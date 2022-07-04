package gb.android.bufet.restapi.data

import gb.android.bufet.restapi.domain.restaurants.RestPictures
import gb.android.bufet.restapi.domain.restaurants.RestPicturesRepo
import gb.android.bufet.restapi.domain.tables.RestaurantTables
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/picture")
class RestaurantPicturesController(
    @Autowired(required = true)
    private val restPictureRepo: RestPicturesRepo
) {
    @GetMapping
    fun allPictures(): List<RestPictures> = restPictureRepo.findAll()

    @GetMapping("/{restaurant_id}")
    fun allTablesInRestaurant(
        @PathVariable("restaurant_id") restaurantId: Int): List<RestPictures> =
        restPictureRepo.findByRestId(restaurantId)
}