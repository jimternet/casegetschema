//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.03 at 11:26:33 PM CDT 
//


package gov.mnvcourts.casetget;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JudgmentSupportMethodCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JudgmentSupportMethodCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIRECT"/>
 *     &lt;enumeration value="WITHHOLD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "JudgmentSupportMethodCodeType")
@XmlEnum
public enum JudgmentSupportMethodCodeType {

    DIRECT,
    WITHHOLD;

    public String value() {
        return name();
    }

    public static JudgmentSupportMethodCodeType fromValue(String v) {
        return valueOf(v);
    }

}