package uk.ac.kcl.inf.trader.typing.validation;

import com.google.inject.Inject;
import org.eclipse.xsemantics.runtime.validation.XsemanticsValidatorErrorGenerator;
import org.eclipse.xtext.validation.Check;
import uk.ac.kcl.inf.trader.trader.ConnectStatement;
import uk.ac.kcl.inf.trader.trader.CreateBotStatement;
import uk.ac.kcl.inf.trader.trader.ExecuteBotsStatement;
import uk.ac.kcl.inf.trader.trader.LoopStatement;
import uk.ac.kcl.inf.trader.typing.TraderTypeValidator;
import uk.ac.kcl.inf.trader.validation.AbstractTraderValidator;

@SuppressWarnings("all")
public class TraderTypeValidatorValidator extends AbstractTraderValidator {
  @Inject
  protected XsemanticsValidatorErrorGenerator errorGenerator;

  @Inject
  protected TraderTypeValidator xsemanticsSystem;

  protected TraderTypeValidator getXsemanticsSystem() {
    return this.xsemanticsSystem;
  }

  @Check
  public void checkConnectStatement(final ConnectStatement stmt) {
    errorGenerator.generateErrors(this,
    	getXsemanticsSystem().checkConnectStatement(stmt),
    		stmt);
  }

  @Check
  public void checkCreateBotStatement(final CreateBotStatement stmt) {
    errorGenerator.generateErrors(this,
    	getXsemanticsSystem().checkCreateBotStatement(stmt),
    		stmt);
  }

  @Check
  public void checkExecuteBotsStatement(final ExecuteBotsStatement stmt) {
    errorGenerator.generateErrors(this,
    	getXsemanticsSystem().checkExecuteBotsStatement(stmt),
    		stmt);
  }

  @Check
  public void checkLoopStatement(final LoopStatement stmt) {
    errorGenerator.generateErrors(this,
    	getXsemanticsSystem().checkLoopStatement(stmt),
    		stmt);
  }
}
