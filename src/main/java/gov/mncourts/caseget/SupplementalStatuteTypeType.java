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
 * <p>Java class for SupplementalStatuteTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SupplementalStatuteTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Both charging and penalty"/&gt;
 *     &lt;enumeration value="Definition"/&gt;
 *     &lt;enumeration value="Not chargeable"/&gt;
 *     &lt;enumeration value="Penalty"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SupplementalStatuteTypeType")
@XmlEnum
public enum SupplementalStatuteTypeType {

    @XmlEnumValue("Both charging and penalty")
    BOTH_CHARGING_AND_PENALTY("Both charging and penalty"),
    @XmlEnumValue("Definition")
    DEFINITION("Definition"),
    @XmlEnumValue("Not chargeable")
    NOT_CHARGEABLE("Not chargeable"),
    @XmlEnumValue("Penalty")
    PENALTY("Penalty");
    private final String value;

    SupplementalStatuteTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SupplementalStatuteTypeType fromValue(String v) {
        for (SupplementalStatuteTypeType c: SupplementalStatuteTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}