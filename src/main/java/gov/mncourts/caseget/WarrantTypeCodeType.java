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
 * <p>Java class for WarrantTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WarrantTypeCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AWRNT"/&gt;
 *     &lt;enumeration value="BWRNT"/&gt;
 *     &lt;enumeration value="BWFTA"/&gt;
 *     &lt;enumeration value="CNVWRNT"/&gt;
 *     &lt;enumeration value="JWRNT"/&gt;
 *     &lt;enumeration value="OWRNT"/&gt;
 *     &lt;enumeration value="VWRNT"/&gt;
 *     &lt;enumeration value="WRITWRNT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WarrantTypeCodeType")
@XmlEnum
public enum WarrantTypeCodeType {

    AWRNT,
    BWRNT,
    BWFTA,
    CNVWRNT,
    JWRNT,
    OWRNT,
    VWRNT,
    WRITWRNT;

    public String value() {
        return name();
    }

    public static WarrantTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}
