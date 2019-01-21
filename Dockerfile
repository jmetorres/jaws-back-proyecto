FROM openjdk:8-jdk-alpine
LABEL maintainer="josemanuel.0095@gmail.com"
WORKDIR /workspace
ADD target/api*.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /workspace/app.jar
EXPOSE 8080
