//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.03 at 11:26:33 PM CDT 
//


package gov.mnvcourts.casetget;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ParentGuardianCustodianType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParentGuardianCustodianType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.courts.state.mn.us/CourtXML/3}PartyNameAddressPhoneEmailType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="Group" type="{http://www.courts.state.mn.us/CourtXML/3}GroupType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ChildReference" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="partyKey" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RepresentedBy" type="{http://www.courts.state.mn.us/CourtXML/3}RepresentedByType" minOccurs="0"/>
 *         &lt;element name="PersonBirthDate" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonSexText" type="{http://www.courts.state.mn.us/CourtXML/3}GenderTypeCodeTextType" minOccurs="0"/>
 *         &lt;element name="ForeignLanguageText" type="{http://www.courts.state.mn.us/CourtXML/3}ForeignLanguageTextType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParentGuardianCustodianType", propOrder = {
    "group",
    "childReference",
    "representedBy",
    "personBirthDate",
    "personSexText",
    "foreignLanguageText"
})
public class ParentGuardianCustodianType
    extends PartyNameAddressPhoneEmailType
{

    @XmlElement(name = "Group")
    protected List<GroupType> group;
    @XmlElement(name = "ChildReference")
    protected List<ParentGuardianCustodianType.ChildReference> childReference;
    @XmlElement(name = "RepresentedBy")
    protected RepresentedByType representedBy;
    @XmlElement(name = "PersonBirthDate")
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> personBirthDate;
    @XmlElement(name = "PersonSexText")
    protected GenderTypeCodeTextType personSexText;
    @XmlElement(name = "ForeignLanguageText")
    protected List<ForeignLanguageTextType> foreignLanguageText;

    /**
     * Gets the value of the group property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the group property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupType }
     * 
     * 
     */
    public List<GroupType> getGroup() {
        if (group == null) {
            group = new ArrayList<GroupType>();
        }
        return this.group;
    }

    /**
     * Gets the value of the childReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParentGuardianCustodianType.ChildReference }
     * 
     * 
     */
    public List<ParentGuardianCustodianType.ChildReference> getChildReference() {
        if (childReference == null) {
            childReference = new ArrayList<ParentGuardianCustodianType.ChildReference>();
        }
        return this.childReference;
    }

    /**
     * Gets the value of the representedBy property.
     * 
     * @return
     *     possible object is
     *     {@link RepresentedByType }
     *     
     */
    public RepresentedByType getRepresentedBy() {
        return representedBy;
    }

    /**
     * Sets the value of the representedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepresentedByType }
     *     
     */
    public void setRepresentedBy(RepresentedByType value) {
        this.representedBy = value;
    }

    /**
     * Gets the value of the personBirthDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personBirthDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonBirthDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getPersonBirthDate() {
        if (personBirthDate == null) {
            personBirthDate = new ArrayList<XMLGregorianCalendar>();
        }
        return this.personBirthDate;
    }

    /**
     * Gets the value of the personSexText property.
     * 
     * @return
     *     possible object is
     *     {@link GenderTypeCodeTextType }
     *     
     */
    public GenderTypeCodeTextType getPersonSexText() {
        return personSexText;
    }

    /**
     * Sets the value of the personSexText property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderTypeCodeTextType }
     *     
     */
    public void setPersonSexText(GenderTypeCodeTextType value) {
        this.personSexText = value;
    }

    /**
     * Gets the value of the foreignLanguageText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foreignLanguageText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForeignLanguageText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForeignLanguageTextType }
     * 
     * 
     */
    public List<ForeignLanguageTextType> getForeignLanguageText() {
        if (foreignLanguageText == null) {
            foreignLanguageText = new ArrayList<ForeignLanguageTextType>();
        }
        return this.foreignLanguageText;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="partyKey" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ChildReference {

        @XmlAttribute(name = "partyKey", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger partyKey;

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

}
