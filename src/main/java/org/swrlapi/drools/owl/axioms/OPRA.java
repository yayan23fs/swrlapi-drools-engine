package org.swrlapi.drools.owl.axioms;

import org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom;
import org.swrlapi.drools.extractors.DroolsOWLAxiomExtractor;
import org.swrlapi.drools.owl.core.DroolsBinaryObject;
import org.swrlapi.exceptions.TargetRuleEngineException;

/**
 * Class representing an OWL range object property axiom in Drools.
 *
 * @see org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom
 */
public class OPRA extends DroolsBinaryObject<String, String> implements A
{
	public OPRA(String propertyID, String rangeClassID)
	{
		super(propertyID, rangeClassID);
	}

	public String getpid()
	{
		return getT1();
	}

	public String getrid()
	{
		return getT2();
	}

	@Override
	public OWLObjectPropertyRangeAxiom extract(DroolsOWLAxiomExtractor extractor) throws TargetRuleEngineException
	{
		return extractor.extract(this);
	}

	@Override
	public String toString()
	{
		return "OPRA(" + getpid() + ", " + getrid() + ")";
	}
}