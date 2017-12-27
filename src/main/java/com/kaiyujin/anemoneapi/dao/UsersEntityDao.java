package com.kaiyujin.anemoneapi.dao;

import com.kaiyujin.anemoneapi.entity.UsersEntity;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao
@ConfigAutowireable
public interface UsersEntityDao {

    /**
     * @param id
     * @return the UsersEntity entity
     */
    @Select
    UsersEntity selectById(Long id);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(UsersEntity entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(UsersEntity entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(UsersEntity entity);
}