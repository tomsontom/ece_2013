package at.bestsolution.myfond.app;

import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.IEclipseContext;

import at.bestsolution.myfond.datasource.DatasourceFactory;

public class DatasourceContextFunction extends ContextFunction {
	@Override
	public Object compute(IEclipseContext context) {
		DatasourceFactory factory = context.get(DatasourceFactory.class);
		return factory.createDatasource();
	}
}
