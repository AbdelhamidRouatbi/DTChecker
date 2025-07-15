package org.xtext.stlrobust.generator

import org.xtext.stlrobust.spec.AfterScope
import org.xtext.stlrobust.spec.AfterUntilScope
import org.xtext.stlrobust.spec.BeforeScope
import org.xtext.stlrobust.spec.BetweenScope
import org.xtext.stlrobust.spec.GlobalScope
import org.xtext.stlrobust.spec.Specification
import org.xtext.stlrobust.spec.Universality

class UniversalityGenerator extends SpecGenerator{
	
	static def generate(Specification spec) {
		switch (spec.scope) {
    		case spec.scope instanceof GlobalScope: return genGlobalScope(spec)
    		case spec.scope instanceof BeforeScope: return genBeforeScope(spec)
    		case spec.scope instanceof AfterScope: return genAfterScope(spec)
    		case spec.scope instanceof BetweenScope: return genBetweenScope(spec)
    		case spec.scope instanceof AfterUntilScope: return genAfterUntilScope(spec)
    		default: return "Unknown scope."
		}
	}
	
	def static genGlobalScope(Specification spec) {
		var pattern = spec.pattern as Universality
		var p = expression(pattern.p)
		return '''always[0,0]«p»'''
	}
	
	def static genBeforeScope(Specification spec) {
	}
	
	def static genAfterScope(Specification spec) {
	}
	
	def static genBetweenScope(Specification spec) {
		""
	}
	
	def static genAfterUntilScope(Specification spec) {
		""
	}
}