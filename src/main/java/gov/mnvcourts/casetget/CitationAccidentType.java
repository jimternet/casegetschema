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
 * <p>Java class for CitationAccidentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CitationAccidentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Fatal"/>
 *     &lt;enumeration value="No injury or property damage"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Pedestrian"/>
 *     &lt;enumeration value="Personal injury"/>
 *     &lt;enumeration value="Property Damage"/>
 *     &lt;enumeration value="Substantial Bodily Harm"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CitationAccidentType")
@XmlEnum
public enum CitationAccidentType {

    @XmlEnumValue("Fatal")
    FATAL("Fatal"),
    @XmlEnumValue("No injury or property damage")
    NO_INJURY_OR_PROPERTY_DAMAGE("No injury or property damage"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Pedestrian")
    PEDESTRIAN("Pedestrian"),
    @XmlEnumValue("Personal injury")
    PERSONAL_INJURY("Personal injury"),
    @XmlEnumValue("Property Damage")
    PROPERTY_DAMAGE("Property Damage"),
    @XmlEnumValue("Substantial Bodily Harm")
    SUBSTANTIAL_BODILY_HARM("Substantial Bodily Harm");
    private final String value;

    CitationAccidentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CitationAccidentType fromValue(String v) {
        for (CitationAccidentType c: CitationAccidentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
