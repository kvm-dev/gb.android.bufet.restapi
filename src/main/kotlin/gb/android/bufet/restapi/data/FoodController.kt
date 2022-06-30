package gb.android.bufet.restapi.data

import gb.android.bufet.restapi.domain.Food
import gb.android.bufet.restapi.domain.FoodRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("food")
class FoodController(
    @Autowired(required = true)
    private val foodRepo: FoodRepository
) {
    @GetMapping
    fun allFood():List<Food> = foodRepo.findAll()
}