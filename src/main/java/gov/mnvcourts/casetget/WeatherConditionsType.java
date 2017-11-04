//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.03 at 11:26:33 PM CDT 
//


package gov.mnvcourts.casetget;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeatherConditionsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WeatherConditionsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Clear"/>
 *     &lt;enumeration value="Cloudy"/>
 *     &lt;enumeration value="Fog"/>
 *     &lt;enumeration value="Freezing rain"/>
 *     &lt;enumeration value="Heavy rain"/>
 *     &lt;enumeration value="Ice"/>
 *     &lt;enumeration value="Light rain"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Snow"/>
 *     &lt;enumeration value="Sundown"/>
 *     &lt;enumeration value="Sunny"/>
 *     &lt;enumeration value="Sunrise"/>
 *     &lt;enumeration value="Unsafe Conditions"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WeatherConditionsType")
@XmlEnum
public enum WeatherConditionsType {

    @XmlEnumValue("Clear")
    CLEAR("Clear"),
    @XmlEnumValue("Cloudy")
    CLOUDY("Cloudy"),
    @XmlEnumValue("Fog")
    FOG("Fog"),
    @XmlEnumValue("Freezing rain")
    FREEZING_RAIN("Freezing rain"),
    @XmlEnumValue("Heavy rain")
    HEAVY_RAIN("Heavy rain"),
    @XmlEnumValue("Ice")
    ICE("Ice"),
    @XmlEnumValue("Light rain")
    LIGHT_RAIN("Light rain"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Snow")
    SNOW("Snow"),
    @XmlEnumValue("Sundown")
    SUNDOWN("Sundown"),
    @XmlEnumValue("Sunny")
    SUNNY("Sunny"),
    @XmlEnumValue("Sunrise")
    SUNRISE("Sunrise"),
    @XmlEnumValue("Unsafe Conditions")
    UNSAFE_CONDITIONS("Unsafe Conditions");
    private final String value;

    WeatherConditionsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WeatherConditionsType fromValue(String v) {
        for (WeatherConditionsType c: WeatherConditionsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
