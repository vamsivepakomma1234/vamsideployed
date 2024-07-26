FROM eclipse-temurin:latest						
RUN pwd						
RUN ls -al						
RUN dir						
COPY  target/doctorsapp-0.0.1-SNAPSHOT.jar /doctorsapp/doctorsapp.jar					
WORKDIR /doctorsapp
RUN pwd
RUN ls -al
CMD ["java", "-jar", "doctorsapp.jar"]