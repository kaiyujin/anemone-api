package com.kaiyujin.anemoneapi.dao;

import com.kaiyujin.anemoneapi.entity.ReservationsEntity;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import java.util.List;

/**
 */
@Dao
@ConfigAutowireable
public interface ReservationsEntityDao {

    /**
     * @return the ReservationsEntity entity
     */
    @Select
    List<ReservationsEntity> find(ReservationsEntity reservation);

    /**
     * @param id
     * @return the ReservationsEntity entity
     */
    @Select
    ReservationsEntity selectById(Long id);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(ReservationsEntity entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(ReservationsEntity entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(ReservationsEntity entity);
}