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
 * <p>Java class for CaseSubTypeTextType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CaseSubTypeTextType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Actions for Recovery of Wages"/&gt;
 *     &lt;enumeration value="Age Discrimination"/&gt;
 *     &lt;enumeration value="Americans with Disabilities Act"/&gt;
 *     &lt;enumeration value="Asbestos"/&gt;
 *     &lt;enumeration value="Asbestos (CNT)"/&gt;
 *     &lt;enumeration value="Asbestos (PRD)"/&gt;
 *     &lt;enumeration value="Asbestos (PRI)"/&gt;
 *     &lt;enumeration value="Asbestos (PRL)"/&gt;
 *     &lt;enumeration value="Asbestos (WRD)"/&gt;
 *     &lt;enumeration value="Astestos (COT)"/&gt;
 *     &lt;enumeration value="Attorney"/&gt;
 *     &lt;enumeration value="Breast Implant"/&gt;
 *     &lt;enumeration value="Class Action (CNA)"/&gt;
 *     &lt;enumeration value="Class Action (CND)"/&gt;
 *     &lt;enumeration value="Class Action (CNT)"/&gt;
 *     &lt;enumeration value="Class Action (COT)"/&gt;
 *     &lt;enumeration value="Class Action (DIS)"/&gt;
 *     &lt;enumeration value="Class Action (EDO)"/&gt;
 *     &lt;enumeration value="Class Action (EMP)"/&gt;
 *     &lt;enumeration value="Class Action (MCL)"/&gt;
 *     &lt;enumeration value="Class Action (MLP)"/&gt;
 *     &lt;enumeration value="Class Action (PRD)"/&gt;
 *     &lt;enumeration value="Class Action (PRI)"/&gt;
 *     &lt;enumeration value="Class Action (PRL)"/&gt;
 *     &lt;enumeration value="Class Action (REC)"/&gt;
 *     &lt;enumeration value="Class Action (SHR)"/&gt;
 *     &lt;enumeration value="Class Action (WRD)"/&gt;
 *     &lt;enumeration value="Conservatorship - Adult  (ACV)"/&gt;
 *     &lt;enumeration value="Conservatorship - Adult  (EGC)"/&gt;
 *     &lt;enumeration value="Conservatorship - Adult  (GAR)"/&gt;
 *     &lt;enumeration value="Conservatorship - Adult  (GCV)"/&gt;
 *     &lt;enumeration value="Conservatorship - Adult  (GDC)"/&gt;
 *     &lt;enumeration value="Conservatorship - Adult  (GDN)"/&gt;
 *     &lt;enumeration value="Conservatorship - Adult  (MCV)"/&gt;
 *     &lt;enumeration value="Conservatorship - Adult  (SCV)"/&gt;
 *     &lt;enumeration value="Conservatorship - Adult  (SGN)"/&gt;
 *     &lt;enumeration value="Conservatorship - Minor  (ACV)"/&gt;
 *     &lt;enumeration value="Conservatorship - Minor  (EGC)"/&gt;
 *     &lt;enumeration value="Conservatorship - Minor  (GAR)"/&gt;
 *     &lt;enumeration value="Conservatorship - Minor  (GCV)"/&gt;
 *     &lt;enumeration value="Conservatorship - Minor  (GDC)"/&gt;
 *     &lt;enumeration value="Conservatorship - Minor  (GDN)"/&gt;
 *     &lt;enumeration value="Conservatorship - Minor  (MCV)"/&gt;
 *     &lt;enumeration value="Conservatorship - Minor  (SCV)"/&gt;
 *     &lt;enumeration value="Conservatorship - Minor  (SGN)"/&gt;
 *     &lt;enumeration value="Defamation"/&gt;
 *     &lt;enumeration value="Emergency Guardianship / Conservatorship  (ACV)"/&gt;
 *     &lt;enumeration value="Emergency Guardianship / Conservatorship  (EGC)"/&gt;
 *     &lt;enumeration value="Emergency Guardianship / Conservatorship  (GAR)"/&gt;
 *     &lt;enumeration value="Emergency Guardianship / Conservatorship  (GCV)"/&gt;
 *     &lt;enumeration value="Emergency Guardianship / Conservatorship  (GDC)"/&gt;
 *     &lt;enumeration value="Emergency Guardianship / Conservatorship  (GDN)"/&gt;
 *     &lt;enumeration value="Emergency Guardianship / Conservatorship  (MCV)"/&gt;
 *     &lt;enumeration value="Emergency Guardianship / Conservatorship  (SCV)"/&gt;
 *     &lt;enumeration value="Emergency Guardianship / Conservatorship  (SGN)"/&gt;
 *     &lt;enumeration value="Employment Contracts (Express, Oral Implies or Promissory)"/&gt;
 *     &lt;enumeration value="Equal Protection 42 USC Sec 1983"/&gt;
 *     &lt;enumeration value="Guardian - Minor  (ACV)"/&gt;
 *     &lt;enumeration value="Guardian - Minor  (EGC)"/&gt;
 *     &lt;enumeration value="Guardian - Minor  (GAR)"/&gt;
 *     &lt;enumeration value="Guardian - Minor  (GCV)"/&gt;
 *     &lt;enumeration value="Guardian - Minor  (GDC)"/&gt;
 *     &lt;enumeration value="Guardian - Minor  (GDN)"/&gt;
 *     &lt;enumeration value="Guardian - Minor  (MCV)"/&gt;
 *     &lt;enumeration value="Guardian - Minor  (SCV)"/&gt;
 *     &lt;enumeration value="Guardian - Minor  (SGN)"/&gt;
 *     &lt;enumeration value="Guardianship - Incapacitated Person  (ACV)"/&gt;
 *     &lt;enumeration value="Guardianship - Incapacitated Person  (EGC)"/&gt;
 *     &lt;enumeration value="Guardianship - Incapacitated Person  (GAR)"/&gt;
 *     &lt;enumeration value="Guardianship - Incapacitated Person  (GCV)"/&gt;
 *     &lt;enumeration value="Guardianship - Incapacitated Person  (GDC)"/&gt;
 *     &lt;enumeration value="Guardianship - Incapacitated Person  (GDN)"/&gt;
 *     &lt;enumeration value="Guardianship - Incapacitated Person  (MCV)"/&gt;
 *     &lt;enumeration value="Guardianship - Incapacitated Person  (SCV)"/&gt;
 *     &lt;enumeration value="Guardianship - Incapacitated Person  (SGN)"/&gt;
 *     &lt;enumeration value="Guardianship/Conservatorship (ACV)"/&gt;
 *     &lt;enumeration value="Guardianship/Conservatorship (EGC)"/&gt;
 *     &lt;enumeration value="Guardianship/Conservatorship (GAR)"/&gt;
 *     &lt;enumeration value="Guardianship/Conservatorship (GCV)"/&gt;
 *     &lt;enumeration value="Guardianship/Conservatorship (GDC)"/&gt;
 *     &lt;enumeration value="Guardianship/Conservatorship (GDN)"/&gt;
 *     &lt;enumeration value="Guardianship/Conservatorship (MCV)"/&gt;
 *     &lt;enumeration value="Guardianship/Conservatorship (SCV)"/&gt;
 *     &lt;enumeration value="Guardianship/Conservatorship (SGN)"/&gt;
 *     &lt;enumeration value="Guardianship/Conservatorship Minor  (MCV)"/&gt;
 *     &lt;enumeration value="Guardianship/Conservatorship Minor (ACV)"/&gt;
 *     &lt;enumeration value="Guardianship/Conservatorship Minor (EGC)"/&gt;
 *     &lt;enumeration value="Guardianship/Conservatorship Minor (GAR)"/&gt;
 *     &lt;enumeration value="Guardianship/Conservatorship Minor (GCV)"/&gt;
 *     &lt;enumeration value="Guardianship/Conservatorship Minor (GDC)"/&gt;
 *     &lt;enumeration value="Guardianship/Conservatorship Minor (GDN)"/&gt;
 *     &lt;enumeration value="Guardianship/Conservatorship Minor (SCV)"/&gt;
 *     &lt;enumeration value="Guardianship/Conservatorship Minor (SGN)"/&gt;
 *     &lt;enumeration value="Intentional Infliction of Emotional Distress"/&gt;
 *     &lt;enumeration value="Labor Disputes/TRO's for Strikes etc."/&gt;
 *     &lt;enumeration value="Medical"/&gt;
 *     &lt;enumeration value="Minnesota Human Rights Act"/&gt;
 *     &lt;enumeration value="Minnesota Whistle Blower Act"/&gt;
 *     &lt;enumeration value="Negligent Hiring, Supervision or Retention"/&gt;
 *     &lt;enumeration value="Negligent Infliction of Emotional Distress"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Private"/&gt;
 *     &lt;enumeration value="Protective Arrangement (ACV)"/&gt;
 *     &lt;enumeration value="Protective Arrangement (EGC)"/&gt;
 *     &lt;enumeration value="Protective Arrangement (GAR)"/&gt;
 *     &lt;enumeration value="Protective Arrangement (GCV)"/&gt;
 *     &lt;enumeration value="Protective Arrangement (GDC)"/&gt;
 *     &lt;enumeration value="Protective Arrangement (GDN)"/&gt;
 *     &lt;enumeration value="Protective Arrangement (MCV)"/&gt;
 *     &lt;enumeration value="Protective Arrangement (SCV)"/&gt;
 *     &lt;enumeration value="Protective Arrangement (SGN)"/&gt;
 *     &lt;enumeration value="Public"/&gt;
 *     &lt;enumeration value="Racial Discrimination 42 USC Sec 1981"/&gt;
 *     &lt;enumeration value="Title VII of Civil Rights Act"/&gt;
 *     &lt;enumeration value="Tortious Interference with Employment"/&gt;
 *     &lt;enumeration value="Vitamin"/&gt;
 *     &lt;enumeration value="Wrongful Discharge"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CaseSubTypeTextType")
@XmlEnum
public enum CaseSubTypeTextType {

    @XmlEnumValue("Actions for Recovery of Wages")
    ACTIONS_FOR_RECOVERY_OF_WAGES("Actions for Recovery of Wages"),
    @XmlEnumValue("Age Discrimination")
    AGE_DISCRIMINATION("Age Discrimination"),
    @XmlEnumValue("Americans with Disabilities Act")
    AMERICANS_WITH_DISABILITIES_ACT("Americans with Disabilities Act"),
    @XmlEnumValue("Asbestos")
    ASBESTOS("Asbestos"),
    @XmlEnumValue("Asbestos (CNT)")
    ASBESTOS_CNT("Asbestos (CNT)"),
    @XmlEnumValue("Asbestos (PRD)")
    ASBESTOS_PRD("Asbestos (PRD)"),
    @XmlEnumValue("Asbestos (PRI)")
    ASBESTOS_PRI("Asbestos (PRI)"),
    @XmlEnumValue("Asbestos (PRL)")
    ASBESTOS_PRL("Asbestos (PRL)"),
    @XmlEnumValue("Asbestos (WRD)")
    ASBESTOS_WRD("Asbestos (WRD)"),
    @XmlEnumValue("Astestos (COT)")
    ASTESTOS_COT("Astestos (COT)"),
    @XmlEnumValue("Attorney")
    ATTORNEY("Attorney"),
    @XmlEnumValue("Breast Implant")
    BREAST_IMPLANT("Breast Implant"),
    @XmlEnumValue("Class Action (CNA)")
    CLASS_ACTION_CNA("Class Action (CNA)"),
    @XmlEnumValue("Class Action (CND)")
    CLASS_ACTION_CND("Class Action (CND)"),
    @XmlEnumValue("Class Action (CNT)")
    CLASS_ACTION_CNT("Class Action (CNT)"),
    @XmlEnumValue("Class Action (COT)")
    CLASS_ACTION_COT("Class Action (COT)"),
    @XmlEnumValue("Class Action (DIS)")
    CLASS_ACTION_DIS("Class Action (DIS)"),
    @XmlEnumValue("Class Action (EDO)")
    CLASS_ACTION_EDO("Class Action (EDO)"),
    @XmlEnumValue("Class Action (EMP)")
    CLASS_ACTION_EMP("Class Action (EMP)"),
    @XmlEnumValue("Class Action (MCL)")
    CLASS_ACTION_MCL("Class Action (MCL)"),
    @XmlEnumValue("Class Action (MLP)")
    CLASS_ACTION_MLP("Class Action (MLP)"),
    @XmlEnumValue("Class Action (PRD)")
    CLASS_ACTION_PRD("Class Action (PRD)"),
    @XmlEnumValue("Class Action (PRI)")
    CLASS_ACTION_PRI("Class Action (PRI)"),
    @XmlEnumValue("Class Action (PRL)")
    CLASS_ACTION_PRL("Class Action (PRL)"),
    @XmlEnumValue("Class Action (REC)")
    CLASS_ACTION_REC("Class Action (REC)"),
    @XmlEnumValue("Class Action (SHR)")
    CLASS_ACTION_SHR("Class Action (SHR)"),
    @XmlEnumValue("Class Action (WRD)")
    CLASS_ACTION_WRD("Class Action (WRD)"),
    @XmlEnumValue("Conservatorship - Adult  (ACV)")
    CONSERVATORSHIP_ADULT_ACV("Conservatorship - Adult  (ACV)"),
    @XmlEnumValue("Conservatorship - Adult  (EGC)")
    CONSERVATORSHIP_ADULT_EGC("Conservatorship - Adult  (EGC)"),
    @XmlEnumValue("Conservatorship - Adult  (GAR)")
    CONSERVATORSHIP_ADULT_GAR("Conservatorship - Adult  (GAR)"),
    @XmlEnumValue("Conservatorship - Adult  (GCV)")
    CONSERVATORSHIP_ADULT_GCV("Conservatorship - Adult  (GCV)"),
    @XmlEnumValue("Conservatorship - Adult  (GDC)")
    CONSERVATORSHIP_ADULT_GDC("Conservatorship - Adult  (GDC)"),
    @XmlEnumValue("Conservatorship - Adult  (GDN)")
    CONSERVATORSHIP_ADULT_GDN("Conservatorship - Adult  (GDN)"),
    @XmlEnumValue("Conservatorship - Adult  (MCV)")
    CONSERVATORSHIP_ADULT_MCV("Conservatorship - Adult  (MCV)"),
    @XmlEnumValue("Conservatorship - Adult  (SCV)")
    CONSERVATORSHIP_ADULT_SCV("Conservatorship - Adult  (SCV)"),
    @XmlEnumValue("Conservatorship - Adult  (SGN)")
    CONSERVATORSHIP_ADULT_SGN("Conservatorship - Adult  (SGN)"),
    @XmlEnumValue("Conservatorship - Minor  (ACV)")
    CONSERVATORSHIP_MINOR_ACV("Conservatorship - Minor  (ACV)"),
    @XmlEnumValue("Conservatorship - Minor  (EGC)")
    CONSERVATORSHIP_MINOR_EGC("Conservatorship - Minor  (EGC)"),
    @XmlEnumValue("Conservatorship - Minor  (GAR)")
    CONSERVATORSHIP_MINOR_GAR("Conservatorship - Minor  (GAR)"),
    @XmlEnumValue("Conservatorship - Minor  (GCV)")
    CONSERVATORSHIP_MINOR_GCV("Conservatorship - Minor  (GCV)"),
    @XmlEnumValue("Conservatorship - Minor  (GDC)")
    CONSERVATORSHIP_MINOR_GDC("Conservatorship - Minor  (GDC)"),
    @XmlEnumValue("Conservatorship - Minor  (GDN)")
    CONSERVATORSHIP_MINOR_GDN("Conservatorship - Minor  (GDN)"),
    @XmlEnumValue("Conservatorship - Minor  (MCV)")
    CONSERVATORSHIP_MINOR_MCV("Conservatorship - Minor  (MCV)"),
    @XmlEnumValue("Conservatorship - Minor  (SCV)")
    CONSERVATORSHIP_MINOR_SCV("Conservatorship - Minor  (SCV)"),
    @XmlEnumValue("Conservatorship - Minor  (SGN)")
    CONSERVATORSHIP_MINOR_SGN("Conservatorship - Minor  (SGN)"),
    @XmlEnumValue("Defamation")
    DEFAMATION("Defamation"),
    @XmlEnumValue("Emergency Guardianship / Conservatorship  (ACV)")
    EMERGENCY_GUARDIANSHIP_CONSERVATORSHIP_ACV("Emergency Guardianship / Conservatorship  (ACV)"),
    @XmlEnumValue("Emergency Guardianship / Conservatorship  (EGC)")
    EMERGENCY_GUARDIANSHIP_CONSERVATORSHIP_EGC("Emergency Guardianship / Conservatorship  (EGC)"),
    @XmlEnumValue("Emergency Guardianship / Conservatorship  (GAR)")
    EMERGENCY_GUARDIANSHIP_CONSERVATORSHIP_GAR("Emergency Guardianship / Conservatorship  (GAR)"),
    @XmlEnumValue("Emergency Guardianship / Conservatorship  (GCV)")
    EMERGENCY_GUARDIANSHIP_CONSERVATORSHIP_GCV("Emergency Guardianship / Conservatorship  (GCV)"),
    @XmlEnumValue("Emergency Guardianship / Conservatorship  (GDC)")
    EMERGENCY_GUARDIANSHIP_CONSERVATORSHIP_GDC("Emergency Guardianship / Conservatorship  (GDC)"),
    @XmlEnumValue("Emergency Guardianship / Conservatorship  (GDN)")
    EMERGENCY_GUARDIANSHIP_CONSERVATORSHIP_GDN("Emergency Guardianship / Conservatorship  (GDN)"),
    @XmlEnumValue("Emergency Guardianship / Conservatorship  (MCV)")
    EMERGENCY_GUARDIANSHIP_CONSERVATORSHIP_MCV("Emergency Guardianship / Conservatorship  (MCV)"),
    @XmlEnumValue("Emergency Guardianship / Conservatorship  (SCV)")
    EMERGENCY_GUARDIANSHIP_CONSERVATORSHIP_SCV("Emergency Guardianship / Conservatorship  (SCV)"),
    @XmlEnumValue("Emergency Guardianship / Conservatorship  (SGN)")
    EMERGENCY_GUARDIANSHIP_CONSERVATORSHIP_SGN("Emergency Guardianship / Conservatorship  (SGN)"),
    @XmlEnumValue("Employment Contracts (Express, Oral Implies or Promissory)")
    EMPLOYMENT_CONTRACTS_EXPRESS_ORAL_IMPLIES_OR_PROMISSORY("Employment Contracts (Express, Oral Implies or Promissory)"),
    @XmlEnumValue("Equal Protection 42 USC Sec 1983")
    EQUAL_PROTECTION_42_USC_SEC_1983("Equal Protection 42 USC Sec 1983"),
    @XmlEnumValue("Guardian - Minor  (ACV)")
    GUARDIAN_MINOR_ACV("Guardian - Minor  (ACV)"),
    @XmlEnumValue("Guardian - Minor  (EGC)")
    GUARDIAN_MINOR_EGC("Guardian - Minor  (EGC)"),
    @XmlEnumValue("Guardian - Minor  (GAR)")
    GUARDIAN_MINOR_GAR("Guardian - Minor  (GAR)"),
    @XmlEnumValue("Guardian - Minor  (GCV)")
    GUARDIAN_MINOR_GCV("Guardian - Minor  (GCV)"),
    @XmlEnumValue("Guardian - Minor  (GDC)")
    GUARDIAN_MINOR_GDC("Guardian - Minor  (GDC)"),
    @XmlEnumValue("Guardian - Minor  (GDN)")
    GUARDIAN_MINOR_GDN("Guardian - Minor  (GDN)"),
    @XmlEnumValue("Guardian - Minor  (MCV)")
    GUARDIAN_MINOR_MCV("Guardian - Minor  (MCV)"),
    @XmlEnumValue("Guardian - Minor  (SCV)")
    GUARDIAN_MINOR_SCV("Guardian - Minor  (SCV)"),
    @XmlEnumValue("Guardian - Minor  (SGN)")
    GUARDIAN_MINOR_SGN("Guardian - Minor  (SGN)"),
    @XmlEnumValue("Guardianship - Incapacitated Person  (ACV)")
    GUARDIANSHIP_INCAPACITATED_PERSON_ACV("Guardianship - Incapacitated Person  (ACV)"),
    @XmlEnumValue("Guardianship - Incapacitated Person  (EGC)")
    GUARDIANSHIP_INCAPACITATED_PERSON_EGC("Guardianship - Incapacitated Person  (EGC)"),
    @XmlEnumValue("Guardianship - Incapacitated Person  (GAR)")
    GUARDIANSHIP_INCAPACITATED_PERSON_GAR("Guardianship - Incapacitated Person  (GAR)"),
    @XmlEnumValue("Guardianship - Incapacitated Person  (GCV)")
    GUARDIANSHIP_INCAPACITATED_PERSON_GCV("Guardianship - Incapacitated Person  (GCV)"),
    @XmlEnumValue("Guardianship - Incapacitated Person  (GDC)")
    GUARDIANSHIP_INCAPACITATED_PERSON_GDC("Guardianship - Incapacitated Person  (GDC)"),
    @XmlEnumValue("Guardianship - Incapacitated Person  (GDN)")
    GUARDIANSHIP_INCAPACITATED_PERSON_GDN("Guardianship - Incapacitated Person  (GDN)"),
    @XmlEnumValue("Guardianship - Incapacitated Person  (MCV)")
    GUARDIANSHIP_INCAPACITATED_PERSON_MCV("Guardianship - Incapacitated Person  (MCV)"),
    @XmlEnumValue("Guardianship - Incapacitated Person  (SCV)")
    GUARDIANSHIP_INCAPACITATED_PERSON_SCV("Guardianship - Incapacitated Person  (SCV)"),
    @XmlEnumValue("Guardianship - Incapacitated Person  (SGN)")
    GUARDIANSHIP_INCAPACITATED_PERSON_SGN("Guardianship - Incapacitated Person  (SGN)"),
    @XmlEnumValue("Guardianship/Conservatorship (ACV)")
    GUARDIANSHIP_CONSERVATORSHIP_ACV("Guardianship/Conservatorship (ACV)"),
    @XmlEnumValue("Guardianship/Conservatorship (EGC)")
    GUARDIANSHIP_CONSERVATORSHIP_EGC("Guardianship/Conservatorship (EGC)"),
    @XmlEnumValue("Guardianship/Conservatorship (GAR)")
    GUARDIANSHIP_CONSERVATORSHIP_GAR("Guardianship/Conservatorship (GAR)"),
    @XmlEnumValue("Guardianship/Conservatorship (GCV)")
    GUARDIANSHIP_CONSERVATORSHIP_GCV("Guardianship/Conservatorship (GCV)"),
    @XmlEnumValue("Guardianship/Conservatorship (GDC)")
    GUARDIANSHIP_CONSERVATORSHIP_GDC("Guardianship/Conservatorship (GDC)"),
    @XmlEnumValue("Guardianship/Conservatorship (GDN)")
    GUARDIANSHIP_CONSERVATORSHIP_GDN("Guardianship/Conservatorship (GDN)"),
    @XmlEnumValue("Guardianship/Conservatorship (MCV)")
    GUARDIANSHIP_CONSERVATORSHIP_MCV("Guardianship/Conservatorship (MCV)"),
    @XmlEnumValue("Guardianship/Conservatorship (SCV)")
    GUARDIANSHIP_CONSERVATORSHIP_SCV("Guardianship/Conservatorship (SCV)"),
    @XmlEnumValue("Guardianship/Conservatorship (SGN)")
    GUARDIANSHIP_CONSERVATORSHIP_SGN("Guardianship/Conservatorship (SGN)"),
    @XmlEnumValue("Guardianship/Conservatorship Minor  (MCV)")
    GUARDIANSHIP_CONSERVATORSHIP_MINOR_MCV("Guardianship/Conservatorship Minor  (MCV)"),
    @XmlEnumValue("Guardianship/Conservatorship Minor (ACV)")
    GUARDIANSHIP_CONSERVATORSHIP_MINOR_ACV("Guardianship/Conservatorship Minor (ACV)"),
    @XmlEnumValue("Guardianship/Conservatorship Minor (EGC)")
    GUARDIANSHIP_CONSERVATORSHIP_MINOR_EGC("Guardianship/Conservatorship Minor (EGC)"),
    @XmlEnumValue("Guardianship/Conservatorship Minor (GAR)")
    GUARDIANSHIP_CONSERVATORSHIP_MINOR_GAR("Guardianship/Conservatorship Minor (GAR)"),
    @XmlEnumValue("Guardianship/Conservatorship Minor (GCV)")
    GUARDIANSHIP_CONSERVATORSHIP_MINOR_GCV("Guardianship/Conservatorship Minor (GCV)"),
    @XmlEnumValue("Guardianship/Conservatorship Minor (GDC)")
    GUARDIANSHIP_CONSERVATORSHIP_MINOR_GDC("Guardianship/Conservatorship Minor (GDC)"),
    @XmlEnumValue("Guardianship/Conservatorship Minor (GDN)")
    GUARDIANSHIP_CONSERVATORSHIP_MINOR_GDN("Guardianship/Conservatorship Minor (GDN)"),
    @XmlEnumValue("Guardianship/Conservatorship Minor (SCV)")
    GUARDIANSHIP_CONSERVATORSHIP_MINOR_SCV("Guardianship/Conservatorship Minor (SCV)"),
    @XmlEnumValue("Guardianship/Conservatorship Minor (SGN)")
    GUARDIANSHIP_CONSERVATORSHIP_MINOR_SGN("Guardianship/Conservatorship Minor (SGN)"),
    @XmlEnumValue("Intentional Infliction of Emotional Distress")
    INTENTIONAL_INFLICTION_OF_EMOTIONAL_DISTRESS("Intentional Infliction of Emotional Distress"),
    @XmlEnumValue("Labor Disputes/TRO's for Strikes etc.")
    LABOR_DISPUTES_TRO_S_FOR_STRIKES_ETC("Labor Disputes/TRO's for Strikes etc."),
    @XmlEnumValue("Medical")
    MEDICAL("Medical"),
    @XmlEnumValue("Minnesota Human Rights Act")
    MINNESOTA_HUMAN_RIGHTS_ACT("Minnesota Human Rights Act"),
    @XmlEnumValue("Minnesota Whistle Blower Act")
    MINNESOTA_WHISTLE_BLOWER_ACT("Minnesota Whistle Blower Act"),
    @XmlEnumValue("Negligent Hiring, Supervision or Retention")
    NEGLIGENT_HIRING_SUPERVISION_OR_RETENTION("Negligent Hiring, Supervision or Retention"),
    @XmlEnumValue("Negligent Infliction of Emotional Distress")
    NEGLIGENT_INFLICTION_OF_EMOTIONAL_DISTRESS("Negligent Infliction of Emotional Distress"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Private")
    PRIVATE("Private"),
    @XmlEnumValue("Protective Arrangement (ACV)")
    PROTECTIVE_ARRANGEMENT_ACV("Protective Arrangement (ACV)"),
    @XmlEnumValue("Protective Arrangement (EGC)")
    PROTECTIVE_ARRANGEMENT_EGC("Protective Arrangement (EGC)"),
    @XmlEnumValue("Protective Arrangement (GAR)")
    PROTECTIVE_ARRANGEMENT_GAR("Protective Arrangement (GAR)"),
    @XmlEnumValue("Protective Arrangement (GCV)")
    PROTECTIVE_ARRANGEMENT_GCV("Protective Arrangement (GCV)"),
    @XmlEnumValue("Protective Arrangement (GDC)")
    PROTECTIVE_ARRANGEMENT_GDC("Protective Arrangement (GDC)"),
    @XmlEnumValue("Protective Arrangement (GDN)")
    PROTECTIVE_ARRANGEMENT_GDN("Protective Arrangement (GDN)"),
    @XmlEnumValue("Protective Arrangement (MCV)")
    PROTECTIVE_ARRANGEMENT_MCV("Protective Arrangement (MCV)"),
    @XmlEnumValue("Protective Arrangement (SCV)")
    PROTECTIVE_ARRANGEMENT_SCV("Protective Arrangement (SCV)"),
    @XmlEnumValue("Protective Arrangement (SGN)")
    PROTECTIVE_ARRANGEMENT_SGN("Protective Arrangement (SGN)"),
    @XmlEnumValue("Public")
    PUBLIC("Public"),
    @XmlEnumValue("Racial Discrimination 42 USC Sec 1981")
    RACIAL_DISCRIMINATION_42_USC_SEC_1981("Racial Discrimination 42 USC Sec 1981"),
    @XmlEnumValue("Title VII of Civil Rights Act")
    TITLE_VII_OF_CIVIL_RIGHTS_ACT("Title VII of Civil Rights Act"),
    @XmlEnumValue("Tortious Interference with Employment")
    TORTIOUS_INTERFERENCE_WITH_EMPLOYMENT("Tortious Interference with Employment"),
    @XmlEnumValue("Vitamin")
    VITAMIN("Vitamin"),
    @XmlEnumValue("Wrongful Discharge")
    WRONGFUL_DISCHARGE("Wrongful Discharge");
    private final String value;

    CaseSubTypeTextType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CaseSubTypeTextType fromValue(String v) {
        for (CaseSubTypeTextType c: CaseSubTypeTextType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}