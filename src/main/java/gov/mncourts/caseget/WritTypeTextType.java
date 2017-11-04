//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.04 at 12:20:40 AM CDT 
//


package gov.mncourts.caseget;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WritTypeTextType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WritTypeTextType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Personal or Real Property"/&gt;
 *     &lt;enumeration value="Money or Personal Property"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WritTypeTextType")
@XmlEnum
public enum WritTypeTextType {

    @XmlEnumValue("Personal or Real Property")
    PERSONAL_OR_REAL_PROPERTY("Personal or Real Property"),
    @XmlEnumValue("Money or Personal Property")
    MONEY_OR_PERSONAL_PROPERTY("Money or Personal Property");
    private final String value;

    WritTypeTextType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WritTypeTextType fromValue(String v) {
        for (WritTypeTextType c: WritTypeTextType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}