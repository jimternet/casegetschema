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
 * <p>Java class for BondPostedLocationTextType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BondPostedLocationTextType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="County Sheriff Department"/&gt;
 *     &lt;enumeration value="County where defendant was arrested"/&gt;
 *     &lt;enumeration value="Court"/&gt;
 *     &lt;enumeration value="Court Administrator"/&gt;
 *     &lt;enumeration value="Jail / Adult Detention Center"/&gt;
 *     &lt;enumeration value="Juvenile and Family Justice Center"/&gt;
 *     &lt;enumeration value="Juvenile Detention Center"/&gt;
 *     &lt;enumeration value="Law Enforcement Center"/&gt;
 *     &lt;enumeration value="Local Police Department"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Rice County Law Enforcement Center"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BondPostedLocationTextType")
@XmlEnum
public enum BondPostedLocationTextType {

    @XmlEnumValue("County Sheriff Department")
    COUNTY_SHERIFF_DEPARTMENT("County Sheriff Department"),
    @XmlEnumValue("County where defendant was arrested")
    COUNTY_WHERE_DEFENDANT_WAS_ARRESTED("County where defendant was arrested"),
    @XmlEnumValue("Court")
    COURT("Court"),
    @XmlEnumValue("Court Administrator")
    COURT_ADMINISTRATOR("Court Administrator"),
    @XmlEnumValue("Jail / Adult Detention Center")
    JAIL_ADULT_DETENTION_CENTER("Jail / Adult Detention Center"),
    @XmlEnumValue("Juvenile and Family Justice Center")
    JUVENILE_AND_FAMILY_JUSTICE_CENTER("Juvenile and Family Justice Center"),
    @XmlEnumValue("Juvenile Detention Center")
    JUVENILE_DETENTION_CENTER("Juvenile Detention Center"),
    @XmlEnumValue("Law Enforcement Center")
    LAW_ENFORCEMENT_CENTER("Law Enforcement Center"),
    @XmlEnumValue("Local Police Department")
    LOCAL_POLICE_DEPARTMENT("Local Police Department"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Rice County Law Enforcement Center")
    RICE_COUNTY_LAW_ENFORCEMENT_CENTER("Rice County Law Enforcement Center");
    private final String value;

    BondPostedLocationTextType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BondPostedLocationTextType fromValue(String v) {
        for (BondPostedLocationTextType c: BondPostedLocationTextType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
