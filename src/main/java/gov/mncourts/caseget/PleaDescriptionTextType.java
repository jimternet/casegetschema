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
 * <p>Java class for PleaDescriptionTextType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PleaDescriptionTextType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Admit"/&gt;
 *     &lt;enumeration value="Alford plea"/&gt;
 *     &lt;enumeration value="Default"/&gt;
 *     &lt;enumeration value="Deny"/&gt;
 *     &lt;enumeration value="Forfeiture"/&gt;
 *     &lt;enumeration value="Guilty"/&gt;
 *     &lt;enumeration value="Lothenbach plea"/&gt;
 *     &lt;enumeration value="M'Naghten plea"/&gt;
 *     &lt;enumeration value="No Response"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Not guilty"/&gt;
 *     &lt;enumeration value="Plea unavailable"/&gt;
 *     &lt;enumeration value="Withdrawn"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PleaDescriptionTextType")
@XmlEnum
public enum PleaDescriptionTextType {

    @XmlEnumValue("Admit")
    ADMIT("Admit"),
    @XmlEnumValue("Alford plea")
    ALFORD_PLEA("Alford plea"),
    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Deny")
    DENY("Deny"),
    @XmlEnumValue("Forfeiture")
    FORFEITURE("Forfeiture"),
    @XmlEnumValue("Guilty")
    GUILTY("Guilty"),
    @XmlEnumValue("Lothenbach plea")
    LOTHENBACH_PLEA("Lothenbach plea"),
    @XmlEnumValue("M'Naghten plea")
    M_NAGHTEN_PLEA("M'Naghten plea"),
    @XmlEnumValue("No Response")
    NO_RESPONSE("No Response"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Not guilty")
    NOT_GUILTY("Not guilty"),
    @XmlEnumValue("Plea unavailable")
    PLEA_UNAVAILABLE("Plea unavailable"),
    @XmlEnumValue("Withdrawn")
    WITHDRAWN("Withdrawn");
    private final String value;

    PleaDescriptionTextType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PleaDescriptionTextType fromValue(String v) {
        for (PleaDescriptionTextType c: PleaDescriptionTextType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}