package org.swrlapi.drools.sqwrl;

import org.swrlapi.builtins.arguments.SWRLBuiltInArgument;
import org.swrlapi.drools.extractors.DroolsSWRLBuiltInArgumentExtractor;
import org.swrlapi.drools.swrl.BA;
import org.swrlapi.exceptions.TargetSWRLRuleEngineException;

/**
 * This class represents a SQWRL collection in Drools. These are created by SQWRL collection construction operators and
 * passed to the second phase of rule execution via the {@link org.swrlapi.drools.sqwrl.DroolsSQWRLCollectionHandler}.
 *
 * @see org.swrlapi.drools.sqwrl.DroolsSQWRLCollectionHandler
 */
public class SQWRLC implements BA
{
  private final String variableName, queryName, collectionName, collectionID;

  public SQWRLC(String variableName, String queryName, String collectionName, String collectionID)
  {
    this.variableName = variableName;
    this.queryName = queryName;
    this.collectionName = collectionName;
    this.collectionID = collectionID;
  }

  public String getVariableName()
  {
    return this.variableName;
  }

  public String getQueryName()
  {
    return this.queryName;
  }

  public String getCollectionName()
  {
    return this.collectionName;
  }

  public String getCollectionID()
  {
    return this.collectionID;
  }

  @Override
  public SWRLBuiltInArgument extract(DroolsSWRLBuiltInArgumentExtractor extractor) throws TargetSWRLRuleEngineException
  {
    return extractor.extract(this);
  }

  @Override
  public String toString()
  {
    return "SQWRLC(" + getQueryName() + ", " + getCollectionName() + ", " + getCollectionID() + ")";
  }

  @Override
  public boolean equals(Object obj)
  {
    if (this == obj)
      return true;
    if ((obj == null) || (obj.getClass() != this.getClass()))
      return false;
    SQWRLC sqwrlc = (SQWRLC)obj;
    return (getQueryName() == sqwrlc.getQueryName() || (getQueryName() != null && getQueryName().equals(
        sqwrlc.getQueryName())))
        && (getCollectionName() == sqwrlc.getCollectionName() || (getCollectionName() != null && getCollectionName()
        .equals(sqwrlc.getCollectionName())))
        && (getCollectionID() == sqwrlc.getCollectionID() || (getCollectionID() != null && getCollectionID().equals(
            sqwrlc.getCollectionID())));
  }

  @Override
  public int hashCode()
  {
    int hash = 334;

    hash = hash + (null == getQueryName() ? 0 : getQueryName().hashCode());
    hash = hash + (null == getCollectionName() ? 0 : getCollectionName().hashCode());
    hash = hash + (null == getCollectionID() ? 0 : getCollectionID().hashCode());

    return hash;
  }
}
