/*
 * generated by Xtext 2.34.0
 */
package uk.ac.kcl.inf.trader.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class TraderAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("uk/ac/kcl/inf/trader/parser/antlr/internal/InternalTrader.tokens");
	}
}
