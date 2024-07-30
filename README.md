# 🌱 스프링부트 핵심가이드 프로젝트

> 스프링부트 핵심가이드 책에 나오는 코드를 직접쳐가며 스프링부트 사용법에 대해 알아보는 프로젝트입니다.


![Front-end](https://skillicons.dev/icons?i=idea,java,gradle,spring,git)<br>

## 🛠️ Development Environment
- 🖥️ **Intellij IDEA Ultimate**
- ☕ **Java 17**
- ☕ **Jdk 17**
- 🔧 **Gradle 8.8**
- 🌱 **Spring Boot 3.3.2**

- ## 🧰 Tech Stack
- **Frameworks & Libraries**: Spring Boot, Spring Security, Spring Data JPA, Spring Web, Spring Configuration Processor
- **Databases**: H2, MariaDB
- **Utilities**: Lombok, Logback, Swagger, Jacoco

## 📖 API Documentation 
### [Swagger로 API 테스트](http://localhost:8080/swagger-ui/index.html)

|Swagger|
|------|
![swagger](https://github.com/user-attachments/assets/afe93fdc-4005-4f0b-a99a-09937cf243b9)


### 🔐 /product

<details>
<summary>상품 조회 API</summary>
  
- **GET** /product
  - 상품 번호로 상품을 조회합니다.
  - `number` 파라미터로 상품 번호를 받아 해당 상품 정보를 반환합니다.
  - 응답 예시:
    - 성공: 200 OK
      ```json
      {
          "number": 123,
          "name": "펜",
          "price": 1000,
          "stock": 1234
      }
      ```
    - 실패: 404 Not Found
      ```json
      {
          "error": "상품을 찾을 수 없습니다."
      }
      ```
</details>

<details>
<summary>상품 생성 API</summary>

- **POST** /product
  - 새로운 상품을 생성합니다.
  - `ProductDto` 형태의 JSON 데이터를 받아 새로운 상품을 생성합니다.
  - 응답 예시:
    - 성공: 200 OK
      ```json
      {
          "number": 123,
          "name": "펜",
          "price": 1000,
          "stock": 1234
      }
      ```
    - 실패: 400 Bad Request
      ```json
      {
          "error": "잘못된 요청입니다."
      }
      ```
</details>

<details>
<summary>상품 이름 변경 API</summary>

- **PUT** /product
  - 상품의 이름을 변경합니다.
  - `ChangeProductNameDto` 형태의 JSON 데이터를 받아 상품의 이름을 변경합니다.
  - 응답 예시:
    - 성공: 200 OK
      ```json
      {
          "number": 123,
          "name": "새로운 이름",
          "price": 1000,
          "stock": 1234
      }
      ```
    - 실패: 404 Not Found
      ```json
      {
          "error": "상품을 찾을 수 없습니다."
      }
      ```
</details>

<details>
<summary>상품 삭제 API</summary>

- **DELETE** /product
  - 상품 번호로 상품을 삭제합니다.
  - `number` 파라미터로 상품 번호를 받아 해당 상품을 삭제합니다.
  - 응답 예시:
    - 성공: 200 OK
      ```json
      {
          "message": "정상적으로 삭제되었습니다."
      }
      ```
    - 실패: 404 Not Found
      ```json
      {
          "error": "상품을 찾을 수 없습니다."
      }
      ```
</details>

## 🚦Jacoco 실행화면

| test | jacocoTestReport |
|------|------------------|
| <img src="https://github.com/user-attachments/assets/b08a1c0f-3d84-4ed6-940c-c5de990d03a1" width="400"> | <img src="https://github.com/user-attachments/assets/a4e5a717-f3fe-46d4-be79-92dfeb76e7b5" width="400"> |
| jacocoTestCoverageVerification | 테스트 커버리지 퍼센트|
| <img src="https://github.com/user-attachments/assets/850125a1-c8d5-4a7c-955b-c336e9b1032e" width="400"> | <img src="src/images/jacoco.png" width="400"> |

### Gradle과 Jacoco를 사용한 테스트 및 커버리지 리포트 생성 가이드

1. **전체 테스트 실행**:
   - Gradle 탭을 엽니다.
   - `jacoco -> verification -> test`를 선택하여 전체 테스트를 실행합니다.

2. **테스트 리포트 생성**:
   - `jacocoTestReport`를 누르면 테스트 결과로 리포트가 생성됩니다.

3. **커버리지 기준 확인**:
   - 커버리지가 원하는 기준에 도달했는지 확인하기 위해 `jacocoTestCoverageVerification`을 클릭합니다.

4. **결과 리포트 확인**:
   - 결과 리포트는 Gradle에서 설정한 경로에 생성됩니다.
   - `index.html` 파일을 열어 커버리지 퍼센트를 확인할 수 있습니다.

