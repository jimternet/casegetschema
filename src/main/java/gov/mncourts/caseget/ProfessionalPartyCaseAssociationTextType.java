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
 * <p>Java class for ProfessionalPartyCaseAssociationTextType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProfessionalPartyCaseAssociationTextType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Advocate"/&gt;
 *     &lt;enumeration value="Examiner"/&gt;
 *     &lt;enumeration value="Guardian Ad Litem"/&gt;
 *     &lt;enumeration value="Probation Officer"/&gt;
 *     &lt;enumeration value="Probation Officer - Conditional Release"/&gt;
 *     &lt;enumeration value="Probation Officer - Criminal Record Summary"/&gt;
 *     &lt;enumeration value="Probation Officer - Investigating"/&gt;
 *     &lt;enumeration value="Probation Officer - Supervising"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProfessionalPartyCaseAssociationTextType")
@XmlEnum
public enum ProfessionalPartyCaseAssociationTextType {

    @XmlEnumValue("Advocate")
    ADVOCATE("Advocate"),
    @XmlEnumValue("Examiner")
    EXAMINER("Examiner"),
    @XmlEnumValue("Guardian Ad Litem")
    GUARDIAN_AD_LITEM("Guardian Ad Litem"),
    @XmlEnumValue("Probation Officer")
    PROBATION_OFFICER("Probation Officer"),
    @XmlEnumValue("Probation Officer - Conditional Release")
    PROBATION_OFFICER_CONDITIONAL_RELEASE("Probation Officer - Conditional Release"),
    @XmlEnumValue("Probation Officer - Criminal Record Summary")
    PROBATION_OFFICER_CRIMINAL_RECORD_SUMMARY("Probation Officer - Criminal Record Summary"),
    @XmlEnumValue("Probation Officer - Investigating")
    PROBATION_OFFICER_INVESTIGATING("Probation Officer - Investigating"),
    @XmlEnumValue("Probation Officer - Supervising")
    PROBATION_OFFICER_SUPERVISING("Probation Officer - Supervising");
    private final String value;

    ProfessionalPartyCaseAssociationTextType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProfessionalPartyCaseAssociationTextType fromValue(String v) {
        for (ProfessionalPartyCaseAssociationTextType c: ProfessionalPartyCaseAssociationTextType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
