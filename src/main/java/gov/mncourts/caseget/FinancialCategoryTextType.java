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
 * <p>Java class for FinancialCategoryTextType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FinancialCategoryTextType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Bond"/&gt;
 *     &lt;enumeration value="Case Fines and Fees"/&gt;
 *     &lt;enumeration value="Draw Down Financial Account"/&gt;
 *     &lt;enumeration value="Fines and Fees"/&gt;
 *     &lt;enumeration value="Miscellaneous Fees"/&gt;
 *     &lt;enumeration value="Registry"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FinancialCategoryTextType")
@XmlEnum
public enum FinancialCategoryTextType {

    @XmlEnumValue("Bond")
    BOND("Bond"),
    @XmlEnumValue("Case Fines and Fees")
    CASE_FINES_AND_FEES("Case Fines and Fees"),
    @XmlEnumValue("Draw Down Financial Account")
    DRAW_DOWN_FINANCIAL_ACCOUNT("Draw Down Financial Account"),
    @XmlEnumValue("Fines and Fees")
    FINES_AND_FEES("Fines and Fees"),
    @XmlEnumValue("Miscellaneous Fees")
    MISCELLANEOUS_FEES("Miscellaneous Fees"),
    @XmlEnumValue("Registry")
    REGISTRY("Registry");
    private final String value;

    FinancialCategoryTextType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FinancialCategoryTextType fromValue(String v) {
        for (FinancialCategoryTextType c: FinancialCategoryTextType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}