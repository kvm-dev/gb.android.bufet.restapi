package gb.android.bufet.restapi.domain.global


import gb.android.bufet.restapi.domain.restaurants.food.Food
import gb.android.bufet.restapi.domain.restaurants.pictures.RestPictures
import gb.android.bufet.restapi.domain.restaurants.tables.RestaurantTables
import java.sql.Date


data class RestaurantNoTable(
    var id: Int? = 0,
    var name: String? = "пустой",
    var description: String? = "пустой",
    var type: String? = null,
    var headerImage: String? = "заглушка",
    var work_start: Date? = null,
    var work_end: Date? = null,

    var restaurantTables: List<RestaurantTables>? = null,
    var restaurantPictures: List<RestPictures>? = null,
    var restaurantFood: List<Food>? = null
)