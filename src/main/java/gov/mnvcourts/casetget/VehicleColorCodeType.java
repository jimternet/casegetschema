//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.03 at 11:26:33 PM CDT 
//


package gov.mnvcourts.casetget;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleColorCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleColorCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BLK"/>
 *     &lt;enumeration value="BLU"/>
 *     &lt;enumeration value="BRZ"/>
 *     &lt;enumeration value="BRO"/>
 *     &lt;enumeration value="GLD"/>
 *     &lt;enumeration value="GRY"/>
 *     &lt;enumeration value="GRN"/>
 *     &lt;enumeration value="CRM"/>
 *     &lt;enumeration value="LAV"/>
 *     &lt;enumeration value="MAR"/>
 *     &lt;enumeration value="ONG"/>
 *     &lt;enumeration value="OTH"/>
 *     &lt;enumeration value="PNK"/>
 *     &lt;enumeration value="RED"/>
 *     &lt;enumeration value="SIL"/>
 *     &lt;enumeration value="TAN"/>
 *     &lt;enumeration value="TEA"/>
 *     &lt;enumeration value="TUR"/>
 *     &lt;enumeration value="WHI"/>
 *     &lt;enumeration value="YEL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleColorCodeType")
@XmlEnum
public enum VehicleColorCodeType {

    BLK,
    BLU,
    BRZ,
    BRO,
    GLD,
    GRY,
    GRN,
    CRM,
    LAV,
    MAR,
    ONG,
    OTH,
    PNK,
    RED,
    SIL,
    TAN,
    TEA,
    TUR,
    WHI,
    YEL;

    public String value() {
        return name();
    }

    public static VehicleColorCodeType fromValue(String v) {
        return valueOf(v);
    }

}
