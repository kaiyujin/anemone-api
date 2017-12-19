package com.kaiyujin.anemoneapi.reservations;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@ConfigAutowireable
@Dao
public interface ReservationsDao {
    @Select
    List<ReservationEntity> selectAll();

    @Insert
    int insert(ReservationEntity entity);

    @Update
    int update(ReservationEntity entity);
}
