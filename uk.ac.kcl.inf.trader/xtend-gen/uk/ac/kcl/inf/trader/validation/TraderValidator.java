package uk.ac.kcl.inf.trader.validation;

import com.google.common.collect.Iterables;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uk.ac.kcl.inf.trader.trader.ConnectStatement;
import uk.ac.kcl.inf.trader.trader.ExecuteBotsStatement;
import uk.ac.kcl.inf.trader.trader.LoopStatement;
import uk.ac.kcl.inf.trader.trader.TraderPackage;
import uk.ac.kcl.inf.trader.trader.TraderProgram;
import uk.ac.kcl.inf.trader.trader.VariableDeclaration;
import uk.ac.kcl.inf.trader.typing.validation.TraderTypeValidatorValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class TraderValidator extends TraderTypeValidatorValidator {
  public static final String INVALID_VARIABLE_NAME = "uk.ac.kcl.inf.trader.INVALID_VARIABLE_NAME";

  public static final String USED_VARIABLE_NAME = "uk.ac.kcl.inf.trader.USED_VARIABLE_NAME";

  public static final String CONNECT_STATEMENT_IN_LOOP = "uk.ac.kcl.inf.trader.CONNECT_STATEMENT_IN_LOOP";

  public static final String MULTIPLE_CONNECT_STATEMENT = "uk.ac.kcl.inf.trader.MULTIPLE_CONNECT_STATEMENT";

  public static final String EXECUTE_BOTS_STATEMENT_IN_LOOP = "uk.ac.kcl.inf.trader.EXECUTE_BOTS_STATEMENT_IN_LOOP";

  public static final String MULTIPLE_EXECUTE_BOTS_STATEMENT = "uk.ac.kcl.inf.trader.MULTIPLE_EXECUTE_BOTS_STATEMENT";

  @Check
  public void checkVariableNamesStartWithLowercaseCharacter(final VariableDeclaration decl) {
    boolean _isLowerCase = Character.isLowerCase(decl.getName().charAt(0));
    boolean _not = (!_isLowerCase);
    if (_not) {
      this.warning("Name should start with a lower-case character", decl, 
        TraderPackage.Literals.VARIABLE_DECLARATION__NAME, 
        TraderValidator.INVALID_VARIABLE_NAME);
    }
  }

  @Check
  public void checkUniqueVariableName(final VariableDeclaration decl) {
    final EObject currentContainer = decl.eContainer();
    this.uniqueNameCheck(currentContainer, decl, decl);
  }

  @Check
  public void checkConnectStatementInLoop(final ConnectStatement conn) {
    EObject _eContainer = conn.eContainer();
    if ((_eContainer instanceof LoopStatement)) {
      this.warning("Cannot call ConnectStatement inside LoopStatement", conn, 
        TraderPackage.Literals.CONNECT_STATEMENT__BROKER_NAME, 
        TraderValidator.CONNECT_STATEMENT_IN_LOOP);
    }
  }

  @Check
  public void checkMultipleConnectStatement(final ConnectStatement conn) {
    EObject _eContainer = conn.eContainer();
    if ((_eContainer instanceof TraderProgram)) {
      EObject _eContainer_1 = conn.eContainer();
      final TraderProgram containingProgram = ((TraderProgram) _eContainer_1);
      final int index = containingProgram.getStatements().indexOf(conn);
      final Function1<ConnectStatement, Boolean> _function = (ConnectStatement cs) -> {
        return Boolean.valueOf(((!cs.equals(conn)) && (containingProgram.getStatements().indexOf(cs) < index)));
      };
      final Iterable<ConnectStatement> scopedConnectStatements = IterableExtensions.<ConnectStatement>filter(Iterables.<ConnectStatement>filter(containingProgram.getStatements(), ConnectStatement.class), _function);
      int _length = ((Object[])Conversions.unwrapArray(scopedConnectStatements, Object.class)).length;
      boolean _tripleNotEquals = (_length != 0);
      if (_tripleNotEquals) {
        this.warning("ConnectStatement should only be called once", conn, 
          TraderPackage.Literals.CONNECT_STATEMENT__BROKER_NAME, 
          TraderValidator.MULTIPLE_CONNECT_STATEMENT);
      }
    }
  }

  @Check
  public void checkExecuteBotStatementInLoop(final ExecuteBotsStatement stmt) {
    EObject _eContainer = stmt.eContainer();
    if ((_eContainer instanceof LoopStatement)) {
      this.warning("Cannot call ExecuteBotsStatement inside LoopStatement", stmt, 
        TraderPackage.Literals.EXECUTE_BOTS_STATEMENT__DAYS, 
        TraderValidator.EXECUTE_BOTS_STATEMENT_IN_LOOP);
    }
  }

  @Check
  public void checkMultipleExecuteBotStatement(final ExecuteBotsStatement stmt) {
    EObject _eContainer = stmt.eContainer();
    if ((_eContainer instanceof TraderProgram)) {
      EObject _eContainer_1 = stmt.eContainer();
      final TraderProgram containingProgram = ((TraderProgram) _eContainer_1);
      final int index = containingProgram.getStatements().indexOf(stmt);
      final Function1<ExecuteBotsStatement, Boolean> _function = (ExecuteBotsStatement ebs) -> {
        return Boolean.valueOf(((!ebs.equals(stmt)) && (containingProgram.getStatements().indexOf(ebs) < index)));
      };
      final Iterable<ExecuteBotsStatement> scopedConnectStatements = IterableExtensions.<ExecuteBotsStatement>filter(Iterables.<ExecuteBotsStatement>filter(containingProgram.getStatements(), ExecuteBotsStatement.class), _function);
      int _length = ((Object[])Conversions.unwrapArray(scopedConnectStatements, Object.class)).length;
      boolean _tripleNotEquals = (_length != 0);
      if (_tripleNotEquals) {
        this.warning("ExecuteBotsStatement should only be called once", stmt, 
          TraderPackage.Literals.EXECUTE_BOTS_STATEMENT__DAYS, 
          TraderValidator.MULTIPLE_EXECUTE_BOTS_STATEMENT);
      }
    }
  }

  public void uniqueNameCheck(final EObject context, final EObject innerContext, final VariableDeclaration decl) {
    if ((context instanceof LoopStatement)) {
      final int innerIndex = ((LoopStatement)context).getStatements().indexOf(innerContext);
      final Function1<VariableDeclaration, Boolean> _function = (VariableDeclaration vd) -> {
        return Boolean.valueOf(((((LoopStatement)context).getStatements().indexOf(vd) < innerIndex) && vd.getName().equals(decl.getName())));
      };
      final Iterable<VariableDeclaration> scopedDeclarations = IterableExtensions.<VariableDeclaration>filter(Iterables.<VariableDeclaration>filter(((LoopStatement)context).getStatements(), VariableDeclaration.class), _function);
      int _length = ((Object[])Conversions.unwrapArray(scopedDeclarations, Object.class)).length;
      boolean _tripleNotEquals = (_length != 0);
      if (_tripleNotEquals) {
        this.warning("Name of the variable must be unique", decl, 
          TraderPackage.Literals.VARIABLE_DECLARATION__NAME, 
          TraderValidator.USED_VARIABLE_NAME);
      }
      this.uniqueNameCheck(((LoopStatement)context).eContainer(), context, decl);
    } else {
      if ((context instanceof TraderProgram)) {
        final int innerIndex_1 = ((TraderProgram)context).getStatements().indexOf(innerContext);
        final Function1<VariableDeclaration, Boolean> _function_1 = (VariableDeclaration vd) -> {
          return Boolean.valueOf(((((TraderProgram)context).getStatements().indexOf(vd) < innerIndex_1) && vd.getName().equals(decl.getName())));
        };
        final Iterable<VariableDeclaration> scopedDeclarations_1 = IterableExtensions.<VariableDeclaration>filter(Iterables.<VariableDeclaration>filter(((TraderProgram)context).getStatements(), VariableDeclaration.class), _function_1);
        int _length_1 = ((Object[])Conversions.unwrapArray(scopedDeclarations_1, Object.class)).length;
        boolean _tripleNotEquals_1 = (_length_1 != 0);
        if (_tripleNotEquals_1) {
          this.warning("Name of the variable must be unique", decl, 
            TraderPackage.Literals.VARIABLE_DECLARATION__NAME, 
            TraderValidator.USED_VARIABLE_NAME);
        }
      }
    }
  }
}
