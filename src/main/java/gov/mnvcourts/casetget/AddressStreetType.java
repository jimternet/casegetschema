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
 * <p>Java class for AddressStreetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressStreetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Alley"/>
 *     &lt;enumeration value="Annex"/>
 *     &lt;enumeration value="Arcade"/>
 *     &lt;enumeration value="Avenue"/>
 *     &lt;enumeration value="Bayou"/>
 *     &lt;enumeration value="Beach"/>
 *     &lt;enumeration value="Bend"/>
 *     &lt;enumeration value="Bluff"/>
 *     &lt;enumeration value="Bluffs"/>
 *     &lt;enumeration value="Bottom"/>
 *     &lt;enumeration value="Boulevard"/>
 *     &lt;enumeration value="Branch"/>
 *     &lt;enumeration value="Bridge"/>
 *     &lt;enumeration value="Brook"/>
 *     &lt;enumeration value="Brooks"/>
 *     &lt;enumeration value="Burg"/>
 *     &lt;enumeration value="Burgs"/>
 *     &lt;enumeration value="Bypass"/>
 *     &lt;enumeration value="Camp"/>
 *     &lt;enumeration value="Canyon"/>
 *     &lt;enumeration value="Cape"/>
 *     &lt;enumeration value="Causeway"/>
 *     &lt;enumeration value="Center"/>
 *     &lt;enumeration value="Centers"/>
 *     &lt;enumeration value="Circle"/>
 *     &lt;enumeration value="Circles"/>
 *     &lt;enumeration value="Cliff"/>
 *     &lt;enumeration value="Cliffs"/>
 *     &lt;enumeration value="Club"/>
 *     &lt;enumeration value="Common"/>
 *     &lt;enumeration value="Connector"/>
 *     &lt;enumeration value="Corner"/>
 *     &lt;enumeration value="Corners"/>
 *     &lt;enumeration value="Course"/>
 *     &lt;enumeration value="Court"/>
 *     &lt;enumeration value="Courts"/>
 *     &lt;enumeration value="Cove"/>
 *     &lt;enumeration value="Coves"/>
 *     &lt;enumeration value="Creek"/>
 *     &lt;enumeration value="Crescent"/>
 *     &lt;enumeration value="Crest"/>
 *     &lt;enumeration value="Crossing"/>
 *     &lt;enumeration value="Crossroad"/>
 *     &lt;enumeration value="Curve"/>
 *     &lt;enumeration value="Dale"/>
 *     &lt;enumeration value="Dam"/>
 *     &lt;enumeration value="Divide"/>
 *     &lt;enumeration value="Drive"/>
 *     &lt;enumeration value="Drives"/>
 *     &lt;enumeration value="Estate"/>
 *     &lt;enumeration value="Estates"/>
 *     &lt;enumeration value="Expressway"/>
 *     &lt;enumeration value="Extension"/>
 *     &lt;enumeration value="Extensions"/>
 *     &lt;enumeration value="Fall"/>
 *     &lt;enumeration value="Falls"/>
 *     &lt;enumeration value="Ferry"/>
 *     &lt;enumeration value="Field"/>
 *     &lt;enumeration value="Fields"/>
 *     &lt;enumeration value="Flat"/>
 *     &lt;enumeration value="Flats"/>
 *     &lt;enumeration value="Ford"/>
 *     &lt;enumeration value="Fords"/>
 *     &lt;enumeration value="Forest"/>
 *     &lt;enumeration value="Forge"/>
 *     &lt;enumeration value="Forges"/>
 *     &lt;enumeration value="Fork"/>
 *     &lt;enumeration value="Forks"/>
 *     &lt;enumeration value="Fort"/>
 *     &lt;enumeration value="Freeway"/>
 *     &lt;enumeration value="Garden"/>
 *     &lt;enumeration value="Gardens"/>
 *     &lt;enumeration value="Gateway"/>
 *     &lt;enumeration value="Glen"/>
 *     &lt;enumeration value="Glens"/>
 *     &lt;enumeration value="Green"/>
 *     &lt;enumeration value="Greens"/>
 *     &lt;enumeration value="Grove"/>
 *     &lt;enumeration value="Groves"/>
 *     &lt;enumeration value="Harbor"/>
 *     &lt;enumeration value="Harbors"/>
 *     &lt;enumeration value="Haven"/>
 *     &lt;enumeration value="Heights"/>
 *     &lt;enumeration value="Highway"/>
 *     &lt;enumeration value="Hill"/>
 *     &lt;enumeration value="Hills"/>
 *     &lt;enumeration value="Hollow"/>
 *     &lt;enumeration value="Inlet"/>
 *     &lt;enumeration value="Island"/>
 *     &lt;enumeration value="Islands"/>
 *     &lt;enumeration value="Isle"/>
 *     &lt;enumeration value="Junction"/>
 *     &lt;enumeration value="Junctions"/>
 *     &lt;enumeration value="Key"/>
 *     &lt;enumeration value="Keys"/>
 *     &lt;enumeration value="Knoll"/>
 *     &lt;enumeration value="Knolls"/>
 *     &lt;enumeration value="Lake"/>
 *     &lt;enumeration value="Lakes"/>
 *     &lt;enumeration value="Land"/>
 *     &lt;enumeration value="Landing"/>
 *     &lt;enumeration value="Lane"/>
 *     &lt;enumeration value="Light"/>
 *     &lt;enumeration value="Lights"/>
 *     &lt;enumeration value="Loaf"/>
 *     &lt;enumeration value="Lock"/>
 *     &lt;enumeration value="Locks"/>
 *     &lt;enumeration value="Lodge"/>
 *     &lt;enumeration value="Loop"/>
 *     &lt;enumeration value="Mall"/>
 *     &lt;enumeration value="Manor"/>
 *     &lt;enumeration value="Manors"/>
 *     &lt;enumeration value="Meadow"/>
 *     &lt;enumeration value="Meadows"/>
 *     &lt;enumeration value="Mews"/>
 *     &lt;enumeration value="Mill"/>
 *     &lt;enumeration value="Mills"/>
 *     &lt;enumeration value="Mission"/>
 *     &lt;enumeration value="Motorway"/>
 *     &lt;enumeration value="Mount"/>
 *     &lt;enumeration value="Mountain"/>
 *     &lt;enumeration value="Mountains"/>
 *     &lt;enumeration value="Neck"/>
 *     &lt;enumeration value="Orchard"/>
 *     &lt;enumeration value="Oval"/>
 *     &lt;enumeration value="Overpass"/>
 *     &lt;enumeration value="Park"/>
 *     &lt;enumeration value="Parkway"/>
 *     &lt;enumeration value="Pass"/>
 *     &lt;enumeration value="Passage"/>
 *     &lt;enumeration value="Path"/>
 *     &lt;enumeration value="Pike"/>
 *     &lt;enumeration value="Pine"/>
 *     &lt;enumeration value="Pines"/>
 *     &lt;enumeration value="Place"/>
 *     &lt;enumeration value="Plain"/>
 *     &lt;enumeration value="Plains"/>
 *     &lt;enumeration value="Plaza"/>
 *     &lt;enumeration value="Point"/>
 *     &lt;enumeration value="Points"/>
 *     &lt;enumeration value="Port"/>
 *     &lt;enumeration value="Ports"/>
 *     &lt;enumeration value="Prairie"/>
 *     &lt;enumeration value="Radial"/>
 *     &lt;enumeration value="Ramp"/>
 *     &lt;enumeration value="Ranch"/>
 *     &lt;enumeration value="Rapid"/>
 *     &lt;enumeration value="Rapids"/>
 *     &lt;enumeration value="Rest"/>
 *     &lt;enumeration value="Ridge"/>
 *     &lt;enumeration value="Ridges"/>
 *     &lt;enumeration value="River"/>
 *     &lt;enumeration value="Road"/>
 *     &lt;enumeration value="Roads"/>
 *     &lt;enumeration value="Route"/>
 *     &lt;enumeration value="Row"/>
 *     &lt;enumeration value="Rue"/>
 *     &lt;enumeration value="Run"/>
 *     &lt;enumeration value="Shoal"/>
 *     &lt;enumeration value="Shoals"/>
 *     &lt;enumeration value="Shore"/>
 *     &lt;enumeration value="Shores"/>
 *     &lt;enumeration value="Skyway"/>
 *     &lt;enumeration value="Spring"/>
 *     &lt;enumeration value="Springs"/>
 *     &lt;enumeration value="Spur"/>
 *     &lt;enumeration value="Square"/>
 *     &lt;enumeration value="Squares"/>
 *     &lt;enumeration value="Station"/>
 *     &lt;enumeration value="Stravenue"/>
 *     &lt;enumeration value="Stream"/>
 *     &lt;enumeration value="Street"/>
 *     &lt;enumeration value="Streets"/>
 *     &lt;enumeration value="Summit"/>
 *     &lt;enumeration value="Terrace"/>
 *     &lt;enumeration value="Throughway"/>
 *     &lt;enumeration value="Trace"/>
 *     &lt;enumeration value="Track"/>
 *     &lt;enumeration value="Trafficway"/>
 *     &lt;enumeration value="Trail"/>
 *     &lt;enumeration value="Tunnel"/>
 *     &lt;enumeration value="Turnpike"/>
 *     &lt;enumeration value="Underpass"/>
 *     &lt;enumeration value="Union"/>
 *     &lt;enumeration value="Unions"/>
 *     &lt;enumeration value="Valley"/>
 *     &lt;enumeration value="Valleys"/>
 *     &lt;enumeration value="Viaduct"/>
 *     &lt;enumeration value="View"/>
 *     &lt;enumeration value="Views"/>
 *     &lt;enumeration value="Village"/>
 *     &lt;enumeration value="Villages"/>
 *     &lt;enumeration value="Ville"/>
 *     &lt;enumeration value="Vista"/>
 *     &lt;enumeration value="Walk"/>
 *     &lt;enumeration value="Wall"/>
 *     &lt;enumeration value="Way"/>
 *     &lt;enumeration value="Ways"/>
 *     &lt;enumeration value="Well"/>
 *     &lt;enumeration value="Wells"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AddressStreetType")
@XmlEnum
public enum AddressStreetType {

    @XmlEnumValue("Alley")
    ALLEY("Alley"),
    @XmlEnumValue("Annex")
    ANNEX("Annex"),
    @XmlEnumValue("Arcade")
    ARCADE("Arcade"),
    @XmlEnumValue("Avenue")
    AVENUE("Avenue"),
    @XmlEnumValue("Bayou")
    BAYOU("Bayou"),
    @XmlEnumValue("Beach")
    BEACH("Beach"),
    @XmlEnumValue("Bend")
    BEND("Bend"),
    @XmlEnumValue("Bluff")
    BLUFF("Bluff"),
    @XmlEnumValue("Bluffs")
    BLUFFS("Bluffs"),
    @XmlEnumValue("Bottom")
    BOTTOM("Bottom"),
    @XmlEnumValue("Boulevard")
    BOULEVARD("Boulevard"),
    @XmlEnumValue("Branch")
    BRANCH("Branch"),
    @XmlEnumValue("Bridge")
    BRIDGE("Bridge"),
    @XmlEnumValue("Brook")
    BROOK("Brook"),
    @XmlEnumValue("Brooks")
    BROOKS("Brooks"),
    @XmlEnumValue("Burg")
    BURG("Burg"),
    @XmlEnumValue("Burgs")
    BURGS("Burgs"),
    @XmlEnumValue("Bypass")
    BYPASS("Bypass"),
    @XmlEnumValue("Camp")
    CAMP("Camp"),
    @XmlEnumValue("Canyon")
    CANYON("Canyon"),
    @XmlEnumValue("Cape")
    CAPE("Cape"),
    @XmlEnumValue("Causeway")
    CAUSEWAY("Causeway"),
    @XmlEnumValue("Center")
    CENTER("Center"),
    @XmlEnumValue("Centers")
    CENTERS("Centers"),
    @XmlEnumValue("Circle")
    CIRCLE("Circle"),
    @XmlEnumValue("Circles")
    CIRCLES("Circles"),
    @XmlEnumValue("Cliff")
    CLIFF("Cliff"),
    @XmlEnumValue("Cliffs")
    CLIFFS("Cliffs"),
    @XmlEnumValue("Club")
    CLUB("Club"),
    @XmlEnumValue("Common")
    COMMON("Common"),
    @XmlEnumValue("Connector")
    CONNECTOR("Connector"),
    @XmlEnumValue("Corner")
    CORNER("Corner"),
    @XmlEnumValue("Corners")
    CORNERS("Corners"),
    @XmlEnumValue("Course")
    COURSE("Course"),
    @XmlEnumValue("Court")
    COURT("Court"),
    @XmlEnumValue("Courts")
    COURTS("Courts"),
    @XmlEnumValue("Cove")
    COVE("Cove"),
    @XmlEnumValue("Coves")
    COVES("Coves"),
    @XmlEnumValue("Creek")
    CREEK("Creek"),
    @XmlEnumValue("Crescent")
    CRESCENT("Crescent"),
    @XmlEnumValue("Crest")
    CREST("Crest"),
    @XmlEnumValue("Crossing")
    CROSSING("Crossing"),
    @XmlEnumValue("Crossroad")
    CROSSROAD("Crossroad"),
    @XmlEnumValue("Curve")
    CURVE("Curve"),
    @XmlEnumValue("Dale")
    DALE("Dale"),
    @XmlEnumValue("Dam")
    DAM("Dam"),
    @XmlEnumValue("Divide")
    DIVIDE("Divide"),
    @XmlEnumValue("Drive")
    DRIVE("Drive"),
    @XmlEnumValue("Drives")
    DRIVES("Drives"),
    @XmlEnumValue("Estate")
    ESTATE("Estate"),
    @XmlEnumValue("Estates")
    ESTATES("Estates"),
    @XmlEnumValue("Expressway")
    EXPRESSWAY("Expressway"),
    @XmlEnumValue("Extension")
    EXTENSION("Extension"),
    @XmlEnumValue("Extensions")
    EXTENSIONS("Extensions"),
    @XmlEnumValue("Fall")
    FALL("Fall"),
    @XmlEnumValue("Falls")
    FALLS("Falls"),
    @XmlEnumValue("Ferry")
    FERRY("Ferry"),
    @XmlEnumValue("Field")
    FIELD("Field"),
    @XmlEnumValue("Fields")
    FIELDS("Fields"),
    @XmlEnumValue("Flat")
    FLAT("Flat"),
    @XmlEnumValue("Flats")
    FLATS("Flats"),
    @XmlEnumValue("Ford")
    FORD("Ford"),
    @XmlEnumValue("Fords")
    FORDS("Fords"),
    @XmlEnumValue("Forest")
    FOREST("Forest"),
    @XmlEnumValue("Forge")
    FORGE("Forge"),
    @XmlEnumValue("Forges")
    FORGES("Forges"),
    @XmlEnumValue("Fork")
    FORK("Fork"),
    @XmlEnumValue("Forks")
    FORKS("Forks"),
    @XmlEnumValue("Fort")
    FORT("Fort"),
    @XmlEnumValue("Freeway")
    FREEWAY("Freeway"),
    @XmlEnumValue("Garden")
    GARDEN("Garden"),
    @XmlEnumValue("Gardens")
    GARDENS("Gardens"),
    @XmlEnumValue("Gateway")
    GATEWAY("Gateway"),
    @XmlEnumValue("Glen")
    GLEN("Glen"),
    @XmlEnumValue("Glens")
    GLENS("Glens"),
    @XmlEnumValue("Green")
    GREEN("Green"),
    @XmlEnumValue("Greens")
    GREENS("Greens"),
    @XmlEnumValue("Grove")
    GROVE("Grove"),
    @XmlEnumValue("Groves")
    GROVES("Groves"),
    @XmlEnumValue("Harbor")
    HARBOR("Harbor"),
    @XmlEnumValue("Harbors")
    HARBORS("Harbors"),
    @XmlEnumValue("Haven")
    HAVEN("Haven"),
    @XmlEnumValue("Heights")
    HEIGHTS("Heights"),
    @XmlEnumValue("Highway")
    HIGHWAY("Highway"),
    @XmlEnumValue("Hill")
    HILL("Hill"),
    @XmlEnumValue("Hills")
    HILLS("Hills"),
    @XmlEnumValue("Hollow")
    HOLLOW("Hollow"),
    @XmlEnumValue("Inlet")
    INLET("Inlet"),
    @XmlEnumValue("Island")
    ISLAND("Island"),
    @XmlEnumValue("Islands")
    ISLANDS("Islands"),
    @XmlEnumValue("Isle")
    ISLE("Isle"),
    @XmlEnumValue("Junction")
    JUNCTION("Junction"),
    @XmlEnumValue("Junctions")
    JUNCTIONS("Junctions"),
    @XmlEnumValue("Key")
    KEY("Key"),
    @XmlEnumValue("Keys")
    KEYS("Keys"),
    @XmlEnumValue("Knoll")
    KNOLL("Knoll"),
    @XmlEnumValue("Knolls")
    KNOLLS("Knolls"),
    @XmlEnumValue("Lake")
    LAKE("Lake"),
    @XmlEnumValue("Lakes")
    LAKES("Lakes"),
    @XmlEnumValue("Land")
    LAND("Land"),
    @XmlEnumValue("Landing")
    LANDING("Landing"),
    @XmlEnumValue("Lane")
    LANE("Lane"),
    @XmlEnumValue("Light")
    LIGHT("Light"),
    @XmlEnumValue("Lights")
    LIGHTS("Lights"),
    @XmlEnumValue("Loaf")
    LOAF("Loaf"),
    @XmlEnumValue("Lock")
    LOCK("Lock"),
    @XmlEnumValue("Locks")
    LOCKS("Locks"),
    @XmlEnumValue("Lodge")
    LODGE("Lodge"),
    @XmlEnumValue("Loop")
    LOOP("Loop"),
    @XmlEnumValue("Mall")
    MALL("Mall"),
    @XmlEnumValue("Manor")
    MANOR("Manor"),
    @XmlEnumValue("Manors")
    MANORS("Manors"),
    @XmlEnumValue("Meadow")
    MEADOW("Meadow"),
    @XmlEnumValue("Meadows")
    MEADOWS("Meadows"),
    @XmlEnumValue("Mews")
    MEWS("Mews"),
    @XmlEnumValue("Mill")
    MILL("Mill"),
    @XmlEnumValue("Mills")
    MILLS("Mills"),
    @XmlEnumValue("Mission")
    MISSION("Mission"),
    @XmlEnumValue("Motorway")
    MOTORWAY("Motorway"),
    @XmlEnumValue("Mount")
    MOUNT("Mount"),
    @XmlEnumValue("Mountain")
    MOUNTAIN("Mountain"),
    @XmlEnumValue("Mountains")
    MOUNTAINS("Mountains"),
    @XmlEnumValue("Neck")
    NECK("Neck"),
    @XmlEnumValue("Orchard")
    ORCHARD("Orchard"),
    @XmlEnumValue("Oval")
    OVAL("Oval"),
    @XmlEnumValue("Overpass")
    OVERPASS("Overpass"),
    @XmlEnumValue("Park")
    PARK("Park"),
    @XmlEnumValue("Parkway")
    PARKWAY("Parkway"),
    @XmlEnumValue("Pass")
    PASS("Pass"),
    @XmlEnumValue("Passage")
    PASSAGE("Passage"),
    @XmlEnumValue("Path")
    PATH("Path"),
    @XmlEnumValue("Pike")
    PIKE("Pike"),
    @XmlEnumValue("Pine")
    PINE("Pine"),
    @XmlEnumValue("Pines")
    PINES("Pines"),
    @XmlEnumValue("Place")
    PLACE("Place"),
    @XmlEnumValue("Plain")
    PLAIN("Plain"),
    @XmlEnumValue("Plains")
    PLAINS("Plains"),
    @XmlEnumValue("Plaza")
    PLAZA("Plaza"),
    @XmlEnumValue("Point")
    POINT("Point"),
    @XmlEnumValue("Points")
    POINTS("Points"),
    @XmlEnumValue("Port")
    PORT("Port"),
    @XmlEnumValue("Ports")
    PORTS("Ports"),
    @XmlEnumValue("Prairie")
    PRAIRIE("Prairie"),
    @XmlEnumValue("Radial")
    RADIAL("Radial"),
    @XmlEnumValue("Ramp")
    RAMP("Ramp"),
    @XmlEnumValue("Ranch")
    RANCH("Ranch"),
    @XmlEnumValue("Rapid")
    RAPID("Rapid"),
    @XmlEnumValue("Rapids")
    RAPIDS("Rapids"),
    @XmlEnumValue("Rest")
    REST("Rest"),
    @XmlEnumValue("Ridge")
    RIDGE("Ridge"),
    @XmlEnumValue("Ridges")
    RIDGES("Ridges"),
    @XmlEnumValue("River")
    RIVER("River"),
    @XmlEnumValue("Road")
    ROAD("Road"),
    @XmlEnumValue("Roads")
    ROADS("Roads"),
    @XmlEnumValue("Route")
    ROUTE("Route"),
    @XmlEnumValue("Row")
    ROW("Row"),
    @XmlEnumValue("Rue")
    RUE("Rue"),
    @XmlEnumValue("Run")
    RUN("Run"),
    @XmlEnumValue("Shoal")
    SHOAL("Shoal"),
    @XmlEnumValue("Shoals")
    SHOALS("Shoals"),
    @XmlEnumValue("Shore")
    SHORE("Shore"),
    @XmlEnumValue("Shores")
    SHORES("Shores"),
    @XmlEnumValue("Skyway")
    SKYWAY("Skyway"),
    @XmlEnumValue("Spring")
    SPRING("Spring"),
    @XmlEnumValue("Springs")
    SPRINGS("Springs"),
    @XmlEnumValue("Spur")
    SPUR("Spur"),
    @XmlEnumValue("Square")
    SQUARE("Square"),
    @XmlEnumValue("Squares")
    SQUARES("Squares"),
    @XmlEnumValue("Station")
    STATION("Station"),
    @XmlEnumValue("Stravenue")
    STRAVENUE("Stravenue"),
    @XmlEnumValue("Stream")
    STREAM("Stream"),
    @XmlEnumValue("Street")
    STREET("Street"),
    @XmlEnumValue("Streets")
    STREETS("Streets"),
    @XmlEnumValue("Summit")
    SUMMIT("Summit"),
    @XmlEnumValue("Terrace")
    TERRACE("Terrace"),
    @XmlEnumValue("Throughway")
    THROUGHWAY("Throughway"),
    @XmlEnumValue("Trace")
    TRACE("Trace"),
    @XmlEnumValue("Track")
    TRACK("Track"),
    @XmlEnumValue("Trafficway")
    TRAFFICWAY("Trafficway"),
    @XmlEnumValue("Trail")
    TRAIL("Trail"),
    @XmlEnumValue("Tunnel")
    TUNNEL("Tunnel"),
    @XmlEnumValue("Turnpike")
    TURNPIKE("Turnpike"),
    @XmlEnumValue("Underpass")
    UNDERPASS("Underpass"),
    @XmlEnumValue("Union")
    UNION("Union"),
    @XmlEnumValue("Unions")
    UNIONS("Unions"),
    @XmlEnumValue("Valley")
    VALLEY("Valley"),
    @XmlEnumValue("Valleys")
    VALLEYS("Valleys"),
    @XmlEnumValue("Viaduct")
    VIADUCT("Viaduct"),
    @XmlEnumValue("View")
    VIEW("View"),
    @XmlEnumValue("Views")
    VIEWS("Views"),
    @XmlEnumValue("Village")
    VILLAGE("Village"),
    @XmlEnumValue("Villages")
    VILLAGES("Villages"),
    @XmlEnumValue("Ville")
    VILLE("Ville"),
    @XmlEnumValue("Vista")
    VISTA("Vista"),
    @XmlEnumValue("Walk")
    WALK("Walk"),
    @XmlEnumValue("Wall")
    WALL("Wall"),
    @XmlEnumValue("Way")
    WAY("Way"),
    @XmlEnumValue("Ways")
    WAYS("Ways"),
    @XmlEnumValue("Well")
    WELL("Well"),
    @XmlEnumValue("Wells")
    WELLS("Wells");
    private final String value;

    AddressStreetType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddressStreetType fromValue(String v) {
        for (AddressStreetType c: AddressStreetType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
