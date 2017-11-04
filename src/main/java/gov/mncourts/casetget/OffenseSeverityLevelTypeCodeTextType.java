//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.03 at 11:31:16 PM CDT 
//


package gov.mncourts.casetget;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for OffenseSeverityLevelTypeCodeTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OffenseSeverityLevelTypeCodeTextType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.courts.state.mn.us/CourtXML/3>OffenseSeverityLevelType">
 *       &lt;attribute name="code" type="{http://www.courts.state.mn.us/CourtXML/3}OffenseSeverityLevelTypeCodeType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffenseSeverityLevelTypeCodeTextType", propOrder = {
    "value"
})
public class OffenseSeverityLevelTypeCodeTextType {

    @XmlValue
    protected OffenseSeverityLevelType value;
    @XmlAttribute(name = "code")
    protected OffenseSeverityLevelTypeCodeType code;

    /**
     * Enumerates Severity Level of Offenses for Charges
     * 
     * @return
     *     possible object is
     *     {@link OffenseSeverityLevelType }
     *     
     */
    public OffenseSeverityLevelType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffenseSeverityLevelType }
     *     
     */
    public void setValue(OffenseSeverityLevelType value) {
        this.value = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link OffenseSeverityLevelTypeCodeType }
     *     
     */
    public OffenseSeverityLevelTypeCodeType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffenseSeverityLevelTypeCodeType }
     *     
     */
    public void setCode(OffenseSeverityLevelTypeCodeType value) {
        this.code = value;
    }

}