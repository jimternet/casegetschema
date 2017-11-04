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
 * <p>Java class for HearingSettingCancellationReasonTextType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HearingSettingCancellationReasonTextType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Assigned in error"/&gt;
 *     &lt;enumeration value="Change of venue"/&gt;
 *     &lt;enumeration value="Dismissed"/&gt;
 *     &lt;enumeration value="Fail to appear"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Paid without appearance"/&gt;
 *     &lt;enumeration value="Party Not Served"/&gt;
 *     &lt;enumeration value="Settled"/&gt;
 *     &lt;enumeration value="Waived"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HearingSettingCancellationReasonTextType")
@XmlEnum
public enum HearingSettingCancellationReasonTextType {

    @XmlEnumValue("Assigned in error")
    ASSIGNED_IN_ERROR("Assigned in error"),
    @XmlEnumValue("Change of venue")
    CHANGE_OF_VENUE("Change of venue"),
    @XmlEnumValue("Dismissed")
    DISMISSED("Dismissed"),
    @XmlEnumValue("Fail to appear")
    FAIL_TO_APPEAR("Fail to appear"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Paid without appearance")
    PAID_WITHOUT_APPEARANCE("Paid without appearance"),
    @XmlEnumValue("Party Not Served")
    PARTY_NOT_SERVED("Party Not Served"),
    @XmlEnumValue("Settled")
    SETTLED("Settled"),
    @XmlEnumValue("Waived")
    WAIVED("Waived");
    private final String value;

    HearingSettingCancellationReasonTextType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HearingSettingCancellationReasonTextType fromValue(String v) {
        for (HearingSettingCancellationReasonTextType c: HearingSettingCancellationReasonTextType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}