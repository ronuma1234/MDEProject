package uk.ac.kcl.inf.trader.scoping;

import com.google.common.collect.Iterables;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uk.ac.kcl.inf.trader.trader.LoopStatement;
import uk.ac.kcl.inf.trader.trader.NumVarExpression;
import uk.ac.kcl.inf.trader.trader.StringVarExpression;
import uk.ac.kcl.inf.trader.trader.TraderProgram;
import uk.ac.kcl.inf.trader.trader.VariableDeclaration;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class TraderScopeProvider extends AbstractDeclarativeScopeProvider {
  public IScope scope_NumVarExpression_var(final NumVarExpression context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final TraderProgram containingProgram = EcoreUtil2.<TraderProgram>getContainerOfType(context.eContainer(), TraderProgram.class);
      final LoopStatement containingLoopStatement = EcoreUtil2.<LoopStatement>getContainerOfType(context, LoopStatement.class);
      IScope _xifexpression = null;
      if ((containingLoopStatement != null)) {
        _xifexpression = this.visibleVariablesScope(containingLoopStatement, context.eContainer());
      } else {
        IScope _xblockexpression_1 = null;
        {
          final int index = this.findIndexOfTopContainer(context, containingProgram);
          final Function1<VariableDeclaration, Boolean> _function = (VariableDeclaration vd) -> {
            int _indexOf = containingProgram.getStatements().indexOf(vd);
            return Boolean.valueOf((_indexOf > index));
          };
          final Iterable<VariableDeclaration> visibleVariables = IterableExtensions.<VariableDeclaration>reject(Iterables.<VariableDeclaration>filter(containingProgram.getStatements(), VariableDeclaration.class), _function);
          _xblockexpression_1 = Scopes.scopeFor(visibleVariables);
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  public IScope scope_StringVarExpression_var(final StringVarExpression context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final TraderProgram containingProgram = EcoreUtil2.<TraderProgram>getContainerOfType(context.eContainer(), TraderProgram.class);
      final LoopStatement containingLoopStatement = EcoreUtil2.<LoopStatement>getContainerOfType(context, LoopStatement.class);
      IScope _xifexpression = null;
      if ((containingLoopStatement != null)) {
        _xifexpression = this.visibleVariablesScope(containingLoopStatement, context.eContainer());
      } else {
        IScope _xblockexpression_1 = null;
        {
          final int index = containingProgram.getStatements().indexOf(context.eContainer());
          final Function1<VariableDeclaration, Boolean> _function = (VariableDeclaration vd) -> {
            int _indexOf = containingProgram.getStatements().indexOf(vd);
            return Boolean.valueOf((_indexOf > index));
          };
          final Iterable<VariableDeclaration> visibleVariables = IterableExtensions.<VariableDeclaration>reject(Iterables.<VariableDeclaration>filter(containingProgram.getStatements(), VariableDeclaration.class), _function);
          _xblockexpression_1 = Scopes.scopeFor(visibleVariables);
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  public IScope visibleVariablesScope(final EObject context, final EObject innerContext) {
    IScope _xifexpression = null;
    if ((context instanceof LoopStatement)) {
      IScope _xblockexpression = null;
      {
        final int innerIndex = ((LoopStatement)context).getStatements().indexOf(innerContext);
        final Function1<VariableDeclaration, Boolean> _function = (VariableDeclaration vd) -> {
          int _indexOf = ((LoopStatement)context).getStatements().indexOf(vd);
          return Boolean.valueOf((_indexOf > innerIndex));
        };
        final Iterable<VariableDeclaration> declarations = IterableExtensions.<VariableDeclaration>reject(Iterables.<VariableDeclaration>filter(((LoopStatement)context).getStatements(), VariableDeclaration.class), _function);
        _xblockexpression = Scopes.scopeFor(declarations, this.visibleVariablesScope(((LoopStatement)context).eContainer(), context));
      }
      _xifexpression = _xblockexpression;
    } else {
      IScope _xifexpression_1 = null;
      if ((context instanceof TraderProgram)) {
        IScope _xblockexpression_1 = null;
        {
          final int index = ((TraderProgram)context).getStatements().indexOf(innerContext);
          final Function1<VariableDeclaration, Boolean> _function = (VariableDeclaration vd) -> {
            int _indexOf = ((TraderProgram)context).getStatements().indexOf(vd);
            return Boolean.valueOf((_indexOf > index));
          };
          final Iterable<VariableDeclaration> visibleVariables = IterableExtensions.<VariableDeclaration>reject(Iterables.<VariableDeclaration>filter(((TraderProgram)context).getStatements(), VariableDeclaration.class), _function);
          _xblockexpression_1 = Scopes.scopeFor(visibleVariables);
        }
        _xifexpression_1 = _xblockexpression_1;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }

  public int findIndexOfTopContainer(final EObject context, final TraderProgram containingProgram) {
    final int index = containingProgram.getStatements().indexOf(context);
    EObject _eContainer = context.eContainer();
    boolean _tripleEquals = (_eContainer == null);
    if (_tripleEquals) {
      return (-1);
    } else {
      if ((index == (-1))) {
        return this.findIndexOfTopContainer(context.eContainer(), containingProgram);
      } else {
        return index;
      }
    }
  }
}
