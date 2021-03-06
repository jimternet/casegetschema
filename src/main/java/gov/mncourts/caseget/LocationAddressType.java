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


/**
 * The subset of JXDM elements the courts use to record a person's location of birth.
 * 
 * <p>Java class for LocationAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocationCityName" type="{}LocationCityNameType" minOccurs="0"/&gt;
 *         &lt;element name="LocationStateName" type="{}StateTextType" minOccurs="0"/&gt;
 *         &lt;element name="LocationStateCode" type="{}StateCodeType" minOccurs="0"/&gt;
 *         &lt;element name="LocationCountryName" type="{}CountryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationAddressType", propOrder = {
    "locationCityName",
    "locationStateName",
    "locationStateCode",
    "locationCountryName"
})
public class LocationAddressType {

    @XmlElement(name = "LocationCityName")
    protected String locationCityName;
    @XmlElement(name = "LocationStateName")
    @XmlSchemaType(name = "string")
    protected StateTextType locationStateName;
    @XmlElement(name = "LocationStateCode")
    @XmlSchemaType(name = "string")
    protected StateCodeType locationStateCode;
    @XmlElement(name = "LocationCountryName")
    protected String locationCountryName;

    /**
     * Gets the value of the locationCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCityName() {
        return locationCityName;
    }

    /**
     * Sets the value of the locationCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCityName(String value) {
        this.locationCityName = value;
    }

    /**
     * Gets the value of the locationStateName property.
     * 
     * @return
     *     possible object is
     *     {@link StateTextType }
     *     
     */
    public StateTextType getLocationStateName() {
        return locationStateName;
    }

    /**
     * Sets the value of the locationStateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateTextType }
     *     
     */
    public void setLocationStateName(StateTextType value) {
        this.locationStateName = value;
    }

    /**
     * Gets the value of the locationStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link StateCodeType }
     *     
     */
    public StateCodeType getLocationStateCode() {
        return locationStateCode;
    }

    /**
     * Sets the value of the locationStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateCodeType }
     *     
     */
    public void setLocationStateCode(StateCodeType value) {
        this.locationStateCode = value;
    }

    /**
     * Gets the value of the locationCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCountryName() {
        return locationCountryName;
    }

    /**
     * Sets the value of the locationCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCountryName(String value) {
        this.locationCountryName = value;
    }

}
