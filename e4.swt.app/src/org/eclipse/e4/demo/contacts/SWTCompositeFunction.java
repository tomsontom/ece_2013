package org.eclipse.e4.demo.contacts;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FX_SWT;

public class SWTCompositeFunction extends ContextFunction {
	@Override
	public Object compute(IEclipseContext context) {
		Composite c = (Composite) context.get("Embedded_Composite");
		if( c == null ) {
			AnchorPane p = new AnchorPane();
			context.get(BorderPane.class).setCenter(p);
			c = FX_SWT.new_Composite(p);
			context.set("Embedded_Composite", c);
		}
		return c;
	}
}
