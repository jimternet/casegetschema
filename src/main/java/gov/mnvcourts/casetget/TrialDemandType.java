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
 * <p>Java class for TrialDemandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrialDemandType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}TrialDemandType"/>
 *         &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}TrialDemandDate"/>
 *         &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}TrialDemandAction"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrialDemandType", propOrder = {
    "trialDemandType",
    "trialDemandDate",
    "trialDemandAction"
})
public class TrialDemandType {

    @XmlElement(name = "TrialDemandType", required = true)
    protected TrialDemandTypeType trialDemandType;
    @XmlElement(name = "TrialDemandDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar trialDemandDate;
    @XmlElement(name = "TrialDemandAction", required = true)
    protected TrialDemandActionType trialDemandAction;

    /**
     * Gets the value of the trialDemandType property.
     * 
     * @return
     *     possible object is
     *     {@link TrialDemandTypeType }
     *     
     */
    public TrialDemandTypeType getTrialDemandType() {
        return trialDemandType;
    }

    /**
     * Sets the value of the trialDemandType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrialDemandTypeType }
     *     
     */
    public void setTrialDemandType(TrialDemandTypeType value) {
        this.trialDemandType = value;
    }

    /**
     * Gets the value of the trialDemandDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrialDemandDate() {
        return trialDemandDate;
    }

    /**
     * Sets the value of the trialDemandDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrialDemandDate(XMLGregorianCalendar value) {
        this.trialDemandDate = value;
    }

    /**
     * Gets the value of the trialDemandAction property.
     * 
     * @return
     *     possible object is
     *     {@link TrialDemandActionType }
     *     
     */
    public TrialDemandActionType getTrialDemandAction() {
        return trialDemandAction;
    }

    /**
     * Sets the value of the trialDemandAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrialDemandActionType }
     *     
     */
    public void setTrialDemandAction(TrialDemandActionType value) {
        this.trialDemandAction = value;
    }

}
