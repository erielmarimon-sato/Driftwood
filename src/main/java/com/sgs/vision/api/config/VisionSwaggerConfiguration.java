package com.sgs.vision.api.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMethod;

import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
public class VisionSwaggerConfiguration {

	
	@Bean
	  public Docket visionApi() {
		List<ResponseMessage> responseMessages = new ArrayList<>();
		String basicAuth = "Authorization : Access token required to use all the API services. Get Access Token using login  service by providing credentials";
		responseMessages.add(new ResponseMessageBuilder().message(basicAuth)
                .code(500)
                .message("500 Internal Server Error. The server encountered an unexpected condition which prevented it from fulfilling the request")
                .responseModel(new ModelRef("The server encountered an unexpected condition which prevented it from fulfilling the request"))
                .build());
		responseMessages.add(new ResponseMessageBuilder()
                .code(401)
                .message("401 Unauthorized. The request requires user authentication.")
                .responseModel(new ModelRef("The request requires user authentication."))
                .build());
		responseMessages.add(new ResponseMessageBuilder()
                .code(404)
                .message("400 Bad Request. The request could not be understood by the server due to malformed syntax.")
                .responseModel(new ModelRef("The request could not be understood by the server due to malformed syntax."))
                .build());
		responseMessages.add(new ResponseMessageBuilder()
                .code(200)
                .message("200 OK. The request has succeeded.")
                .responseModel(new ModelRef("The request has succeeded."))
                .build());
	    return new Docket(DocumentationType.SWAGGER_2)
	        .apiInfo(apiInfo())
	        .pathMapping("/")
	        .globalResponseMessage(RequestMethod.GET,responseMessages)
	        .tags(new Tag("Vision", "SATO Vision APIs"))
	        ;
	  }

	  private ApiInfo apiInfo() {
		    ApiInfo apiInfo = new ApiInfo(
		      "SATO Vision REST API",
		      "Vision Rest API docs.",
		      "0.8.5",
		      "Terms of service",
		      new Contact("SATO Global Solutions","http://www.satoglobalsolutions.com/", "info@satoglobalsolutions.com"),
		      "License of API",
		      "http://www.satoglobalsolutions.com/privacy.php");
		    return apiInfo;
		}
}
