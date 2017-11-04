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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about an identifier used to refer to a specific person who has obtained a driver's license. Sometimes referred to as driver license number, dlNumber.
 * 
 * <p>Java class for PersonDriverLicenseIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonDriverLicenseIDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{}ID1to20Type"/&gt;
 *         &lt;element name="IDJurisdictionCode" type="{}DriverLicenseStateType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonDriverLicenseIDType", propOrder = {
    "id",
    "idJurisdictionCode"
})
@XmlSeeAlso({
    PersonDriverLicenseID.class
})
public class PersonDriverLicenseIDType {

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "IDJurisdictionCode", required = true)
    @XmlSchemaType(name = "string")
    protected DriverLicenseStateType idJurisdictionCode;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the idJurisdictionCode property.
     * 
     * @return
     *     possible object is
     *     {@link DriverLicenseStateType }
     *     
     */
    public DriverLicenseStateType getIDJurisdictionCode() {
        return idJurisdictionCode;
    }

    /**
     * Sets the value of the idJurisdictionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverLicenseStateType }
     *     
     */
    public void setIDJurisdictionCode(DriverLicenseStateType value) {
        this.idJurisdictionCode = value;
    }

}