package org.swrlapi.drools.converters;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.swrlapi.bridge.SWRLRuleEngineBridge;
import org.swrlapi.bridge.converters.TargetRuleEngineConverterBase;
import org.swrlapi.bridge.converters.TargetRuleEngineOWLLiteralConverter;
import org.swrlapi.drools.core.DroolsNames;

/**
 * This class converts OWLAPI OWL literals to their Drools DRL representation.
 *
 * @see org.semanticweb.owlapi.model.OWLLiteral
 */
public class DroolsOWLLiteral2DRLConverter extends TargetRuleEngineConverterBase implements
TargetRuleEngineOWLLiteralConverter<String>
{
  public DroolsOWLLiteral2DRLConverter(SWRLRuleEngineBridge bridge)
  {
    super(bridge);
  }

  @Override
  public String convert(OWLLiteral literal)
  {
    IRI datatypeIRI = literal.getDatatype().getIRI();
    String datatypePrefixedName = getIRIResolver().iri2PrefixedName(datatypeIRI);

    return "new " + DroolsNames.LITERAL_CLASS_NAME + "(\"" + literal.getLiteral() + "\", \"" + datatypePrefixedName
        + "\")";
  }
}
