//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.03 at 11:26:33 PM CDT 
//


package gov.mnvcourts.casetget;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseConnectionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BaseConnectionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AT"/>
 *     &lt;enumeration value="DC"/>
 *     &lt;enumeration value="DF"/>
 *     &lt;enumeration value="FM"/>
 *     &lt;enumeration value="GD"/>
 *     &lt;enumeration value="MD"/>
 *     &lt;enumeration value="O1"/>
 *     &lt;enumeration value="O2"/>
 *     &lt;enumeration value="PL"/>
 *     &lt;enumeration value="RC"/>
 *     &lt;enumeration value="TH"/>
 *     &lt;enumeration value="VI"/>
 *     &lt;enumeration value="WA"/>
 *     &lt;enumeration value="WI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
