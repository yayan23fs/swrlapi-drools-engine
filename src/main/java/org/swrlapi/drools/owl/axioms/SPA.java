package org.swrlapi.drools.owl.axioms;

import org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom;
import org.swrlapi.drools.extractors.DroolsOWLAxiomExtractor;
import org.swrlapi.drools.owl.core.DroolsUnaryObject;
import org.swrlapi.drools.owl.properties.OP;
import org.swrlapi.exceptions.TargetRuleEngineException;

/**
 * Class representing an OWL symmetric object property axiom in Drools.
 *
 * @see org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom
 */
public class SPA extends DroolsUnaryObject<String> implements A
{
	public SPA(String propertyID)
	{
		super(propertyID);
	}

	public String getpid() { return getT1(); }

	@Override
	public String toString()
	{
		return "SPA" + super.toString();
	}

	@Override
	public OWLSymmetricObjectPropertyAxiom extract(DroolsOWLAxiomExtractor extractor) throws TargetRuleEngineException
	{
		return extractor.extract(this);
	}
}