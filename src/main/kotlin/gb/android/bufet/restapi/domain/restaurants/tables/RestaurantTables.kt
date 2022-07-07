package gb.android.bufet.restapi.domain.restaurants.tables

import jakarta.persistence.*

@Entity
@Table(name = "restaurant_tables")
data class RestaurantTables(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    val id: Int = 0,
    @Column(name = "restaurant_Id")
    val restaurantId: Int = 0,
    @Column(name = "guests_count")
    val guestsCount: Int = 0,
    @Column(name = "availability")
    val availability: Int = 0,
    @Column(name = "guest_id")
    val guestId: Int? = 0
)