//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.04 at 12:20:40 AM CDT 
//


package gov.mncourts.caseget;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}PartyAddressBaseType"&gt;
 *       &lt;attribute name="caseCorrespondenceIndicator" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="partyCorrespondenceIndicator" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="currentKnownAddressIndicator" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="undeliverableIndicator" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyAddressType")
public class PartyAddressType
    extends PartyAddressBaseType
{

    @XmlAttribute(name = "caseCorrespondenceIndicator", required = true)
    protected boolean caseCorrespondenceIndicator;
    @XmlAttribute(name = "partyCorrespondenceIndicator", required = true)
    protected boolean partyCorrespondenceIndicator;
    @XmlAttribute(name = "currentKnownAddressIndicator", required = true)
    protected boolean currentKnownAddressIndicator;
    @XmlAttribute(name = "undeliverableIndicator", required = true)
    protected boolean undeliverableIndicator;

    /**
     * Gets the value of the caseCorrespondenceIndicator property.
     * 
     */
    public boolean isCaseCorrespondenceIndicator() {
        return caseCorrespondenceIndicator;
    }

    /**
     * Sets the value of the caseCorrespondenceIndicator property.
     * 
     */
    public void setCaseCorrespondenceIndicator(boolean value) {
        this.caseCorrespondenceIndicator = value;
    }

    /**
     * Gets the value of the partyCorrespondenceIndicator property.
     * 
     */
    public boolean isPartyCorrespondenceIndicator() {
        return partyCorrespondenceIndicator;
    }

    /**
     * Sets the value of the partyCorrespondenceIndicator property.
     * 
     */
    public void setPartyCorrespondenceIndicator(boolean value) {
        this.partyCorrespondenceIndicator = value;
    }

    /**
     * Gets the value of the currentKnownAddressIndicator property.
     * 
     */
    public boolean isCurrentKnownAddressIndicator() {
        return currentKnownAddressIndicator;
    }

    /**
     * Sets the value of the currentKnownAddressIndicator property.
     * 
     */
    public void setCurrentKnownAddressIndicator(boolean value) {
        this.currentKnownAddressIndicator = value;
    }

    /**
     * Gets the value of the undeliverableIndicator property.
     * 
     */
    public boolean isUndeliverableIndicator() {
        return undeliverableIndicator;
    }

    /**
     * Sets the value of the undeliverableIndicator property.
     * 
     */
    public void setUndeliverableIndicator(boolean value) {
        this.undeliverableIndicator = value;
    }

}
