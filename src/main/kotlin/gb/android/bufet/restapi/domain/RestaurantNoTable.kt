package gb.android.bufet.restapi.domain


import gb.android.bufet.restapi.domain.RestaurantTables
import jakarta.persistence.*
import java.sql.Date


data class RestaurantNoTable(
    val id: Int = 0,
    val restaurant: Restaurant? = null,
    var restaurantTables: List<RestaurantTables>? = null
)