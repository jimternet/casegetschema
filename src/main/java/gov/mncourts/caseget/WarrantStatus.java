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
 *         &lt;element ref="{}WarrantStatusTypeText"/&gt;
 *         &lt;element ref="{}WarrantStatusDate"/&gt;
 *         &lt;element ref="{}WarrantStatusTime" minOccurs="0"/&gt;
 *         &lt;element ref="{}WarrantLocation"/&gt;
 *         &lt;element ref="{}WarrantStatusComment" minOccurs="0"/&gt;
 *         &lt;element name="CourtORI" type="{}JudicialAgencyORIIDType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="currentStatusIndicator" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "warrantStatusTypeText",
    "warrantStatusDate",
    "warrantStatusTime",
    "warrantLocation",
    "warrantStatusComment",
    "courtORI"
})
@XmlRootElement(name = "WarrantStatus")
public class WarrantStatus {

    @XmlElement(name = "WarrantStatusTypeText", required = true)
    protected WarrantStatusTypeCodeTextType warrantStatusTypeText;
    @XmlElement(name = "WarrantStatusDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar warrantStatusDate;
    @XmlElement(name = "WarrantStatusTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar warrantStatusTime;
    @XmlElement(name = "WarrantLocation", required = true)
    protected WarrantLocationTypeCodeTextType warrantLocation;
    @XmlElement(name = "WarrantStatusComment")
    protected String warrantStatusComment;
    @XmlElement(name = "CourtORI", required = true)
    protected JudicialAgencyORIIDType courtORI;
    @XmlAttribute(name = "currentStatusIndicator", required = true)
    protected boolean currentStatusIndicator;

    /**
     * Gets the value of the warrantStatusTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link WarrantStatusTypeCodeTextType }
     *     
     */
    public WarrantStatusTypeCodeTextType getWarrantStatusTypeText() {
        return warrantStatusTypeText;
    }

    /**
     * Sets the value of the warrantStatusTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantStatusTypeCodeTextType }
     *     
     */
    public void setWarrantStatusTypeText(WarrantStatusTypeCodeTextType value) {
        this.warrantStatusTypeText = value;
    }

    /**
     * Gets the value of the warrantStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWarrantStatusDate() {
        return warrantStatusDate;
    }

    /**
     * Sets the value of the warrantStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWarrantStatusDate(XMLGregorianCalendar value) {
        this.warrantStatusDate = value;
    }

    /**
     * Gets the value of the warrantStatusTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWarrantStatusTime() {
        return warrantStatusTime;
    }

    /**
     * Sets the value of the warrantStatusTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWarrantStatusTime(XMLGregorianCalendar value) {
        this.warrantStatusTime = value;
    }

    /**
     * Gets the value of the warrantLocation property.
     * 
     * @return
     *     possible object is
     *     {@link WarrantLocationTypeCodeTextType }
     *     
     */
    public WarrantLocationTypeCodeTextType getWarrantLocation() {
        return warrantLocation;
    }

    /**
     * Sets the value of the warrantLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantLocationTypeCodeTextType }
     *     
     */
    public void setWarrantLocation(WarrantLocationTypeCodeTextType value) {
        this.warrantLocation = value;
    }

    /**
     * Gets the value of the warrantStatusComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantStatusComment() {
        return warrantStatusComment;
    }

    /**
     * Sets the value of the warrantStatusComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantStatusComment(String value) {
        this.warrantStatusComment = value;
    }

    /**
     * Gets the value of the courtORI property.
     * 
     * @return
     *     possible object is
     *     {@link JudicialAgencyORIIDType }
     *     
     */
    public JudicialAgencyORIIDType getCourtORI() {
        return courtORI;
    }

    /**
     * Sets the value of the courtORI property.
     * 
     * @param value
     *     allowed object is
     *     {@link JudicialAgencyORIIDType }
     *     
     */
    public void setCourtORI(JudicialAgencyORIIDType value) {
        this.courtORI = value;
    }

    /**
     * Gets the value of the currentStatusIndicator property.
     * 
     */
    public boolean isCurrentStatusIndicator() {
        return currentStatusIndicator;
    }

    /**
     * Sets the value of the currentStatusIndicator property.
     * 
     */
    public void setCurrentStatusIndicator(boolean value) {
        this.currentStatusIndicator = value;
    }

}