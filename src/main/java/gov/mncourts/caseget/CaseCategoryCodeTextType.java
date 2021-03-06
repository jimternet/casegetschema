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
 * <p>Java class for CaseCategoryCodeTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseCategoryCodeTextType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;&gt;CaseCategoryTextType"&gt;
 *       &lt;attribute name="code" type="{}CaseCategoryCodeType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseCategoryCodeTextType", propOrder = {
    "value"
})
public class CaseCategoryCodeTextType {

    @XmlValue
    protected CaseCategoryTextType value;
    @XmlAttribute(name = "code")
    protected CaseCategoryCodeType code;

    /**
     * Enumerated list of high level case type categories
     * 
     * @return
     *     possible object is
     *     {@link CaseCategoryTextType }
     *     
     */
    public CaseCategoryTextType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseCategoryTextType }
     *     
     */
    public void setValue(CaseCategoryTextType value) {
        this.value = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CaseCategoryCodeType }
     *     
     */
    public CaseCategoryCodeType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseCategoryCodeType }
     *     
     */
    public void setCode(CaseCategoryCodeType value) {
        this.code = value;
    }

}
