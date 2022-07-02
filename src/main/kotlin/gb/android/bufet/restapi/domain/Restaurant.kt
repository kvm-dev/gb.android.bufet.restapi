package gb.android.bufet.restapi.domain


import jakarta.persistence.*
import java.sql.Date

@Entity
@Table(name = "restaurants")
data class Restaurant(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    val id: Int = 0,
    @Column(name = "name")
    val name: String = "пустой",
    @Column(name = "description")
    val description: String = "пустой",
    @Column(name = "type")
    val type: String? = null,
    @Column(name = "headerImage")
    val headerImage: String = "заглушка",
    @Column(name = "tables")
    val tables: String? = null,
    @Column(name = "work_start")
    val work_start: Date? = null,
    @Column(name = "work_end")
    val work_end: Date? = null
)