/*
 * generated by Xtext 2.37.0
 */
package org.xtext.stlrobust.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractSpecValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.stlrobust.spec.SpecPackage.eINSTANCE);
		return result;
	}
}
