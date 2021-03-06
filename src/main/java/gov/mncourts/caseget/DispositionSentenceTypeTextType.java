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
 * <p>Java class for DispositionSentenceTypeTextType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DispositionSentenceTypeTextType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Commit to Commissioner of Corrections - Adult"/&gt;
 *     &lt;enumeration value="Commit to Commissioner of Corrections - Juvenile"/&gt;
 *     &lt;enumeration value="ConcurrentConsecutive"/&gt;
 *     &lt;enumeration value="Condition - Adult"/&gt;
 *     &lt;enumeration value="Condition - Juvenile"/&gt;
 *     &lt;enumeration value="Converted Disposition Component"/&gt;
 *     &lt;enumeration value="Diversion Program - Adult"/&gt;
 *     &lt;enumeration value="Diversion Program - Juvenile"/&gt;
 *     &lt;enumeration value="Electronic Monitor - Adult"/&gt;
 *     &lt;enumeration value="Electronic Monitor - Juvenile"/&gt;
 *     &lt;enumeration value="Fees"/&gt;
 *     &lt;enumeration value="Fees - Adult"/&gt;
 *     &lt;enumeration value="Fees - Juvenile"/&gt;
 *     &lt;enumeration value="Home Detention - Adult"/&gt;
 *     &lt;enumeration value="Home Detention - Juvenile"/&gt;
 *     &lt;enumeration value="Home Monitoring"/&gt;
 *     &lt;enumeration value="Juvenile Correctional/Placement Facility"/&gt;
 *     &lt;enumeration value="Juvenile Facility"/&gt;
 *     &lt;enumeration value="Local Confinement"/&gt;
 *     &lt;enumeration value="Probation - Adult"/&gt;
 *     &lt;enumeration value="Probation - Juvenile"/&gt;
 *     &lt;enumeration value="Service - Adult"/&gt;
 *     &lt;enumeration value="Service - Juvenile"/&gt;
 *     &lt;enumeration value="Stayed Adult Sentence"/&gt;
 *     &lt;enumeration value="Treatment - Adult"/&gt;
 *     &lt;enumeration value="Treatment - Juvenile"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DispositionSentenceTypeTextType")
@XmlEnum
public enum DispositionSentenceTypeTextType {

    @XmlEnumValue("Commit to Commissioner of Corrections - Adult")
    COMMIT_TO_COMMISSIONER_OF_CORRECTIONS_ADULT("Commit to Commissioner of Corrections - Adult"),
    @XmlEnumValue("Commit to Commissioner of Corrections - Juvenile")
    COMMIT_TO_COMMISSIONER_OF_CORRECTIONS_JUVENILE("Commit to Commissioner of Corrections - Juvenile"),
    @XmlEnumValue("ConcurrentConsecutive")
    CONCURRENT_CONSECUTIVE("ConcurrentConsecutive"),
    @XmlEnumValue("Condition - Adult")
    CONDITION_ADULT("Condition - Adult"),
    @XmlEnumValue("Condition - Juvenile")
    CONDITION_JUVENILE("Condition - Juvenile"),
    @XmlEnumValue("Converted Disposition Component")
    CONVERTED_DISPOSITION_COMPONENT("Converted Disposition Component"),
    @XmlEnumValue("Diversion Program - Adult")
    DIVERSION_PROGRAM_ADULT("Diversion Program - Adult"),
    @XmlEnumValue("Diversion Program - Juvenile")
    DIVERSION_PROGRAM_JUVENILE("Diversion Program - Juvenile"),
    @XmlEnumValue("Electronic Monitor - Adult")
    ELECTRONIC_MONITOR_ADULT("Electronic Monitor - Adult"),
    @XmlEnumValue("Electronic Monitor - Juvenile")
    ELECTRONIC_MONITOR_JUVENILE("Electronic Monitor - Juvenile"),
    @XmlEnumValue("Fees")
    FEES("Fees"),
    @XmlEnumValue("Fees - Adult")
    FEES_ADULT("Fees - Adult"),
    @XmlEnumValue("Fees - Juvenile")
    FEES_JUVENILE("Fees - Juvenile"),
    @XmlEnumValue("Home Detention - Adult")
    HOME_DETENTION_ADULT("Home Detention - Adult"),
    @XmlEnumValue("Home Detention - Juvenile")
    HOME_DETENTION_JUVENILE("Home Detention - Juvenile"),
    @XmlEnumValue("Home Monitoring")
    HOME_MONITORING("Home Monitoring"),
    @XmlEnumValue("Juvenile Correctional/Placement Facility")
    JUVENILE_CORRECTIONAL_PLACEMENT_FACILITY("Juvenile Correctional/Placement Facility"),
    @XmlEnumValue("Juvenile Facility")
    JUVENILE_FACILITY("Juvenile Facility"),
    @XmlEnumValue("Local Confinement")
    LOCAL_CONFINEMENT("Local Confinement"),
    @XmlEnumValue("Probation - Adult")
    PROBATION_ADULT("Probation - Adult"),
    @XmlEnumValue("Probation - Juvenile")
    PROBATION_JUVENILE("Probation - Juvenile"),
    @XmlEnumValue("Service - Adult")
    SERVICE_ADULT("Service - Adult"),
    @XmlEnumValue("Service - Juvenile")
    SERVICE_JUVENILE("Service - Juvenile"),
    @XmlEnumValue("Stayed Adult Sentence")
    STAYED_ADULT_SENTENCE("Stayed Adult Sentence"),
    @XmlEnumValue("Treatment - Adult")
    TREATMENT_ADULT("Treatment - Adult"),
    @XmlEnumValue("Treatment - Juvenile")
    TREATMENT_JUVENILE("Treatment - Juvenile");
    private final String value;

    DispositionSentenceTypeTextType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DispositionSentenceTypeTextType fromValue(String v) {
        for (DispositionSentenceTypeTextType c: DispositionSentenceTypeTextType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
