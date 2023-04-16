FROM openjdk:17
VOLUME /tmp
ADD ./target/linguagens-api-0.0.1-SNAPSHOT.jar linguagens-api.jar
ENTRYPOINT ["java","-jar","/linguagens-api.jar"]