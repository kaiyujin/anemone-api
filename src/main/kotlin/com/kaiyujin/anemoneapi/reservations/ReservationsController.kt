package com.kaiyujin.anemoneapi.reservations

import com.kaiyujin.anemoneapi.entity.ReservationsEntity
import org.springframework.context.MessageSource
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping(value = "reservations")
class ReservationsController (
    private val reservationsService: ReservationsService,
    private val messageSource: MessageSource
) {
    @RequestMapping(value = "/{id}", method = arrayOf(RequestMethod.GET))
    fun getReservation(@PathVariable id: Long, locale: Locale): Reservation {
        return Reservation(id,messageSource.getMessage("test", null,  locale),"ln")
    }

    @RequestMapping(value = "/", method = arrayOf(RequestMethod.GET))
    fun getReservations(): List<ReservationsEntity> {
        return reservationsService.findAll()
    }

    @PostMapping
    fun create(@Validated reservationInput : ReservationInput): Int {
        val reservation = Reservation(
                firstName = reservationInput.firstName!!,
                lastName =  reservationInput.lastName!!
        )
        return reservationsService.create(reservation)
    }

}