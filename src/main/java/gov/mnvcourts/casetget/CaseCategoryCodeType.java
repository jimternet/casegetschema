//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.03 at 11:26:33 PM CDT 
//


package gov.mnvcourts.casetget;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseCategoryCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CaseCategoryCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AP"/>
 *     &lt;enumeration value="CHECK"/>
 *     &lt;enumeration value="CV"/>
 *     &lt;enumeration value="CC"/>
 *     &lt;enumeration value="CR"/>
 *     &lt;enumeration value="DC"/>
 *     &lt;enumeration value="FAM"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="JAIL"/>
 *     &lt;enumeration value="LE"/>
 *     &lt;enumeration value="PT"/>
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="PROB"/>
 *     &lt;enumeration value="PROS"/>
 *     &lt;enumeration value="PD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CaseCategoryCodeType")
@XmlEnum
public enum CaseCategoryCodeType {

    AP,
    CHECK,
    CV,
    CC,
    CR,
    DC,
    FAM,
    IN,
    JAIL,
    LE,
    PT,
    PR,
    PROB,
    PROS,
    PD;

    public String value() {
        return name();
    }

    public static CaseCategoryCodeType fromValue(String v) {
        return valueOf(v);
    }

}
