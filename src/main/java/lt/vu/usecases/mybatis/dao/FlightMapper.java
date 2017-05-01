package lt.vu.usecases.mybatis.dao;

import lt.vu.usecases.mybatis.model.Flight;

import java.util.List;

public interface FlightMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.FLIGHT
     *
     * @mbg.generated Tue May 02 01:21:14 EEST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.FLIGHT
     *
     * @mbg.generated Tue May 02 01:21:14 EEST 2017
     */
    int insert(Flight record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.FLIGHT
     *
     * @mbg.generated Tue May 02 01:21:14 EEST 2017
     */
    Flight selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.FLIGHT
     *
     * @mbg.generated Tue May 02 01:21:14 EEST 2017
     */
    List<Flight> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.FLIGHT
     *
     * @mbg.generated Tue May 02 01:21:14 EEST 2017
     */
    int updateByPrimaryKey(Flight record);
}