package dto;

import java.io.Serializable;

public class HotelDetailsDTO implements Serializable {
    /**
     * Indicates hotel five star rating
     */
    private int stars;
    /**
     * Indicates the general estimated distance to a city center.
     */
    private double distanceToCenter;
    /**
     * returns the name of hotel chain
     */
    private String name;
    /**
     * returns the address of the hotel chain
     */
    private String address;
    /**
     * return the city name of the address
     */
    private String city;

    public HotelDetailsDTO(int stars, double distanceToCenter, String name, String address, String city) {
        this.stars = stars;
        this.distanceToCenter = distanceToCenter;
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public HotelDetailsDTO() {
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public double getDistanceToCenter() {
        return distanceToCenter;
    }

    public void setDistanceToCenter(double distanceToCenter) {
        this.distanceToCenter = distanceToCenter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
