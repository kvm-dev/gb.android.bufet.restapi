package gb.android.bufet.restapi.domain.restaurants

import jakarta.persistence.*

@Entity
@Table(name = "restaurant_pictures")
data class RestPictures(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    val id: Int = 0,
    @Column(name = "rest_id")
    val restId: Int = 0,
    @Column(name = "image_path")
    val imagePath: String = "any",
)