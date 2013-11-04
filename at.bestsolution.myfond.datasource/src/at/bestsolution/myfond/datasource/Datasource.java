package at.bestsolution.myfond.datasource;

import org.eclipse.core.runtime.IStatus;

import at.bestsolution.myfond.model.myfond.MyFond;

public interface Datasource {
	public MyFond getRoot();
	public IStatus save();
}
