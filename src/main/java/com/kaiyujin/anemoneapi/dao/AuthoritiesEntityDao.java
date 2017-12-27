package com.kaiyujin.anemoneapi.dao;

import com.kaiyujin.anemoneapi.entity.AuthoritiesEntity;
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
public interface AuthoritiesEntityDao {

    /**
     * @param id
     * @return the AuthoritiesEntity entity
     */
    @Select
    AuthoritiesEntity selectById(Long id);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(AuthoritiesEntity entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(AuthoritiesEntity entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(AuthoritiesEntity entity);
}