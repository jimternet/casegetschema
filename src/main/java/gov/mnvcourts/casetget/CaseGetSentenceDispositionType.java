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


/**
 * <p>Java class for CaseGetSentenceDispositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseGetSentenceDispositionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.courts.state.mn.us/CourtXML/3}CaseGetSentenceDelinquencyDispositionEventType">
 *       &lt;sequence>
 *         &lt;element name="Charges">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ChargeDisposition" type="{http://www.courts.state.mn.us/CourtXML/3}CaseGetChargeDispositionType" maxOccurs="unbounded"/>
 *                   &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}SentenceChargeSeverityLevel" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SentenceDispositionDetail" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.courts.state.mn.us/CourtXML/3}DispositionComponentType">
 *                 &lt;sequence>
 *                   &lt;element name="DispositionConditionElement" type="{http://www.courts.state.mn.us/CourtXML/3}DispositionConditionElementType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="DispositionComponentStatus" type="{http://www.courts.state.mn.us/CourtXML/3}StatusType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SentenceEventHistoryReference" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="sentenceEventKey" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SentenceHistoryReference" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="sentenceDelinquencyDispositionKey" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="sentenceDelinquencyDispositionKey" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="sentenceEventKey" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseGetSentenceDispositionType", propOrder = {
    "charges",
    "sentenceDispositionDetail",
    "sentenceEventHistoryReference",
    "sentenceHistoryReference"
})
public class CaseGetSentenceDispositionType
    extends CaseGetSentenceDelinquencyDispositionEventType
{

    @XmlElement(name = "Charges", required = true)
    protected CaseGetSentenceDispositionType.Charges charges;
    @XmlElement(name = "SentenceDispositionDetail")
    protected List<CaseGetSentenceDispositionType.SentenceDispositionDetail> sentenceDispositionDetail;
    @XmlElement(name = "SentenceEventHistoryReference")
    protected CaseGetSentenceDispositionType.SentenceEventHistoryReference sentenceEventHistoryReference;
    @XmlElement(name = "SentenceHistoryReference")
    protected CaseGetSentenceDispositionType.SentenceHistoryReference sentenceHistoryReference;
    @XmlAttribute(name = "sentenceDelinquencyDispositionKey", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sentenceDelinquencyDispositionKey;
    @XmlAttribute(name = "sentenceEventKey", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sentenceEventKey;

    /**
     * Gets the value of the charges property.
     * 
     * @return
     *     possible object is
     *     {@link CaseGetSentenceDispositionType.Charges }
     *     
     */
    public CaseGetSentenceDispositionType.Charges getCharges() {
        return charges;
    }

    /**
     * Sets the value of the charges property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseGetSentenceDispositionType.Charges }
     *     
     */
    public void setCharges(CaseGetSentenceDispositionType.Charges value) {
        this.charges = value;
    }

    /**
     * Gets the value of the sentenceDispositionDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sentenceDispositionDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSentenceDispositionDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CaseGetSentenceDispositionType.SentenceDispositionDetail }
     * 
     * 
     */
    public List<CaseGetSentenceDispositionType.SentenceDispositionDetail> getSentenceDispositionDetail() {
        if (sentenceDispositionDetail == null) {
            sentenceDispositionDetail = new ArrayList<CaseGetSentenceDispositionType.SentenceDispositionDetail>();
        }
        return this.sentenceDispositionDetail;
    }

    /**
     * Gets the value of the sentenceEventHistoryReference property.
     * 
     * @return
     *     possible object is
     *     {@link CaseGetSentenceDispositionType.SentenceEventHistoryReference }
     *     
     */
    public CaseGetSentenceDispositionType.SentenceEventHistoryReference getSentenceEventHistoryReference() {
        return sentenceEventHistoryReference;
    }

    /**
     * Sets the value of the sentenceEventHistoryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseGetSentenceDispositionType.SentenceEventHistoryReference }
     *     
     */
    public void setSentenceEventHistoryReference(CaseGetSentenceDispositionType.SentenceEventHistoryReference value) {
        this.sentenceEventHistoryReference = value;
    }

    /**
     * Gets the value of the sentenceHistoryReference property.
     * 
     * @return
     *     possible object is
     *     {@link CaseGetSentenceDispositionType.SentenceHistoryReference }
     *     
     */
    public CaseGetSentenceDispositionType.SentenceHistoryReference getSentenceHistoryReference() {
        return sentenceHistoryReference;
    }

    /**
     * Sets the value of the sentenceHistoryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseGetSentenceDispositionType.SentenceHistoryReference }
     *     
     */
    public void setSentenceHistoryReference(CaseGetSentenceDispositionType.SentenceHistoryReference value) {
        this.sentenceHistoryReference = value;
    }

    /**
     * Gets the value of the sentenceDelinquencyDispositionKey property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSentenceDelinquencyDispositionKey() {
        return sentenceDelinquencyDispositionKey;
    }

    /**
     * Sets the value of the sentenceDelinquencyDispositionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSentenceDelinquencyDispositionKey(BigInteger value) {
        this.sentenceDelinquencyDispositionKey = value;
    }

    /**
     * Gets the value of the sentenceEventKey property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSentenceEventKey() {
        return sentenceEventKey;
    }

    /**
     * Sets the value of the sentenceEventKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSentenceEventKey(BigInteger value) {
        this.sentenceEventKey = value;
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
     *       &lt;sequence>
     *         &lt;element name="ChargeDisposition" type="{http://www.courts.state.mn.us/CourtXML/3}CaseGetChargeDispositionType" maxOccurs="unbounded"/>
     *         &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}SentenceChargeSeverityLevel" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "chargeDisposition",
        "sentenceChargeSeverityLevel"
    })
    public static class Charges {

        @XmlElement(name = "ChargeDisposition", required = true)
        protected List<CaseGetChargeDispositionType> chargeDisposition;
        @XmlElement(name = "SentenceChargeSeverityLevel")
        protected OffenseSeverityLevelTypeCodeTextType sentenceChargeSeverityLevel;

        /**
         * Gets the value of the chargeDisposition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the chargeDisposition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChargeDisposition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CaseGetChargeDispositionType }
         * 
         * 
         */
        public List<CaseGetChargeDispositionType> getChargeDisposition() {
            if (chargeDisposition == null) {
                chargeDisposition = new ArrayList<CaseGetChargeDispositionType>();
            }
            return this.chargeDisposition;
        }

        /**
         * Gets the value of the sentenceChargeSeverityLevel property.
         * 
         * @return
         *     possible object is
         *     {@link OffenseSeverityLevelTypeCodeTextType }
         *     
         */
        public OffenseSeverityLevelTypeCodeTextType getSentenceChargeSeverityLevel() {
            return sentenceChargeSeverityLevel;
        }

        /**
         * Sets the value of the sentenceChargeSeverityLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link OffenseSeverityLevelTypeCodeTextType }
         *     
         */
        public void setSentenceChargeSeverityLevel(OffenseSeverityLevelTypeCodeTextType value) {
            this.sentenceChargeSeverityLevel = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.courts.state.mn.us/CourtXML/3}DispositionComponentType">
     *       &lt;sequence>
     *         &lt;element name="DispositionConditionElement" type="{http://www.courts.state.mn.us/CourtXML/3}DispositionConditionElementType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="DispositionComponentStatus" type="{http://www.courts.state.mn.us/CourtXML/3}StatusType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dispositionConditionElement",
        "dispositionComponentStatus"
    })
    public static class SentenceDispositionDetail
        extends DispositionComponentType
    {

        @XmlElement(name = "DispositionConditionElement")
        protected List<DispositionConditionElementType> dispositionConditionElement;
        @XmlElement(name = "DispositionComponentStatus")
        protected StatusType dispositionComponentStatus;

        /**
         * Gets the value of the dispositionConditionElement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dispositionConditionElement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDispositionConditionElement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DispositionConditionElementType }
         * 
         * 
         */
        public List<DispositionConditionElementType> getDispositionConditionElement() {
            if (dispositionConditionElement == null) {
                dispositionConditionElement = new ArrayList<DispositionConditionElementType>();
            }
            return this.dispositionConditionElement;
        }

        /**
         * Gets the value of the dispositionComponentStatus property.
         * 
         * @return
         *     possible object is
         *     {@link StatusType }
         *     
         */
        public StatusType getDispositionComponentStatus() {
            return dispositionComponentStatus;
        }

        /**
         * Sets the value of the dispositionComponentStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusType }
         *     
         */
        public void setDispositionComponentStatus(StatusType value) {
            this.dispositionComponentStatus = value;
        }

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
     *       &lt;attribute name="sentenceEventKey" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SentenceEventHistoryReference {

        @XmlAttribute(name = "sentenceEventKey")
        @XmlSchemaType(name = "anySimpleType")
        protected String sentenceEventKey;

        /**
         * Gets the value of the sentenceEventKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSentenceEventKey() {
            return sentenceEventKey;
        }

        /**
         * Sets the value of the sentenceEventKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSentenceEventKey(String value) {
            this.sentenceEventKey = value;
        }

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
     *       &lt;attribute name="sentenceDelinquencyDispositionKey" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SentenceHistoryReference {

        @XmlAttribute(name = "sentenceDelinquencyDispositionKey", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger sentenceDelinquencyDispositionKey;

        /**
         * Gets the value of the sentenceDelinquencyDispositionKey property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSentenceDelinquencyDispositionKey() {
            return sentenceDelinquencyDispositionKey;
        }

        /**
         * Sets the value of the sentenceDelinquencyDispositionKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSentenceDelinquencyDispositionKey(BigInteger value) {
            this.sentenceDelinquencyDispositionKey = value;
        }

    }

}
