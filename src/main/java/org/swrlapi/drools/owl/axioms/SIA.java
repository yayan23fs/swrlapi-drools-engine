package org.swrlapi.drools.owl.axioms;

import org.semanticweb.owlapi.model.OWLSameIndividualAxiom;
import org.swrlapi.drools.extractors.DroolsOWLAxiomExtractor;
import org.swrlapi.drools.owl.core.I;
import org.swrlapi.exceptions.TargetSWRLRuleEngineException;

/**
 * This class represents an OWL same individual axiom in Drools.
 * <p>
 * Rather than holding an arbitrary number of individuals, we hold only pairs and expect that the axiom translator
 * generates all possible pairs from an original OWL axiom.
 * <p>
 * We need to have 4 possible constructors for the different argument combinations. This approach makes the rules more
 * readable.
 *
 * @see org.semanticweb.owlapi.model.OWLSameIndividualAxiom
 */
public class SIA extends DroolsBinaryIndividualsAxiom
{
  private static final long serialVersionUID = 1L;

  public SIA(I individual1, I individual2)
  {
    super(individual1, individual2);
  }

  public SIA(String individual1ID, String individual2ID)
  {
    this(new I(individual1ID), new I(individual2ID));
  }

  public SIA(I individual1, String individual2ID)
  {
    this(individual1, new I(individual2ID));
  }

  public SIA(String individual1ID, I individual2)
  {
    this(new I(individual1ID), individual2);
  }

  @Override
  public OWLSameIndividualAxiom extract(DroolsOWLAxiomExtractor extractor) throws TargetSWRLRuleEngineException
  {
    return extractor.extract(this);
  }

  @Override
  public void visit(AVisitor visitor)
  {
    visitor.visit(this);
  }

  @Override
  public String toString()
  {
    return "SIA" + super.toString();
  }
}
