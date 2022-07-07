package gb.android.bufet.restapi.data

import gb.android.bufet.restapi.domain.restaurants.food.FoodRepository
import gb.android.bufet.restapi.domain.global.RestaurantNoTable
import gb.android.bufet.restapi.domain.restaurants.RestaurantRepository
import gb.android.bufet.restapi.domain.restaurants.pictures.RestPicturesRepo
import gb.android.bufet.restapi.domain.restaurants.tables.RestaurantTablesRepository

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("fullrest")

@Tag(description = "get full restaurants list with tables", name = "main controller")
class RestaurantFullQueryController(
    @Autowired(required = true)
    private val restaurantRepository: RestaurantRepository,
    private val restaurantTablesRepository: RestaurantTablesRepository,
    private val foodRepo: FoodRepository,
    private val picturesRepo: RestPicturesRepo
) {

    @GetMapping
    @Operation(description = "get all")
    fun allRest(): ArrayList<RestaurantNoTable?> {
        val count: Int = restaurantRepository.count().toInt()
        val rest = arrayListOf<RestaurantNoTable?>()
        for (i in 0..count) {

            var fullQueryRest = RestaurantNoTable()
            val tmprest = restaurantRepository.findByIdOrNull(i)
            fullQueryRest.apply {
                id = tmprest?.id
                name = tmprest?.name
                description = tmprest?.description
                type = tmprest?.type
                headerImage = tmprest?.headerImage
                work_start = tmprest?.work_start
                work_end = tmprest?.work_end
                fullQueryRest.restaurantTables = restaurantTablesRepository.findByRestaurantId(i)
                fullQueryRest.restaurantPictures = picturesRepo.findByRestaurantId(i)
                fullQueryRest.restaurantFood = foodRepo.findByRestaurantId(i)
            }
            rest.add(fullQueryRest)
        }
        return rest
    }
}