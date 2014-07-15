package org.swrlapi.drools.owl.core;

import org.semanticweb.owlapi.model.OWLDatatype;
import org.swrlapi.builtins.arguments.SWRLBuiltInArgument;
import org.swrlapi.drools.extractors.DroolsAA2SWRLAtomArgumentExtractor;
import org.swrlapi.drools.extractors.DroolsOWLEntityExtractor;
import org.swrlapi.drools.owl.dataranges.DR;
import org.swrlapi.drools.swrl.BA;
import org.swrlapi.exceptions.TargetRuleEngineException;

/**
 * This class represents an OWL datatype (e.g., xsd:int).
 */
public class D extends OE implements DR
{
	public D(String datatypeID)
	{
		super(datatypeID);
	}

	/**
	 * We have no way of anticipating the return types of built-ins in rules so we need to perform a runtime check.
	 */
	public D(BA ba)
	{
		super("<InProcess>");

		if (ba instanceof D) {
			D d = (D)ba;
			setId(d.getName());
		} else
			throw new RuntimeException("expecting OWL datatype from bound built-in argument, got "
					+ ba.getClass().getCanonicalName());
	}

	public String getid()
	{
		return getName();
	}

	@Override
	public OWLDatatype extract(DroolsOWLEntityExtractor extractor) throws TargetRuleEngineException
	{
		return extractor.extract(this);
	}

	@Override
	public SWRLBuiltInArgument extract(DroolsAA2SWRLAtomArgumentExtractor extractor) throws TargetRuleEngineException
	{
		return extractor.extract(this);
	}

	@Override
	public String toString()
	{
		return super.toString();
	}
}