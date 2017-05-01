package lt.vu.usecases.mybatis.dao;

import lt.vu.usecases.mybatis.model.Passenger;

import java.util.List;

public interface PassengerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.PASSENGER
     *
     * @mbg.generated Tue May 02 01:21:14 EEST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.PASSENGER
     *
     * @mbg.generated Tue May 02 01:21:14 EEST 2017
     */
    int insert(Passenger record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.PASSENGER
     *
     * @mbg.generated Tue May 02 01:21:14 EEST 2017
     */
    Passenger selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.PASSENGER
     *
     * @mbg.generated Tue May 02 01:21:14 EEST 2017
     */
    List<Passenger> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.PASSENGER
     *
     * @mbg.generated Tue May 02 01:21:14 EEST 2017
     */
    int updateByPrimaryKey(Passenger record);
}