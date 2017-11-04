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
 * <p>Java class for BondStatusTypeTextType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BondStatusTypeTextType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Bail Applied to Fine/Refunded"/>
 *     &lt;enumeration value="Conversion Status"/>
 *     &lt;enumeration value="Converted Bond Active"/>
 *     &lt;enumeration value="Converted Bond Inactive"/>
 *     &lt;enumeration value="Discharged"/>
 *     &lt;enumeration value="Forfeited"/>
 *     &lt;enumeration value="Ordered Refunded"/>
 *     &lt;enumeration value="Other Active"/>
 *     &lt;enumeration value="Other Inactive"/>
 *     &lt;enumeration value="Posted"/>
 *     &lt;enumeration value="Pre-Case Fines 30 Day Letter Sent"/>
 *     &lt;enumeration value="Pre-Case Fines Remitted to State/Turned Over"/>
 *     &lt;enumeration value="Pre-Case/Pre-Closure Applied to Fine"/>
 *     &lt;enumeration value="Refunded"/>
 *     &lt;enumeration value="Reinstated"/>
 *     &lt;enumeration value="Turned Over/Disbursed"/>
 *     &lt;enumeration value="Unclaimed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BondStatusTypeTextType")
@XmlEnum
public enum BondStatusTypeTextType {

    @XmlEnumValue("Bail Applied to Fine/Refunded")
    BAIL_APPLIED_TO_FINE_REFUNDED("Bail Applied to Fine/Refunded"),
    @XmlEnumValue("Conversion Status")
    CONVERSION_STATUS("Conversion Status"),
    @XmlEnumValue("Converted Bond Active")
    CONVERTED_BOND_ACTIVE("Converted Bond Active"),
    @XmlEnumValue("Converted Bond Inactive")
    CONVERTED_BOND_INACTIVE("Converted Bond Inactive"),
    @XmlEnumValue("Discharged")
    DISCHARGED("Discharged"),
    @XmlEnumValue("Forfeited")
    FORFEITED("Forfeited"),
    @XmlEnumValue("Ordered Refunded")
    ORDERED_REFUNDED("Ordered Refunded"),
    @XmlEnumValue("Other Active")
    OTHER_ACTIVE("Other Active"),
    @XmlEnumValue("Other Inactive")
    OTHER_INACTIVE("Other Inactive"),
    @XmlEnumValue("Posted")
    POSTED("Posted"),
    @XmlEnumValue("Pre-Case Fines 30 Day Letter Sent")
    PRE_CASE_FINES_30_DAY_LETTER_SENT("Pre-Case Fines 30 Day Letter Sent"),
    @XmlEnumValue("Pre-Case Fines Remitted to State/Turned Over")
    PRE_CASE_FINES_REMITTED_TO_STATE_TURNED_OVER("Pre-Case Fines Remitted to State/Turned Over"),
    @XmlEnumValue("Pre-Case/Pre-Closure Applied to Fine")
    PRE_CASE_PRE_CLOSURE_APPLIED_TO_FINE("Pre-Case/Pre-Closure Applied to Fine"),
    @XmlEnumValue("Refunded")
    REFUNDED("Refunded"),
    @XmlEnumValue("Reinstated")
    REINSTATED("Reinstated"),
    @XmlEnumValue("Turned Over/Disbursed")
    TURNED_OVER_DISBURSED("Turned Over/Disbursed"),
    @XmlEnumValue("Unclaimed")
    UNCLAIMED("Unclaimed");
    private final String value;

    BondStatusTypeTextType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BondStatusTypeTextType fromValue(String v) {
        for (BondStatusTypeTextType c: BondStatusTypeTextType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
