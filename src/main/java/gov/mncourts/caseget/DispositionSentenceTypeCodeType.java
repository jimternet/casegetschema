//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.04 at 12:20:40 AM CDT 
//


package gov.mncourts.caseget;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DispositionSentenceTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DispositionSentenceTypeCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PRI"/&gt;
 *     &lt;enumeration value="COM"/&gt;
 *     &lt;enumeration value="CONC"/&gt;
 *     &lt;enumeration value="ACOND"/&gt;
 *     &lt;enumeration value="JCOND"/&gt;
 *     &lt;enumeration value="COMMT"/&gt;
 *     &lt;enumeration value="ADIV"/&gt;
 *     &lt;enumeration value="JDIV"/&gt;
 *     &lt;enumeration value="AELE"/&gt;
 *     &lt;enumeration value="JELE"/&gt;
 *     &lt;enumeration value="FEES"/&gt;
 *     &lt;enumeration value="AFEE"/&gt;
 *     &lt;enumeration value="JFEE"/&gt;
 *     &lt;enumeration value="AHOM"/&gt;
 *     &lt;enumeration value="JHOM"/&gt;
 *     &lt;enumeration value="HMON"/&gt;
 *     &lt;enumeration value="JUV"/&gt;
 *     &lt;enumeration value="PLA"/&gt;
 *     &lt;enumeration value="LOC"/&gt;
 *     &lt;enumeration value="APRO"/&gt;
 *     &lt;enumeration value="JPRO"/&gt;
 *     &lt;enumeration value="ASER"/&gt;
 *     &lt;enumeration value="JSER"/&gt;
 *     &lt;enumeration value="STAY"/&gt;
 *     &lt;enumeration value="ATRE"/&gt;
 *     &lt;enumeration value="JTRE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DispositionSentenceTypeCodeType")
@XmlEnum
public enum DispositionSentenceTypeCodeType {

    PRI,
    COM,
    CONC,
    ACOND,
    JCOND,
    COMMT,
    ADIV,
    JDIV,
    AELE,
    JELE,
    FEES,
    AFEE,
    JFEE,
    AHOM,
    JHOM,
    HMON,
    JUV,
    PLA,
    LOC,
    APRO,
    JPRO,
    ASER,
    JSER,
    STAY,
    ATRE,
    JTRE;

    public String value() {
        return name();
    }

    public static DispositionSentenceTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}
