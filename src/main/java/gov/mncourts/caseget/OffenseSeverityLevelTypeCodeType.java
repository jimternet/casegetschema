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
 * <p>Java class for OffenseSeverityLevelTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OffenseSeverityLevelTypeCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CNVUNKNOWN"/&gt;
 *     &lt;enumeration value="CNVLEVEL"/&gt;
 *     &lt;enumeration value="FEL"/&gt;
 *     &lt;enumeration value="GMD"/&gt;
 *     &lt;enumeration value="JPO"/&gt;
 *     &lt;enumeration value="JTO"/&gt;
 *     &lt;enumeration value="MSD"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="PMD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OffenseSeverityLevelTypeCodeType")
@XmlEnum
public enum OffenseSeverityLevelTypeCodeType {

    CNVUNKNOWN,
    CNVLEVEL,
    FEL,
    GMD,
    JPO,
    JTO,
    MSD,
    NONE,
    PMD;

    public String value() {
        return name();
    }

    public static OffenseSeverityLevelTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}