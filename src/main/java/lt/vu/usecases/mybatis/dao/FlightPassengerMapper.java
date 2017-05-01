package lt.vu.usecases.mybatis.dao;

import lt.vu.usecases.mybatis.model.FlightPassenger;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FlightPassengerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.FLIGHT_PASSENGER
     *
     * @mbg.generated Tue May 02 01:21:14 EEST 2017
     */
    int deleteByPrimaryKey(@Param("flightId") Integer flightId, @Param("passengerId") Integer passengerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.FLIGHT_PASSENGER
     *
     * @mbg.generated Tue May 02 01:21:14 EEST 2017
     */
    int insert(FlightPassenger record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.FLIGHT_PASSENGER
     *
     * @mbg.generated Tue May 02 01:21:14 EEST 2017
     */
    List<FlightPassenger> selectAll();
}