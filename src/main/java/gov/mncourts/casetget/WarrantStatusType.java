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
 * <p>Java class for WarrantStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WarrantStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Bond/Bail Posted"/>
 *     &lt;enumeration value="Conversion Status"/>
 *     &lt;enumeration value="Converted Active"/>
 *     &lt;enumeration value="Converted Satisfied"/>
 *     &lt;enumeration value="Issued Active"/>
 *     &lt;enumeration value="Quashed"/>
 *     &lt;enumeration value="Recalled Inactive"/>
 *     &lt;enumeration value="Served"/>
 *     &lt;enumeration value="Unsigned"/>
 *     &lt;enumeration value="Walk In"/>
 *     &lt;enumeration value="Warrant Cleared by Arrest"/>
 *     &lt;enumeration value="Warrant Cleared by Wt Office"/>
 *     &lt;enumeration value="Warrant Requested"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WarrantStatusType")
@XmlEnum
public enum WarrantStatusType {

    @XmlEnumValue("Bond/Bail Posted")
    BOND_BAIL_POSTED("Bond/Bail Posted"),
    @XmlEnumValue("Conversion Status")
    CONVERSION_STATUS("Conversion Status"),
    @XmlEnumValue("Converted Active")
    CONVERTED_ACTIVE("Converted Active"),
    @XmlEnumValue("Converted Satisfied")
    CONVERTED_SATISFIED("Converted Satisfied"),
    @XmlEnumValue("Issued Active")
    ISSUED_ACTIVE("Issued Active"),
    @XmlEnumValue("Quashed")
    QUASHED("Quashed"),
    @XmlEnumValue("Recalled Inactive")
    RECALLED_INACTIVE("Recalled Inactive"),
    @XmlEnumValue("Served")
    SERVED("Served"),
    @XmlEnumValue("Unsigned")
    UNSIGNED("Unsigned"),
    @XmlEnumValue("Walk In")
    WALK_IN("Walk In"),
    @XmlEnumValue("Warrant Cleared by Arrest")
    WARRANT_CLEARED_BY_ARREST("Warrant Cleared by Arrest"),
    @XmlEnumValue("Warrant Cleared by Wt Office")
    WARRANT_CLEARED_BY_WT_OFFICE("Warrant Cleared by Wt Office"),
    @XmlEnumValue("Warrant Requested")
    WARRANT_REQUESTED("Warrant Requested");
    private final String value;

    WarrantStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WarrantStatusType fromValue(String v) {
        for (WarrantStatusType c: WarrantStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}