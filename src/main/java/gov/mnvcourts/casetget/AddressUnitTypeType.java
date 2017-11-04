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
 * <p>Java class for AddressUnitTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressUnitTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Apartment"/>
 *     &lt;enumeration value="Building"/>
 *     &lt;enumeration value="Department"/>
 *     &lt;enumeration value="Floor"/>
 *     &lt;enumeration value="Lot"/>
 *     &lt;enumeration value="Room"/>
 *     &lt;enumeration value="Suite"/>
 *     &lt;enumeration value="Trailer"/>
 *     &lt;enumeration value="Unit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AddressUnitTypeType")
@XmlEnum
public enum AddressUnitTypeType {

    @XmlEnumValue("Apartment")
    APARTMENT("Apartment"),
    @XmlEnumValue("Building")
    BUILDING("Building"),
    @XmlEnumValue("Department")
    DEPARTMENT("Department"),
    @XmlEnumValue("Floor")
    FLOOR("Floor"),
    @XmlEnumValue("Lot")
    LOT("Lot"),
    @XmlEnumValue("Room")
    ROOM("Room"),
    @XmlEnumValue("Suite")
    SUITE("Suite"),
    @XmlEnumValue("Trailer")
    TRAILER("Trailer"),
    @XmlEnumValue("Unit")
    UNIT("Unit");
    private final String value;

    AddressUnitTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddressUnitTypeType fromValue(String v) {
        for (AddressUnitTypeType c: AddressUnitTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
