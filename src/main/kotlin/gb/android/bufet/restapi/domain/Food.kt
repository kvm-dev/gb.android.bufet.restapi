package gb.android.bufet.restapi.domain

import jakarta.persistence.*

@Entity
@Table(name = "food")
data class Food(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    val id: Int = 0,
    @Column(name = "type")
    val type: String = "any",
    @Column(name = "name")
    val name: String = "any",
    @Column(name = "pictures")
    val pictures: String? = "blanc",
    @Column(name = "price")
    val price: String = "0"
)