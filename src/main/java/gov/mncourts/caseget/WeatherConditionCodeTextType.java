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
 * <p>Java class for WeatherConditionCodeTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeatherConditionCodeTextType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;&gt;WeatherConditionsType"&gt;
 *       &lt;attribute name="code" type="{}WeatherConditionsCodeType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherConditionCodeTextType", propOrder = {
    "value"
})
public class WeatherConditionCodeTextType {

    @XmlValue
    protected WeatherConditionsType value;
    @XmlAttribute(name = "code")
    protected WeatherConditionsCodeType code;

    /**
     * Enumerates valid weather conditions appearing on citations
     * 
     * @return
     *     possible object is
     *     {@link WeatherConditionsType }
     *     
     */
    public WeatherConditionsType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherConditionsType }
     *     
     */
    public void setValue(WeatherConditionsType value) {
        this.value = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherConditionsCodeType }
     *     
     */
    public WeatherConditionsCodeType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherConditionsCodeType }
     *     
     */
    public void setCode(WeatherConditionsCodeType value) {
        this.code = value;
    }

}
