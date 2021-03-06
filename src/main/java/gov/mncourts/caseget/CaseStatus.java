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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="CaseStatusText" type="{}CaseStatusTypeCodeTextType"/&gt;
 *         &lt;element name="CaseStatusDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="CaseStatusComment" type="{}CommentType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="currentStatusIndicator" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "caseStatusText",
    "caseStatusDate",
    "caseStatusComment"
})
@XmlRootElement(name = "CaseStatus")
public class CaseStatus {

    @XmlElement(name = "CaseStatusText", required = true)
    protected CaseStatusTypeCodeTextType caseStatusText;
    @XmlElement(name = "CaseStatusDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar caseStatusDate;
    @XmlElement(name = "CaseStatusComment")
    protected String caseStatusComment;
    @XmlAttribute(name = "currentStatusIndicator", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String currentStatusIndicator;

    /**
     * Gets the value of the caseStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link CaseStatusTypeCodeTextType }
     *     
     */
    public CaseStatusTypeCodeTextType getCaseStatusText() {
        return caseStatusText;
    }

    /**
     * Sets the value of the caseStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseStatusTypeCodeTextType }
     *     
     */
    public void setCaseStatusText(CaseStatusTypeCodeTextType value) {
        this.caseStatusText = value;
    }

    /**
     * Gets the value of the caseStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaseStatusDate() {
        return caseStatusDate;
    }

    /**
     * Sets the value of the caseStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaseStatusDate(XMLGregorianCalendar value) {
        this.caseStatusDate = value;
    }

    /**
     * Gets the value of the caseStatusComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseStatusComment() {
        return caseStatusComment;
    }

    /**
     * Sets the value of the caseStatusComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseStatusComment(String value) {
        this.caseStatusComment = value;
    }

    /**
     * Gets the value of the currentStatusIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentStatusIndicator() {
        return currentStatusIndicator;
    }

    /**
     * Sets the value of the currentStatusIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentStatusIndicator(String value) {
        this.currentStatusIndicator = value;
    }

}
