package sombrero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * 스프링 부트가 자동 설정을 지원하는 템플릿 엔진 (뷰 생성, 코드 제너레이션, 이메일 템플릿)
     * ● FreeMarker
     * ● Groovy
     * ● Thymeleaf
     * ● Mustache
     *
     * JSP는 jar로 패키징이 안되고 war만 패키징 가능. (undertow는 JSP 지원안함.)
     *
     */

    /**
     * Thymeleaf
     * 의존성 추가.
     * 템플릿 파일 위치: /src/main/resources/template/
     */
}
