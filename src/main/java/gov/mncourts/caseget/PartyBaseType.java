//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.04 at 12:20:40 AM CDT 
//


package gov.mncourts.caseget;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PartyName" type="{}PartyNameType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="PartyCaseAssociationText" type="{}ExtendedPartyConnectionTypeCodeTextType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="partyKey" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyBaseType", propOrder = {
    "partyName",
    "partyCaseAssociationText"
})
@XmlSeeAlso({
    WitnessType.class,
    gov.mncourts.caseget.NoContactOrderType.OrderSubject.class,
    PartyNameAddressPhoneEmailType.class
})
public class PartyBaseType {

    @XmlElement(name = "PartyName", required = true)
    protected List<PartyNameType> partyName;
    @XmlElement(name = "PartyCaseAssociationText")
    protected List<ExtendedPartyConnectionTypeCodeTextType> partyCaseAssociationText;
    @XmlAttribute(name = "partyKey", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger partyKey;

    /**
     * Gets the value of the partyName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyNameType }
     * 
     * 
     */
    public List<PartyNameType> getPartyName() {
        if (partyName == null) {
            partyName = new ArrayList<PartyNameType>();
        }
        return this.partyName;
    }

    /**
     * Gets the value of the partyCaseAssociationText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyCaseAssociationText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyCaseAssociationText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedPartyConnectionTypeCodeTextType }
     * 
     * 
     */
    public List<ExtendedPartyConnectionTypeCodeTextType> getPartyCaseAssociationText() {
        if (partyCaseAssociationText == null) {
            partyCaseAssociationText = new ArrayList<ExtendedPartyConnectionTypeCodeTextType>();
        }
        return this.partyCaseAssociationText;
    }

    /**
     * Gets the value of the partyKey property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPartyKey() {
        return partyKey;
    }

    /**
     * Sets the value of the partyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPartyKey(BigInteger value) {
        this.partyKey = value;
    }

}