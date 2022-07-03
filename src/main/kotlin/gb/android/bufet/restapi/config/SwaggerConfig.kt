package gb.android.bufet.restapi.config

import io.swagger.v3.oas.models.OpenAPI
import org.springframework.context.annotation.Bean
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@EnableWebMvc

class SwaggerConfig {
    @Bean
    fun springShopOpenAPI(): OpenAPI? {
        return OpenAPI()
    }

}