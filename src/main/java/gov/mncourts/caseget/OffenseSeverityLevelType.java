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
 * <p>Java class for OffenseSeverityLevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OffenseSeverityLevelType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Converted: Offense Level Not Available"/&gt;
 *     &lt;enumeration value="Felony"/&gt;
 *     &lt;enumeration value="Gross Misdemeanor"/&gt;
 *     &lt;enumeration value="Juvenile Petty Offense"/&gt;
 *     &lt;enumeration value="Juvenile Traffic Offense"/&gt;
 *     &lt;enumeration value="Misdemeanor"/&gt;
 *     &lt;enumeration value="No Level"/&gt;
 *     &lt;enumeration value="Petty Misdemeanor"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OffenseSeverityLevelType")
@XmlEnum
public enum OffenseSeverityLevelType {

    @XmlEnumValue("Converted: Offense Level Not Available")
    CONVERTED_OFFENSE_LEVEL_NOT_AVAILABLE("Converted: Offense Level Not Available"),
    @XmlEnumValue("Felony")
    FELONY("Felony"),
    @XmlEnumValue("Gross Misdemeanor")
    GROSS_MISDEMEANOR("Gross Misdemeanor"),
    @XmlEnumValue("Juvenile Petty Offense")
    JUVENILE_PETTY_OFFENSE("Juvenile Petty Offense"),
    @XmlEnumValue("Juvenile Traffic Offense")
    JUVENILE_TRAFFIC_OFFENSE("Juvenile Traffic Offense"),
    @XmlEnumValue("Misdemeanor")
    MISDEMEANOR("Misdemeanor"),
    @XmlEnumValue("No Level")
    NO_LEVEL("No Level"),
    @XmlEnumValue("Petty Misdemeanor")
    PETTY_MISDEMEANOR("Petty Misdemeanor");
    private final String value;

    OffenseSeverityLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OffenseSeverityLevelType fromValue(String v) {
        for (OffenseSeverityLevelType c: OffenseSeverityLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
