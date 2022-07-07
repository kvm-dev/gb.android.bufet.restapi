package gb.android.bufet.restapi.domain.restaurants.pictures

import org.springframework.data.jpa.repository.JpaRepository

interface RestPicturesRepo : JpaRepository<RestPictures, Int> {
    fun findByRestaurantId(id: Int): List<RestPictures>
}