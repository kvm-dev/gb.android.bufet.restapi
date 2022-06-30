package gb.android.bufet.restapi.domain

import jakarta.persistence.*

@Entity
@Table(name = "restaurant_tables")
data class RestaurantTables(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    val id: Int = 0,
    @Column(name = "restaurant_Id")
    val restaurant_Id: Int = 0,
    @Column(name = "guests_count")
    val guests_count: Int = 0,
    @Column(name = "availability")
    val availability: Int = 0,
    @Column(name = "guest_id")
    val guest_id: Int? = 0
)