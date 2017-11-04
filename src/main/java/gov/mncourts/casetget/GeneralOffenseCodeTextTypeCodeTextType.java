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
 * <p>Java class for GeneralOffenseCodeTextTypeCodeTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralOffenseCodeTextTypeCodeTextType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.courts.state.mn.us/CourtXML/3>GeneralOffenseCodeType">
 *       &lt;attribute name="code" type="{http://www.courts.state.mn.us/CourtXML/3}GeneralOffenseCodeTypeCodeType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralOffenseCodeTextTypeCodeTextType", propOrder = {
    "value"
})
public class GeneralOffenseCodeTextTypeCodeTextType {

    @XmlValue
    protected GeneralOffenseCodeType value;
    @XmlAttribute(name = "code")
    protected GeneralOffenseCodeTypeCodeType code;

    /**
     * Enumerated General Offense Code Types - Literals are enumerated and the GOC code is contained in the document Annotation to the enumerated value.
     * 
     * @return
     *     possible object is
     *     {@link GeneralOffenseCodeType }
     *     
     */
    public GeneralOffenseCodeType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralOffenseCodeType }
     *     
     */
    public void setValue(GeneralOffenseCodeType value) {
        this.value = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralOffenseCodeTypeCodeType }
     *     
     */
    public GeneralOffenseCodeTypeCodeType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralOffenseCodeTypeCodeType }
     *     
     */
    public void setCode(GeneralOffenseCodeTypeCodeType value) {
        this.code = value;
    }

}