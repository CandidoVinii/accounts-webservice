FROM openjdk:11-jdk

WORKDIR /app

COPY target/accounts-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]