package com.qf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * @version 1.0
 * @author: qc
 * @date 2023/8/7 19:46
 */
@Configuration
@EnableSwagger2WebMvc
public class SwaggerConfig {

    /**
     * 创建API应用
     * apiInfo() 增加API相关信息
     * 通过select()函数返回一个ApiSelectorBuilder实例,用来控制哪些接口暴露给Swagger来展现，
     * 本例采用指定扫描的包路径来定义指定要建立API的目录。
     *
     * @return
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.qf.controller"))
                .paths(PathSelectors.any())
                .build();
    }
// 访问地址：http://localhost:8088/swagger-ui/index.html 老的依赖是Swagger
//    访问地址http://localhost:8088/doc.html 依赖是knife4j springboot2版本的

    /**
     * 创建该API的基本信息（这些基本信息会展现在文档页面中）
     * 访问地址：http://项目实际地址/swagger-ui.html
     *
     * @return
     */
    private ApiInfo apiInfo() {

//联系人基本信息
        Contact contact = new Contact("王不二", "url", "qc@aliyun.com");

        return new ApiInfoBuilder()
                .title("事件项目 --Swagger构建API文档")
                .description("更多请关注http://www.nbwz.com")
                .termsOfServiceUrl("http://www.nbwz.com")
                .contact(contact)
                .version("1.0")
                .build();
    }
}
