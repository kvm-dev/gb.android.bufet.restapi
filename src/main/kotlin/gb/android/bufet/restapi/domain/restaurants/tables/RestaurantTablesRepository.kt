package gb.android.bufet.restapi.domain.restaurants.tables

import org.springframework.data.jpa.repository.JpaRepository

interface RestaurantTablesRepository: JpaRepository<RestaurantTables, Int> {
    fun findByRestaurantId(restaurantId: Int): ArrayList<RestaurantTables>
    fun findByRestaurantIdAndId(restaurantId: Int, tableId: Int): RestaurantTables
}