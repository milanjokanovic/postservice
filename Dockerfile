FROM openjdk:latest
COPY  ./target/postservice-0.0.1-SNAPSHOT.jar post_service.jar
CMD ["java","-jar","/post_service.jar"]