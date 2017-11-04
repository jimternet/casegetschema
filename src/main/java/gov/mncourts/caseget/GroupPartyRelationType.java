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
 * <p>Java class for GroupPartyRelationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GroupPartyRelationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Acknowledged Father"/&gt;
 *     &lt;enumeration value="Adjudicated Father"/&gt;
 *     &lt;enumeration value="Alleged Father"/&gt;
 *     &lt;enumeration value="Child"/&gt;
 *     &lt;enumeration value="Father"/&gt;
 *     &lt;enumeration value="Legal Custodian"/&gt;
 *     &lt;enumeration value="Mother"/&gt;
 *     &lt;enumeration value="Presumed Father"/&gt;
 *     &lt;enumeration value="Putative Father"/&gt;
 *     &lt;enumeration value="Step Father"/&gt;
 *     &lt;enumeration value="Step Mother"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GroupPartyRelationType")
@XmlEnum
public enum GroupPartyRelationType {

    @XmlEnumValue("Acknowledged Father")
    ACKNOWLEDGED_FATHER("Acknowledged Father"),
    @XmlEnumValue("Adjudicated Father")
    ADJUDICATED_FATHER("Adjudicated Father"),
    @XmlEnumValue("Alleged Father")
    ALLEGED_FATHER("Alleged Father"),
    @XmlEnumValue("Child")
    CHILD("Child"),
    @XmlEnumValue("Father")
    FATHER("Father"),
    @XmlEnumValue("Legal Custodian")
    LEGAL_CUSTODIAN("Legal Custodian"),
    @XmlEnumValue("Mother")
    MOTHER("Mother"),
    @XmlEnumValue("Presumed Father")
    PRESUMED_FATHER("Presumed Father"),
    @XmlEnumValue("Putative Father")
    PUTATIVE_FATHER("Putative Father"),
    @XmlEnumValue("Step Father")
    STEP_FATHER("Step Father"),
    @XmlEnumValue("Step Mother")
    STEP_MOTHER("Step Mother");
    private final String value;

    GroupPartyRelationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GroupPartyRelationType fromValue(String v) {
        for (GroupPartyRelationType c: GroupPartyRelationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}