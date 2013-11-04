package at.bestsolution.myfond.datasource.xmi;

import java.io.IOException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import at.bestsolution.myfond.datasource.Datasource;
import at.bestsolution.myfond.datasource.DatasourceFactory;
import at.bestsolution.myfond.model.myfond.MyFond;

public class XMIDatasourceFactory implements DatasourceFactory {
	private Resource resource;
	
	@Override
	public Datasource createDatasource() {
		if( resource == null ) {
			ResourceSet resourceSet = new ResourceSetImpl();
			resource = resourceSet.getResource(URI.createPlatformPluginURI("/at.bestsolution.myfond.datasource.xmi/MyFond.xmi", true), true);
		}
		return new DatasourceImpl(resource);
	}

	static class DatasourceImpl implements Datasource {
		private Resource resource;
		
		public DatasourceImpl(Resource resource) {
			this.resource = resource;
		}
		
		@Override
		public MyFond getRoot() {
			return (MyFond) resource.getContents().get(0);
		}
		
		@Override
		public IStatus save() {
			try {
				resource.save(null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return Status.OK_STATUS;
		}
	}
}
