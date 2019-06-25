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
     * 템플릿 파일 위치: /src/main/resources/templates/
     * 서블릿 컨테이너에 독립적인 엔진이기 때문에 뷰의 랜더링 결과 본문 내용 확인 가능.
     *
     * https://www.thymeleaf.org/
     *
     * https://www.thymeleaf.org/doc/articles/standarddialect5minutes.html
     *
     * https://github.com/thymeleaf/thymeleafexamples-stsm/blob/3.0-master/src/main/webapp/WEB-INF/templates/seedstartermng.html
     *
     *
     */
}
