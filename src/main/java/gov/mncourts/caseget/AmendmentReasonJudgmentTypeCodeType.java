//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.04 at 12:20:40 AM CDT 
//


package gov.mncourts.caseget;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmendmentReasonJudgmentTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AmendmentReasonJudgmentTypeCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AMEND"/&gt;
 *     &lt;enumeration value="APREVERS"/&gt;
 *     &lt;enumeration value="CTORDER"/&gt;
 *     &lt;enumeration value="MOTGRANT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AmendmentReasonJudgmentTypeCodeType")
@XmlEnum
public enum AmendmentReasonJudgmentTypeCodeType {

    AMEND,
    APREVERS,
    CTORDER,
    MOTGRANT;

    public String value() {
        return name();
    }

    public static AmendmentReasonJudgmentTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}
