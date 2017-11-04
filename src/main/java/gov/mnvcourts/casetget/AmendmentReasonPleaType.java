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
 * <p>Java class for AmendmentReasonPleaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AmendmentReasonPleaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Amend"/>
 *     &lt;enumeration value="Amended complaint"/>
 *     &lt;enumeration value="Appeals Court Reversal"/>
 *     &lt;enumeration value="Court Order"/>
 *     &lt;enumeration value="Defense Motion Granted"/>
 *     &lt;enumeration value="Plea agreement"/>
 *     &lt;enumeration value="Plea withdrawn by appellate court decision"/>
 *     &lt;enumeration value="Plea withdrawn by court"/>
 *     &lt;enumeration value="Plea withdrawn by defendant"/>
 *     &lt;enumeration value="Probation Violation"/>
 *     &lt;enumeration value="Prosecution motion granted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AmendmentReasonPleaType")
@XmlEnum
public enum AmendmentReasonPleaType {

    @XmlEnumValue("Amend")
    AMEND("Amend"),
    @XmlEnumValue("Amended complaint")
    AMENDED_COMPLAINT("Amended complaint"),
    @XmlEnumValue("Appeals Court Reversal")
    APPEALS_COURT_REVERSAL("Appeals Court Reversal"),
    @XmlEnumValue("Court Order")
    COURT_ORDER("Court Order"),
    @XmlEnumValue("Defense Motion Granted")
    DEFENSE_MOTION_GRANTED("Defense Motion Granted"),
    @XmlEnumValue("Plea agreement")
    PLEA_AGREEMENT("Plea agreement"),
    @XmlEnumValue("Plea withdrawn by appellate court decision")
    PLEA_WITHDRAWN_BY_APPELLATE_COURT_DECISION("Plea withdrawn by appellate court decision"),
    @XmlEnumValue("Plea withdrawn by court")
    PLEA_WITHDRAWN_BY_COURT("Plea withdrawn by court"),
    @XmlEnumValue("Plea withdrawn by defendant")
    PLEA_WITHDRAWN_BY_DEFENDANT("Plea withdrawn by defendant"),
    @XmlEnumValue("Probation Violation")
    PROBATION_VIOLATION("Probation Violation"),
    @XmlEnumValue("Prosecution motion granted")
    PROSECUTION_MOTION_GRANTED("Prosecution motion granted");
    private final String value;

    AmendmentReasonPleaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AmendmentReasonPleaType fromValue(String v) {
        for (AmendmentReasonPleaType c: AmendmentReasonPleaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
