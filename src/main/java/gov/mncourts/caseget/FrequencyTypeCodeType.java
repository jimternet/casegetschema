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
 * <p>Java class for FrequencyTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FrequencyTypeCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BIMONTH"/&gt;
 *     &lt;enumeration value="BIWEEK"/&gt;
 *     &lt;enumeration value="DAY"/&gt;
 *     &lt;enumeration value="MONTH"/&gt;
 *     &lt;enumeration value="ONETIME"/&gt;
 *     &lt;enumeration value="QUARTER"/&gt;
 *     &lt;enumeration value="SEMIYEAR"/&gt;
 *     &lt;enumeration value="SEMIMONTH"/&gt;
 *     &lt;enumeration value="SEMIWEEK"/&gt;
 *     &lt;enumeration value="WEEK"/&gt;
 *     &lt;enumeration value="YEAR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FrequencyTypeCodeType")
@XmlEnum
public enum FrequencyTypeCodeType {

    BIMONTH,
    BIWEEK,
    DAY,
    MONTH,
    ONETIME,
    QUARTER,
    SEMIYEAR,
    SEMIMONTH,
    SEMIWEEK,
    WEEK,
    YEAR;

    public String value() {
        return name();
    }

    public static FrequencyTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}