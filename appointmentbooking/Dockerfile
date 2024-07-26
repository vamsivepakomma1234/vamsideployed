FROM eclipse-temurin:latest						
RUN pwd						
RUN ls -al						
RUN dir						
COPY  target/appointmentbooking-0.0.1-SNAPSHOT.jar /appointmentbooking/appointmentbooking.jar					
WORKDIR /appointmentbooking
RUN pwd
RUN ls -al
CMD ["java", "-jar", "appointmentbooking.jar"]