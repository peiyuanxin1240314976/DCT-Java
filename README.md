# temple-api

Java 17 + Spring Boot 3.3（Web / Validation / Actuator）。

## 运行

```bash
./mvnw.cmd spring-boot:run
```

健康检查示例：`GET http://localhost:8080/api/v1/health`

## 约定

- 对外 JSON 使用统一包装 `ApiResponse`（见 `com.temple.api.common.api`）。
- Cursor 规则见 `.cursor/rules/`。
