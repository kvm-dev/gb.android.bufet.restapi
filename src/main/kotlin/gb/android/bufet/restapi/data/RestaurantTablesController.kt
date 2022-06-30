package gb.android.bufet.restapi.data

import gb.android.bufet.restapi.domain.Food
import gb.android.bufet.restapi.domain.FoodRepository
import gb.android.bufet.restapi.domain.RestaurantTables
import gb.android.bufet.restapi.domain.RestaurantTablesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/tables")
class RestaurantTablesController(
    @Autowired(required = true)
    private val restaurantTablesRepository: RestaurantTablesRepository
) {
    @GetMapping
    fun allTables(): List<RestaurantTables> = restaurantTablesRepository.findAll()

    @GetMapping("/{restaurant_id}")
    fun allTablesInRestaurant(@PathVariable("restaurant_id") restaurantId: Int): List<RestaurantTables> =
        restaurantTablesRepository.findByRestaurantId(restaurantId)

    @GetMapping("/{restaurant_id}/{table_id}")
    fun oneTable(
        @PathVariable("restaurant_id") restaurantId: Int,
        @PathVariable("table_id") tableId: Int
    ): RestaurantTables = restaurantTablesRepository.findByRestaurantIdAndId(restaurantId,tableId)
}