package com.kaiyujin.anemoneapi.reservations

import org.hibernate.validator.constraints.NotBlank
import javax.validation.constraints.Size

class ReservationInput {
    @NotBlank
    @Size(max = 20)
    var firstName: String? = null

    @NotBlank
    @Size(max = 20)
    var lastName: String? = null
}