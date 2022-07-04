package gb.android.bufet.restapi.domain.advertise

import jakarta.persistence.*

@Entity
@Table(name = "advertise")
data class Advertise(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    val id: Int = 0,
    @Column(name = "title")
    val title: String = "default",
    @Column(name = "description")
    val description: String = "any",
    @Column(name = "image")
    val image: String? = "blanc",
    @Column(name = "active")
    val isActive: Boolean = false
)