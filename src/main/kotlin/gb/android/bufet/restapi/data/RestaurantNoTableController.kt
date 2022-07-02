package gb.android.bufet.restapi.data

import gb.android.bufet.restapi.domain.food.FoodRepository
import gb.android.bufet.restapi.domain.global.RestaurantNoTable
import gb.android.bufet.restapi.domain.restaurants.RestaurantRepository
import gb.android.bufet.restapi.domain.tables.RestaurantTablesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("fullrest")
class RestaurantNoTableController(
    @Autowired(required = true)
//    private val restaurantNoTableRepository: RestaurantNoTableRepository,
    private val restaurantRepository: RestaurantRepository,
    private val restaurantTablesRepository: RestaurantTablesRepository,
    private val foodRepo: FoodRepository
) {

    @GetMapping
    fun allRest(): ArrayList<RestaurantNoTable?> {
        val count: Int = restaurantRepository.count().toInt()
        val rest = arrayListOf<RestaurantNoTable?>()
        for (i in 0..count) {
            rest.add(
                RestaurantNoTable(
                    i,
                    restaurantRepository.findByIdOrNull(i),
                    restaurantTablesRepository.findByRestaurantId(i)
                )
            )
        }
        return rest
    }
}