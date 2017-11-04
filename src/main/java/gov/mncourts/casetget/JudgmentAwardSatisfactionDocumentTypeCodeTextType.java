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
 * <p>Java class for JudgmentAwardSatisfactionDocumentTypeCodeTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JudgmentAwardSatisfactionDocumentTypeCodeTextType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.courts.state.mn.us/CourtXML/3>JudgmentAwardSatisfactionDocumentTypeTextType">
 *       &lt;attribute name="code" type="{http://www.courts.state.mn.us/CourtXML/3}JudgmentAwardSatisfactionDocumentTypeCodeType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JudgmentAwardSatisfactionDocumentTypeCodeTextType", propOrder = {
    "value"
})
public class JudgmentAwardSatisfactionDocumentTypeCodeTextType {

    @XmlValue
    protected JudgmentAwardSatisfactionDocumentTypeTextType value;
    @XmlAttribute(name = "code")
    protected JudgmentAwardSatisfactionDocumentTypeCodeType code;

    /**
     * Enumerated list of judgment satisfaction document types.
     * 
     * @return
     *     possible object is
     *     {@link JudgmentAwardSatisfactionDocumentTypeTextType }
     *     
     */
    public JudgmentAwardSatisfactionDocumentTypeTextType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link JudgmentAwardSatisfactionDocumentTypeTextType }
     *     
     */
    public void setValue(JudgmentAwardSatisfactionDocumentTypeTextType value) {
        this.value = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link JudgmentAwardSatisfactionDocumentTypeCodeType }
     *     
     */
    public JudgmentAwardSatisfactionDocumentTypeCodeType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JudgmentAwardSatisfactionDocumentTypeCodeType }
     *     
     */
    public void setCode(JudgmentAwardSatisfactionDocumentTypeCodeType value) {
        this.code = value;
    }

}