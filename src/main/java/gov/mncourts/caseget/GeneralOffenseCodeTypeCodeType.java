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
 * <p>Java class for GeneralOffenseCodeTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeneralOffenseCodeTypeCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Z"/&gt;
 *     &lt;enumeration value="Y"/&gt;
 *     &lt;enumeration value="X"/&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GeneralOffenseCodeTypeCodeType")
@XmlEnum
public enum GeneralOffenseCodeTypeCodeType {

    Z,
    Y,
    X,
    B,
    A,
    C,
    F,
    N,
    S,
    T;

    public String value() {
        return name();
    }

    public static GeneralOffenseCodeTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}