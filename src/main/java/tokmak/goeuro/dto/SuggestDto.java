package tokmak.goeuro.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SuggestDto {

    @JsonProperty("_id")
    private Integer id;
    private String key;
    private String name;
    private String fullName;
    @JsonProperty("iata_airport_code")
    private String airportCode;
    private String type;
    private String country;
    @JsonProperty("geo_position")
    private GeoPositionDto geoPosition;
    @JsonProperty("location_id")
    private Integer locationId;
    private Boolean inEurope = Boolean.FALSE;
    private String countryCode;
    private Boolean coreCountry = Boolean.FALSE;
    private Float distance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public GeoPositionDto getGeoPosition() {
        return geoPosition;
    }

    public void setGeoPosition(GeoPositionDto geoPosition) {
        this.geoPosition = geoPosition;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public Boolean getInEurope() {
        return inEurope;
    }

    public void setInEurope(Boolean inEurope) {
        this.inEurope = inEurope;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Boolean getCoreCountry() {
        return coreCountry;
    }

    public void setCoreCountry(Boolean coreCountry) {
        this.coreCountry = coreCountry;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }
}
