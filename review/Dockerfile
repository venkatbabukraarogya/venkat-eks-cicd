FROM amazoncorretto:latest
VOLUME /tmp
ADD target/review-1.0-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]