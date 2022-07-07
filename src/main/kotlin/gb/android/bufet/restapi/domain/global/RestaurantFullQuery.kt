package gb.android.bufet.restapi.domain.global


import gb.android.bufet.restapi.domain.restaurants.food.Food
import gb.android.bufet.restapi.domain.restaurants.pictures.RestPictures
import gb.android.bufet.restapi.domain.restaurants.tables.RestaurantTables


data class RestaurantFullQuery(
    var id: Int? = 0,
    var name: String? = "пустой",
    var description: String? = "пустой",
    var type: String? = null,
    var headerImage: String? = "заглушка",
    var work_start: Long? = null,
    var work_end: Long? = null,

    var restaurantTables: List<RestaurantTables>? = null,
    var restaurantPictures: List<RestPictures>? = null,
    var restaurantFood: List<Food>? = null
)