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
 *         &lt;element ref="{}AppearByDate" minOccurs="0"/&gt;
 *         &lt;element ref="{}AppearLocationText" minOccurs="0"/&gt;
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
    "appearByDate",
    "appearLocationText"
})
@XmlRootElement(name = "AppearBy")
public class AppearBy {

    @XmlElement(name = "AppearByDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar appearByDate;
    @XmlElement(name = "AppearLocationText", nillable = true)
    protected CourtLocationCodeTextType appearLocationText;

    /**
     * Gets the value of the appearByDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAppearByDate() {
        return appearByDate;
    }

    /**
     * Sets the value of the appearByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAppearByDate(XMLGregorianCalendar value) {
        this.appearByDate = value;
    }

    /**
     * Gets the value of the appearLocationText property.
     * 
     * @return
     *     possible object is
     *     {@link CourtLocationCodeTextType }
     *     
     */
    public CourtLocationCodeTextType getAppearLocationText() {
        return appearLocationText;
    }

    /**
     * Sets the value of the appearLocationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourtLocationCodeTextType }
     *     
     */
    public void setAppearLocationText(CourtLocationCodeTextType value) {
        this.appearLocationText = value;
    }

}