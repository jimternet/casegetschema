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
 * <p>Java class for PrefixNameTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrefixNameTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Agt"/>
 *     &lt;enumeration value="Dep"/>
 *     &lt;enumeration value="Det"/>
 *     &lt;enumeration value="Dr"/>
 *     &lt;enumeration value="Hon"/>
 *     &lt;enumeration value="Miss"/>
 *     &lt;enumeration value="Mr"/>
 *     &lt;enumeration value="Mrs"/>
 *     &lt;enumeration value="Ms"/>
 *     &lt;enumeration value="Off"/>
 *     &lt;enumeration value="Rev"/>
 *     &lt;enumeration value="Tpr"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrefixNameTypeCodeType")
@XmlEnum
public enum PrefixNameTypeCodeType {

    @XmlEnumValue("Agt")
    AGT("Agt"),
    @XmlEnumValue("Dep")
    DEP("Dep"),
    @XmlEnumValue("Det")
    DET("Det"),
    @XmlEnumValue("Dr")
    DR("Dr"),
    @XmlEnumValue("Hon")
    HON("Hon"),
    @XmlEnumValue("Miss")
    MISS("Miss"),
    @XmlEnumValue("Mr")
    MR("Mr"),
    @XmlEnumValue("Mrs")
    MRS("Mrs"),
    @XmlEnumValue("Ms")
    MS("Ms"),
    @XmlEnumValue("Off")
    OFF("Off"),
    @XmlEnumValue("Rev")
    REV("Rev"),
    @XmlEnumValue("Tpr")
    TPR("Tpr");
    private final String value;

    PrefixNameTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrefixNameTypeCodeType fromValue(String v) {
        for (PrefixNameTypeCodeType c: PrefixNameTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
