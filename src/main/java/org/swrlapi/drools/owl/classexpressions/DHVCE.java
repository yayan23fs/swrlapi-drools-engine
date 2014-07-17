package org.swrlapi.drools.owl.classexpressions;

import org.swrlapi.drools.owl.core.DroolsTernaryObject;
import org.swrlapi.drools.owl.core.L;
import org.swrlapi.drools.owl.properties.DP;

/**
 * This class represents an OWL data has value class expression in Drools.
 */
public class DHVCE extends DroolsTernaryObject<String, String, L> implements CE
{
	public DHVCE(String id, String propertyID, L l)
	{
		super(id, propertyID, l);
	}

	@Override
	public String getceid()
	{
		return getT1();
	}

	public String getpid()
	{
		return getT2();
	}

	public L getV()
	{
		return getT3();
	}

	@Override
	public String toString()
	{
		return "DHVCE" + super.toString();
	}
}
