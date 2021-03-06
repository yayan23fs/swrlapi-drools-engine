package org.swrlapi.drools.owl.classexpressions;

import org.swrlapi.drools.owl.core.DroolsTernaryObject;
import org.swrlapi.drools.owl.core.L;

/**
 * This class represents an OWL data has value class expression in Drools.
 *
 * @see org.semanticweb.owlapi.model.OWLDataHasValue
 */
public class DHVCE extends DroolsTernaryObject<String, String, L> implements CE
{
  private static final long serialVersionUID = 1L;

  public DHVCE(String ceid, String propertyID, L l)
  {
    super(ceid, propertyID, l);
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
