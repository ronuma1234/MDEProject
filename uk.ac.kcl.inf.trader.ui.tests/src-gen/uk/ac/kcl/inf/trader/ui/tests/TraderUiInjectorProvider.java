/*
 * generated by Xtext 2.34.0
 */
package uk.ac.kcl.inf.trader.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import uk.ac.kcl.inf.trader.ui.internal.TraderActivator;

public class TraderUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return TraderActivator.getInstance().getInjector("uk.ac.kcl.inf.trader.Trader");
	}

}
