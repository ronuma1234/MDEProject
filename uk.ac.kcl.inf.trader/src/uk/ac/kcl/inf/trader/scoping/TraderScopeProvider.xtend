package uk.ac.kcl.inf.trader.scoping

import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.IScope
import org.eclipse.emf.ecore.EReference
import static extension org.eclipse.xtext.EcoreUtil2.*
import static org.eclipse.xtext.scoping.Scopes.*
import uk.ac.kcl.inf.trader.trader.TraderProgram
import uk.ac.kcl.inf.trader.trader.VariableDeclaration
import uk.ac.kcl.inf.trader.trader.NumVarExpression
import uk.ac.kcl.inf.trader.trader.LoopStatement
import org.eclipse.emf.ecore.EObject
import uk.ac.kcl.inf.trader.trader.StringVarExpression

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class TraderScopeProvider extends AbstractDeclarativeScopeProvider{
	
	def IScope scope_NumVarExpression_var (NumVarExpression context, EReference ref) {
		val containingProgram = context.eContainer.getContainerOfType(TraderProgram)
		val containingLoopStatement = context.getContainerOfType(LoopStatement)
		if (containingLoopStatement !== null) {
			containingLoopStatement.visibleVariablesScope(context.eContainer)
		} else {
			val index = containingProgram.statements.indexOf(context.eContainer) 
			val visibleVariables = containingProgram.statements
            .filter(VariableDeclaration)
            .reject[vd | containingProgram.statements.indexOf(vd) > index]
            scopeFor(visibleVariables)
		}
	}
	def IScope scope_StringVarExpression_var (StringVarExpression context, EReference ref) {
		val containingProgram = context.eContainer.getContainerOfType(TraderProgram)
		val containingLoopStatement = context.getContainerOfType(LoopStatement)
		if (containingLoopStatement !== null) {
			containingLoopStatement.visibleVariablesScope(context.eContainer)
		} else {
			val index = containingProgram.statements.indexOf(context.eContainer) 
			val visibleVariables = containingProgram.statements
            .filter(VariableDeclaration)
            .reject[vd | containingProgram.statements.indexOf(vd) > index]
            scopeFor(visibleVariables)
		}
	}
    def IScope visibleVariablesScope(EObject context, EObject innerContext) {
    	if (context instanceof LoopStatement) {
    		val innerIndex = context.statements.indexOf(innerContext)
    		val declarations = context.statements.filter(VariableDeclaration)
    		.reject[vd | context.statements.indexOf(vd) > innerIndex]
       		scopeFor(declarations, context.eContainer.visibleVariablesScope(context))
    	} else if(context instanceof TraderProgram) {
			val index = context.statements.indexOf(innerContext) 
			val visibleVariables = context.statements
            .filter(VariableDeclaration)
            .reject[vd | context.statements.indexOf(vd) > index]
            scopeFor(visibleVariables)
    	}
    }
    
    
//    
//    def IScope scope_ConnectParameters_usernameRef(ConnectParameters context, EReference ref) {
//        val containingProgram = context.eContainer.getContainerOfType(TraderProgram)
//        val connectStatement = context.eContainer.getContainerOfType(Connect)
//        if (containingProgram !== null && connectStatement !== null) {
//            val index = containingProgram.statements.indexOf(connectStatement)
//        	val visibleVariables = containingProgram.statements.take(index)
//            .filter(VariableDeclaration)
//            .toList
//            scopeFor(visibleVariables)
//        }
//    }
    
}