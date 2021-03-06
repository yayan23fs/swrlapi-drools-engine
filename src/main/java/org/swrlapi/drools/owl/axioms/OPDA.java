package org.swrlapi.drools.owl.axioms;

import org.semanticweb.owlapi.model.OWLDeclarationAxiom;
import org.swrlapi.drools.extractors.DroolsOWLAxiomExtractor;
import org.swrlapi.exceptions.TargetSWRLRuleEngineException;

/**
 * This class represents an OWL object property declaration.
 *
 * @see org.semanticweb.owlapi.model.OWLDeclarationAxiom
 */
public class OPDA extends DroolsUnaryPropertyAxiom
{
  private static final long serialVersionUID = 1L;

  public OPDA(String propertyID)
  {
    super(propertyID);
  }

  @Override
  public String toString()
  {
    return "OPDA(" + super.toString() + ")";
  }

  @Override
  public OWLDeclarationAxiom extract(DroolsOWLAxiomExtractor extractor) throws TargetSWRLRuleEngineException
  {
    return extractor.extract(this);
  }

  @Override
  public void visit(AVisitor visitor)
  {
    visitor.visit(this);
  }
}
