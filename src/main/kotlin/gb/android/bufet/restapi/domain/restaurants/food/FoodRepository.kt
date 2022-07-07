package gb.android.bufet.restapi.domain.restaurants.food

import org.springframework.data.jpa.repository.JpaRepository

interface FoodRepository: JpaRepository<Food, Int> {
    fun findByRestaurantId(id: Int): List<Food>
}