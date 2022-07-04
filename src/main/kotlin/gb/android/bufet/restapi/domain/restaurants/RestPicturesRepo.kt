package gb.android.bufet.restapi.domain.restaurants

import gb.android.bufet.restapi.domain.tables.RestaurantTables
import org.springframework.data.jpa.repository.JpaRepository

interface RestPicturesRepo : JpaRepository<RestPictures, Int> {
    fun findByRestId(id: Int): List<RestPictures>
}