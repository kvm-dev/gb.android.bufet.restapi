package gb.android.bufet.restapi.data

import gb.android.bufet.restapi.domain.Food
import gb.android.bufet.restapi.domain.FoodRepository
import gb.android.bufet.restapi.domain.RestaurantTables
import gb.android.bufet.restapi.domain.RestaurantTablesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/tables")
class RestaurantTablesController(
    @Autowired(required = true)
    private val restaurantTablesRepository: RestaurantTablesRepository
) {
    @GetMapping
    fun allTables():List<RestaurantTables> = restaurantTablesRepository.findAll()
}