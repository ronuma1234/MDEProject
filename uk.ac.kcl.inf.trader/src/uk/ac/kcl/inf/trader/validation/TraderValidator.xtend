package uk.ac.kcl.inf.trader.validation

import org.eclipse.xtext.validation.Check
import uk.ac.kcl.inf.trader.trader.VariableDeclaration
import uk.ac.kcl.inf.trader.trader.TraderPackage
import uk.ac.kcl.inf.trader.trader.ConnectStatement
import uk.ac.kcl.inf.trader.trader.LoopStatement
import uk.ac.kcl.inf.trader.trader.TraderProgram
import org.eclipse.emf.ecore.EObject
import uk.ac.kcl.inf.trader.typing.validation.TraderTypeValidatorValidator
import uk.ac.kcl.inf.trader.trader.ExecuteBotsStatement

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class TraderValidator extends TraderTypeValidatorValidator{
	
	public static val INVALID_VARIABLE_NAME = 'uk.ac.kcl.inf.trader.INVALID_VARIABLE_NAME'
	public static val USED_VARIABLE_NAME = 'uk.ac.kcl.inf.trader.USED_VARIABLE_NAME'
	public static val CONNECT_STATEMENT_IN_LOOP = 'uk.ac.kcl.inf.trader.CONNECT_STATEMENT_IN_LOOP'
	public static val MULTIPLE_CONNECT_STATEMENT = 'uk.ac.kcl.inf.trader.MULTIPLE_CONNECT_STATEMENT'
	public static val EXECUTE_BOTS_STATEMENT_IN_LOOP = 'uk.ac.kcl.inf.trader.EXECUTE_BOTS_STATEMENT_IN_LOOP'
	public static val MULTIPLE_EXECUTE_BOTS_STATEMENT = 'uk.ac.kcl.inf.trader.MULTIPLE_EXECUTE_BOTS_STATEMENT'
	
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
			warning('Cannot call ConnectStatement inside LoopStatement', conn,
				TraderPackage.Literals.CONNECT_STATEMENT__BROKER_NAME,
				CONNECT_STATEMENT_IN_LOOP
			)
		}
	}
	
	@Check
	def checkMultipleConnectStatement (ConnectStatement conn){
		val containingProgram = conn.eContainer as TraderProgram
		val index = containingProgram.statements.indexOf(conn)
		val scopedConnectStatements = containingProgram.statements
		.filter(ConnectStatement)
		.filter[cs | !cs.equals(conn) && containingProgram.statements.indexOf(cs) < index]
		if (scopedConnectStatements.length !== 0){
			warning('ConnectStatement should only be called once', conn,
				TraderPackage.Literals.CONNECT_STATEMENT__BROKER_NAME,
				MULTIPLE_CONNECT_STATEMENT
			)
		}
	}

	@Check
	def checkExecuteBotStatementInLoop (ExecuteBotsStatement stmt){
		if (stmt.eContainer instanceof LoopStatement) {
			warning('Cannot call ExecuteBotsStatement inside LoopStatement', stmt,
				TraderPackage.Literals.EXECUTE_BOTS_STATEMENT__DAYS,
				EXECUTE_BOTS_STATEMENT_IN_LOOP
			)
		}
	}
	
	@Check
	def checkMultipleExecuteBotStatement (ExecuteBotsStatement stmt){
		val containingProgram = stmt.eContainer as TraderProgram
		val index = containingProgram.statements.indexOf(stmt) 
		val scopedConnectStatements = containingProgram.statements
		.filter(ExecuteBotsStatement)
		.filter[ebs | (!ebs.equals(stmt) && containingProgram.statements.indexOf(ebs) < index)]
		if (scopedConnectStatements.length !== 0){
			warning('ExecuteBotsStatement should only be called once', stmt,
				TraderPackage.Literals.EXECUTE_BOTS_STATEMENT__DAYS,
				MULTIPLE_EXECUTE_BOTS_STATEMENT
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