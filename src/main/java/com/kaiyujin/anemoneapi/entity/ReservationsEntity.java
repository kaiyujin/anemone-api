package com.kaiyujin.anemoneapi.entity;

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
@Table(name = "reservations")
public class ReservationsEntity {

    /** ユーザID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    /** 性 */
    @Column(name = "last_name")
    String lastName;

    /** 名 */
    @Column(name = "first_name")
    String firstName;

    /** ステータスID */
    @Column(name = "status_id")
    Short statusId;

    /** 滞在時間 */
    @Column(name = "stay_time")
    Integer stayTime;

    /** 予約人数 */
    @Column(name = "persons")
    Integer persons;

    /** 予約人数 */
    @Column(name = "chileren")
    Integer chileren;

    /** 流入経路 */
    @Column(name = "inflow_id")
    Integer inflowId;

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
     * Returns the lastName.
     * 
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /** 
     * Sets the lastName.
     * 
     * @param lastName the lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /** 
     * Returns the firstName.
     * 
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /** 
     * Sets the firstName.
     * 
     * @param firstName the firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /** 
     * Returns the statusId.
     * 
     * @return the statusId
     */
    public Short getStatusId() {
        return statusId;
    }

    /** 
     * Sets the statusId.
     * 
     * @param statusId the statusId
     */
    public void setStatusId(Short statusId) {
        this.statusId = statusId;
    }

    /** 
     * Returns the stayTime.
     * 
     * @return the stayTime
     */
    public Integer getStayTime() {
        return stayTime;
    }

    /** 
     * Sets the stayTime.
     * 
     * @param stayTime the stayTime
     */
    public void setStayTime(Integer stayTime) {
        this.stayTime = stayTime;
    }

    /** 
     * Returns the persons.
     * 
     * @return the persons
     */
    public Integer getPersons() {
        return persons;
    }

    /** 
     * Sets the persons.
     * 
     * @param persons the persons
     */
    public void setPersons(Integer persons) {
        this.persons = persons;
    }

    /** 
     * Returns the chileren.
     * 
     * @return the chileren
     */
    public Integer getChileren() {
        return chileren;
    }

    /** 
     * Sets the chileren.
     * 
     * @param chileren the chileren
     */
    public void setChileren(Integer chileren) {
        this.chileren = chileren;
    }

    /** 
     * Returns the inflowId.
     * 
     * @return the inflowId
     */
    public Integer getInflowId() {
        return inflowId;
    }

    /** 
     * Sets the inflowId.
     * 
     * @param inflowId the inflowId
     */
    public void setInflowId(Integer inflowId) {
        this.inflowId = inflowId;
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