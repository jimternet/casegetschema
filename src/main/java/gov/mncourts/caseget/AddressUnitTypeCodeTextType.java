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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for AddressUnitTypeCodeTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressUnitTypeCodeTextType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;&gt;AddressUnitTypeType"&gt;
 *       &lt;attribute name="code" type="{}AddressUnitTypeCodeType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressUnitTypeCodeTextType", propOrder = {
    "value"
})
public class AddressUnitTypeCodeTextType {

    @XmlValue
    protected AddressUnitTypeType value;
    @XmlAttribute(name = "code")
    protected AddressUnitTypeCodeType code;

    /**
     * Enumerated list of address unit type values
     * 
     * @return
     *     possible object is
     *     {@link AddressUnitTypeType }
     *     
     */
    public AddressUnitTypeType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressUnitTypeType }
     *     
     */
    public void setValue(AddressUnitTypeType value) {
        this.value = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link AddressUnitTypeCodeType }
     *     
     */
    public AddressUnitTypeCodeType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressUnitTypeCodeType }
     *     
     */
    public void setCode(AddressUnitTypeCodeType value) {
        this.code = value;
    }

}