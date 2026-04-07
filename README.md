# temple-api

Java 17 + Spring Boot 3.3（Web / Validation / Actuator）、MySQL、Flyway、MyBatis-Plus。

## 设计流程（与前端共用）

若工作区包含上级目录 `docs/`，请先阅读：

- `docs/DESIGN_PROCESS.md` — 设计—开发流程（必须遵守）
- `docs/P0_PLAN.md` — P0 范围与验收
- `docs/API_P0.md` — 接口基线

## 本地数据库

```bash
docker compose up -d
```

默认连接：`127.0.0.1:3306`，库名 `temple`，用户/密码 `temple`/`temple`（见 `application-dev.yml`，可用环境变量覆盖）。

## 运行

```bash
./mvnw.cmd spring-boot:run
```

示例：`GET http://localhost:8080/api/v1/health`、`GET http://localhost:8080/api/v1/temples`

## 约定

- 对外 JSON 使用统一包装 `ApiResponse`（见 `com.temple.api.common.api`）。
- 表结构仅通过 `src/main/resources/db/migration` 变更。
- Cursor 规则见 `.cursor/rules/`。
