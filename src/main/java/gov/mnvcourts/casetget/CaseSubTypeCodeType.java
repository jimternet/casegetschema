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
 * <p>Java class for CaseSubTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CaseSubTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="XARW"/>
 *     &lt;enumeration value="ARW"/>
 *     &lt;enumeration value="XAD"/>
 *     &lt;enumeration value="AD"/>
 *     &lt;enumeration value="ADA"/>
 *     &lt;enumeration value="XADA"/>
 *     &lt;enumeration value="ASB"/>
 *     &lt;enumeration value="XASB"/>
 *     &lt;enumeration value="ASBCNT"/>
 *     &lt;enumeration value="ASBPRD"/>
 *     &lt;enumeration value="ASBPRI"/>
 *     &lt;enumeration value="ASBPRL"/>
 *     &lt;enumeration value="ASBWRD"/>
 *     &lt;enumeration value="ASBCOT"/>
 *     &lt;enumeration value="XATY"/>
 *     &lt;enumeration value="ATY"/>
 *     &lt;enumeration value="BI"/>
 *     &lt;enumeration value="XBI"/>
 *     &lt;enumeration value="CLACNA"/>
 *     &lt;enumeration value="CLACND"/>
 *     &lt;enumeration value="CLACNT"/>
 *     &lt;enumeration value="CLACOT"/>
 *     &lt;enumeration value="CLADIS"/>
 *     &lt;enumeration value="CLAEDO"/>
 *     &lt;enumeration value="CLAEMP"/>
 *     &lt;enumeration value="CLAMCL"/>
 *     &lt;enumeration value="CLAMLP"/>
 *     &lt;enumeration value="CLAPRD"/>
 *     &lt;enumeration value="CLAPRI"/>
 *     &lt;enumeration value="CLAPRL"/>
 *     &lt;enumeration value="CLAREC"/>
 *     &lt;enumeration value="CLASHR"/>
 *     &lt;enumeration value="CLAWRD"/>
 *     &lt;enumeration value="CAACV"/>
 *     &lt;enumeration value="CAEGC"/>
 *     &lt;enumeration value="CAGAR"/>
 *     &lt;enumeration value="CAGCV"/>
 *     &lt;enumeration value="CAGDC"/>
 *     &lt;enumeration value="CAGDN"/>
 *     &lt;enumeration value="CAMCV"/>
 *     &lt;enumeration value="CASCV"/>
 *     &lt;enumeration value="CASGN"/>
 *     &lt;enumeration value="CMACV"/>
 *     &lt;enumeration value="CMEGC"/>
 *     &lt;enumeration value="CMGAR"/>
 *     &lt;enumeration value="CMGCV"/>
 *     &lt;enumeration value="CMGDC"/>
 *     &lt;enumeration value="CMGDN"/>
 *     &lt;enumeration value="CMMCV"/>
 *     &lt;enumeration value="CMSCV"/>
 *     &lt;enumeration value="CMSGN"/>
 *     &lt;enumeration value="DEF"/>
 *     &lt;enumeration value="XDEF"/>
 *     &lt;enumeration value="EGACV"/>
 *     &lt;enumeration value="EGEGC"/>
 *     &lt;enumeration value="EGGAR"/>
 *     &lt;enumeration value="EGGCV"/>
 *     &lt;enumeration value="EGGDC"/>
 *     &lt;enumeration value="EGGDN"/>
 *     &lt;enumeration value="EGMCV"/>
 *     &lt;enumeration value="EGSCV"/>
 *     &lt;enumeration value="EGSGN"/>
 *     &lt;enumeration value="EC"/>
 *     &lt;enumeration value="XEC"/>
 *     &lt;enumeration value="XEP"/>
 *     &lt;enumeration value="EP"/>
 *     &lt;enumeration value="GMACV"/>
 *     &lt;enumeration value="GMEGC"/>
 *     &lt;enumeration value="GMGAR"/>
 *     &lt;enumeration value="GMGCV"/>
 *     &lt;enumeration value="GMGDC"/>
 *     &lt;enumeration value="GMGDN"/>
 *     &lt;enumeration value="GMMCV"/>
 *     &lt;enumeration value="GMSCV"/>
 *     &lt;enumeration value="GMSGN"/>
 *     &lt;enumeration value="GIACV"/>
 *     &lt;enumeration value="GIEGC"/>
 *     &lt;enumeration value="GIGAR"/>
 *     &lt;enumeration value="GIGCV"/>
 *     &lt;enumeration value="GIGDC"/>
 *     &lt;enumeration value="GIGDN"/>
 *     &lt;enumeration value="GIMCV"/>
 *     &lt;enumeration value="GISCV"/>
 *     &lt;enumeration value="GISGN"/>
 *     &lt;enumeration value="GCACV"/>
 *     &lt;enumeration value="GCEGC"/>
 *     &lt;enumeration value="GCGAR"/>
 *     &lt;enumeration value="GCGCV"/>
 *     &lt;enumeration value="GCGDC"/>
 *     &lt;enumeration value="GCGDN"/>
 *     &lt;enumeration value="GCMCV"/>
 *     &lt;enumeration value="GCSCV"/>
 *     &lt;enumeration value="GCSGN"/>
 *     &lt;enumeration value="GCMMCV"/>
 *     &lt;enumeration value="GCMACV"/>
 *     &lt;enumeration value="GCMEGC"/>
 *     &lt;enumeration value="GCMGAR"/>
 *     &lt;enumeration value="GCMGCV"/>
 *     &lt;enumeration value="GCMGDC"/>
 *     &lt;enumeration value="GCMGDN"/>
 *     &lt;enumeration value="GCMSCV"/>
 *     &lt;enumeration value="GCMSGN"/>
 *     &lt;enumeration value="XIIED"/>
 *     &lt;enumeration value="IIED"/>
 *     &lt;enumeration value="LD"/>
 *     &lt;enumeration value="XLD"/>
 *     &lt;enumeration value="XMED"/>
 *     &lt;enumeration value="MED"/>
 *     &lt;enumeration value="XHRA"/>
 *     &lt;enumeration value="HRA"/>
 *     &lt;enumeration value="WBA"/>
 *     &lt;enumeration value="XWBA"/>
 *     &lt;enumeration value="NHSR"/>
 *     &lt;enumeration value="XNHSR"/>
 *     &lt;enumeration value="XNIED"/>
 *     &lt;enumeration value="NIED"/>
 *     &lt;enumeration value="OTR"/>
 *     &lt;enumeration value="XOTR"/>
 *     &lt;enumeration value="PRI"/>
 *     &lt;enumeration value="PVT"/>
 *     &lt;enumeration value="PRAACV"/>
 *     &lt;enumeration value="PRAEGC"/>
 *     &lt;enumeration value="PRAGAR"/>
 *     &lt;enumeration value="PRAGCV"/>
 *     &lt;enumeration value="PRAGDC"/>
 *     &lt;enumeration value="PRAGDN"/>
 *     &lt;enumeration value="PRAMCV"/>
 *     &lt;enumeration value="PRASCV"/>
 *     &lt;enumeration value="PRASGN"/>
 *     &lt;enumeration value="PBL"/>
 *     &lt;enumeration value="PUB"/>
 *     &lt;enumeration value="XRD"/>
 *     &lt;enumeration value="RD"/>
 *     &lt;enumeration value="CRA"/>
 *     &lt;enumeration value="XCRA"/>
 *     &lt;enumeration value="XTIE"/>
 *     &lt;enumeration value="TIE"/>
 *     &lt;enumeration value="VIT"/>
 *     &lt;enumeration value="XVIT"/>
 *     &lt;enumeration value="XWD"/>
 *     &lt;enumeration value="WD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CaseSubTypeCodeType")
@XmlEnum
public enum CaseSubTypeCodeType {

    XARW,
    ARW,
    XAD,
    AD,
    ADA,
    XADA,
    ASB,
    XASB,
    ASBCNT,
    ASBPRD,
    ASBPRI,
    ASBPRL,
    ASBWRD,
    ASBCOT,
    XATY,
    ATY,
    BI,
    XBI,
    CLACNA,
    CLACND,
    CLACNT,
    CLACOT,
    CLADIS,
    CLAEDO,
    CLAEMP,
    CLAMCL,
    CLAMLP,
    CLAPRD,
    CLAPRI,
    CLAPRL,
    CLAREC,
    CLASHR,
    CLAWRD,
    CAACV,
    CAEGC,
    CAGAR,
    CAGCV,
    CAGDC,
    CAGDN,
    CAMCV,
    CASCV,
    CASGN,
    CMACV,
    CMEGC,
    CMGAR,
    CMGCV,
    CMGDC,
    CMGDN,
    CMMCV,
    CMSCV,
    CMSGN,
    DEF,
    XDEF,
    EGACV,
    EGEGC,
    EGGAR,
    EGGCV,
    EGGDC,
    EGGDN,
    EGMCV,
    EGSCV,
    EGSGN,
    EC,
    XEC,
    XEP,
    EP,
    GMACV,
    GMEGC,
    GMGAR,
    GMGCV,
    GMGDC,
    GMGDN,
    GMMCV,
    GMSCV,
    GMSGN,
    GIACV,
    GIEGC,
    GIGAR,
    GIGCV,
    GIGDC,
    GIGDN,
    GIMCV,
    GISCV,
    GISGN,
    GCACV,
    GCEGC,
    GCGAR,
    GCGCV,
    GCGDC,
    GCGDN,
    GCMCV,
    GCSCV,
    GCSGN,
    GCMMCV,
    GCMACV,
    GCMEGC,
    GCMGAR,
    GCMGCV,
    GCMGDC,
    GCMGDN,
    GCMSCV,
    GCMSGN,
    XIIED,
    IIED,
    LD,
    XLD,
    XMED,
    MED,
    XHRA,
    HRA,
    WBA,
    XWBA,
    NHSR,
    XNHSR,
    XNIED,
    NIED,
    OTR,
    XOTR,
    PRI,
    PVT,
    PRAACV,
    PRAEGC,
    PRAGAR,
    PRAGCV,
    PRAGDC,
    PRAGDN,
    PRAMCV,
    PRASCV,
    PRASGN,
    PBL,
    PUB,
    XRD,
    RD,
    CRA,
    XCRA,
    XTIE,
    TIE,
    VIT,
    XVIT,
    XWD,
    WD;

    public String value() {
        return name();
    }

    public static CaseSubTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}
