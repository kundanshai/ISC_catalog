package com.equant.flip.swager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	/**
	 * Posts api.
	 *
	 * @return the docket
	 */
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2)
		.groupName("webservice-server")
        .apiInfo(apiInfo())
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.equant.flip.controller"))
        .build();
	}

	

	/**
	 * Api info.
	 *
	 * @return the api info
	 */
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("RESOURCE CATALOG MANAGMENT API")
				.description("RESOURCE CATALOG MANAGMENT API")
				.termsOfServiceUrl("See more at")
				.licenseUrl("https://www.orange.com").version("1.0").build();
		
	}

}
