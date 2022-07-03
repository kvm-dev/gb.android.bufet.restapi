package gb.android.bufet.restapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication

@SpringBootApplication
@EntityScan("gb.android.bufet.restapi.domain")
class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}
