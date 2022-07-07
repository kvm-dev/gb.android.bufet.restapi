package gb.android.bufet.restapi.data

import gb.android.bufet.restapi.domain.advertise.Advertise
import gb.android.bufet.restapi.domain.advertise.AdvertiseRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("advertise")
class AdvertiseController(
    @Autowired(required = true)
    private val advertiseRepo: AdvertiseRepository
) {
    @GetMapping
    fun allAdvertise():List<Advertise> = advertiseRepo.findAll()
}