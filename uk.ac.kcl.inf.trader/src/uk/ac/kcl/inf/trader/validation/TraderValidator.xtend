package uk.ac.kcl.inf.trader.validation

import org.eclipse.xtext.validation.Check
import uk.ac.kcl.inf.trader.trader.VariableDeclaration
import uk.ac.kcl.inf.trader.trader.TraderPackage
import uk.ac.kcl.inf.trader.trader.ConnectStatement
import uk.ac.kcl.inf.trader.trader.LoopStatement
import uk.ac.kcl.inf.trader.trader.TraderProgram
import org.eclipse.emf.ecore.EObject

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class TraderValidator extends AbstractTraderValidator{
	
	public static val INVALID_VARIABLE_NAME = 'uk.ac.kcl.inf.trader.INVALID_VARIABLE_NAME'
	public static val USED_VARIABLE_NAME = 'uk.ac.kcl.inf.trader.USED_VARIABLE_NAME'
	public static val CONNECT_STATEMENT_IN_LOOP = 'uk.ac.kcl.inf.trader.CONNECT_STATEMENT_IN_LOOP'
	
	@Check
	def checkVariableNamesStartWithLowercaseCharacter (VariableDeclaration decl){
		if (!Character.isLowerCase(decl.name.charAt(0))) {
			warning('Name should start with a lower-case character', decl,
				TraderPackage.Literals.VARIABLE_DECLARATION__NAME,
				INVALID_VARIABLE_NAME
			)
		}
	}
	
	@Check
	def checkUniqueVariableName (VariableDeclaration decl){
		val currentContainer = decl.eContainer
		currentContainer.uniqueNameCheck(decl, decl)
	}
	
	@Check
	def checkConnectStatementInLoop (ConnectStatement conn){
		if (conn.eContainer instanceof LoopStatement) {
			warning('Cannot call connect statement inside loop statement', conn,
				TraderPackage.Literals.CONNECT_STATEMENT__BROKER_NAME,
				CONNECT_STATEMENT_IN_LOOP
			)
		}
	}
	
    def void uniqueNameCheck(EObject context, EObject innerContext, VariableDeclaration decl) {
    	if (context instanceof LoopStatement) {
    		val innerIndex = context.statements.indexOf(innerContext)
    		val scopedDeclarations = context.statements
    		.filter(VariableDeclaration)
			.filter[vd | ((context.statements.indexOf(vd) < innerIndex) && (vd.name.equals(decl.name)))]
			
			if (scopedDeclarations.length !== 0){
				warning('Name of the variable must be unique', decl,
					TraderPackage.Literals.VARIABLE_DECLARATION__NAME,
					USED_VARIABLE_NAME
				)
			}
       		context.eContainer.uniqueNameCheck(context, decl)
    	} else if(context instanceof TraderProgram) {
			val innerIndex = context.statements.indexOf(innerContext) 
    		val scopedDeclarations = context.statements
    		.filter(VariableDeclaration)
			.filter[vd | ((context.statements.indexOf(vd) < innerIndex) && (vd.name.equals(decl.name)))]
			
			if (scopedDeclarations.length !== 0){
				warning('Name of the variable must be unique', decl,
					TraderPackage.Literals.VARIABLE_DECLARATION__NAME,
					USED_VARIABLE_NAME
				)
			}
            
    	}
    }
	
}