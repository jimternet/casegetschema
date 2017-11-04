//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.03 at 11:31:16 PM CDT 
//


package gov.mncourts.casetget;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelephoneNumberUsageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TelephoneNumberUsageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Cell"/>
 *     &lt;enumeration value="Fax"/>
 *     &lt;enumeration value="Home"/>
 *     &lt;enumeration value="Work"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TelephoneNumberUsageType")
@XmlEnum
public enum TelephoneNumberUsageType {

    @XmlEnumValue("Cell")
    CELL("Cell"),
    @XmlEnumValue("Fax")
    FAX("Fax"),
    @XmlEnumValue("Home")
    HOME("Home"),
    @XmlEnumValue("Work")
    WORK("Work");
    private final String value;

    TelephoneNumberUsageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TelephoneNumberUsageType fromValue(String v) {
        for (TelephoneNumberUsageType c: TelephoneNumberUsageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}