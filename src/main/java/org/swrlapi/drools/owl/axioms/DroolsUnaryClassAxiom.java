package org.swrlapi.drools.owl.axioms;

import org.swrlapi.drools.owl.core.DroolsUnaryObject;

public abstract class DroolsUnaryClassAxiom extends DroolsUnaryObject<String> implements A
{
  private static final long serialVersionUID = 1L;

  public DroolsUnaryClassAxiom(String classID)
  {
    super(classID);
  }

  public String getcid()
  {
    return getT1();
  }

  @Override
  public String toString()
  {
    return super.toString();
  }
}