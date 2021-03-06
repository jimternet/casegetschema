//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.04 at 12:20:40 AM CDT 
//


package gov.mncourts.caseget;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleColorTextType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleColorTextType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Black"/&gt;
 *     &lt;enumeration value="Blue"/&gt;
 *     &lt;enumeration value="Bronze"/&gt;
 *     &lt;enumeration value="Brown"/&gt;
 *     &lt;enumeration value="Gold"/&gt;
 *     &lt;enumeration value="Gray"/&gt;
 *     &lt;enumeration value="Green"/&gt;
 *     &lt;enumeration value="Ivory"/&gt;
 *     &lt;enumeration value="Lavender (purple)"/&gt;
 *     &lt;enumeration value="Maroon"/&gt;
 *     &lt;enumeration value="Orange"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Pink"/&gt;
 *     &lt;enumeration value="Red"/&gt;
 *     &lt;enumeration value="Silver"/&gt;
 *     &lt;enumeration value="Tan"/&gt;
 *     &lt;enumeration value="Teal"/&gt;
 *     &lt;enumeration value="Turquoise"/&gt;
 *     &lt;enumeration value="White"/&gt;
 *     &lt;enumeration value="Yellow"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VehicleColorTextType")
@XmlEnum
public enum VehicleColorTextType {

    @XmlEnumValue("Black")
    BLACK("Black"),
    @XmlEnumValue("Blue")
    BLUE("Blue"),
    @XmlEnumValue("Bronze")
    BRONZE("Bronze"),
    @XmlEnumValue("Brown")
    BROWN("Brown"),
    @XmlEnumValue("Gold")
    GOLD("Gold"),
    @XmlEnumValue("Gray")
    GRAY("Gray"),
    @XmlEnumValue("Green")
    GREEN("Green"),
    @XmlEnumValue("Ivory")
    IVORY("Ivory"),
    @XmlEnumValue("Lavender (purple)")
    LAVENDER_PURPLE("Lavender (purple)"),
    @XmlEnumValue("Maroon")
    MAROON("Maroon"),
    @XmlEnumValue("Orange")
    ORANGE("Orange"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Pink")
    PINK("Pink"),
    @XmlEnumValue("Red")
    RED("Red"),
    @XmlEnumValue("Silver")
    SILVER("Silver"),
    @XmlEnumValue("Tan")
    TAN("Tan"),
    @XmlEnumValue("Teal")
    TEAL("Teal"),
    @XmlEnumValue("Turquoise")
    TURQUOISE("Turquoise"),
    @XmlEnumValue("White")
    WHITE("White"),
    @XmlEnumValue("Yellow")
    YELLOW("Yellow");
    private final String value;

    VehicleColorTextType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleColorTextType fromValue(String v) {
        for (VehicleColorTextType c: VehicleColorTextType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
