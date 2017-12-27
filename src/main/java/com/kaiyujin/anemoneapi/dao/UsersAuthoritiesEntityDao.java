package com.kaiyujin.anemoneapi.dao;

import com.kaiyujin.anemoneapi.entity.UsersAuthoritiesEntity;
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
public interface UsersAuthoritiesEntityDao {

    /**
     * @param userId
     * @param authorityId
     * @param shopId
     * @return the UsersAuthoritiesEntity entity
     */
    @Select
    UsersAuthoritiesEntity selectById(Long userId, Long authorityId, Long shopId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(UsersAuthoritiesEntity entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(UsersAuthoritiesEntity entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(UsersAuthoritiesEntity entity);
}