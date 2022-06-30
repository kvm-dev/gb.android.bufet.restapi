package gb.android.bufet.restapi.data

import gb.android.bufet.restapi.domain.Restaurant
import gb.android.bufet.restapi.domain.RestaurantRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/restaurants")

class RestaurantController(
    @Autowired(required = true)
    private val restaurantRepository: RestaurantRepository
) {
    @GetMapping
    fun allRest(): List<Restaurant> = restaurantRepository.findAll()

    @GetMapping("/{name}")
    fun getOne(@PathVariable("name") name : String): Restaurant = restaurantRepository.findByName(name)
}