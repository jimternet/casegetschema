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
 * <p>Java class for BACStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BACStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BAC amount recorded"/&gt;
 *     &lt;enumeration value="No BAC available"/&gt;
 *     &lt;enumeration value="Refused Test"/&gt;
 *     &lt;enumeration value="Test administered - no BAC amount available"/&gt;
 *     &lt;enumeration value="Test Administered for controlled/hazardous substance"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BACStatusType")
@XmlEnum
public enum BACStatusType {

    @XmlEnumValue("BAC amount recorded")
    BAC_AMOUNT_RECORDED("BAC amount recorded"),
    @XmlEnumValue("No BAC available")
    NO_BAC_AVAILABLE("No BAC available"),
    @XmlEnumValue("Refused Test")
    REFUSED_TEST("Refused Test"),
    @XmlEnumValue("Test administered - no BAC amount available")
    TEST_ADMINISTERED_NO_BAC_AMOUNT_AVAILABLE("Test administered - no BAC amount available"),
    @XmlEnumValue("Test Administered for controlled/hazardous substance")
    TEST_ADMINISTERED_FOR_CONTROLLED_HAZARDOUS_SUBSTANCE("Test Administered for controlled/hazardous substance");
    private final String value;

    BACStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BACStatusType fromValue(String v) {
        for (BACStatusType c: BACStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
