package com.kaiyujin.anemoneapi.entity;

import java.math.BigInteger;
import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * 
 */
@Entity
@Table(name = "authorities")
public class AuthoritiesEntity {

    /** 権限ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    /** 権限名 */
    @Column(name = "name")
    String name;

    /** 権限ビット */
    @Column(name = "authority_bit")
    Byte authorityBit;

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
     * Returns the id.
     * 
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /** 
     * Sets the id.
     * 
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** 
     * Returns the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /** 
     * Sets the name.
     * 
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Returns the authorityBit.
     * 
     * @return the authorityBit
     */
    public Byte getAuthorityBit() {
        return authorityBit;
    }

    /** 
     * Sets the authorityBit.
     * 
     * @param authorityBit the authorityBit
     */
    public void setAuthorityBit(Byte authorityBit) {
        this.authorityBit = authorityBit;
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