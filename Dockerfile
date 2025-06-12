FROM openjdk:21-jdk-slim

RUN addgroup --system spring && adduser --system --ingroup spring spring

ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app

USER spring:spring

# Optional: Healthcheck (adjust URL/path if using Spring Boot Actuator)
# HEALTHCHECK --interval=30s --timeout=5s --start-period=10s \
#   CMD wget --spider -q http://localhost:8080/actuator/health || exit 1

ENTRYPOINT ["java","-cp","app:app/lib/*","com.nuach_server.Main"]
