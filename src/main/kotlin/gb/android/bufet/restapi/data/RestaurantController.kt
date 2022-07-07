package gb.android.bufet.restapi.data

import gb.android.bufet.restapi.domain.restaurants.Restaurant
import gb.android.bufet.restapi.domain.restaurants.RestaurantRepository
import gb.android.bufet.restapi.domain.restaurants.tables.RestaurantTablesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/restaurants")

class RestaurantController(
    @Autowired(required = true)
    private val restaurantRepository: RestaurantRepository,
    private val restaurantTablesRepository: RestaurantTablesRepository
) {
    @GetMapping
    fun allEntity(): List<Restaurant> = restaurantRepository.findAll()

    @GetMapping("/{name}")
    fun getOneFromName(@PathVariable("name") name: String): Restaurant = restaurantRepository.findByName(name)

    @GetMapping("/{id}")
    fun getOneFromId(@PathVariable("id") id: Int): Restaurant? = restaurantRepository.findByIdOrNull(id)

}