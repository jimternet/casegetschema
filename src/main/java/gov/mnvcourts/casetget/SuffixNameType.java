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
 * <p>Java class for SuffixNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SuffixNameType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DC"/>
 *     &lt;enumeration value="DO"/>
 *     &lt;enumeration value="ESQ"/>
 *     &lt;enumeration value="II"/>
 *     &lt;enumeration value="III"/>
 *     &lt;enumeration value="IV"/>
 *     &lt;enumeration value="Jr."/>
 *     &lt;enumeration value="M.D."/>
 *     &lt;enumeration value="RN"/>
 *     &lt;enumeration value="Sr."/>
 *     &lt;enumeration value="V"/>
 *     &lt;enumeration value="VI"/>
 *     &lt;enumeration value="VII"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SuffixNameType")
@XmlEnum
public enum SuffixNameType {

    DC("DC"),
    DO("DO"),
    ESQ("ESQ"),
    II("II"),
    III("III"),
    IV("IV"),
    @XmlEnumValue("Jr.")
    JR("Jr."),
    @XmlEnumValue("M.D.")
    M_D("M.D."),
    RN("RN"),
    @XmlEnumValue("Sr.")
    SR("Sr."),
    V("V"),
    VI("VI"),
    VII("VII");
    private final String value;

    SuffixNameType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SuffixNameType fromValue(String v) {
        for (SuffixNameType c: SuffixNameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
