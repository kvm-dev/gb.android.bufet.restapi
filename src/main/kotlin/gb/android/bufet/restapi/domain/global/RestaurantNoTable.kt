package gb.android.bufet.restapi.domain.global


import gb.android.bufet.restapi.domain.restaurants.Restaurant
import gb.android.bufet.restapi.domain.tables.RestaurantTables


data class RestaurantNoTable(
    val id: Int = 0,
    val restaurant: Restaurant? = null,
    var restaurantTables: List<RestaurantTables>? = null
)