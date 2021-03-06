//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.04 at 12:20:40 AM CDT 
//


package gov.mncourts.caseget;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MonetaryAwardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryAwardType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OriginalPrincipalDueAmount" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="CurrentPrincipalDueAmount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CurrentCostsDueAmount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CurrentInterestDueAmount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CurrentBalance" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="CurrentBalanceDueAmount" type="{}CurrencyType"/&gt;
 *                   &lt;element name="CurrentBalanceDueText" type="{}BalanceDueCodeTextType"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InterestRateTypeText" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="InterestStay" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="StayDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                   &lt;element name="RestartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryAwardType", propOrder = {
    "originalPrincipalDueAmount",
    "currentPrincipalDueAmount",
    "currentCostsDueAmount",
    "currentInterestDueAmount",
    "currentBalance",
    "interestRateTypeText",
    "interestStay"
})
public class MonetaryAwardType {

    @XmlElement(name = "OriginalPrincipalDueAmount", required = true)
    protected Object originalPrincipalDueAmount;
    @XmlElement(name = "CurrentPrincipalDueAmount")
    protected Object currentPrincipalDueAmount;
    @XmlElement(name = "CurrentCostsDueAmount")
    protected Object currentCostsDueAmount;
    @XmlElement(name = "CurrentInterestDueAmount")
    protected Object currentInterestDueAmount;
    @XmlElement(name = "CurrentBalance")
    protected MonetaryAwardType.CurrentBalance currentBalance;
    @XmlElement(name = "InterestRateTypeText", required = true)
    protected Object interestRateTypeText;
    @XmlElement(name = "InterestStay")
    protected MonetaryAwardType.InterestStay interestStay;

    /**
     * Gets the value of the originalPrincipalDueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOriginalPrincipalDueAmount() {
        return originalPrincipalDueAmount;
    }

    /**
     * Sets the value of the originalPrincipalDueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOriginalPrincipalDueAmount(Object value) {
        this.originalPrincipalDueAmount = value;
    }

    /**
     * Gets the value of the currentPrincipalDueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCurrentPrincipalDueAmount() {
        return currentPrincipalDueAmount;
    }

    /**
     * Sets the value of the currentPrincipalDueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCurrentPrincipalDueAmount(Object value) {
        this.currentPrincipalDueAmount = value;
    }

    /**
     * Gets the value of the currentCostsDueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCurrentCostsDueAmount() {
        return currentCostsDueAmount;
    }

    /**
     * Sets the value of the currentCostsDueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCurrentCostsDueAmount(Object value) {
        this.currentCostsDueAmount = value;
    }

    /**
     * Gets the value of the currentInterestDueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCurrentInterestDueAmount() {
        return currentInterestDueAmount;
    }

    /**
     * Sets the value of the currentInterestDueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCurrentInterestDueAmount(Object value) {
        this.currentInterestDueAmount = value;
    }

    /**
     * Gets the value of the currentBalance property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAwardType.CurrentBalance }
     *     
     */
    public MonetaryAwardType.CurrentBalance getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Sets the value of the currentBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAwardType.CurrentBalance }
     *     
     */
    public void setCurrentBalance(MonetaryAwardType.CurrentBalance value) {
        this.currentBalance = value;
    }

    /**
     * Gets the value of the interestRateTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInterestRateTypeText() {
        return interestRateTypeText;
    }

    /**
     * Sets the value of the interestRateTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInterestRateTypeText(Object value) {
        this.interestRateTypeText = value;
    }

    /**
     * Gets the value of the interestStay property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAwardType.InterestStay }
     *     
     */
    public MonetaryAwardType.InterestStay getInterestStay() {
        return interestStay;
    }

    /**
     * Sets the value of the interestStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAwardType.InterestStay }
     *     
     */
    public void setInterestStay(MonetaryAwardType.InterestStay value) {
        this.interestStay = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice&gt;
     *         &lt;element name="CurrentBalanceDueAmount" type="{}CurrencyType"/&gt;
     *         &lt;element name="CurrentBalanceDueText" type="{}BalanceDueCodeTextType"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "currentBalanceDueAmount",
        "currentBalanceDueText"
    })
    public static class CurrentBalance {

        @XmlElement(name = "CurrentBalanceDueAmount")
        protected Double currentBalanceDueAmount;
        @XmlElement(name = "CurrentBalanceDueText")
        protected BalanceDueCodeTextType currentBalanceDueText;

        /**
         * Gets the value of the currentBalanceDueAmount property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getCurrentBalanceDueAmount() {
            return currentBalanceDueAmount;
        }

        /**
         * Sets the value of the currentBalanceDueAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setCurrentBalanceDueAmount(Double value) {
            this.currentBalanceDueAmount = value;
        }

        /**
         * Gets the value of the currentBalanceDueText property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceDueCodeTextType }
         *     
         */
        public BalanceDueCodeTextType getCurrentBalanceDueText() {
            return currentBalanceDueText;
        }

        /**
         * Sets the value of the currentBalanceDueText property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceDueCodeTextType }
         *     
         */
        public void setCurrentBalanceDueText(BalanceDueCodeTextType value) {
            this.currentBalanceDueText = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="StayDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *         &lt;element name="RestartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "stayDate",
        "restartDate"
    })
    public static class InterestStay {

        @XmlElement(name = "StayDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar stayDate;
        @XmlElement(name = "RestartDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar restartDate;

        /**
         * Gets the value of the stayDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStayDate() {
            return stayDate;
        }

        /**
         * Sets the value of the stayDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStayDate(XMLGregorianCalendar value) {
            this.stayDate = value;
        }

        /**
         * Gets the value of the restartDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRestartDate() {
            return restartDate;
        }

        /**
         * Sets the value of the restartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRestartDate(XMLGregorianCalendar value) {
            this.restartDate = value;
        }

    }

}
