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
 * <p>Java class for JudgmentEventTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JudgmentEventTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Abandon"/>
 *     &lt;enumeration value="Adjudicated"/>
 *     &lt;enumeration value="Adjudicated: Default"/>
 *     &lt;enumeration value="Adjudicated: No"/>
 *     &lt;enumeration value="Adjudicated: Yes"/>
 *     &lt;enumeration value="Adjudication withheld"/>
 *     &lt;enumeration value="Admitted"/>
 *     &lt;enumeration value="Adopted"/>
 *     &lt;enumeration value="Adoption Granted - Judgment"/>
 *     &lt;enumeration value="Annulment Granted - Judgment"/>
 *     &lt;enumeration value="Arbitration award final"/>
 *     &lt;enumeration value="Case Consolidated"/>
 *     &lt;enumeration value="Change of name denied"/>
 *     &lt;enumeration value="Change of name granted"/>
 *     &lt;enumeration value="Change of venue - administrative"/>
 *     &lt;enumeration value="Change of venue granted"/>
 *     &lt;enumeration value="Child Added"/>
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="Closed - other"/>
 *     &lt;enumeration value="Closed administratively"/>
 *     &lt;enumeration value="Closed at arbitration - other"/>
 *     &lt;enumeration value="Closed at filing"/>
 *     &lt;enumeration value="Closed at settlement hearing"/>
 *     &lt;enumeration value="Closed-Fee Not Waived and Not Paid"/>
 *     &lt;enumeration value="Cncvtr Adult Prs&amp;Est"/>
 *     &lt;enumeration value="Cnsvtr Adult Estate"/>
 *     &lt;enumeration value="Cnsvtr Adult Person"/>
 *     &lt;enumeration value="Commissioners Appointed"/>
 *     &lt;enumeration value="Commitment - Adjudged Legally Incompetent"/>
 *     &lt;enumeration value="Committed"/>
 *     &lt;enumeration value="Committed - Chemically Dependent"/>
 *     &lt;enumeration value="Committed - Developmentally Disabled"/>
 *     &lt;enumeration value="Committed - Mentally Ill"/>
 *     &lt;enumeration value="Committed - Mentally Ill and Dangerous"/>
 *     &lt;enumeration value="Committed - Psychopathic Person"/>
 *     &lt;enumeration value="Committed - Sexual Psychopathic Personality"/>
 *     &lt;enumeration value="Committed - Sexually Dangerous Person"/>
 *     &lt;enumeration value="Conservatorship-estate"/>
 *     &lt;enumeration value="Conservatorship-person"/>
 *     &lt;enumeration value="Conservatorship-person &amp; estate"/>
 *     &lt;enumeration value="Cont'd for Dismissal"/>
 *     &lt;enumeration value="Continued Commitment - Chemically Dependent"/>
 *     &lt;enumeration value="Continued Commitment - Developmentally Disabled"/>
 *     &lt;enumeration value="Continued Commitment - Mentally Ill"/>
 *     &lt;enumeration value="Continued for dismissal"/>
 *     &lt;enumeration value="CONVERT JUDGMENT FOR LANDLORD"/>
 *     &lt;enumeration value="CONVERT JUDGMENT FOR TENANT"/>
 *     &lt;enumeration value="CONVERT JUDGMENT TENANT REDEMPTION"/>
 *     &lt;enumeration value="CONVERT LANDLORD VIOLATION OF HAB"/>
 *     &lt;enumeration value="CONVERT OTHER"/>
 *     &lt;enumeration value="CONVERTED - ADMINISTRATIVE JUDGMENT ENTERED"/>
 *     &lt;enumeration value="CONVERTED - AMENDED RESTRAINING ORDER ISSUED"/>
 *     &lt;enumeration value="CONVERTED - CLOSED AFTER NOI FILED"/>
 *     &lt;enumeration value="CONVERTED - CLOSED AT CONVERSION"/>
 *     &lt;enumeration value="CONVERTED - CLOSED PRIOR NI"/>
 *     &lt;enumeration value="CONVERTED - CLOSED-DEFAULT PROCEEDING (NOI)"/>
 *     &lt;enumeration value="CONVERTED - DISMISSED-COURT ORDER"/>
 *     &lt;enumeration value="CONVERTED - DORMANT AT FILING"/>
 *     &lt;enumeration value="CONVERTED - INVOLUNTARY DISMISSAL W/OUT PREJ"/>
 *     &lt;enumeration value="CONVERTED - INVOLUNTARY DISMISSAL WITH PREJ"/>
 *     &lt;enumeration value="CONVERTED - JURY VERDICT RETURNED"/>
 *     &lt;enumeration value="CONVERTED - MEDIATION -ORDER ISSUED BY COURT"/>
 *     &lt;enumeration value="CONVERTED - MUTUAL RESTRAINING ORDER ISSUED"/>
 *     &lt;enumeration value="CONVERTED - NOI CASE - HEARD BY DEFAULT"/>
 *     &lt;enumeration value="CONVERTED - RESTRAINING ORDER ISSUED"/>
 *     &lt;enumeration value="CONVERTED - SETTLED PRIOR TO NOI/CERT"/>
 *     &lt;enumeration value="CONVERTED - STRICKEN - CASE DORMANT"/>
 *     &lt;enumeration value="CONVERTED - TRIAL BY DEFAULT"/>
 *     &lt;enumeration value="CONVERTED ADOPTION"/>
 *     &lt;enumeration value="CONVERTED JUDGMENT EVENT"/>
 *     &lt;enumeration value="Converted Juvenile Court Disposition"/>
 *     &lt;enumeration value="CONVERTED OUT OF HOME PLACEMENT"/>
 *     &lt;enumeration value="CONVERTED PROTECTIVE SUPERVISION"/>
 *     &lt;enumeration value="Converted results that close the case"/>
 *     &lt;enumeration value="Converted TCIS disposition unavailable"/>
 *     &lt;enumeration value="Court Trial Concluded"/>
 *     &lt;enumeration value="Custody order"/>
 *     &lt;enumeration value="Decree of descent"/>
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Default Judgment Granted"/>
 *     &lt;enumeration value="Defendant"/>
 *     &lt;enumeration value="Delinquent"/>
 *     &lt;enumeration value="Denied"/>
 *     &lt;enumeration value="Dfd Rfrd to Diversion"/>
 *     &lt;enumeration value="Discharge of conservator"/>
 *     &lt;enumeration value="Discharge of guardian"/>
 *     &lt;enumeration value="Discharge of Guardian/Conservator"/>
 *     &lt;enumeration value="Discharge Personal Representative"/>
 *     &lt;enumeration value="Discharge Special Administrator"/>
 *     &lt;enumeration value="Dismissal by Stipulation - Judgment"/>
 *     &lt;enumeration value="Dismissal With Prejudice - Judgment"/>
 *     &lt;enumeration value="Dismissal with prejudice - not all parties"/>
 *     &lt;enumeration value="Dismissal without prejudice"/>
 *     &lt;enumeration value="Dismissal without prejudice - not all parties"/>
 *     &lt;enumeration value="Dismissed"/>
 *     &lt;enumeration value="Dismissed - not all parties"/>
 *     &lt;enumeration value="Disposition/Permanency Ordered"/>
 *     &lt;enumeration value="Dissolution Granted - Judgment"/>
 *     &lt;enumeration value="Dissolution/annulment granted"/>
 *     &lt;enumeration value="Driver's License Revocation Reversed"/>
 *     &lt;enumeration value="Driver's license revocation upheld"/>
 *     &lt;enumeration value="Eviction, Failure to Vacate - Judgment"/>
 *     &lt;enumeration value="Eviction, Non-Payment of Rent - Judgment"/>
 *     &lt;enumeration value="Eviction, Other/Breach of Lease - Judgment"/>
 *     &lt;enumeration value="Eviction, Violation of Covenants - Judgment"/>
 *     &lt;enumeration value="Failure to Appear"/>
 *     &lt;enumeration value="For Plaintiff"/>
 *     &lt;enumeration value="Foreign Order for Protection"/>
 *     &lt;enumeration value="Forfeiture Denied"/>
 *     &lt;enumeration value="Forfeiture Granted"/>
 *     &lt;enumeration value="Foster Care Specific Period of Time"/>
 *     &lt;enumeration value="Found Not True"/>
 *     &lt;enumeration value="Found True"/>
 *     &lt;enumeration value="Grdn Adult Estate"/>
 *     &lt;enumeration value="Grdn Adult Person"/>
 *     &lt;enumeration value="Grdn Adult Prsn&amp;Est"/>
 *     &lt;enumeration value="Grdn Minor Person"/>
 *     &lt;enumeration value="Guardianship - Voting Rights Removed"/>
 *     &lt;enumeration value="Guardianship Through Consent to Adopt"/>
 *     &lt;enumeration value="Guardianship-estate"/>
 *     &lt;enumeration value="Guardianship-person"/>
 *     &lt;enumeration value="Guardianship-person &amp; estate"/>
 *     &lt;enumeration value="Guardianship/Conservatorship"/>
 *     &lt;enumeration value="Guardianship/custody to DHS"/>
 *     &lt;enumeration value="Guilty"/>
 *     &lt;enumeration value="Harassment restraining order (mutual) granted"/>
 *     &lt;enumeration value="Harassment restraining order issued"/>
 *     &lt;enumeration value="Heard by Default"/>
 *     &lt;enumeration value="Judgment"/>
 *     &lt;enumeration value="Judgment - not all parties"/>
 *     &lt;enumeration value="Judgment on Pleadings Granted"/>
 *     &lt;enumeration value="Judicial review approved"/>
 *     &lt;enumeration value="Jury Verdict Returned"/>
 *     &lt;enumeration value="Juvenile Disposition Imposed"/>
 *     &lt;enumeration value="Legal Separation Granted - Judgment"/>
 *     &lt;enumeration value="Letters Issued - Unsupervised Formal"/>
 *     &lt;enumeration value="Letters Issued- Informal"/>
 *     &lt;enumeration value="Living independently"/>
 *     &lt;enumeration value="Long term foster care"/>
 *     &lt;enumeration value="Mediation - order issued by Court"/>
 *     &lt;enumeration value="Mediation - settled no Court order"/>
 *     &lt;enumeration value="Minor Conservatorshp"/>
 *     &lt;enumeration value="Minor settlement approved"/>
 *     &lt;enumeration value="Modified"/>
 *     &lt;enumeration value="Mortgage Redemption Period Reduced"/>
 *     &lt;enumeration value="No Change in Status at this time"/>
 *     &lt;enumeration value="No Response"/>
 *     &lt;enumeration value="Non-suit"/>
 *     &lt;enumeration value="NonState Ward for Adoption"/>
 *     &lt;enumeration value="Not Delinquent"/>
 *     &lt;enumeration value="Not Guilty"/>
 *     &lt;enumeration value="Not proven"/>
 *     &lt;enumeration value="Order for protection"/>
 *     &lt;enumeration value="Original order"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Paternity Determination - Judgment"/>
 *     &lt;enumeration value="Permanent Custody to Agency"/>
 *     &lt;enumeration value="Petition Dismissed"/>
 *     &lt;enumeration value="Petition Withdrawn By Plaintiff"/>
 *     &lt;enumeration value="Plea not accepted"/>
 *     &lt;enumeration value="Pre-disposition care ordered"/>
 *     &lt;enumeration value="Predisposition Order(s)"/>
 *     &lt;enumeration value="Private Termination of Parental Rights - Stepparent Adoption"/>
 *     &lt;enumeration value="Proven"/>
 *     &lt;enumeration value="Recommitted"/>
 *     &lt;enumeration value="Recommitted - Chemically Dependent"/>
 *     &lt;enumeration value="Recommitted - Developmentally Disabled"/>
 *     &lt;enumeration value="Recommitted - Mentally Ill"/>
 *     &lt;enumeration value="Reestablished Legal Parent and Child Relationship"/>
 *     &lt;enumeration value="Removed to Federal Court"/>
 *     &lt;enumeration value="Replevin Granted - Judgment"/>
 *     &lt;enumeration value="Restored to capacity"/>
 *     &lt;enumeration value="Reunification"/>
 *     &lt;enumeration value="SEE FILE FOR OUTCOME"/>
 *     &lt;enumeration value="Settled"/>
 *     &lt;enumeration value="Settled after arbitration hearing"/>
 *     &lt;enumeration value="Settled by ADR"/>
 *     &lt;enumeration value="SETTLED BY MEDIATION"/>
 *     &lt;enumeration value="SETTLED BY PARTIES"/>
 *     &lt;enumeration value="Settled during arbitration hearing"/>
 *     &lt;enumeration value="Settled prior to ADR"/>
 *     &lt;enumeration value="Settled prior to arbitration hearing"/>
 *     &lt;enumeration value="Settled prior to trial"/>
 *     &lt;enumeration value="State ward for adoption"/>
 *     &lt;enumeration value="State ward ordered into long term foster care"/>
 *     &lt;enumeration value="Stay of Adjudication"/>
 *     &lt;enumeration value="Stay of commitment"/>
 *     &lt;enumeration value="Stricken - case closed"/>
 *     &lt;enumeration value="Stricken -case dormant"/>
 *     &lt;enumeration value="Summary decree"/>
 *     &lt;enumeration value="Summary Dissolution - Judgment"/>
 *     &lt;enumeration value="Summary judgment - not all parties"/>
 *     &lt;enumeration value="Summary judgment granted"/>
 *     &lt;enumeration value="Support order"/>
 *     &lt;enumeration value="Temp. restraining order denied-case closed"/>
 *     &lt;enumeration value="Temp. restraining order dismissed-case closed"/>
 *     &lt;enumeration value="Temporary Custody to Agency"/>
 *     &lt;enumeration value="Tenant Redemption - Judgment"/>
 *     &lt;enumeration value="Termination of jurisdiction"/>
 *     &lt;enumeration value="Termination of Parental Rights-Involuntary"/>
 *     &lt;enumeration value="Termination of Parental Rights-Voluntary"/>
 *     &lt;enumeration value="Termination parental rights"/>
 *     &lt;enumeration value="Termination parental rights of father"/>
 *     &lt;enumeration value="Termination parental rights of mother"/>
 *     &lt;enumeration value="Transfer Permanent Legal &amp; Physical Custody"/>
 *     &lt;enumeration value="Transferred"/>
 *     &lt;enumeration value="Trust - Court Jurisdiction Assumed"/>
 *     &lt;enumeration value="Trust-Termination of Jurisdiction"/>
 *     &lt;enumeration value="UD Counter Claim"/>
 *     &lt;enumeration value="UD Oth Breach Lease"/>
 *     &lt;enumeration value="UD Viol. Covenants"/>
 *     &lt;enumeration value="Unlawful Detainer Nonpayment of Rent"/>
 *     &lt;enumeration value="Voluntary Dismissal by Plaintiff"/>
 *     &lt;enumeration value="Voluntary Foster Care for Treatment Approved"/>
 *     &lt;enumeration value="Voluntary Placement Agreement Until 21 Approved"/>
 *     &lt;enumeration value="Ward/Protected person deceased"/>
 *     &lt;enumeration value="Withdrawn"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "JudgmentEventTypeType")
@XmlEnum
public enum JudgmentEventTypeType {

    @XmlEnumValue("Abandon")
    ABANDON("Abandon"),
    @XmlEnumValue("Adjudicated")
    ADJUDICATED("Adjudicated"),
    @XmlEnumValue("Adjudicated: Default")
    ADJUDICATED_DEFAULT("Adjudicated: Default"),
    @XmlEnumValue("Adjudicated: No")
    ADJUDICATED_NO("Adjudicated: No"),
    @XmlEnumValue("Adjudicated: Yes")
    ADJUDICATED_YES("Adjudicated: Yes"),
    @XmlEnumValue("Adjudication withheld")
    ADJUDICATION_WITHHELD("Adjudication withheld"),
    @XmlEnumValue("Admitted")
    ADMITTED("Admitted"),
    @XmlEnumValue("Adopted")
    ADOPTED("Adopted"),
    @XmlEnumValue("Adoption Granted - Judgment")
    ADOPTION_GRANTED_JUDGMENT("Adoption Granted - Judgment"),
    @XmlEnumValue("Annulment Granted - Judgment")
    ANNULMENT_GRANTED_JUDGMENT("Annulment Granted - Judgment"),
    @XmlEnumValue("Arbitration award final")
    ARBITRATION_AWARD_FINAL("Arbitration award final"),
    @XmlEnumValue("Case Consolidated")
    CASE_CONSOLIDATED("Case Consolidated"),
    @XmlEnumValue("Change of name denied")
    CHANGE_OF_NAME_DENIED("Change of name denied"),
    @XmlEnumValue("Change of name granted")
    CHANGE_OF_NAME_GRANTED("Change of name granted"),
    @XmlEnumValue("Change of venue - administrative")
    CHANGE_OF_VENUE_ADMINISTRATIVE("Change of venue - administrative"),
    @XmlEnumValue("Change of venue granted")
    CHANGE_OF_VENUE_GRANTED("Change of venue granted"),
    @XmlEnumValue("Child Added")
    CHILD_ADDED("Child Added"),
    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("Closed - other")
    CLOSED_OTHER("Closed - other"),
    @XmlEnumValue("Closed administratively")
    CLOSED_ADMINISTRATIVELY("Closed administratively"),
    @XmlEnumValue("Closed at arbitration - other")
    CLOSED_AT_ARBITRATION_OTHER("Closed at arbitration - other"),
    @XmlEnumValue("Closed at filing")
    CLOSED_AT_FILING("Closed at filing"),
    @XmlEnumValue("Closed at settlement hearing")
    CLOSED_AT_SETTLEMENT_HEARING("Closed at settlement hearing"),
    @XmlEnumValue("Closed-Fee Not Waived and Not Paid")
    CLOSED_FEE_NOT_WAIVED_AND_NOT_PAID("Closed-Fee Not Waived and Not Paid"),
    @XmlEnumValue("Cncvtr Adult Prs&Est")
    CNCVTR_ADULT_PRS_EST("Cncvtr Adult Prs&Est"),
    @XmlEnumValue("Cnsvtr Adult Estate")
    CNSVTR_ADULT_ESTATE("Cnsvtr Adult Estate"),
    @XmlEnumValue("Cnsvtr Adult Person")
    CNSVTR_ADULT_PERSON("Cnsvtr Adult Person"),
    @XmlEnumValue("Commissioners Appointed")
    COMMISSIONERS_APPOINTED("Commissioners Appointed"),
    @XmlEnumValue("Commitment - Adjudged Legally Incompetent")
    COMMITMENT_ADJUDGED_LEGALLY_INCOMPETENT("Commitment - Adjudged Legally Incompetent"),
    @XmlEnumValue("Committed")
    COMMITTED("Committed"),
    @XmlEnumValue("Committed - Chemically Dependent")
    COMMITTED_CHEMICALLY_DEPENDENT("Committed - Chemically Dependent"),
    @XmlEnumValue("Committed - Developmentally Disabled")
    COMMITTED_DEVELOPMENTALLY_DISABLED("Committed - Developmentally Disabled"),
    @XmlEnumValue("Committed - Mentally Ill")
    COMMITTED_MENTALLY_ILL("Committed - Mentally Ill"),
    @XmlEnumValue("Committed - Mentally Ill and Dangerous")
    COMMITTED_MENTALLY_ILL_AND_DANGEROUS("Committed - Mentally Ill and Dangerous"),
    @XmlEnumValue("Committed - Psychopathic Person")
    COMMITTED_PSYCHOPATHIC_PERSON("Committed - Psychopathic Person"),
    @XmlEnumValue("Committed - Sexual Psychopathic Personality")
    COMMITTED_SEXUAL_PSYCHOPATHIC_PERSONALITY("Committed - Sexual Psychopathic Personality"),
    @XmlEnumValue("Committed - Sexually Dangerous Person")
    COMMITTED_SEXUALLY_DANGEROUS_PERSON("Committed - Sexually Dangerous Person"),
    @XmlEnumValue("Conservatorship-estate")
    CONSERVATORSHIP_ESTATE("Conservatorship-estate"),
    @XmlEnumValue("Conservatorship-person")
    CONSERVATORSHIP_PERSON("Conservatorship-person"),
    @XmlEnumValue("Conservatorship-person & estate")
    CONSERVATORSHIP_PERSON_ESTATE("Conservatorship-person & estate"),
    @XmlEnumValue("Cont'd for Dismissal")
    CONT_D_FOR_DISMISSAL("Cont'd for Dismissal"),
    @XmlEnumValue("Continued Commitment - Chemically Dependent")
    CONTINUED_COMMITMENT_CHEMICALLY_DEPENDENT("Continued Commitment - Chemically Dependent"),
    @XmlEnumValue("Continued Commitment - Developmentally Disabled")
    CONTINUED_COMMITMENT_DEVELOPMENTALLY_DISABLED("Continued Commitment - Developmentally Disabled"),
    @XmlEnumValue("Continued Commitment - Mentally Ill")
    CONTINUED_COMMITMENT_MENTALLY_ILL("Continued Commitment - Mentally Ill"),
    @XmlEnumValue("Continued for dismissal")
    CONTINUED_FOR_DISMISSAL("Continued for dismissal"),
    @XmlEnumValue("CONVERT JUDGMENT FOR LANDLORD")
    CONVERT_JUDGMENT_FOR_LANDLORD("CONVERT JUDGMENT FOR LANDLORD"),
    @XmlEnumValue("CONVERT JUDGMENT FOR TENANT")
    CONVERT_JUDGMENT_FOR_TENANT("CONVERT JUDGMENT FOR TENANT"),
    @XmlEnumValue("CONVERT JUDGMENT TENANT REDEMPTION")
    CONVERT_JUDGMENT_TENANT_REDEMPTION("CONVERT JUDGMENT TENANT REDEMPTION"),
    @XmlEnumValue("CONVERT LANDLORD VIOLATION OF HAB")
    CONVERT_LANDLORD_VIOLATION_OF_HAB("CONVERT LANDLORD VIOLATION OF HAB"),
    @XmlEnumValue("CONVERT OTHER")
    CONVERT_OTHER("CONVERT OTHER"),
    @XmlEnumValue("CONVERTED - ADMINISTRATIVE JUDGMENT ENTERED")
    CONVERTED_ADMINISTRATIVE_JUDGMENT_ENTERED("CONVERTED - ADMINISTRATIVE JUDGMENT ENTERED"),
    @XmlEnumValue("CONVERTED - AMENDED RESTRAINING ORDER ISSUED")
    CONVERTED_AMENDED_RESTRAINING_ORDER_ISSUED("CONVERTED - AMENDED RESTRAINING ORDER ISSUED"),
    @XmlEnumValue("CONVERTED - CLOSED AFTER NOI FILED")
    CONVERTED_CLOSED_AFTER_NOI_FILED("CONVERTED - CLOSED AFTER NOI FILED"),
    @XmlEnumValue("CONVERTED - CLOSED AT CONVERSION")
    CONVERTED_CLOSED_AT_CONVERSION("CONVERTED - CLOSED AT CONVERSION"),
    @XmlEnumValue("CONVERTED - CLOSED PRIOR NI")
    CONVERTED_CLOSED_PRIOR_NI("CONVERTED - CLOSED PRIOR NI"),
    @XmlEnumValue("CONVERTED - CLOSED-DEFAULT PROCEEDING (NOI)")
    CONVERTED_CLOSED_DEFAULT_PROCEEDING_NOI("CONVERTED - CLOSED-DEFAULT PROCEEDING (NOI)"),
    @XmlEnumValue("CONVERTED - DISMISSED-COURT ORDER")
    CONVERTED_DISMISSED_COURT_ORDER("CONVERTED - DISMISSED-COURT ORDER"),
    @XmlEnumValue("CONVERTED - DORMANT AT FILING")
    CONVERTED_DORMANT_AT_FILING("CONVERTED - DORMANT AT FILING"),
    @XmlEnumValue("CONVERTED - INVOLUNTARY DISMISSAL W/OUT PREJ")
    CONVERTED_INVOLUNTARY_DISMISSAL_W_OUT_PREJ("CONVERTED - INVOLUNTARY DISMISSAL W/OUT PREJ"),
    @XmlEnumValue("CONVERTED - INVOLUNTARY DISMISSAL WITH PREJ")
    CONVERTED_INVOLUNTARY_DISMISSAL_WITH_PREJ("CONVERTED - INVOLUNTARY DISMISSAL WITH PREJ"),
    @XmlEnumValue("CONVERTED - JURY VERDICT RETURNED")
    CONVERTED_JURY_VERDICT_RETURNED("CONVERTED - JURY VERDICT RETURNED"),
    @XmlEnumValue("CONVERTED - MEDIATION -ORDER ISSUED BY COURT")
    CONVERTED_MEDIATION_ORDER_ISSUED_BY_COURT("CONVERTED - MEDIATION -ORDER ISSUED BY COURT"),
    @XmlEnumValue("CONVERTED - MUTUAL RESTRAINING ORDER ISSUED")
    CONVERTED_MUTUAL_RESTRAINING_ORDER_ISSUED("CONVERTED - MUTUAL RESTRAINING ORDER ISSUED"),
    @XmlEnumValue("CONVERTED - NOI CASE - HEARD BY DEFAULT")
    CONVERTED_NOI_CASE_HEARD_BY_DEFAULT("CONVERTED - NOI CASE - HEARD BY DEFAULT"),
    @XmlEnumValue("CONVERTED - RESTRAINING ORDER ISSUED")
    CONVERTED_RESTRAINING_ORDER_ISSUED("CONVERTED - RESTRAINING ORDER ISSUED"),
    @XmlEnumValue("CONVERTED - SETTLED PRIOR TO NOI/CERT")
    CONVERTED_SETTLED_PRIOR_TO_NOI_CERT("CONVERTED - SETTLED PRIOR TO NOI/CERT"),
    @XmlEnumValue("CONVERTED - STRICKEN - CASE DORMANT")
    CONVERTED_STRICKEN_CASE_DORMANT("CONVERTED - STRICKEN - CASE DORMANT"),
    @XmlEnumValue("CONVERTED - TRIAL BY DEFAULT")
    CONVERTED_TRIAL_BY_DEFAULT("CONVERTED - TRIAL BY DEFAULT"),
    @XmlEnumValue("CONVERTED ADOPTION")
    CONVERTED_ADOPTION("CONVERTED ADOPTION"),
    @XmlEnumValue("CONVERTED JUDGMENT EVENT")
    CONVERTED_JUDGMENT_EVENT("CONVERTED JUDGMENT EVENT"),
    @XmlEnumValue("Converted Juvenile Court Disposition")
    CONVERTED_JUVENILE_COURT_DISPOSITION("Converted Juvenile Court Disposition"),
    @XmlEnumValue("CONVERTED OUT OF HOME PLACEMENT")
    CONVERTED_OUT_OF_HOME_PLACEMENT("CONVERTED OUT OF HOME PLACEMENT"),
    @XmlEnumValue("CONVERTED PROTECTIVE SUPERVISION")
    CONVERTED_PROTECTIVE_SUPERVISION("CONVERTED PROTECTIVE SUPERVISION"),
    @XmlEnumValue("Converted results that close the case")
    CONVERTED_RESULTS_THAT_CLOSE_THE_CASE("Converted results that close the case"),
    @XmlEnumValue("Converted TCIS disposition unavailable")
    CONVERTED_TCIS_DISPOSITION_UNAVAILABLE("Converted TCIS disposition unavailable"),
    @XmlEnumValue("Court Trial Concluded")
    COURT_TRIAL_CONCLUDED("Court Trial Concluded"),
    @XmlEnumValue("Custody order")
    CUSTODY_ORDER("Custody order"),
    @XmlEnumValue("Decree of descent")
    DECREE_OF_DESCENT("Decree of descent"),
    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Default Judgment Granted")
    DEFAULT_JUDGMENT_GRANTED("Default Judgment Granted"),
    @XmlEnumValue("Defendant")
    DEFENDANT("Defendant"),
    @XmlEnumValue("Delinquent")
    DELINQUENT("Delinquent"),
    @XmlEnumValue("Denied")
    DENIED("Denied"),
    @XmlEnumValue("Dfd Rfrd to Diversion")
    DFD_RFRD_TO_DIVERSION("Dfd Rfrd to Diversion"),
    @XmlEnumValue("Discharge of conservator")
    DISCHARGE_OF_CONSERVATOR("Discharge of conservator"),
    @XmlEnumValue("Discharge of guardian")
    DISCHARGE_OF_GUARDIAN("Discharge of guardian"),
    @XmlEnumValue("Discharge of Guardian/Conservator")
    DISCHARGE_OF_GUARDIAN_CONSERVATOR("Discharge of Guardian/Conservator"),
    @XmlEnumValue("Discharge Personal Representative")
    DISCHARGE_PERSONAL_REPRESENTATIVE("Discharge Personal Representative"),
    @XmlEnumValue("Discharge Special Administrator")
    DISCHARGE_SPECIAL_ADMINISTRATOR("Discharge Special Administrator"),
    @XmlEnumValue("Dismissal by Stipulation - Judgment")
    DISMISSAL_BY_STIPULATION_JUDGMENT("Dismissal by Stipulation - Judgment"),
    @XmlEnumValue("Dismissal With Prejudice - Judgment")
    DISMISSAL_WITH_PREJUDICE_JUDGMENT("Dismissal With Prejudice - Judgment"),
    @XmlEnumValue("Dismissal with prejudice - not all parties")
    DISMISSAL_WITH_PREJUDICE_NOT_ALL_PARTIES("Dismissal with prejudice - not all parties"),
    @XmlEnumValue("Dismissal without prejudice")
    DISMISSAL_WITHOUT_PREJUDICE("Dismissal without prejudice"),
    @XmlEnumValue("Dismissal without prejudice - not all parties")
    DISMISSAL_WITHOUT_PREJUDICE_NOT_ALL_PARTIES("Dismissal without prejudice - not all parties"),
    @XmlEnumValue("Dismissed")
    DISMISSED("Dismissed"),
    @XmlEnumValue("Dismissed - not all parties")
    DISMISSED_NOT_ALL_PARTIES("Dismissed - not all parties"),
    @XmlEnumValue("Disposition/Permanency Ordered")
    DISPOSITION_PERMANENCY_ORDERED("Disposition/Permanency Ordered"),
    @XmlEnumValue("Dissolution Granted - Judgment")
    DISSOLUTION_GRANTED_JUDGMENT("Dissolution Granted - Judgment"),
    @XmlEnumValue("Dissolution/annulment granted")
    DISSOLUTION_ANNULMENT_GRANTED("Dissolution/annulment granted"),
    @XmlEnumValue("Driver's License Revocation Reversed")
    DRIVER_S_LICENSE_REVOCATION_REVERSED("Driver's License Revocation Reversed"),
    @XmlEnumValue("Driver's license revocation upheld")
    DRIVER_S_LICENSE_REVOCATION_UPHELD("Driver's license revocation upheld"),
    @XmlEnumValue("Eviction, Failure to Vacate - Judgment")
    EVICTION_FAILURE_TO_VACATE_JUDGMENT("Eviction, Failure to Vacate - Judgment"),
    @XmlEnumValue("Eviction, Non-Payment of Rent - Judgment")
    EVICTION_NON_PAYMENT_OF_RENT_JUDGMENT("Eviction, Non-Payment of Rent - Judgment"),
    @XmlEnumValue("Eviction, Other/Breach of Lease - Judgment")
    EVICTION_OTHER_BREACH_OF_LEASE_JUDGMENT("Eviction, Other/Breach of Lease - Judgment"),
    @XmlEnumValue("Eviction, Violation of Covenants - Judgment")
    EVICTION_VIOLATION_OF_COVENANTS_JUDGMENT("Eviction, Violation of Covenants - Judgment"),
    @XmlEnumValue("Failure to Appear")
    FAILURE_TO_APPEAR("Failure to Appear"),
    @XmlEnumValue("For Plaintiff")
    FOR_PLAINTIFF("For Plaintiff"),
    @XmlEnumValue("Foreign Order for Protection")
    FOREIGN_ORDER_FOR_PROTECTION("Foreign Order for Protection"),
    @XmlEnumValue("Forfeiture Denied")
    FORFEITURE_DENIED("Forfeiture Denied"),
    @XmlEnumValue("Forfeiture Granted")
    FORFEITURE_GRANTED("Forfeiture Granted"),
    @XmlEnumValue("Foster Care Specific Period of Time")
    FOSTER_CARE_SPECIFIC_PERIOD_OF_TIME("Foster Care Specific Period of Time"),
    @XmlEnumValue("Found Not True")
    FOUND_NOT_TRUE("Found Not True"),
    @XmlEnumValue("Found True")
    FOUND_TRUE("Found True"),
    @XmlEnumValue("Grdn Adult Estate")
    GRDN_ADULT_ESTATE("Grdn Adult Estate"),
    @XmlEnumValue("Grdn Adult Person")
    GRDN_ADULT_PERSON("Grdn Adult Person"),
    @XmlEnumValue("Grdn Adult Prsn&Est")
    GRDN_ADULT_PRSN_EST("Grdn Adult Prsn&Est"),
    @XmlEnumValue("Grdn Minor Person")
    GRDN_MINOR_PERSON("Grdn Minor Person"),
    @XmlEnumValue("Guardianship - Voting Rights Removed")
    GUARDIANSHIP_VOTING_RIGHTS_REMOVED("Guardianship - Voting Rights Removed"),
    @XmlEnumValue("Guardianship Through Consent to Adopt")
    GUARDIANSHIP_THROUGH_CONSENT_TO_ADOPT("Guardianship Through Consent to Adopt"),
    @XmlEnumValue("Guardianship-estate")
    GUARDIANSHIP_ESTATE("Guardianship-estate"),
    @XmlEnumValue("Guardianship-person")
    GUARDIANSHIP_PERSON("Guardianship-person"),
    @XmlEnumValue("Guardianship-person & estate")
    GUARDIANSHIP_PERSON_ESTATE("Guardianship-person & estate"),
    @XmlEnumValue("Guardianship/Conservatorship")
    GUARDIANSHIP_CONSERVATORSHIP("Guardianship/Conservatorship"),
    @XmlEnumValue("Guardianship/custody to DHS")
    GUARDIANSHIP_CUSTODY_TO_DHS("Guardianship/custody to DHS"),
    @XmlEnumValue("Guilty")
    GUILTY("Guilty"),
    @XmlEnumValue("Harassment restraining order (mutual) granted")
    HARASSMENT_RESTRAINING_ORDER_MUTUAL_GRANTED("Harassment restraining order (mutual) granted"),
    @XmlEnumValue("Harassment restraining order issued")
    HARASSMENT_RESTRAINING_ORDER_ISSUED("Harassment restraining order issued"),
    @XmlEnumValue("Heard by Default")
    HEARD_BY_DEFAULT("Heard by Default"),
    @XmlEnumValue("Judgment")
    JUDGMENT("Judgment"),
    @XmlEnumValue("Judgment - not all parties")
    JUDGMENT_NOT_ALL_PARTIES("Judgment - not all parties"),
    @XmlEnumValue("Judgment on Pleadings Granted")
    JUDGMENT_ON_PLEADINGS_GRANTED("Judgment on Pleadings Granted"),
    @XmlEnumValue("Judicial review approved")
    JUDICIAL_REVIEW_APPROVED("Judicial review approved"),
    @XmlEnumValue("Jury Verdict Returned")
    JURY_VERDICT_RETURNED("Jury Verdict Returned"),
    @XmlEnumValue("Juvenile Disposition Imposed")
    JUVENILE_DISPOSITION_IMPOSED("Juvenile Disposition Imposed"),
    @XmlEnumValue("Legal Separation Granted - Judgment")
    LEGAL_SEPARATION_GRANTED_JUDGMENT("Legal Separation Granted - Judgment"),
    @XmlEnumValue("Letters Issued - Unsupervised Formal")
    LETTERS_ISSUED_UNSUPERVISED_FORMAL("Letters Issued - Unsupervised Formal"),
    @XmlEnumValue("Letters Issued- Informal")
    LETTERS_ISSUED_INFORMAL("Letters Issued- Informal"),
    @XmlEnumValue("Living independently")
    LIVING_INDEPENDENTLY("Living independently"),
    @XmlEnumValue("Long term foster care")
    LONG_TERM_FOSTER_CARE("Long term foster care"),
    @XmlEnumValue("Mediation - order issued by Court")
    MEDIATION_ORDER_ISSUED_BY_COURT("Mediation - order issued by Court"),
    @XmlEnumValue("Mediation - settled no Court order")
    MEDIATION_SETTLED_NO_COURT_ORDER("Mediation - settled no Court order"),
    @XmlEnumValue("Minor Conservatorshp")
    MINOR_CONSERVATORSHP("Minor Conservatorshp"),
    @XmlEnumValue("Minor settlement approved")
    MINOR_SETTLEMENT_APPROVED("Minor settlement approved"),
    @XmlEnumValue("Modified")
    MODIFIED("Modified"),
    @XmlEnumValue("Mortgage Redemption Period Reduced")
    MORTGAGE_REDEMPTION_PERIOD_REDUCED("Mortgage Redemption Period Reduced"),
    @XmlEnumValue("No Change in Status at this time")
    NO_CHANGE_IN_STATUS_AT_THIS_TIME("No Change in Status at this time"),
    @XmlEnumValue("No Response")
    NO_RESPONSE("No Response"),
    @XmlEnumValue("Non-suit")
    NON_SUIT("Non-suit"),
    @XmlEnumValue("NonState Ward for Adoption")
    NON_STATE_WARD_FOR_ADOPTION("NonState Ward for Adoption"),
    @XmlEnumValue("Not Delinquent")
    NOT_DELINQUENT("Not Delinquent"),
    @XmlEnumValue("Not Guilty")
    NOT_GUILTY("Not Guilty"),
    @XmlEnumValue("Not proven")
    NOT_PROVEN("Not proven"),
    @XmlEnumValue("Order for protection")
    ORDER_FOR_PROTECTION("Order for protection"),
    @XmlEnumValue("Original order")
    ORIGINAL_ORDER("Original order"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Paternity Determination - Judgment")
    PATERNITY_DETERMINATION_JUDGMENT("Paternity Determination - Judgment"),
    @XmlEnumValue("Permanent Custody to Agency")
    PERMANENT_CUSTODY_TO_AGENCY("Permanent Custody to Agency"),
    @XmlEnumValue("Petition Dismissed")
    PETITION_DISMISSED("Petition Dismissed"),
    @XmlEnumValue("Petition Withdrawn By Plaintiff")
    PETITION_WITHDRAWN_BY_PLAINTIFF("Petition Withdrawn By Plaintiff"),
    @XmlEnumValue("Plea not accepted")
    PLEA_NOT_ACCEPTED("Plea not accepted"),
    @XmlEnumValue("Pre-disposition care ordered")
    PRE_DISPOSITION_CARE_ORDERED("Pre-disposition care ordered"),
    @XmlEnumValue("Predisposition Order(s)")
    PREDISPOSITION_ORDER_S("Predisposition Order(s)"),
    @XmlEnumValue("Private Termination of Parental Rights - Stepparent Adoption")
    PRIVATE_TERMINATION_OF_PARENTAL_RIGHTS_STEPPARENT_ADOPTION("Private Termination of Parental Rights - Stepparent Adoption"),
    @XmlEnumValue("Proven")
    PROVEN("Proven"),
    @XmlEnumValue("Recommitted")
    RECOMMITTED("Recommitted"),
    @XmlEnumValue("Recommitted - Chemically Dependent")
    RECOMMITTED_CHEMICALLY_DEPENDENT("Recommitted - Chemically Dependent"),
    @XmlEnumValue("Recommitted - Developmentally Disabled")
    RECOMMITTED_DEVELOPMENTALLY_DISABLED("Recommitted - Developmentally Disabled"),
    @XmlEnumValue("Recommitted - Mentally Ill")
    RECOMMITTED_MENTALLY_ILL("Recommitted - Mentally Ill"),
    @XmlEnumValue("Reestablished Legal Parent and Child Relationship")
    REESTABLISHED_LEGAL_PARENT_AND_CHILD_RELATIONSHIP("Reestablished Legal Parent and Child Relationship"),
    @XmlEnumValue("Removed to Federal Court")
    REMOVED_TO_FEDERAL_COURT("Removed to Federal Court"),
    @XmlEnumValue("Replevin Granted - Judgment")
    REPLEVIN_GRANTED_JUDGMENT("Replevin Granted - Judgment"),
    @XmlEnumValue("Restored to capacity")
    RESTORED_TO_CAPACITY("Restored to capacity"),
    @XmlEnumValue("Reunification")
    REUNIFICATION("Reunification"),
    @XmlEnumValue("SEE FILE FOR OUTCOME")
    SEE_FILE_FOR_OUTCOME("SEE FILE FOR OUTCOME"),
    @XmlEnumValue("Settled")
    SETTLED("Settled"),
    @XmlEnumValue("Settled after arbitration hearing")
    SETTLED_AFTER_ARBITRATION_HEARING("Settled after arbitration hearing"),
    @XmlEnumValue("Settled by ADR")
    SETTLED_BY_ADR("Settled by ADR"),
    @XmlEnumValue("SETTLED BY MEDIATION")
    SETTLED_BY_MEDIATION("SETTLED BY MEDIATION"),
    @XmlEnumValue("SETTLED BY PARTIES")
    SETTLED_BY_PARTIES("SETTLED BY PARTIES"),
    @XmlEnumValue("Settled during arbitration hearing")
    SETTLED_DURING_ARBITRATION_HEARING("Settled during arbitration hearing"),
    @XmlEnumValue("Settled prior to ADR")
    SETTLED_PRIOR_TO_ADR("Settled prior to ADR"),
    @XmlEnumValue("Settled prior to arbitration hearing")
    SETTLED_PRIOR_TO_ARBITRATION_HEARING("Settled prior to arbitration hearing"),
    @XmlEnumValue("Settled prior to trial")
    SETTLED_PRIOR_TO_TRIAL("Settled prior to trial"),
    @XmlEnumValue("State ward for adoption")
    STATE_WARD_FOR_ADOPTION("State ward for adoption"),
    @XmlEnumValue("State ward ordered into long term foster care")
    STATE_WARD_ORDERED_INTO_LONG_TERM_FOSTER_CARE("State ward ordered into long term foster care"),
    @XmlEnumValue("Stay of Adjudication")
    STAY_OF_ADJUDICATION("Stay of Adjudication"),
    @XmlEnumValue("Stay of commitment")
    STAY_OF_COMMITMENT("Stay of commitment"),
    @XmlEnumValue("Stricken - case closed")
    STRICKEN_CASE_CLOSED("Stricken - case closed"),
    @XmlEnumValue("Stricken -case dormant")
    STRICKEN_CASE_DORMANT("Stricken -case dormant"),
    @XmlEnumValue("Summary decree")
    SUMMARY_DECREE("Summary decree"),
    @XmlEnumValue("Summary Dissolution - Judgment")
    SUMMARY_DISSOLUTION_JUDGMENT("Summary Dissolution - Judgment"),
    @XmlEnumValue("Summary judgment - not all parties")
    SUMMARY_JUDGMENT_NOT_ALL_PARTIES("Summary judgment - not all parties"),
    @XmlEnumValue("Summary judgment granted")
    SUMMARY_JUDGMENT_GRANTED("Summary judgment granted"),
    @XmlEnumValue("Support order")
    SUPPORT_ORDER("Support order"),
    @XmlEnumValue("Temp. restraining order denied-case closed")
    TEMP_RESTRAINING_ORDER_DENIED_CASE_CLOSED("Temp. restraining order denied-case closed"),
    @XmlEnumValue("Temp. restraining order dismissed-case closed")
    TEMP_RESTRAINING_ORDER_DISMISSED_CASE_CLOSED("Temp. restraining order dismissed-case closed"),
    @XmlEnumValue("Temporary Custody to Agency")
    TEMPORARY_CUSTODY_TO_AGENCY("Temporary Custody to Agency"),
    @XmlEnumValue("Tenant Redemption - Judgment")
    TENANT_REDEMPTION_JUDGMENT("Tenant Redemption - Judgment"),
    @XmlEnumValue("Termination of jurisdiction")
    TERMINATION_OF_JURISDICTION("Termination of jurisdiction"),
    @XmlEnumValue("Termination of Parental Rights-Involuntary")
    TERMINATION_OF_PARENTAL_RIGHTS_INVOLUNTARY("Termination of Parental Rights-Involuntary"),
    @XmlEnumValue("Termination of Parental Rights-Voluntary")
    TERMINATION_OF_PARENTAL_RIGHTS_VOLUNTARY("Termination of Parental Rights-Voluntary"),
    @XmlEnumValue("Termination parental rights")
    TERMINATION_PARENTAL_RIGHTS("Termination parental rights"),
    @XmlEnumValue("Termination parental rights of father")
    TERMINATION_PARENTAL_RIGHTS_OF_FATHER("Termination parental rights of father"),
    @XmlEnumValue("Termination parental rights of mother")
    TERMINATION_PARENTAL_RIGHTS_OF_MOTHER("Termination parental rights of mother"),
    @XmlEnumValue("Transfer Permanent Legal & Physical Custody")
    TRANSFER_PERMANENT_LEGAL_PHYSICAL_CUSTODY("Transfer Permanent Legal & Physical Custody"),
    @XmlEnumValue("Transferred")
    TRANSFERRED("Transferred"),
    @XmlEnumValue("Trust - Court Jurisdiction Assumed")
    TRUST_COURT_JURISDICTION_ASSUMED("Trust - Court Jurisdiction Assumed"),
    @XmlEnumValue("Trust-Termination of Jurisdiction")
    TRUST_TERMINATION_OF_JURISDICTION("Trust-Termination of Jurisdiction"),
    @XmlEnumValue("UD Counter Claim")
    UD_COUNTER_CLAIM("UD Counter Claim"),
    @XmlEnumValue("UD Oth Breach Lease")
    UD_OTH_BREACH_LEASE("UD Oth Breach Lease"),
    @XmlEnumValue("UD Viol. Covenants")
    UD_VIOL_COVENANTS("UD Viol. Covenants"),
    @XmlEnumValue("Unlawful Detainer Nonpayment of Rent")
    UNLAWFUL_DETAINER_NONPAYMENT_OF_RENT("Unlawful Detainer Nonpayment of Rent"),
    @XmlEnumValue("Voluntary Dismissal by Plaintiff")
    VOLUNTARY_DISMISSAL_BY_PLAINTIFF("Voluntary Dismissal by Plaintiff"),
    @XmlEnumValue("Voluntary Foster Care for Treatment Approved")
    VOLUNTARY_FOSTER_CARE_FOR_TREATMENT_APPROVED("Voluntary Foster Care for Treatment Approved"),
    @XmlEnumValue("Voluntary Placement Agreement Until 21 Approved")
    VOLUNTARY_PLACEMENT_AGREEMENT_UNTIL_21_APPROVED("Voluntary Placement Agreement Until 21 Approved"),
    @XmlEnumValue("Ward/Protected person deceased")
    WARD_PROTECTED_PERSON_DECEASED("Ward/Protected person deceased"),
    @XmlEnumValue("Withdrawn")
    WITHDRAWN("Withdrawn");
    private final String value;

    JudgmentEventTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JudgmentEventTypeType fromValue(String v) {
        for (JudgmentEventTypeType c: JudgmentEventTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
