package dto;

/**
 * A shorted version of the HotelDetailsDTO
 */
public class HotelDTO {
    /**
     * returns name of hotel
     */
    private String name;
    /**
     * returns address of hotel
     */
    private String address;
    /**
     * returns city of address
     */
    private String city;

    public HotelDTO(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public HotelDTO() {
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
