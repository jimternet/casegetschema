//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.03 at 11:31:16 PM CDT 
//


package gov.mncourts.casetget;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CitationAccidentTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CitationAccidentTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACCFATAL"/>
 *     &lt;enumeration value="ACCNONE"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="ACCPED"/>
 *     &lt;enumeration value="ACCPI"/>
 *     &lt;enumeration value="ACCPD"/>
 *     &lt;enumeration value="ACCSUB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CitationAccidentTypeCodeType")
@XmlEnum
public enum CitationAccidentTypeCodeType {

    ACCFATAL,
    ACCNONE,
    NONE,
    ACCPED,
    ACCPI,
    ACCPD,
    ACCSUB;

    public String value() {
        return name();
    }

    public static CitationAccidentTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}