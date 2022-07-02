package gb.android.bufet.restapi.domain

import org.springframework.data.jpa.repository.JpaRepository

interface RestaurantTablesRepository: JpaRepository<RestaurantTables, Int> {
    fun findByRestaurantId(restaurantId: Int): ArrayList<RestaurantTables>
    fun findByRestaurantIdAndId(restaurantId: Int, tableId: Int): RestaurantTables
}