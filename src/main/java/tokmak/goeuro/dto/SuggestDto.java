package tokmak.goeuro.dto;

/**
 * 
 * <b>Project GoEuroTest</b><br />
 * SuggestDto.java<br />
 *
 * @author Volkan Tokmak
 * @since 0.0.1
 */
public class SuggestDto 
{
	private Integer _id 				= null;
	private String key 					= null;
	private String name 				= null;
	private String fullName 			= null;
	private String iata_airport_code 	= null;
	private String type					= null;
	private String country				= null;
	private GeoPositionDto geo_position = null;
	private Integer location_id			= null;
	private Boolean inEurope 			= Boolean.FALSE;
	private String countryCode			= null;
	private Boolean coreCountry			= Boolean.FALSE;
	private Float distance				= null;
	
	/**
	 * get_id<br />
	 * @return the _id
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public Integer get_id() {
		return this._id;
	}
	/**
	 * set_id<br />
	 *
	 * @param arg_id the _id to set
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public void set_id(Integer arg_id) {
		this._id = arg_id;
	}
	/**
	 * getKey<br />
	 * @return the key
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public String getKey() {
		return this.key;
	}
	/**
	 * setKey<br />
	 *
	 * @param argKey the key to set
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public void setKey(String argKey) {
		this.key = argKey;
	}
	/**
	 * getName<br />
	 * @return the name
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * setName<br />
	 *
	 * @param argName the name to set
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public void setName(String argName) {
		this.name = argName;
	}
	/**
	 * getFullName<br />
	 * @return the fullName
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public String getFullName() {
		return this.fullName;
	}
	/**
	 * setFullName<br />
	 *
	 * @param argFullName the fullName to set
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public void setFullName(String argFullName) {
		this.fullName = argFullName;
	}
	/**
	 * getIata_airport_code<br />
	 * @return the iata_airport_code
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public String getIata_airport_code() {
		return this.iata_airport_code;
	}
	/**
	 * setIata_airport_code<br />
	 *
	 * @param argIata_airport_code the iata_airport_code to set
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public void setIata_airport_code(String argIata_airport_code) {
		this.iata_airport_code = argIata_airport_code;
	}
	/**
	 * getType<br />
	 * @return the type
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * setType<br />
	 *
	 * @param argType the type to set
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public void setType(String argType) {
		this.type = argType;
	}
	/**
	 * getCountry<br />
	 * @return the country
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public String getCountry() {
		return this.country;
	}
	/**
	 * setCountry<br />
	 *
	 * @param argCountry the country to set
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public void setCountry(String argCountry) {
		this.country = argCountry;
	}
	/**
	 * getGeo_position<br />
	 * @return the geo_position
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public GeoPositionDto getGeo_position() {
		return this.geo_position;
	}
	/**
	 * setGeo_position<br />
	 *
	 * @param argGeo_position the geo_position to set
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public void setGeo_position(GeoPositionDto argGeo_position) {
		this.geo_position = argGeo_position;
	}
	/**
	 * getLocation_id<br />
	 * @return the location_id
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public Integer getLocation_id() {
		return this.location_id;
	}
	/**
	 * setLocation_id<br />
	 *
	 * @param argLocation_id the location_id to set
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public void setLocation_id(Integer argLocation_id) {
		this.location_id = argLocation_id;
	}
	/**
	 * getInEurope<br />
	 * @return the inEurope
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public Boolean getInEurope() {
		return this.inEurope;
	}
	/**
	 * setInEurope<br />
	 *
	 * @param argInEurope the inEurope to set
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public void setInEurope(Boolean argInEurope) {
		this.inEurope = argInEurope;
	}
	/**
	 * getCountryCode<br />
	 * @return the countryCode
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public String getCountryCode() {
		return this.countryCode;
	}
	/**
	 * setCountryCode<br />
	 *
	 * @param argCountryCode the countryCode to set
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public void setCountryCode(String argCountryCode) {
		this.countryCode = argCountryCode;
	}
	/**
	 * getCoreCountry<br />
	 * @return the coreCountry
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public Boolean getCoreCountry() {
		return this.coreCountry;
	}
	/**
	 * setCoreCountry<br />
	 *
	 * @param argCoreCountry the coreCountry to set
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public void setCoreCountry(Boolean argCoreCountry) {
		this.coreCountry = argCoreCountry;
	}
	/**
	 * getDistance<br />
	 * @return the distance
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public Float getDistance() {
		return this.distance;
	}
	/**
	 * setDistance<br />
	 *
	 * @param argDistance the distance to set
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public void setDistance(Float argDistance) {
		this.distance = argDistance;
	}
}
