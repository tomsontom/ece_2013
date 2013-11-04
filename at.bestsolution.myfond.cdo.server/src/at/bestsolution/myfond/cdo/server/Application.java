package at.bestsolution.myfond.cdo.server;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import at.bestsolution.myfond.cdo.server.DemoConfiguration.Mode;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {

	public Object start(IApplicationContext context) throws Exception {
		DemoServer.INSTANCE.addConfig(Mode.NORMAL);
		DemoServer.INSTANCE.activate();
		return IApplication.EXIT_OK;
	}

	public void stop() {
		// nothing to do
	}
}
