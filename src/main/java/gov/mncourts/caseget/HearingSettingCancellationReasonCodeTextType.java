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
 * <p>Java class for HearingSettingCancellationReasonCodeTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HearingSettingCancellationReasonCodeTextType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;&gt;HearingSettingCancellationReasonTextType"&gt;
 *       &lt;attribute name="code" type="{}HearingSettingCancellationReasonCodeType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HearingSettingCancellationReasonCodeTextType", propOrder = {
    "value"
})
public class HearingSettingCancellationReasonCodeTextType {

    @XmlValue
    protected HearingSettingCancellationReasonTextType value;
    @XmlAttribute(name = "code")
    protected HearingSettingCancellationReasonCodeType code;

    /**
     * Enumerated Hearing/Setting Cancellation Reasons
     * 
     * @return
     *     possible object is
     *     {@link HearingSettingCancellationReasonTextType }
     *     
     */
    public HearingSettingCancellationReasonTextType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link HearingSettingCancellationReasonTextType }
     *     
     */
    public void setValue(HearingSettingCancellationReasonTextType value) {
        this.value = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link HearingSettingCancellationReasonCodeType }
     *     
     */
    public HearingSettingCancellationReasonCodeType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link HearingSettingCancellationReasonCodeType }
     *     
     */
    public void setCode(HearingSettingCancellationReasonCodeType value) {
        this.code = value;
    }

}
