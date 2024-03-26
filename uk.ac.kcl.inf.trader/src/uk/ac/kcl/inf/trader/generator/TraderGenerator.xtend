/*
 * generated by Xtext 2.33.0
 */
package uk.ac.kcl.inf.trader.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import uk.ac.kcl.inf.trader.trader.TraderProgram

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class TraderGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val model = resource.contents.head as TraderProgram
		
		//val className = resource.deriveClassName
		//fsa.generateFile(className + '.py', model.doGenerateClass(className))
		
		fsa.generateFile(resource.derivePythonFileNameFor, model.doGeneratePythonCode)
		
	}
	
	def derivePythonFileNameFor(Resource resource) {
		resource.URI.lastSegment + "/" + resource.URI.appendFileExtension('py').lastSegment
	}
	
	def String doGeneratePythonCode(TraderProgram program) {
		head + '''
		«program.statements.map[generatePythonStatement(new Environment)].join('\n')»
		'''
	}
	
	def String head() '''
	import sys
	import subprocess
	#subprocess.check_call([sys.executable, 'virtualenv' 'env'])
	#subprocess.check_call([sys.executable, '-m', 'pip', 'install', 'MetaTrader5'])
	
	from typing import List
	from abc import ABC, abstractmethod
	from datetime import datetime, timedelta
	import time
	import MetaTrader5 as mt5
	import pandas as pd 
	'''
	
	private static class Environment {
		var int counter = 0
		
		def getFreshVarName() '''i«counter++»'''
		
		def exit() {counter--}
	}
	
	dispatch def String generatePythonStatement(Statement stmt, Environment env) ''''''
	
	dispatch def String generatePythonStatement(ConnectStatement stmt, Environment env) ''''''
	
	dispatch def String generatePythonStatement(CreateBotStatement stmt, Environment env) ''''''
	
	dispatch def String generatePythonStatement(ListBotsStatement stmt, Environment env) ''''''
	
	dispatch def String generatePythonStatement(ExecuteStatement stmt, Environment env) ''''''
	
	dispatch def String generatePythonStatement(LoopStatement stmt, Environment env) {
		val varName = env.freshVarName
		
		val result = '''
			for «varName» in range(«stmt.count.generatePythonExpression»):
				«stmt.statements.map[generatePythonStatement].join('\n')»
		'''
		
		env.exit
		
		result
	}
	
	
	dispatch def String generateJavaExpression(IntExpression exp) ''''''
	
	dispatch def String generateJavaExpression(Addition exp) ''''''
	
	dispatch def String generateJavaExpression(Multiplication exp) ''''''
	
	dispatch def String generateJavaExpression(IntLiteral exp) ''''''
	
	dispatch def String generateJavaExpression(IntVarExpression exp) ''''''
	
	
	
	
	
	def deriveClassName(Resource resource) {
		val origFilename = resource.URI.lastSegment
		
		origFilename.substring(0, origFilename.indexOf('.')).toFirstUpper + 'Trader'
	}
	
	def CharSequence doGenerateClass(TraderProgram program, String string) '''
	
	'''
	
}
