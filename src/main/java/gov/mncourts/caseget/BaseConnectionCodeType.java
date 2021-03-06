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
 * <p>Java class for BaseConnectionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BaseConnectionCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AT"/&gt;
 *     &lt;enumeration value="DC"/&gt;
 *     &lt;enumeration value="DF"/&gt;
 *     &lt;enumeration value="FM"/&gt;
 *     &lt;enumeration value="GD"/&gt;
 *     &lt;enumeration value="MD"/&gt;
 *     &lt;enumeration value="O1"/&gt;
 *     &lt;enumeration value="O2"/&gt;
 *     &lt;enumeration value="PL"/&gt;
 *     &lt;enumeration value="RC"/&gt;
 *     &lt;enumeration value="TH"/&gt;
 *     &lt;enumeration value="VI"/&gt;
 *     &lt;enumeration value="WA"/&gt;
 *     &lt;enumeration value="WI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BaseConnectionCodeType")
@XmlEnum
public enum BaseConnectionCodeType {

    AT("AT"),
    DC("DC"),
    DF("DF"),
    FM("FM"),
    GD("GD"),
    MD("MD"),
    @XmlEnumValue("O1")
    O_1("O1"),
    @XmlEnumValue("O2")
    O_2("O2"),
    PL("PL"),
    RC("RC"),
    TH("TH"),
    VI("VI"),
    WA("WA"),
    WI("WI");
    private final String value;

    BaseConnectionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BaseConnectionCodeType fromValue(String v) {
        for (BaseConnectionCodeType c: BaseConnectionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
