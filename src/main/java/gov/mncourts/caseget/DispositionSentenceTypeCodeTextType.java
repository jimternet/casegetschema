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
 * <p>Java class for DispositionSentenceTypeCodeTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DispositionSentenceTypeCodeTextType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;&gt;DispositionSentenceTypeTextType"&gt;
 *       &lt;attribute name="code" type="{}DispositionSentenceTypeCodeType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DispositionSentenceTypeCodeTextType", propOrder = {
    "value"
})
public class DispositionSentenceTypeCodeTextType {

    @XmlValue
    protected DispositionSentenceTypeTextType value;
    @XmlAttribute(name = "code")
    protected DispositionSentenceTypeCodeType code;

    /**
     * Enumerated the types of sentence disposition components.
     *                         This enumeration is not tied directly to a mncis code table and is maintained outside of MNCIS in the ServiceCatalog database.
     * 
     * @return
     *     possible object is
     *     {@link DispositionSentenceTypeTextType }
     *     
     */
    public DispositionSentenceTypeTextType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link DispositionSentenceTypeTextType }
     *     
     */
    public void setValue(DispositionSentenceTypeTextType value) {
        this.value = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link DispositionSentenceTypeCodeType }
     *     
     */
    public DispositionSentenceTypeCodeType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link DispositionSentenceTypeCodeType }
     *     
     */
    public void setCode(DispositionSentenceTypeCodeType value) {
        this.code = value;
    }

}