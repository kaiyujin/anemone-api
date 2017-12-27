package com.kaiyujin.anemoneapi.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * 
 */
@Entity
@Table(name = "users_authorities")
public class UsersAuthoritiesEntity {

    /** ユーザID */
    @Id
    @Column(name = "user_id")
    Long userId;

    /** 権限ID */
    @Id
    @Column(name = "authority_id")
    Long authorityId;

    /** 店舗ID */
    @Id
    @Column(name = "shop_id")
    Long shopId;

    /** 作成者ID */
    @Column(name = "created_by")
    Long createdBy;

    /** 作成モジュール名 */
    @Column(name = "created_in")
    String createdIn;

    /** 作成日時 */
    @Column(name = "created_at", insertable = false, updatable = false)
    LocalDateTime createdAt;

    /** 更新者ID */
    @Column(name = "updated_by")
    Long updatedBy;

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
    public Long getUserId() {
        return userId;
    }

    /** 
     * Sets the userId.
     * 
     * @param userId the userId
     */
    public void setUserId(Long userId) {
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
    public Long getShopId() {
        return shopId;
    }

    /** 
     * Sets the shopId.
     * 
     * @param shopId the shopId
     */
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    /** 
     * Returns the createdBy.
     * 
     * @return the createdBy
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /** 
     * Sets the createdBy.
     * 
     * @param createdBy the createdBy
     */
    public void setCreatedBy(Long createdBy) {
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
    public Long getUpdatedBy() {
        return updatedBy;
    }

    /** 
     * Sets the updatedBy.
     * 
     * @param updatedBy the updatedBy
     */
    public void setUpdatedBy(Long updatedBy) {
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