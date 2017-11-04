//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.04 at 12:20:40 AM CDT 
//


package gov.mncourts.caseget;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyNameAddressPhoneEmailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyNameAddressPhoneEmailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}PartyBaseType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="PartyAddress" type="{}PartyAddressType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PartyTelephoneNumber" type="{}TelephoneNumberType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}PartyEmail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyNameAddressPhoneEmailType", propOrder = {
    "partyAddress",
    "partyTelephoneNumber",
    "partyEmail"
})
@XmlSeeAlso({
    PartyToTheActionType.class,
    CasePetitionerPlaintiffType.class,
    CaseRespondentType.class,
    ParentGuardianCustodianType.class,
    VictimType.class,
    gov.mncourts.caseget.NoContactOrderType.ProtectedParty.class,
    gov.mncourts.caseget.JudgmentSupportType.OnBehalfOf.class,
    PartyDetailType.class
})
public class PartyNameAddressPhoneEmailType
    extends PartyBaseType
{

    @XmlElement(name = "PartyAddress")
    protected List<PartyAddressType> partyAddress;
    @XmlElement(name = "PartyTelephoneNumber")
    protected List<TelephoneNumberType> partyTelephoneNumber;
    @XmlElement(name = "PartyEmail")
    protected List<PartyEmail> partyEmail;

    /**
     * Gets the value of the partyAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyAddressType }
     * 
     * 
     */
    public List<PartyAddressType> getPartyAddress() {
        if (partyAddress == null) {
            partyAddress = new ArrayList<PartyAddressType>();
        }
        return this.partyAddress;
    }

    /**
     * Gets the value of the partyTelephoneNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyTelephoneNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyTelephoneNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelephoneNumberType }
     * 
     * 
     */
    public List<TelephoneNumberType> getPartyTelephoneNumber() {
        if (partyTelephoneNumber == null) {
            partyTelephoneNumber = new ArrayList<TelephoneNumberType>();
        }
        return this.partyTelephoneNumber;
    }

    /**
     * Gets the value of the partyEmail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyEmail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyEmail }
     * 
     * 
     */
    public List<PartyEmail> getPartyEmail() {
        if (partyEmail == null) {
            partyEmail = new ArrayList<PartyEmail>();
        }
        return this.partyEmail;
    }

}