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
 * <p>Java class for SentenceEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SentenceEventType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Adult sentence executed-EJJ"/>
 *     &lt;enumeration value="Certified as an adult"/>
 *     &lt;enumeration value="Certified as EJJ"/>
 *     &lt;enumeration value="Change of venue"/>
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="Continued"/>
 *     &lt;enumeration value="Continued Juvenile"/>
 *     &lt;enumeration value="Converted Juvenile Court Disposition"/>
 *     &lt;enumeration value="Converted TCIS Criminal Sentence"/>
 *     &lt;enumeration value="Converted TCIS Criminal Sentence: Stay of Imposition"/>
 *     &lt;enumeration value="Delinquency disposition imposed"/>
 *     &lt;enumeration value="Disposition/permanency ordered"/>
 *     &lt;enumeration value="EJJ Adult Sentence Imposed"/>
 *     &lt;enumeration value="EJJ disposition imposed"/>
 *     &lt;enumeration value="Felony DWI"/>
 *     &lt;enumeration value="Juvenile Disposition Imposed"/>
 *     &lt;enumeration value="Juvenile Petty Offense"/>
 *     &lt;enumeration value="Modification"/>
 *     &lt;enumeration value="Modified Outcome"/>
 *     &lt;enumeration value="New/Re-sentenced"/>
 *     &lt;enumeration value="No change in status at this time"/>
 *     &lt;enumeration value="No sentence pronounced"/>
 *     &lt;enumeration value="Original Outcome"/>
 *     &lt;enumeration value="Payable without appearance"/>
 *     &lt;enumeration value="Petition Dismissed"/>
 *     &lt;enumeration value="Petty MSD"/>
 *     &lt;enumeration value="Predisposition order(s)"/>
 *     &lt;enumeration value="Revocation"/>
 *     &lt;enumeration value="Revoked Outcome"/>
 *     &lt;enumeration value="Sentence combined with another case"/>
 *     &lt;enumeration value="Sentenced"/>
 *     &lt;enumeration value="Staggered Sentence"/>
 *     &lt;enumeration value="Stay of execution"/>
 *     &lt;enumeration value="Stay of Imposition Pursuant to M.S. 609.135"/>
 *     &lt;enumeration value="Termination of jurisdiction"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SentenceEventType")
@XmlEnum
public enum SentenceEventType {

    @XmlEnumValue("Adult sentence executed-EJJ")
    ADULT_SENTENCE_EXECUTED_EJJ("Adult sentence executed-EJJ"),
    @XmlEnumValue("Certified as an adult")
    CERTIFIED_AS_AN_ADULT("Certified as an adult"),
    @XmlEnumValue("Certified as EJJ")
    CERTIFIED_AS_EJJ("Certified as EJJ"),
    @XmlEnumValue("Change of venue")
    CHANGE_OF_VENUE("Change of venue"),
    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("Continued")
    CONTINUED("Continued"),
    @XmlEnumValue("Continued Juvenile")
    CONTINUED_JUVENILE("Continued Juvenile"),
    @XmlEnumValue("Converted Juvenile Court Disposition")
    CONVERTED_JUVENILE_COURT_DISPOSITION("Converted Juvenile Court Disposition"),
    @XmlEnumValue("Converted TCIS Criminal Sentence")
    CONVERTED_TCIS_CRIMINAL_SENTENCE("Converted TCIS Criminal Sentence"),
    @XmlEnumValue("Converted TCIS Criminal Sentence: Stay of Imposition")
    CONVERTED_TCIS_CRIMINAL_SENTENCE_STAY_OF_IMPOSITION("Converted TCIS Criminal Sentence: Stay of Imposition"),
    @XmlEnumValue("Delinquency disposition imposed")
    DELINQUENCY_DISPOSITION_IMPOSED("Delinquency disposition imposed"),
    @XmlEnumValue("Disposition/permanency ordered")
    DISPOSITION_PERMANENCY_ORDERED("Disposition/permanency ordered"),
    @XmlEnumValue("EJJ Adult Sentence Imposed")
    EJJ_ADULT_SENTENCE_IMPOSED("EJJ Adult Sentence Imposed"),
    @XmlEnumValue("EJJ disposition imposed")
    EJJ_DISPOSITION_IMPOSED("EJJ disposition imposed"),
    @XmlEnumValue("Felony DWI")
    FELONY_DWI("Felony DWI"),
    @XmlEnumValue("Juvenile Disposition Imposed")
    JUVENILE_DISPOSITION_IMPOSED("Juvenile Disposition Imposed"),
    @XmlEnumValue("Juvenile Petty Offense")
    JUVENILE_PETTY_OFFENSE("Juvenile Petty Offense"),
    @XmlEnumValue("Modification")
    MODIFICATION("Modification"),
    @XmlEnumValue("Modified Outcome")
    MODIFIED_OUTCOME("Modified Outcome"),
    @XmlEnumValue("New/Re-sentenced")
    NEW_RE_SENTENCED("New/Re-sentenced"),
    @XmlEnumValue("No change in status at this time")
    NO_CHANGE_IN_STATUS_AT_THIS_TIME("No change in status at this time"),
    @XmlEnumValue("No sentence pronounced")
    NO_SENTENCE_PRONOUNCED("No sentence pronounced"),
    @XmlEnumValue("Original Outcome")
    ORIGINAL_OUTCOME("Original Outcome"),
    @XmlEnumValue("Payable without appearance")
    PAYABLE_WITHOUT_APPEARANCE("Payable without appearance"),
    @XmlEnumValue("Petition Dismissed")
    PETITION_DISMISSED("Petition Dismissed"),
    @XmlEnumValue("Petty MSD")
    PETTY_MSD("Petty MSD"),
    @XmlEnumValue("Predisposition order(s)")
    PREDISPOSITION_ORDER_S("Predisposition order(s)"),
    @XmlEnumValue("Revocation")
    REVOCATION("Revocation"),
    @XmlEnumValue("Revoked Outcome")
    REVOKED_OUTCOME("Revoked Outcome"),
    @XmlEnumValue("Sentence combined with another case")
    SENTENCE_COMBINED_WITH_ANOTHER_CASE("Sentence combined with another case"),
    @XmlEnumValue("Sentenced")
    SENTENCED("Sentenced"),
    @XmlEnumValue("Staggered Sentence")
    STAGGERED_SENTENCE("Staggered Sentence"),
    @XmlEnumValue("Stay of execution")
    STAY_OF_EXECUTION("Stay of execution"),
    @XmlEnumValue("Stay of Imposition Pursuant to M.S. 609.135")
    STAY_OF_IMPOSITION_PURSUANT_TO_M_S_609_135("Stay of Imposition Pursuant to M.S. 609.135"),
    @XmlEnumValue("Termination of jurisdiction")
    TERMINATION_OF_JURISDICTION("Termination of jurisdiction");
    private final String value;

    SentenceEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SentenceEventType fromValue(String v) {
        for (SentenceEventType c: SentenceEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}