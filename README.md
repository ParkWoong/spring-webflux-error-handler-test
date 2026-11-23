# WebFlux error response / WebFlux 오류 응답

[ENG](#eng) | [KR](#kr)

## ENG

### Project structure

```text
pom.xml
src/main/java/io/github/parkwoong/webflux/Application.java
src/main/java/io/github/parkwoong/webflux/error/component/CustomWebExceptionHandler.java
src/main/java/io/github/parkwoong/webflux/error/constant/ErrorProperty.java
src/main/java/io/github/parkwoong/webflux/handler/SampleHandler.java
src/main/resources/application.properties
src/test/java/io/github/parkwoong/webflux/ErrorHandlerTest.java
```

### Code explanation

`CustomWebExceptionHandler` handles errors from functional routes. It reads the HTTP status, error name, and message, then returns a small JSON response. `ErrorProperty` defines the response field names. `SampleHandler` raises a sample 400 error at GET `/sample/error`.

### Run and test

```sh
java -version
mvn clean verify
mvn spring-boot:run
```

Use JDK 8 and Maven 3.6.3+. `mvn clean verify` starts a local test server and checks the JSON response. `mvn spring-boot:run` starts on 127.0.0.1:8080; call `curl -i http://127.0.0.1:8080/sample/error`.

## KR

### 프로젝트 구조

```text
pom.xml
src/main/java/io/github/parkwoong/webflux/Application.java
src/main/java/io/github/parkwoong/webflux/error/component/CustomWebExceptionHandler.java
src/main/java/io/github/parkwoong/webflux/error/constant/ErrorProperty.java
src/main/java/io/github/parkwoong/webflux/handler/SampleHandler.java
src/main/resources/application.properties
src/test/java/io/github/parkwoong/webflux/ErrorHandlerTest.java
```

### 코드 설명

`CustomWebExceptionHandler`가 함수형 라우트의 오류를 처리합니다. HTTP 상태, 오류 이름, 메시지를 읽어 간단한 JSON 응답을 만듭니다. `ErrorProperty`는 응답 필드 이름을 정의합니다. `SampleHandler`는 GET `/sample/error`에서 샘플 400 오류를 발생시킵니다.

### 실행과 테스트

```sh
java -version
mvn clean verify
mvn spring-boot:run
```

JDK 8과 Maven 3.6.3 이상을 사용합니다. `mvn clean verify`는 로컬 테스트 서버에서 JSON 오류 응답을 확인합니다. `mvn spring-boot:run`은 127.0.0.1:8080에서 실행되며 `curl -i http://127.0.0.1:8080/sample/error`로 확인할 수 있습니다.
