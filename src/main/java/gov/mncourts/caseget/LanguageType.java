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
 * <p>Java class for LanguageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LanguageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Afar"/&gt;
 *     &lt;enumeration value="Afghanistan"/&gt;
 *     &lt;enumeration value="Akan"/&gt;
 *     &lt;enumeration value="Albanian"/&gt;
 *     &lt;enumeration value="AMHARIC"/&gt;
 *     &lt;enumeration value="ANUAK"/&gt;
 *     &lt;enumeration value="ARABIC - STANDARD"/&gt;
 *     &lt;enumeration value="ARABIC - SUDANESE"/&gt;
 *     &lt;enumeration value="Armenian"/&gt;
 *     &lt;enumeration value="Atie - W Africa"/&gt;
 *     &lt;enumeration value="Bandi"/&gt;
 *     &lt;enumeration value="Bangolese"/&gt;
 *     &lt;enumeration value="Bari"/&gt;
 *     &lt;enumeration value="Bassa"/&gt;
 *     &lt;enumeration value="Basut"/&gt;
 *     &lt;enumeration value="BEHDINI"/&gt;
 *     &lt;enumeration value="Belarusian"/&gt;
 *     &lt;enumeration value="BENGALI"/&gt;
 *     &lt;enumeration value="BERBER"/&gt;
 *     &lt;enumeration value="BHOJPURL"/&gt;
 *     &lt;enumeration value="Binin"/&gt;
 *     &lt;enumeration value="BOSNIAN"/&gt;
 *     &lt;enumeration value="Bulgarian"/&gt;
 *     &lt;enumeration value="Burmese"/&gt;
 *     &lt;enumeration value="Burmese-Karen"/&gt;
 *     &lt;enumeration value="CAMBODIAN"/&gt;
 *     &lt;enumeration value="CANTONESE"/&gt;
 *     &lt;enumeration value="CASTILIAN"/&gt;
 *     &lt;enumeration value="CATALAN - VALENCIAN - BALEAR"/&gt;
 *     &lt;enumeration value="Cebuano"/&gt;
 *     &lt;enumeration value="Certified Deaf Interpreter"/&gt;
 *     &lt;enumeration value="Chichewa"/&gt;
 *     &lt;enumeration value="CHINESE, MANDARIN"/&gt;
 *     &lt;enumeration value="CHINESE, MIN NAN"/&gt;
 *     &lt;enumeration value="CHINESE, YUE"/&gt;
 *     &lt;enumeration value="CREOLE"/&gt;
 *     &lt;enumeration value="CROATIAN"/&gt;
 *     &lt;enumeration value="Czechoslovkian"/&gt;
 *     &lt;enumeration value="DANISH"/&gt;
 *     &lt;enumeration value="Deaf - Relay"/&gt;
 *     &lt;enumeration value="Dinka"/&gt;
 *     &lt;enumeration value="DUTCH"/&gt;
 *     &lt;enumeration value="Ebu"/&gt;
 *     &lt;enumeration value="Edo"/&gt;
 *     &lt;enumeration value="Egyptian"/&gt;
 *     &lt;enumeration value="Eritrian"/&gt;
 *     &lt;enumeration value="Estonian"/&gt;
 *     &lt;enumeration value="ETHIOPIAN"/&gt;
 *     &lt;enumeration value="Ewe"/&gt;
 *     &lt;enumeration value="Fancy"/&gt;
 *     &lt;enumeration value="FARSI, EASTERN"/&gt;
 *     &lt;enumeration value="FARSI, WESTERN"/&gt;
 *     &lt;enumeration value="Filipino"/&gt;
 *     &lt;enumeration value="FINNISH"/&gt;
 *     &lt;enumeration value="FRENCH"/&gt;
 *     &lt;enumeration value="FUCHIENESE"/&gt;
 *     &lt;enumeration value="Fulani"/&gt;
 *     &lt;enumeration value="Gbandi"/&gt;
 *     &lt;enumeration value="GERMAN, STANDARD"/&gt;
 *     &lt;enumeration value="Gio or Dan"/&gt;
 *     &lt;enumeration value="Gisi"/&gt;
 *     &lt;enumeration value="Grebo"/&gt;
 *     &lt;enumeration value="GREEK"/&gt;
 *     &lt;enumeration value="Gudrathi"/&gt;
 *     &lt;enumeration value="GUJANARTI"/&gt;
 *     &lt;enumeration value="GUJARATI"/&gt;
 *     &lt;enumeration value="GUJRATI"/&gt;
 *     &lt;enumeration value="Guyanese"/&gt;
 *     &lt;enumeration value="HAITIAN CREOLE FRENCH"/&gt;
 *     &lt;enumeration value="Harari"/&gt;
 *     &lt;enumeration value="Haseen"/&gt;
 *     &lt;enumeration value="Hausa"/&gt;
 *     &lt;enumeration value="HEBREW"/&gt;
 *     &lt;enumeration value="Hendu"/&gt;
 *     &lt;enumeration value="HINDI"/&gt;
 *     &lt;enumeration value="HMONG"/&gt;
 *     &lt;enumeration value="HUNGARIAN"/&gt;
 *     &lt;enumeration value="Ibibio"/&gt;
 *     &lt;enumeration value="Igbo"/&gt;
 *     &lt;enumeration value="Indian"/&gt;
 *     &lt;enumeration value="INDONESIAN"/&gt;
 *     &lt;enumeration value="Iranian"/&gt;
 *     &lt;enumeration value="Ishan"/&gt;
 *     &lt;enumeration value="Islamic"/&gt;
 *     &lt;enumeration value="ITALIAN"/&gt;
 *     &lt;enumeration value="Jamaician"/&gt;
 *     &lt;enumeration value="JAPANESE"/&gt;
 *     &lt;enumeration value="Karen"/&gt;
 *     &lt;enumeration value="Karenni"/&gt;
 *     &lt;enumeration value="Kayah"/&gt;
 *     &lt;enumeration value="Kenna (Nigerian)"/&gt;
 *     &lt;enumeration value="KHMER, CENTRAL"/&gt;
 *     &lt;enumeration value="KHMER, NORTHERN"/&gt;
 *     &lt;enumeration value="Khran"/&gt;
 *     &lt;enumeration value="Kinyarwanda"/&gt;
 *     &lt;enumeration value="Kisi"/&gt;
 *     &lt;enumeration value="Kiswahili"/&gt;
 *     &lt;enumeration value="KONKANI"/&gt;
 *     &lt;enumeration value="KOREAN"/&gt;
 *     &lt;enumeration value="Kosraen"/&gt;
 *     &lt;enumeration value="Kpelle"/&gt;
 *     &lt;enumeration value="Krahn"/&gt;
 *     &lt;enumeration value="KREOLE"/&gt;
 *     &lt;enumeration value="KRIO"/&gt;
 *     &lt;enumeration value="Kru"/&gt;
 *     &lt;enumeration value="Krudish Soranu"/&gt;
 *     &lt;enumeration value="KUKU"/&gt;
 *     &lt;enumeration value="Kurd"/&gt;
 *     &lt;enumeration value="KURDISH BANDINANI"/&gt;
 *     &lt;enumeration value="LAHU"/&gt;
 *     &lt;enumeration value="LAO"/&gt;
 *     &lt;enumeration value="LATVIAN"/&gt;
 *     &lt;enumeration value="Lebanese"/&gt;
 *     &lt;enumeration value="Liberian"/&gt;
 *     &lt;enumeration value="Liberian English"/&gt;
 *     &lt;enumeration value="LINGALA"/&gt;
 *     &lt;enumeration value="LITHUANIAN"/&gt;
 *     &lt;enumeration value="Loma"/&gt;
 *     &lt;enumeration value="Luganda"/&gt;
 *     &lt;enumeration value="Malayalam"/&gt;
 *     &lt;enumeration value="MANDARIN"/&gt;
 *     &lt;enumeration value="Mandinka/Mandingo"/&gt;
 *     &lt;enumeration value="MANO"/&gt;
 *     &lt;enumeration value="MARATI"/&gt;
 *     &lt;enumeration value="Mareke"/&gt;
 *     &lt;enumeration value="Mende"/&gt;
 *     &lt;enumeration value="Micronesia"/&gt;
 *     &lt;enumeration value="Mongolian"/&gt;
 *     &lt;enumeration value="MORISYEN"/&gt;
 *     &lt;enumeration value="Nepali"/&gt;
 *     &lt;enumeration value="NUER"/&gt;
 *     &lt;enumeration value="Ogoni"/&gt;
 *     &lt;enumeration value="Ojibway"/&gt;
 *     &lt;enumeration value="Oromifa"/&gt;
 *     &lt;enumeration value="OROMO, BORANA-ARSI-GUJI"/&gt;
 *     &lt;enumeration value="PASHTO, CENTRAL"/&gt;
 *     &lt;enumeration value="Pelle"/&gt;
 *     &lt;enumeration value="PERSIAN"/&gt;
 *     &lt;enumeration value="Phillipino"/&gt;
 *     &lt;enumeration value="Pigeon English"/&gt;
 *     &lt;enumeration value="POLISH"/&gt;
 *     &lt;enumeration value="PORTUGUESE"/&gt;
 *     &lt;enumeration value="PUNJABI"/&gt;
 *     &lt;enumeration value="PUNJABI, EASTERN"/&gt;
 *     &lt;enumeration value="Real Time"/&gt;
 *     &lt;enumeration value="ROMANIAN"/&gt;
 *     &lt;enumeration value="RUSSIAN"/&gt;
 *     &lt;enumeration value="Russian-Georgian"/&gt;
 *     &lt;enumeration value="Samoan"/&gt;
 *     &lt;enumeration value="Saniklle"/&gt;
 *     &lt;enumeration value="Sapo"/&gt;
 *     &lt;enumeration value="SERBO-CROATIAN"/&gt;
 *     &lt;enumeration value="Sign (Spanish)"/&gt;
 *     &lt;enumeration value="SIGN LANGUAGE - AMERICAN"/&gt;
 *     &lt;enumeration value="Sinhalese"/&gt;
 *     &lt;enumeration value="SLOVAKIAN"/&gt;
 *     &lt;enumeration value="SOMALI"/&gt;
 *     &lt;enumeration value="Soninke"/&gt;
 *     &lt;enumeration value="Sovany"/&gt;
 *     &lt;enumeration value="SPANISH"/&gt;
 *     &lt;enumeration value="SUSU"/&gt;
 *     &lt;enumeration value="SWAHILI"/&gt;
 *     &lt;enumeration value="SWEDISH"/&gt;
 *     &lt;enumeration value="Tactile"/&gt;
 *     &lt;enumeration value="Tagalog"/&gt;
 *     &lt;enumeration value="TAISHAN"/&gt;
 *     &lt;enumeration value="TAIWANESE"/&gt;
 *     &lt;enumeration value="Tamil"/&gt;
 *     &lt;enumeration value="Tasnian"/&gt;
 *     &lt;enumeration value="Tegerin"/&gt;
 *     &lt;enumeration value="Telugu"/&gt;
 *     &lt;enumeration value="THAI"/&gt;
 *     &lt;enumeration value="TIBETAN"/&gt;
 *     &lt;enumeration value="TIGRINYA"/&gt;
 *     &lt;enumeration value="Tunisian"/&gt;
 *     &lt;enumeration value="Turkish"/&gt;
 *     &lt;enumeration value="Twi"/&gt;
 *     &lt;enumeration value="Uighur (Kazakhstan)"/&gt;
 *     &lt;enumeration value="UKRAINIAN"/&gt;
 *     &lt;enumeration value="URDU"/&gt;
 *     &lt;enumeration value="Uzbek"/&gt;
 *     &lt;enumeration value="Vai"/&gt;
 *     &lt;enumeration value="VIETNAMESE"/&gt;
 *     &lt;enumeration value="Wollof"/&gt;
 *     &lt;enumeration value="YORUBA"/&gt;
 *     &lt;enumeration value="Zapoteco"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LanguageType")
@XmlEnum
public enum LanguageType {

    @XmlEnumValue("Afar")
    AFAR("Afar"),
    @XmlEnumValue("Afghanistan")
    AFGHANISTAN("Afghanistan"),
    @XmlEnumValue("Akan")
    AKAN("Akan"),
    @XmlEnumValue("Albanian")
    ALBANIAN("Albanian"),
    AMHARIC("AMHARIC"),
    ANUAK("ANUAK"),
    @XmlEnumValue("ARABIC - STANDARD")
    ARABIC_STANDARD("ARABIC - STANDARD"),
    @XmlEnumValue("ARABIC - SUDANESE")
    ARABIC_SUDANESE("ARABIC - SUDANESE"),
    @XmlEnumValue("Armenian")
    ARMENIAN("Armenian"),
    @XmlEnumValue("Atie - W Africa")
    ATIE_W_AFRICA("Atie - W Africa"),
    @XmlEnumValue("Bandi")
    BANDI("Bandi"),
    @XmlEnumValue("Bangolese")
    BANGOLESE("Bangolese"),
    @XmlEnumValue("Bari")
    BARI("Bari"),
    @XmlEnumValue("Bassa")
    BASSA("Bassa"),
    @XmlEnumValue("Basut")
    BASUT("Basut"),
    BEHDINI("BEHDINI"),
    @XmlEnumValue("Belarusian")
    BELARUSIAN("Belarusian"),
    BENGALI("BENGALI"),
    BERBER("BERBER"),
    BHOJPURL("BHOJPURL"),
    @XmlEnumValue("Binin")
    BININ("Binin"),
    BOSNIAN("BOSNIAN"),
    @XmlEnumValue("Bulgarian")
    BULGARIAN("Bulgarian"),
    @XmlEnumValue("Burmese")
    BURMESE("Burmese"),
    @XmlEnumValue("Burmese-Karen")
    BURMESE_KAREN("Burmese-Karen"),
    CAMBODIAN("CAMBODIAN"),
    CANTONESE("CANTONESE"),
    CASTILIAN("CASTILIAN"),
    @XmlEnumValue("CATALAN - VALENCIAN - BALEAR")
    CATALAN_VALENCIAN_BALEAR("CATALAN - VALENCIAN - BALEAR"),
    @XmlEnumValue("Cebuano")
    CEBUANO("Cebuano"),
    @XmlEnumValue("Certified Deaf Interpreter")
    CERTIFIED_DEAF_INTERPRETER("Certified Deaf Interpreter"),
    @XmlEnumValue("Chichewa")
    CHICHEWA("Chichewa"),
    @XmlEnumValue("CHINESE, MANDARIN")
    CHINESE_MANDARIN("CHINESE, MANDARIN"),
    @XmlEnumValue("CHINESE, MIN NAN")
    CHINESE_MIN_NAN("CHINESE, MIN NAN"),
    @XmlEnumValue("CHINESE, YUE")
    CHINESE_YUE("CHINESE, YUE"),
    CREOLE("CREOLE"),
    CROATIAN("CROATIAN"),
    @XmlEnumValue("Czechoslovkian")
    CZECHOSLOVKIAN("Czechoslovkian"),
    DANISH("DANISH"),
    @XmlEnumValue("Deaf - Relay")
    DEAF_RELAY("Deaf - Relay"),
    @XmlEnumValue("Dinka")
    DINKA("Dinka"),
    DUTCH("DUTCH"),
    @XmlEnumValue("Ebu")
    EBU("Ebu"),
    @XmlEnumValue("Edo")
    EDO("Edo"),
    @XmlEnumValue("Egyptian")
    EGYPTIAN("Egyptian"),
    @XmlEnumValue("Eritrian")
    ERITRIAN("Eritrian"),
    @XmlEnumValue("Estonian")
    ESTONIAN("Estonian"),
    ETHIOPIAN("ETHIOPIAN"),
    @XmlEnumValue("Ewe")
    EWE("Ewe"),
    @XmlEnumValue("Fancy")
    FANCY("Fancy"),
    @XmlEnumValue("FARSI, EASTERN")
    FARSI_EASTERN("FARSI, EASTERN"),
    @XmlEnumValue("FARSI, WESTERN")
    FARSI_WESTERN("FARSI, WESTERN"),
    @XmlEnumValue("Filipino")
    FILIPINO("Filipino"),
    FINNISH("FINNISH"),
    FRENCH("FRENCH"),
    FUCHIENESE("FUCHIENESE"),
    @XmlEnumValue("Fulani")
    FULANI("Fulani"),
    @XmlEnumValue("Gbandi")
    GBANDI("Gbandi"),
    @XmlEnumValue("GERMAN, STANDARD")
    GERMAN_STANDARD("GERMAN, STANDARD"),
    @XmlEnumValue("Gio or Dan")
    GIO_OR_DAN("Gio or Dan"),
    @XmlEnumValue("Gisi")
    GISI("Gisi"),
    @XmlEnumValue("Grebo")
    GREBO("Grebo"),
    GREEK("GREEK"),
    @XmlEnumValue("Gudrathi")
    GUDRATHI("Gudrathi"),
    GUJANARTI("GUJANARTI"),
    GUJARATI("GUJARATI"),
    GUJRATI("GUJRATI"),
    @XmlEnumValue("Guyanese")
    GUYANESE("Guyanese"),
    @XmlEnumValue("HAITIAN CREOLE FRENCH")
    HAITIAN_CREOLE_FRENCH("HAITIAN CREOLE FRENCH"),
    @XmlEnumValue("Harari")
    HARARI("Harari"),
    @XmlEnumValue("Haseen")
    HASEEN("Haseen"),
    @XmlEnumValue("Hausa")
    HAUSA("Hausa"),
    HEBREW("HEBREW"),
    @XmlEnumValue("Hendu")
    HENDU("Hendu"),
    HINDI("HINDI"),
    HMONG("HMONG"),
    HUNGARIAN("HUNGARIAN"),
    @XmlEnumValue("Ibibio")
    IBIBIO("Ibibio"),
    @XmlEnumValue("Igbo")
    IGBO("Igbo"),
    @XmlEnumValue("Indian")
    INDIAN("Indian"),
    INDONESIAN("INDONESIAN"),
    @XmlEnumValue("Iranian")
    IRANIAN("Iranian"),
    @XmlEnumValue("Ishan")
    ISHAN("Ishan"),
    @XmlEnumValue("Islamic")
    ISLAMIC("Islamic"),
    ITALIAN("ITALIAN"),
    @XmlEnumValue("Jamaician")
    JAMAICIAN("Jamaician"),
    JAPANESE("JAPANESE"),
    @XmlEnumValue("Karen")
    KAREN("Karen"),
    @XmlEnumValue("Karenni")
    KARENNI("Karenni"),
    @XmlEnumValue("Kayah")
    KAYAH("Kayah"),
    @XmlEnumValue("Kenna (Nigerian)")
    KENNA_NIGERIAN("Kenna (Nigerian)"),
    @XmlEnumValue("KHMER, CENTRAL")
    KHMER_CENTRAL("KHMER, CENTRAL"),
    @XmlEnumValue("KHMER, NORTHERN")
    KHMER_NORTHERN("KHMER, NORTHERN"),
    @XmlEnumValue("Khran")
    KHRAN("Khran"),
    @XmlEnumValue("Kinyarwanda")
    KINYARWANDA("Kinyarwanda"),
    @XmlEnumValue("Kisi")
    KISI("Kisi"),
    @XmlEnumValue("Kiswahili")
    KISWAHILI("Kiswahili"),
    KONKANI("KONKANI"),
    KOREAN("KOREAN"),
    @XmlEnumValue("Kosraen")
    KOSRAEN("Kosraen"),
    @XmlEnumValue("Kpelle")
    KPELLE("Kpelle"),
    @XmlEnumValue("Krahn")
    KRAHN("Krahn"),
    KREOLE("KREOLE"),
    KRIO("KRIO"),
    @XmlEnumValue("Kru")
    KRU("Kru"),
    @XmlEnumValue("Krudish Soranu")
    KRUDISH_SORANU("Krudish Soranu"),
    KUKU("KUKU"),
    @XmlEnumValue("Kurd")
    KURD("Kurd"),
    @XmlEnumValue("KURDISH BANDINANI")
    KURDISH_BANDINANI("KURDISH BANDINANI"),
    LAHU("LAHU"),
    LAO("LAO"),
    LATVIAN("LATVIAN"),
    @XmlEnumValue("Lebanese")
    LEBANESE("Lebanese"),
    @XmlEnumValue("Liberian")
    LIBERIAN("Liberian"),
    @XmlEnumValue("Liberian English")
    LIBERIAN_ENGLISH("Liberian English"),
    LINGALA("LINGALA"),
    LITHUANIAN("LITHUANIAN"),
    @XmlEnumValue("Loma")
    LOMA("Loma"),
    @XmlEnumValue("Luganda")
    LUGANDA("Luganda"),
    @XmlEnumValue("Malayalam")
    MALAYALAM("Malayalam"),
    MANDARIN("MANDARIN"),
    @XmlEnumValue("Mandinka/Mandingo")
    MANDINKA_MANDINGO("Mandinka/Mandingo"),
    MANO("MANO"),
    MARATI("MARATI"),
    @XmlEnumValue("Mareke")
    MAREKE("Mareke"),
    @XmlEnumValue("Mende")
    MENDE("Mende"),
    @XmlEnumValue("Micronesia")
    MICRONESIA("Micronesia"),
    @XmlEnumValue("Mongolian")
    MONGOLIAN("Mongolian"),
    MORISYEN("MORISYEN"),
    @XmlEnumValue("Nepali")
    NEPALI("Nepali"),
    NUER("NUER"),
    @XmlEnumValue("Ogoni")
    OGONI("Ogoni"),
    @XmlEnumValue("Ojibway")
    OJIBWAY("Ojibway"),
    @XmlEnumValue("Oromifa")
    OROMIFA("Oromifa"),
    @XmlEnumValue("OROMO, BORANA-ARSI-GUJI")
    OROMO_BORANA_ARSI_GUJI("OROMO, BORANA-ARSI-GUJI"),
    @XmlEnumValue("PASHTO, CENTRAL")
    PASHTO_CENTRAL("PASHTO, CENTRAL"),
    @XmlEnumValue("Pelle")
    PELLE("Pelle"),
    PERSIAN("PERSIAN"),
    @XmlEnumValue("Phillipino")
    PHILLIPINO("Phillipino"),
    @XmlEnumValue("Pigeon English")
    PIGEON_ENGLISH("Pigeon English"),
    POLISH("POLISH"),
    PORTUGUESE("PORTUGUESE"),
    PUNJABI("PUNJABI"),
    @XmlEnumValue("PUNJABI, EASTERN")
    PUNJABI_EASTERN("PUNJABI, EASTERN"),
    @XmlEnumValue("Real Time")
    REAL_TIME("Real Time"),
    ROMANIAN("ROMANIAN"),
    RUSSIAN("RUSSIAN"),
    @XmlEnumValue("Russian-Georgian")
    RUSSIAN_GEORGIAN("Russian-Georgian"),
    @XmlEnumValue("Samoan")
    SAMOAN("Samoan"),
    @XmlEnumValue("Saniklle")
    SANIKLLE("Saniklle"),
    @XmlEnumValue("Sapo")
    SAPO("Sapo"),
    @XmlEnumValue("SERBO-CROATIAN")
    SERBO_CROATIAN("SERBO-CROATIAN"),
    @XmlEnumValue("Sign (Spanish)")
    SIGN_SPANISH("Sign (Spanish)"),
    @XmlEnumValue("SIGN LANGUAGE - AMERICAN")
    SIGN_LANGUAGE_AMERICAN("SIGN LANGUAGE - AMERICAN"),
    @XmlEnumValue("Sinhalese")
    SINHALESE("Sinhalese"),
    SLOVAKIAN("SLOVAKIAN"),
    SOMALI("SOMALI"),
    @XmlEnumValue("Soninke")
    SONINKE("Soninke"),
    @XmlEnumValue("Sovany")
    SOVANY("Sovany"),
    SPANISH("SPANISH"),
    SUSU("SUSU"),
    SWAHILI("SWAHILI"),
    SWEDISH("SWEDISH"),
    @XmlEnumValue("Tactile")
    TACTILE("Tactile"),
    @XmlEnumValue("Tagalog")
    TAGALOG("Tagalog"),
    TAISHAN("TAISHAN"),
    TAIWANESE("TAIWANESE"),
    @XmlEnumValue("Tamil")
    TAMIL("Tamil"),
    @XmlEnumValue("Tasnian")
    TASNIAN("Tasnian"),
    @XmlEnumValue("Tegerin")
    TEGERIN("Tegerin"),
    @XmlEnumValue("Telugu")
    TELUGU("Telugu"),
    THAI("THAI"),
    TIBETAN("TIBETAN"),
    TIGRINYA("TIGRINYA"),
    @XmlEnumValue("Tunisian")
    TUNISIAN("Tunisian"),
    @XmlEnumValue("Turkish")
    TURKISH("Turkish"),
    @XmlEnumValue("Twi")
    TWI("Twi"),
    @XmlEnumValue("Uighur (Kazakhstan)")
    UIGHUR_KAZAKHSTAN("Uighur (Kazakhstan)"),
    UKRAINIAN("UKRAINIAN"),
    URDU("URDU"),
    @XmlEnumValue("Uzbek")
    UZBEK("Uzbek"),
    @XmlEnumValue("Vai")
    VAI("Vai"),
    VIETNAMESE("VIETNAMESE"),
    @XmlEnumValue("Wollof")
    WOLLOF("Wollof"),
    YORUBA("YORUBA"),
    @XmlEnumValue("Zapoteco")
    ZAPOTECO("Zapoteco");
    private final String value;

    LanguageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LanguageType fromValue(String v) {
        for (LanguageType c: LanguageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}