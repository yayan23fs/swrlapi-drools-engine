package org.swrlapi.drools.swrl;

import org.semanticweb.owlapi.model.SWRLVariable;
import org.swrlapi.drools.extractors.DroolsSWRLBuiltInArgumentExtractor;
import org.swrlapi.exceptions.TargetRuleEngineException;

/**
 * @see org.semanticweb.owlapi.model.SWRLVariable
 */
public class VA implements AA
{
	private final String variableName;

	public VA(String variableName)
	{
		this.variableName = variableName;
	}

	public String getVariableName()
	{
		return this.variableName;
	}

	@Override
	public SWRLVariable extract(DroolsSWRLBuiltInArgumentExtractor extractor) throws TargetRuleEngineException
	{
		return extractor.extract(this);
	}

	@Override
	public String toString()
	{
		return "VA(?" + getVariableName() + ")";
	}
}
