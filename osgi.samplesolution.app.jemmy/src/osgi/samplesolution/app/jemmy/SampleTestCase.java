package osgi.samplesolution.app.jemmy;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

import org.jemmy.fx.SceneDock;
import org.jemmy.lookup.Lookup;
import org.jemmy.lookup.LookupCriteria;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleTestCase {
	protected static SceneDock scene;
	
	@BeforeClass
	public static void startApp() throws InterruptedException {
		try {
			scene = new SceneDock();
		} catch(Throwable t ) {
			t.printStackTrace();
		}
	}
	
	@Test
	public void testButtonClick() {
		Lookup<Button> lookup = scene.asParent().lookup(Button.class, new LookupCriteria<Button>() {

			@Override
			public boolean check(Button arg0) {
				return true;
			}
		});
		lookup.wrap().mouse().click();
		Assert.assertEquals("Clicked!!", lookup.get().getText());
	}
}
