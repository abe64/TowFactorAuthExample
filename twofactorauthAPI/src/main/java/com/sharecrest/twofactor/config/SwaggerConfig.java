package com.sharecrest.twofactor.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.common.collect.Lists;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket swaggerSpringMvcPlugin() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.regex("^\\/api/.*"))		// APIとして判定したいURL
					.build()
				.useDefaultResponseMessages(false)							// trueにするとmethod毎に200,201などのデフォルトステータスまで出力してしまう
				.genericModelSubstitutes(ResponseEntity.class)				// ResponseEntity<>で指定されている場合にResponseEntityのメンバを無視させる
				// A各リクエストメソッド毎にデフォルトのステータスコードと返却値の型、概要を設定
				.globalResponseMessage(RequestMethod.GET,
						Lists.newArrayList(
									new ResponseMessageBuilder().code(200).message("OK").build(),
									new ResponseMessageBuilder().code(404).message("データが存在しません").build()
								))
				.globalResponseMessage(RequestMethod.POST,
						Lists.newArrayList(
									new ResponseMessageBuilder().code(200).message("作成されました").build(),
									new ResponseMessageBuilder().code(404).message("データが存在しません").build()
								))
				.globalResponseMessage(RequestMethod.PUT,
						Lists.newArrayList(
									new ResponseMessageBuilder().code(200).message("更新されました").build(),
									new ResponseMessageBuilder().code(404).message("データが存在しません").build()
								))
				.globalResponseMessage(RequestMethod.DELETE,
						Lists.newArrayList(
									new ResponseMessageBuilder().code(200).message("削除されました").build(),
									new ResponseMessageBuilder().code(404).message("データが存在しません").build()
								))
				.apiInfo(apiInfo())
			;
	}

	@SuppressWarnings("rawtypes")
	private ApiInfo apiInfo() {
		return new ApiInfo(
				"2段階認証試用アプリ",
				"API",
				"v1",
				"????",
				new Contact(
						"シェアクレスト株式会社",
						"https://www.sharecrest.com/",
						"abe@sharecrest.com"),
				"とりあえず内部使用なんでライセンス関連ないです",
				"",
				new ArrayList<VendorExtension>()
			);
	}
}
