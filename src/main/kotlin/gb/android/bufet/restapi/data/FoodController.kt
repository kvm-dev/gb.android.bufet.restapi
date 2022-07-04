package gb.android.bufet.restapi.data

import gb.android.bufet.restapi.domain.food.Food
import gb.android.bufet.restapi.domain.food.FoodRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/food")
class FoodController(
    @Autowired(required = true)
    private val foodRepo: FoodRepository
) {
    @GetMapping
    fun allFood():List<Food> = foodRepo.findAll()

    @GetMapping("/{restaurant_id}")
    fun allTablesInRestaurant(
        @PathVariable("restaurant_id") restaurantId: Int): List<Food> =
        foodRepo.findByRestaurantId(restaurantId)
}