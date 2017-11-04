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
 * <p>Java class for CaseStatusTypeTextType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CaseStatusTypeTextType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Adult Certification Pending"/&gt;
 *     &lt;enumeration value="Closed"/&gt;
 *     &lt;enumeration value="Closed-Physical File Destroyed"/&gt;
 *     &lt;enumeration value="Converted Closed"/&gt;
 *     &lt;enumeration value="Custodial"/&gt;
 *     &lt;enumeration value="Denied"/&gt;
 *     &lt;enumeration value="Dormant"/&gt;
 *     &lt;enumeration value="EJJ - Youth Serving Juvenile Snt"/&gt;
 *     &lt;enumeration value="EJJ Case - Has Adult Sentence Only"/&gt;
 *     &lt;enumeration value="EJJ Case - No Juvenile or Adult Sentence"/&gt;
 *     &lt;enumeration value="EJJ Case - Youth Serving Adult Sentence"/&gt;
 *     &lt;enumeration value="EJJ Case - Youth Serving Juvenile Sentence"/&gt;
 *     &lt;enumeration value="Exported"/&gt;
 *     &lt;enumeration value="Final Pay/Appear Notice Sent"/&gt;
 *     &lt;enumeration value="Inactive"/&gt;
 *     &lt;enumeration value="Interim Disposition"/&gt;
 *     &lt;enumeration value="Motion for EJJ Filed"/&gt;
 *     &lt;enumeration value="Old Code"/&gt;
 *     &lt;enumeration value="Old Code 2"/&gt;
 *     &lt;enumeration value="Old Code 3"/&gt;
 *     &lt;enumeration value="Old Code 4"/&gt;
 *     &lt;enumeration value="Old Code 5"/&gt;
 *     &lt;enumeration value="On Hold"/&gt;
 *     &lt;enumeration value="Open"/&gt;
 *     &lt;enumeration value="Pending Probable Cause"/&gt;
 *     &lt;enumeration value="Pending Referral"/&gt;
 *     &lt;enumeration value="Petition for EJJ Filed"/&gt;
 *     &lt;enumeration value="Probated"/&gt;
 *     &lt;enumeration value="Reopened"/&gt;
 *     &lt;enumeration value="Safekeeping"/&gt;
 *     &lt;enumeration value="Test Case Status"/&gt;
 *     &lt;enumeration value="Uncertain"/&gt;
 *     &lt;enumeration value="Under Court Jurisdiction"/&gt;
 *     &lt;enumeration value="Unprobated"/&gt;
 *     &lt;enumeration value="Withdrawn"/&gt;
 *     &lt;enumeration value="Youth Serving Adult Snt"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CaseStatusTypeTextType")
@XmlEnum
public enum CaseStatusTypeTextType {

    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Adult Certification Pending")
    ADULT_CERTIFICATION_PENDING("Adult Certification Pending"),
    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("Closed-Physical File Destroyed")
    CLOSED_PHYSICAL_FILE_DESTROYED("Closed-Physical File Destroyed"),
    @XmlEnumValue("Converted Closed")
    CONVERTED_CLOSED("Converted Closed"),
    @XmlEnumValue("Custodial")
    CUSTODIAL("Custodial"),
    @XmlEnumValue("Denied")
    DENIED("Denied"),
    @XmlEnumValue("Dormant")
    DORMANT("Dormant"),
    @XmlEnumValue("EJJ - Youth Serving Juvenile Snt")
    EJJ_YOUTH_SERVING_JUVENILE_SNT("EJJ - Youth Serving Juvenile Snt"),
    @XmlEnumValue("EJJ Case - Has Adult Sentence Only")
    EJJ_CASE_HAS_ADULT_SENTENCE_ONLY("EJJ Case - Has Adult Sentence Only"),
    @XmlEnumValue("EJJ Case - No Juvenile or Adult Sentence")
    EJJ_CASE_NO_JUVENILE_OR_ADULT_SENTENCE("EJJ Case - No Juvenile or Adult Sentence"),
    @XmlEnumValue("EJJ Case - Youth Serving Adult Sentence")
    EJJ_CASE_YOUTH_SERVING_ADULT_SENTENCE("EJJ Case - Youth Serving Adult Sentence"),
    @XmlEnumValue("EJJ Case - Youth Serving Juvenile Sentence")
    EJJ_CASE_YOUTH_SERVING_JUVENILE_SENTENCE("EJJ Case - Youth Serving Juvenile Sentence"),
    @XmlEnumValue("Exported")
    EXPORTED("Exported"),
    @XmlEnumValue("Final Pay/Appear Notice Sent")
    FINAL_PAY_APPEAR_NOTICE_SENT("Final Pay/Appear Notice Sent"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),
    @XmlEnumValue("Interim Disposition")
    INTERIM_DISPOSITION("Interim Disposition"),
    @XmlEnumValue("Motion for EJJ Filed")
    MOTION_FOR_EJJ_FILED("Motion for EJJ Filed"),
    @XmlEnumValue("Old Code")
    OLD_CODE("Old Code"),
    @XmlEnumValue("Old Code 2")
    OLD_CODE_2("Old Code 2"),
    @XmlEnumValue("Old Code 3")
    OLD_CODE_3("Old Code 3"),
    @XmlEnumValue("Old Code 4")
    OLD_CODE_4("Old Code 4"),
    @XmlEnumValue("Old Code 5")
    OLD_CODE_5("Old Code 5"),
    @XmlEnumValue("On Hold")
    ON_HOLD("On Hold"),
    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Pending Probable Cause")
    PENDING_PROBABLE_CAUSE("Pending Probable Cause"),
    @XmlEnumValue("Pending Referral")
    PENDING_REFERRAL("Pending Referral"),
    @XmlEnumValue("Petition for EJJ Filed")
    PETITION_FOR_EJJ_FILED("Petition for EJJ Filed"),
    @XmlEnumValue("Probated")
    PROBATED("Probated"),
    @XmlEnumValue("Reopened")
    REOPENED("Reopened"),
    @XmlEnumValue("Safekeeping")
    SAFEKEEPING("Safekeeping"),
    @XmlEnumValue("Test Case Status")
    TEST_CASE_STATUS("Test Case Status"),
    @XmlEnumValue("Uncertain")
    UNCERTAIN("Uncertain"),
    @XmlEnumValue("Under Court Jurisdiction")
    UNDER_COURT_JURISDICTION("Under Court Jurisdiction"),
    @XmlEnumValue("Unprobated")
    UNPROBATED("Unprobated"),
    @XmlEnumValue("Withdrawn")
    WITHDRAWN("Withdrawn"),
    @XmlEnumValue("Youth Serving Adult Snt")
    YOUTH_SERVING_ADULT_SNT("Youth Serving Adult Snt");
    private final String value;

    CaseStatusTypeTextType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CaseStatusTypeTextType fromValue(String v) {
        for (CaseStatusTypeTextType c: CaseStatusTypeTextType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}