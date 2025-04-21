# 🏗️ 3️⃣ Сборка Java-приложений: Maven и Gradle

## 🧰 Maven
Maven — это сборщик и менеджер зависимостей для Java.
В Java-проекте с Maven ты всегда найдёшь файл: [pom.xml](https://github.com/alexandreevich/Cheklists/blob/main/pom.xml)

### 💡 Что делает Maven:
- Загружает библиотеки (зависимости) с Maven Central.
- Собирает JAR / WAR.
- Может запускать тесты (mvn test).
- Может строить Docker-образы (если подключён плагин).

### Базовые команды:
- mvn clean install      # сборка + установка в локальный репозиторий
- mvn package            # сборка JAR/WAR файла
- mvn test               # запустить тесты

## ⚡ Gradle
Gradle — современный и гибкий аналог Maven.
Конфиг на Groovy или Kotlin. В Java-проекте с Gradle ты найдёшь файл: [build.gradle](https://github.com/alexandreevich/Cheklists/blob/main/build.gradle)
### 💡 Что делает Gradle:
- Быстрее и умнее кэширует сборки.
- Поддерживает гибкие пайплайны.
- Подходит не только для Java, но и для Kotlin, Scala и даже Android.

### Базовые команды 
- ./gradlew build         # сборка проекта
- ./gradlew test          # запуск тестов
- ./gradlew clean build   # чистая сборка

## Что важно знать
| Maven | Gradle |
|--------|------------------------|
|Старый стандарт |Java мира	Современный и гибкий|
|XML конфигурация (pom.xml)|	Groovy / Kotlin DSL (build.gradle) |
|Более предсказуем	| Быстрее, но требует понимания плагинов |
|Упрощённая структура	| Гибкая кастомизация сборки| 
|Часто используется с Jenkins	| Часто с GitLab, GitHub Actions, Gradle Runner|
