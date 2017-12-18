package com.kaiyujin.anemoneapi.reservations

import org.springframework.stereotype.Service

@Service
class ReservationsService(
        private var reservationsDao: ReservationsDao
) {

    fun findAll(): List<ReservationEntity> {
        return reservationsDao.selectAll()
    }
}

