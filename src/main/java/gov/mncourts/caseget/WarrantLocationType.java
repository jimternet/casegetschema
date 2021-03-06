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
 * <p>Java class for WarrantLocationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WarrantLocationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APD"/&gt;
 *     &lt;enumeration value="Benton Sheriff's Office"/&gt;
 *     &lt;enumeration value="Carlos PD"/&gt;
 *     &lt;enumeration value="City Attorney"/&gt;
 *     &lt;enumeration value="Converted Location"/&gt;
 *     &lt;enumeration value="County Attorney"/&gt;
 *     &lt;enumeration value="Court Administration"/&gt;
 *     &lt;enumeration value="Court File"/&gt;
 *     &lt;enumeration value="Dept of Corrections"/&gt;
 *     &lt;enumeration value="Detroit Lakes Highway Patrol"/&gt;
 *     &lt;enumeration value="DNR"/&gt;
 *     &lt;enumeration value="In Transit from Sheriff"/&gt;
 *     &lt;enumeration value="Judge Chambers"/&gt;
 *     &lt;enumeration value="MN State Patrol Detroit Lakes"/&gt;
 *     &lt;enumeration value="Mower County Corrections"/&gt;
 *     &lt;enumeration value="Osakis PD"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Sealed Search Warrant File"/&gt;
 *     &lt;enumeration value="Sheriffs Office"/&gt;
 *     &lt;enumeration value="Signature Bin"/&gt;
 *     &lt;enumeration value="St. Cloud Police Department"/&gt;
 *     &lt;enumeration value="State Patrol"/&gt;
 *     &lt;enumeration value="Stearns Sheriff's Office"/&gt;
 *     &lt;enumeration value="Unfiled Search Warrant File"/&gt;
 *     &lt;enumeration value="Warrant Prep Bin"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WarrantLocationType")
@XmlEnum
public enum WarrantLocationType {

    APD("APD"),
    @XmlEnumValue("Benton Sheriff's Office")
    BENTON_SHERIFF_S_OFFICE("Benton Sheriff's Office"),
    @XmlEnumValue("Carlos PD")
    CARLOS_PD("Carlos PD"),
    @XmlEnumValue("City Attorney")
    CITY_ATTORNEY("City Attorney"),
    @XmlEnumValue("Converted Location")
    CONVERTED_LOCATION("Converted Location"),
    @XmlEnumValue("County Attorney")
    COUNTY_ATTORNEY("County Attorney"),
    @XmlEnumValue("Court Administration")
    COURT_ADMINISTRATION("Court Administration"),
    @XmlEnumValue("Court File")
    COURT_FILE("Court File"),
    @XmlEnumValue("Dept of Corrections")
    DEPT_OF_CORRECTIONS("Dept of Corrections"),
    @XmlEnumValue("Detroit Lakes Highway Patrol")
    DETROIT_LAKES_HIGHWAY_PATROL("Detroit Lakes Highway Patrol"),
    DNR("DNR"),
    @XmlEnumValue("In Transit from Sheriff")
    IN_TRANSIT_FROM_SHERIFF("In Transit from Sheriff"),
    @XmlEnumValue("Judge Chambers")
    JUDGE_CHAMBERS("Judge Chambers"),
    @XmlEnumValue("MN State Patrol Detroit Lakes")
    MN_STATE_PATROL_DETROIT_LAKES("MN State Patrol Detroit Lakes"),
    @XmlEnumValue("Mower County Corrections")
    MOWER_COUNTY_CORRECTIONS("Mower County Corrections"),
    @XmlEnumValue("Osakis PD")
    OSAKIS_PD("Osakis PD"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Sealed Search Warrant File")
    SEALED_SEARCH_WARRANT_FILE("Sealed Search Warrant File"),
    @XmlEnumValue("Sheriffs Office")
    SHERIFFS_OFFICE("Sheriffs Office"),
    @XmlEnumValue("Signature Bin")
    SIGNATURE_BIN("Signature Bin"),
    @XmlEnumValue("St. Cloud Police Department")
    ST_CLOUD_POLICE_DEPARTMENT("St. Cloud Police Department"),
    @XmlEnumValue("State Patrol")
    STATE_PATROL("State Patrol"),
    @XmlEnumValue("Stearns Sheriff's Office")
    STEARNS_SHERIFF_S_OFFICE("Stearns Sheriff's Office"),
    @XmlEnumValue("Unfiled Search Warrant File")
    UNFILED_SEARCH_WARRANT_FILE("Unfiled Search Warrant File"),
    @XmlEnumValue("Warrant Prep Bin")
    WARRANT_PREP_BIN("Warrant Prep Bin");
    private final String value;

    WarrantLocationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WarrantLocationType fromValue(String v) {
        for (WarrantLocationType c: WarrantLocationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
