# Java DevOps Checklist

## Основы Java и JVM
- [ ] Понимаю, что Java-компилятор превращает код в байт-код (.class / .jar).
- [ ] Знаю, как запускаются Java-приложения (`java -jar app.jar`).
- [ ] Понимаю, что такое JVM и как задаются параметры (`-Xms`, `-Xmx`, `-XX`).

## Управление памятью и производительностью
- [ ] Умею выставлять лимиты для Java-приложения: `-Xmx` и `-Xms`.
- [ ] Понимаю, как работает Garbage Collector (GC) и где смотреть логи GC.
- [ ] Могу диагностировать ошибки OOM и memory leak по логам и метрикам.

## Сетевые настройки
- [ ] Понимаю, как Java-приложение слушает порты (`server.port`, `application.yml`).
- [ ] Могу настроить health-check для Java-сервиса.
- [ ] Умею проверять подключения с помощью `ss`, `lsof`, `curl`.

## Логирование
- [ ] Знаю, как настраиваются Java-логи (`Logback`, `Log4j`, `SLF4J`).
- [ ] Умею читать Java `stack trace` и быстро определять причину ошибок.
- [ ] Настроил ротацию логов для Java-приложения.

## JDK / JRE и сборка
- [ ] Знаю разницу между JDK и JRE.
- [ ] Умею собирать Java-приложения с помощью Maven / Gradle.
- [ ] Понимаю зависимость приложения от версии JDK.

## Контейнеризация Java
- [ ] Умею писать `Dockerfile` для Java-приложения.
- [ ] Понимаю, как настраивать JVM в контейнере.
- [ ] Знаю особенности slim-образов и multi-stage build для Java.

## Конфигурация и переменные окружения
- [ ] Умею передавать переменные окружения и параметры (`-Dparam=value`).
- [ ] Понимаю логику Spring Boot `application.yml` / `application.properties`.
- [ ] Настроил секреты и переменные для окружений (`.env`, Vault, K8s Secrets`).

## CI/CD для Java
- [ ] Умею собирать `jar` и `war` файлы на CI-сервере.
- [ ] Настроил деплой Java-приложения через GitLab CI / Jenkins.
- [ ] Внедрил проверки (`Unit`, `Integration`, `Lint`) в pipeline.

## Безопасность и Секреты
- [ ] Изучил Spring Cloud Config, Vault, K8s Secrets.
- [ ] Настроил secure storage переменных.
- [ ] Понимаю OWASP для Java-приложений.

---

# Roadmap

## Этап 1 — Основа Java и JVM
- [ ] Жизненный цикл Java-приложения.
- [ ] Параметры запуска JVM (`-Xmx`, `-Xms`, `-XX:+UseG1GC`).
- [ ] Собрал всю информацию [тут](https://github.com/alexandreevich/Cheklists/blob/main/Java_main.md)

## Этап 2 — Мониторинг и Тюнинг
- [ ] Логи GC и диагностика (`jstat`, `jmap`, `jstack`).
- [ ] Интеграция с Prometheus + JMX Exporter.

## Этап 3 — Логирование и Алёртинг
- [ ] Конфигурация Logback / Log4j.
- [ ] Интеграция с ELK или Grafana Loki.

## Этап 4 — Контейнеризация
- [ ] Dockerfile для Java.
- [ ] Multi-stage build.

## Этап 5 — CI/CD
- [ ] Сборка jar на Jenkins/GitLab.
- [ ] Деплой с Ansible, Helm, systemd.

## Этап 6 — Безопасность
- [ ] Spring Cloud Config.
- [ ] Vault, K8s Secrets.
- [ ] OWASP для Java-приложений.

---
