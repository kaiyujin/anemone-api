package com.kaiyujin.anemoneapi.reservations

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = "reservations")
class ReservationsController (
    private val reservationsService: ReservationsService
) {
    @RequestMapping(value = "/{id}", method = arrayOf(RequestMethod.GET))
    fun getReservation(@PathVariable id: Int): Reservation {
        return Reservation(id)
    }

    @RequestMapping(value = "/", method = arrayOf(RequestMethod.GET))
    fun getReservations(): List<ReservationEntity> {
        return reservationsService.findAll()
    }
}