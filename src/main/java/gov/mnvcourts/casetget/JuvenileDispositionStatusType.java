//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.03 at 11:26:33 PM CDT 
//


package gov.mnvcourts.casetget;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for JuvenileDispositionStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JuvenileDispositionStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatusDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;choice>
 *           &lt;element name="StayedJuvenileAdultSentenceStatus">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice>
 *                     &lt;element name="Imposed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     &lt;element name="Until21Birthdate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                     &lt;element name="StayedDuration" type="{http://www.courts.state.mn.us/CourtXML/3}DurationOfStayType"/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="StatusText" type="{http://www.courts.state.mn.us/CourtXML/3}StatusTextType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JuvenileDispositionStatusType", propOrder = {
    "statusDate",
    "stayedJuvenileAdultSentenceStatus",
    "statusText"
})
public class JuvenileDispositionStatusType {

    @XmlElement(name = "StatusDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar statusDate;
    @XmlElement(name = "StayedJuvenileAdultSentenceStatus")
    protected JuvenileDispositionStatusType.StayedJuvenileAdultSentenceStatus stayedJuvenileAdultSentenceStatus;
    @XmlElement(name = "StatusText")
    protected StatusTextType statusText;

    /**
     * Gets the value of the statusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusDate() {
        return statusDate;
    }

    /**
     * Sets the value of the statusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusDate(XMLGregorianCalendar value) {
        this.statusDate = value;
    }

    /**
     * Gets the value of the stayedJuvenileAdultSentenceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JuvenileDispositionStatusType.StayedJuvenileAdultSentenceStatus }
     *     
     */
    public JuvenileDispositionStatusType.StayedJuvenileAdultSentenceStatus getStayedJuvenileAdultSentenceStatus() {
        return stayedJuvenileAdultSentenceStatus;
    }

    /**
     * Sets the value of the stayedJuvenileAdultSentenceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JuvenileDispositionStatusType.StayedJuvenileAdultSentenceStatus }
     *     
     */
    public void setStayedJuvenileAdultSentenceStatus(JuvenileDispositionStatusType.StayedJuvenileAdultSentenceStatus value) {
        this.stayedJuvenileAdultSentenceStatus = value;
    }

    /**
     * Gets the value of the statusText property.
     * 
     * @return
     *     possible object is
     *     {@link StatusTextType }
     *     
     */
    public StatusTextType getStatusText() {
        return statusText;
    }

    /**
     * Sets the value of the statusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusTextType }
     *     
     */
    public void setStatusText(StatusTextType value) {
        this.statusText = value;
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
     *       &lt;choice>
     *         &lt;element name="Imposed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="Until21Birthdate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="StayedDuration" type="{http://www.courts.state.mn.us/CourtXML/3}DurationOfStayType"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "imposed",
        "until21Birthdate",
        "stayedDuration"
    })
    public static class StayedJuvenileAdultSentenceStatus {

        @XmlElement(name = "Imposed")
        protected Boolean imposed;
        @XmlElement(name = "Until21Birthdate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar until21Birthdate;
        @XmlElement(name = "StayedDuration")
        protected DurationOfStayType stayedDuration;

        /**
         * Gets the value of the imposed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isImposed() {
            return imposed;
        }

        /**
         * Sets the value of the imposed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setImposed(Boolean value) {
            this.imposed = value;
        }

        /**
         * Gets the value of the until21Birthdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getUntil21Birthdate() {
            return until21Birthdate;
        }

        /**
         * Sets the value of the until21Birthdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setUntil21Birthdate(XMLGregorianCalendar value) {
            this.until21Birthdate = value;
        }

        /**
         * Gets the value of the stayedDuration property.
         * 
         * @return
         *     possible object is
         *     {@link DurationOfStayType }
         *     
         */
        public DurationOfStayType getStayedDuration() {
            return stayedDuration;
        }

        /**
         * Sets the value of the stayedDuration property.
         * 
         * @param value
         *     allowed object is
         *     {@link DurationOfStayType }
         *     
         */
        public void setStayedDuration(DurationOfStayType value) {
            this.stayedDuration = value;
        }

    }

}
