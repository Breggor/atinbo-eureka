FROM java:8
MAINTAINER breggor/breggor@163.com

VOLUME /tmp

ARG JAR_FILE
COPY target/atinbo-eureka-1.0.0-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8761
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]