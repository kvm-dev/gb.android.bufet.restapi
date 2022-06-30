package gb.android.bufet.restapi.domain

import org.springframework.data.jpa.repository.JpaRepository

interface FoodRepository: JpaRepository<Food, Int> {
}