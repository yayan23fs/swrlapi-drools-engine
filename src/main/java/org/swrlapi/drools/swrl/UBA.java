package org.swrlapi.drools.swrl;

import org.swrlapi.builtins.arguments.SWRLBuiltInArgument;
import org.swrlapi.drools.extractors.DroolsSWRLBuiltInArgumentExtractor;
import org.swrlapi.exceptions.TargetRuleEngineException;

/**
 * This class represents an unbound argument to a built-in
 */
public class UBA implements BA
{
	private final String variableName;

	public UBA(String variableName)
	{
		this.variableName = variableName;
	}

	public String getVariableName()
	{
		return this.variableName;
	}

	@Override
	public SWRLBuiltInArgument extract(DroolsSWRLBuiltInArgumentExtractor extractor) throws TargetRuleEngineException
	{
		return extractor.extract(this);
	}

	@Override
	public String toString()
	{
		return "UBA(?" + getVariableName() + ")";
	}
}
