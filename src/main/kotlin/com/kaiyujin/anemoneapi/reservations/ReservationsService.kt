package com.kaiyujin.anemoneapi.reservations

import com.kaiyujin.anemoneapi.dao.ReservationsEntityDao
import com.kaiyujin.anemoneapi.entity.ReservationsEntity
import org.springframework.stereotype.Service

@Service
class ReservationsService(
        private val reservationsEntityDao: ReservationsEntityDao
) {

    fun findAll(): List<ReservationsEntity> {
        return reservationsEntityDao.find()
    }

    fun create(reservation: Reservation): Int {
        val reservationEntity =  domain2Entity(reservation)
        return reservationsEntityDao.insert(reservationEntity)
    }

    fun update(reservation: Reservation): Int {
        val reservationEntity =  domain2Entity(reservation)
        return reservationsEntityDao.update(reservationEntity)
    }

    private fun domain2Entity(reservation: Reservation): ReservationsEntity {
        return ReservationsEntity().also {
            it.id = reservation.id
            it.firstName = reservation.firstName
            it.lastName = reservation.lastName
        }
    }

    private fun entity2Domain(entity: ReservationsEntity): Reservation {
        return Reservation(
                id = entity.id,
                firstName = entity.firstName,
                lastName = entity.lastName
        )
    }
}