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
 * <p>Java class for AmendmentReasonCriminalDispositionTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AmendmentReasonCriminalDispositionTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADD"/>
 *     &lt;enumeration value="AMEND"/>
 *     &lt;enumeration value="AMENDC"/>
 *     &lt;enumeration value="APREVERS"/>
 *     &lt;enumeration value="CONDMET"/>
 *     &lt;enumeration value="CTORDER"/>
 *     &lt;enumeration value="MOTGRANT"/>
 *     &lt;enumeration value="INTDSPEXP"/>
 *     &lt;enumeration value="PARD"/>
 *     &lt;enumeration value="PROBVIOL"/>
 *     &lt;enumeration value="PMOTGRANT"/>
 *     &lt;enumeration value="RED"/>
 *     &lt;enumeration value="REV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AmendmentReasonCriminalDispositionTypeCodeType")
@XmlEnum
public enum AmendmentReasonCriminalDispositionTypeCodeType {

    ADD,
    AMEND,
    AMENDC,
    APREVERS,
    CONDMET,
    CTORDER,
    MOTGRANT,
    INTDSPEXP,
    PARD,
    PROBVIOL,
    PMOTGRANT,
    RED,
    REV;

    public String value() {
        return name();
    }

    public static AmendmentReasonCriminalDispositionTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}