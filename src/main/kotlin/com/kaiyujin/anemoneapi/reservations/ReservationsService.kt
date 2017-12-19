package com.kaiyujin.anemoneapi.reservations

import org.springframework.stereotype.Service

@Service
class ReservationsService(
        private var reservationsDao: ReservationsDao
) {

    fun findAll(): List<ReservationEntity> {
        return reservationsDao.selectAll()
    }

    fun create(reservation: Reservation): Int {
        val reservationEntity =  domain2Entity(reservation)
        return reservationsDao.insert(reservationEntity)
    }

    fun update(reservation: Reservation): Int {
        val reservationEntity =  domain2Entity(reservation)
        return reservationsDao.update(reservationEntity)
    }

    private fun domain2Entity(reservation: Reservation): ReservationEntity {
        return ReservationEntity().also {
            it.id = reservation.id
            it.firstName = reservation.firstName
            it.lastName = reservation.lastName
        }
    }

    private fun entity2Domain(entity: ReservationEntity): Reservation {
        return Reservation(
                id = entity.id,
                firstName = entity.firstName,
                lastName = entity.lastName
        )
    }
}