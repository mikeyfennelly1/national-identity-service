FROM ubuntu:latest
LABEL authors="mfennelly"

FROM gradle:7.6-jdk17 AS builder

WORKDIR /app
COPY build.gradle.kts settings.gradle.kts /app/

COPY src /app/src

RUN gradle build --no-daemon

FROM openjdk:17-jdk-slim AS runtime

WORKDIR /app

COPY --from=builder /app/build/libs/*.jar /app/app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]