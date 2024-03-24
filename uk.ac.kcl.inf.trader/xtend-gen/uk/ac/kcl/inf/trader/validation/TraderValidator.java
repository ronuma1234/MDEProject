package uk.ac.kcl.inf.trader.validation;

import com.google.common.collect.Iterables;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uk.ac.kcl.inf.trader.trader.ConnectStatement;
import uk.ac.kcl.inf.trader.trader.LoopStatement;
import uk.ac.kcl.inf.trader.trader.TraderPackage;
import uk.ac.kcl.inf.trader.trader.TraderProgram;
import uk.ac.kcl.inf.trader.trader.VariableDeclaration;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class TraderValidator extends AbstractTraderValidator {
  public static final String INVALID_VARIABLE_NAME = "uk.ac.kcl.inf.trader.INVALID_VARIABLE_NAME";

  public static final String USED_VARIABLE_NAME = "uk.ac.kcl.inf.trader.USED_VARIABLE_NAME";

  public static final String CONNECT_STATEMENT_IN_LOOP = "uk.ac.kcl.inf.trader.CONNECT_STATEMENT_IN_LOOP";

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
      this.warning("Cannot call connect statement inside loop statement", conn, 
        TraderPackage.Literals.CONNECT_STATEMENT__BROKER_NAME, 
        TraderValidator.CONNECT_STATEMENT_IN_LOOP);
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
