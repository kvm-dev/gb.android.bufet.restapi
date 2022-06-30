package gb.android.bufet.restapi.domain

import org.springframework.data.jpa.repository.JpaRepository

interface RestaurantRepository : JpaRepository<Restaurant, Int> {
    fun findByName(name:String): Restaurant

}