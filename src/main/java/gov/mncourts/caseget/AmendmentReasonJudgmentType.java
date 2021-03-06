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
 * <p>Java class for AmendmentReasonJudgmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AmendmentReasonJudgmentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Amend"/&gt;
 *     &lt;enumeration value="Appeals Court Reversal"/&gt;
 *     &lt;enumeration value="Court Order"/&gt;
 *     &lt;enumeration value="Defense Motion Granted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AmendmentReasonJudgmentType")
@XmlEnum
public enum AmendmentReasonJudgmentType {

    @XmlEnumValue("Amend")
    AMEND("Amend"),
    @XmlEnumValue("Appeals Court Reversal")
    APPEALS_COURT_REVERSAL("Appeals Court Reversal"),
    @XmlEnumValue("Court Order")
    COURT_ORDER("Court Order"),
    @XmlEnumValue("Defense Motion Granted")
    DEFENSE_MOTION_GRANTED("Defense Motion Granted");
    private final String value;

    AmendmentReasonJudgmentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AmendmentReasonJudgmentType fromValue(String v) {
        for (AmendmentReasonJudgmentType c: AmendmentReasonJudgmentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
