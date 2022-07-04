package gb.android.bufet.restapi.domain.advertise

import gb.android.bufet.restapi.domain.food.Food
import org.springframework.data.jpa.repository.JpaRepository

interface AdvertiseRepository: JpaRepository<Advertise, Int> {
}