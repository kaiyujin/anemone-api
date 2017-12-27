package com.kaiyujin.anemoneapi.entity;

import java.math.BigInteger;
import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 * 
 */
@Entity
@Table(name = "users_authorities")
public class UsersAuthoritiesEntity {

    /** ユーザID */
    @Column(name = "user_id")
    BigInteger userId;

    /** 権限ID */
    @Column(name = "authority_id")
    Long authorityId;

    /** 店舗ID */
    @Column(name = "shop_id")
    BigInteger shopId;

    /** 作成者ID */
    @Column(name = "created_by")
    BigInteger createdBy;

    /** 作成モジュール名 */
    @Column(name = "created_in")
    String createdIn;

    /** 作成日時 */
    @Column(name = "created_at", insertable = false, updatable = false)
    LocalDateTime createdAt;

    /** 更新者ID */
    @Column(name = "updated_by")
    BigInteger updatedBy;

    /** 更新モジュール名 */
    @Column(name = "updated_in")
    String updatedIn;

    /** 更新日時 */
    @Column(name = "updated_at", insertable = false, updatable = false)
    LocalDateTime updatedAt;

    /** 
     * Returns the userId.
     * 
     * @return the userId
     */
    public BigInteger getUserId() {
        return userId;
    }

    /** 
     * Sets the userId.
     * 
     * @param userId the userId
     */
    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    /** 
     * Returns the authorityId.
     * 
     * @return the authorityId
     */
    public Long getAuthorityId() {
        return authorityId;
    }

    /** 
     * Sets the authorityId.
     * 
     * @param authorityId the authorityId
     */
    public void setAuthorityId(Long authorityId) {
        this.authorityId = authorityId;
    }

    /** 
     * Returns the shopId.
     * 
     * @return the shopId
     */
    public BigInteger getShopId() {
        return shopId;
    }

    /** 
     * Sets the shopId.
     * 
     * @param shopId the shopId
     */
    public void setShopId(BigInteger shopId) {
        this.shopId = shopId;
    }

    /** 
     * Returns the createdBy.
     * 
     * @return the createdBy
     */
    public BigInteger getCreatedBy() {
        return createdBy;
    }

    /** 
     * Sets the createdBy.
     * 
     * @param createdBy the createdBy
     */
    public void setCreatedBy(BigInteger createdBy) {
        this.createdBy = createdBy;
    }

    /** 
     * Returns the createdIn.
     * 
     * @return the createdIn
     */
    public String getCreatedIn() {
        return createdIn;
    }

    /** 
     * Sets the createdIn.
     * 
     * @param createdIn the createdIn
     */
    public void setCreatedIn(String createdIn) {
        this.createdIn = createdIn;
    }

    /** 
     * Returns the createdAt.
     * 
     * @return the createdAt
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /** 
     * Sets the createdAt.
     * 
     * @param createdAt the createdAt
     */
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /** 
     * Returns the updatedBy.
     * 
     * @return the updatedBy
     */
    public BigInteger getUpdatedBy() {
        return updatedBy;
    }

    /** 
     * Sets the updatedBy.
     * 
     * @param updatedBy the updatedBy
     */
    public void setUpdatedBy(BigInteger updatedBy) {
        this.updatedBy = updatedBy;
    }

    /** 
     * Returns the updatedIn.
     * 
     * @return the updatedIn
     */
    public String getUpdatedIn() {
        return updatedIn;
    }

    /** 
     * Sets the updatedIn.
     * 
     * @param updatedIn the updatedIn
     */
    public void setUpdatedIn(String updatedIn) {
        this.updatedIn = updatedIn;
    }

    /** 
     * Returns the updatedAt.
     * 
     * @return the updatedAt
     */
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /** 
     * Sets the updatedAt.
     * 
     * @param updatedAt the updatedAt
     */
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}