package lt.vu.usecases.mybatis.model;

public class Passenger {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.PASSENGER.ID
     *
     * @mbg.generated Tue May 02 01:21:14 EEST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.PASSENGER.FIRST_NAME
     *
     * @mbg.generated Tue May 02 01:21:14 EEST 2017
     */
    private String firstName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.PASSENGER.LAST_NAME
     *
     * @mbg.generated Tue May 02 01:21:14 EEST 2017
     */
    private String lastName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.PASSENGER.COUNTRY
     *
     * @mbg.generated Tue May 02 01:21:14 EEST 2017
     */
    private String country;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.PASSENGER.ID
     *
     * @return the value of PUBLIC.PASSENGER.ID
     *
     * @mbg.generated Tue May 02 01:21:14 EEST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.PASSENGER.ID
     *
     * @param id the value for PUBLIC.PASSENGER.ID
     *
     * @mbg.generated Tue May 02 01:21:14 EEST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.PASSENGER.FIRST_NAME
     *
     * @return the value of PUBLIC.PASSENGER.FIRST_NAME
     *
     * @mbg.generated Tue May 02 01:21:14 EEST 2017
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.PASSENGER.FIRST_NAME
     *
     * @param firstName the value for PUBLIC.PASSENGER.FIRST_NAME
     *
     * @mbg.generated Tue May 02 01:21:14 EEST 2017
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.PASSENGER.LAST_NAME
     *
     * @return the value of PUBLIC.PASSENGER.LAST_NAME
     *
     * @mbg.generated Tue May 02 01:21:14 EEST 2017
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.PASSENGER.LAST_NAME
     *
     * @param lastName the value for PUBLIC.PASSENGER.LAST_NAME
     *
     * @mbg.generated Tue May 02 01:21:14 EEST 2017
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.PASSENGER.COUNTRY
     *
     * @return the value of PUBLIC.PASSENGER.COUNTRY
     *
     * @mbg.generated Tue May 02 01:21:14 EEST 2017
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.PASSENGER.COUNTRY
     *
     * @param country the value for PUBLIC.PASSENGER.COUNTRY
     *
     * @mbg.generated Tue May 02 01:21:14 EEST 2017
     */
    public void setCountry(String country) {
        this.country = country;
    }
}