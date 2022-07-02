package gb.android.bufet.restapi.domain.food

import gb.android.bufet.restapi.domain.food.Food
import org.springframework.data.jpa.repository.JpaRepository

interface FoodRepository: JpaRepository<Food, Int> {
}