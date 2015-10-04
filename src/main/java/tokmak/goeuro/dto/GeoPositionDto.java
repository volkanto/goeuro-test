package tokmak.goeuro.dto;

/**
 * <b>Project GoEuroTest</b><br />
 * GeoPositionDto.java<br />
 *
 * @author Volkan Tokmak
 * @since 0.0.1
 */
public class GeoPositionDto 
{
	private Double latitude 	= null;
	private Double longitude 	= null;
	
	/**
	 * getLatitude<br />
	 * @return the latitude
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public Double getLatitude() {
		return this.latitude;
	}
	/**
	 * setLatitude<br />
	 *
	 * @param argLatitude the latitude to set
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public void setLatitude(Double argLatitude) {
		this.latitude = argLatitude;
	}
	/**
	 * getLongitude<br />
	 * @return the longitude
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public Double getLongitude() {
		return this.longitude;
	}
	/**
	 * setLongitude<br />
	 *
	 * @param argLongitude the longitude to set
	 *
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public void setLongitude(Double argLongitude) {
		this.longitude = argLongitude;
	}
}
