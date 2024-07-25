FROM eclipse-temurin:latest						
RUN pwd						
RUN ls -al						
RUN dir						
COPY  target/eurekaserver-0.0.1-SNAPSHOT.jar /eurekaserver/eurekaserver.jar					
WORKDIR /eurekaserver
RUN pwd
RUN ls -al
CMD ["java", "-jar", "eurekaserver.jar"]