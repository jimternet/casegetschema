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
 * <p>Java class for JudgmentInactiveReasonTextType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JudgmentInactiveReasonTextType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Bankruptcy"/&gt;
 *     &lt;enumeration value="Dismissed"/&gt;
 *     &lt;enumeration value="Renewed"/&gt;
 *     &lt;enumeration value="Vacated"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "JudgmentInactiveReasonTextType")
@XmlEnum
public enum JudgmentInactiveReasonTextType {

    @XmlEnumValue("Bankruptcy")
    BANKRUPTCY("Bankruptcy"),
    @XmlEnumValue("Dismissed")
    DISMISSED("Dismissed"),
    @XmlEnumValue("Renewed")
    RENEWED("Renewed"),
    @XmlEnumValue("Vacated")
    VACATED("Vacated");
    private final String value;

    JudgmentInactiveReasonTextType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JudgmentInactiveReasonTextType fromValue(String v) {
        for (JudgmentInactiveReasonTextType c: JudgmentInactiveReasonTextType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}