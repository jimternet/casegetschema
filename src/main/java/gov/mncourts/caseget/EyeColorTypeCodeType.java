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
 * <p>Java class for EyeColorTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EyeColorTypeCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BLK"/&gt;
 *     &lt;enumeration value="BLU"/&gt;
 *     &lt;enumeration value="BRO"/&gt;
 *     &lt;enumeration value="GRY"/&gt;
 *     &lt;enumeration value="GRN"/&gt;
 *     &lt;enumeration value="HAZ"/&gt;
 *     &lt;enumeration value="MAR"/&gt;
 *     &lt;enumeration value="MUL"/&gt;
 *     &lt;enumeration value="PNK"/&gt;
 *     &lt;enumeration value="XXX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EyeColorTypeCodeType")
@XmlEnum
public enum EyeColorTypeCodeType {

    BLK,
    BLU,
    BRO,
    GRY,
    GRN,
    HAZ,
    MAR,
    MUL,
    PNK,
    XXX;

    public String value() {
        return name();
    }

    public static EyeColorTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}
