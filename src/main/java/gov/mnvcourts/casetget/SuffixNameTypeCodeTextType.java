//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.03 at 11:26:33 PM CDT 
//


package gov.mnvcourts.casetget;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for SuffixNameTypeCodeTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuffixNameTypeCodeTextType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.courts.state.mn.us/CourtXML/3>SuffixNameType">
 *       &lt;attribute name="code" type="{http://www.courts.state.mn.us/CourtXML/3}SuffixNameTypeCodeType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuffixNameTypeCodeTextType", propOrder = {
    "value"
})
public class SuffixNameTypeCodeTextType {

    @XmlValue
    protected SuffixNameType value;
    @XmlAttribute(name = "code")
    protected SuffixNameTypeCodeType code;

    /**
     * This simple type enumerates values that are accepted for name suffix. 
     * 
     * @return
     *     possible object is
     *     {@link SuffixNameType }
     *     
     */
    public SuffixNameType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuffixNameType }
     *     
     */
    public void setValue(SuffixNameType value) {
        this.value = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link SuffixNameTypeCodeType }
     *     
     */
    public SuffixNameTypeCodeType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuffixNameTypeCodeType }
     *     
     */
    public void setCode(SuffixNameTypeCodeType value) {
        this.code = value;
    }

}
