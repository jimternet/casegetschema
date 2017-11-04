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
 * <p>Java class for PrefixNameTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrefixNameTypeCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Agt"/&gt;
 *     &lt;enumeration value="Dep"/&gt;
 *     &lt;enumeration value="Det"/&gt;
 *     &lt;enumeration value="Dr"/&gt;
 *     &lt;enumeration value="Hon"/&gt;
 *     &lt;enumeration value="Miss"/&gt;
 *     &lt;enumeration value="Mr"/&gt;
 *     &lt;enumeration value="Mrs"/&gt;
 *     &lt;enumeration value="Ms"/&gt;
 *     &lt;enumeration value="Off"/&gt;
 *     &lt;enumeration value="Rev"/&gt;
 *     &lt;enumeration value="Tpr"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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