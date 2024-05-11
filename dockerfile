FROM openjdk:17

WORKDIR /app

COPY ${JAR_FILE} app.war

EXPOSE 8080

CMD ["java", "-war", "SB-Electricity-Hibernate-0.0.1-SNAPSHOT.war"]
