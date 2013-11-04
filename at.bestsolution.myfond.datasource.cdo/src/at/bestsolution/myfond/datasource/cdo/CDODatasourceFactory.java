package at.bestsolution.myfond.datasource.cdo;

import java.io.IOException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.util.ConcurrentAccessException;
import org.eclipse.emf.cdo.view.CDOAdapterPolicy;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.util.container.IPluginContainer;

import at.bestsolution.myfond.datasource.Datasource;
import at.bestsolution.myfond.datasource.DatasourceFactory;
import at.bestsolution.myfond.model.myfond.MyFond;

public class CDODatasourceFactory implements DatasourceFactory {
	private CDONet4jSession session;
	
	@Override
	public Datasource createDatasource() {
		if( session == null ) {
			IConnector connector = Net4jUtil.getConnector(IPluginContainer.INSTANCE, "tcp://localhost:2036");
			CDONet4jSessionConfiguration sessionConfiguration = CDONet4jUtil.createNet4jSessionConfiguration();
			sessionConfiguration.setConnector(connector);
			sessionConfiguration.setRepositoryName("MyFond");
			 
			session = sessionConfiguration.openNet4jSession();			
		}
		return new CDODatasource(session);
	}

	static class CDODatasource implements Datasource {
		private CDONet4jSession session;
		private Resource resource;
		private CDOTransaction transaction;
		
		public CDODatasource(CDONet4jSession session) {
			this.session = session;
		}
		
		@Override
		public MyFond getRoot() {
			return (MyFond) getResource().getContents().get(0);
		}
		
		private Resource getResource() {
			if(resource != null) {
				return resource;
			}
			
			transaction = session.openTransaction();
			transaction.options().addChangeSubscriptionPolicy(CDOAdapterPolicy.ALL);
			resource = transaction.getResource("MyFond");
			return resource;
		}
		
		@Override
		public IStatus save() {
			try {
				resource.save(null);
				transaction.commit();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ConcurrentAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (CommitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return Status.OK_STATUS;
		}
	}
}
