package gb.android.bufet.restapi.domain.food

import gb.android.bufet.restapi.domain.food.Food
import gb.android.bufet.restapi.domain.restaurants.RestPictures
import org.springframework.data.jpa.repository.JpaRepository

interface FoodRepository: JpaRepository<Food, Int> {
    fun findByRestaurantId(id: Int): List<Food>
}