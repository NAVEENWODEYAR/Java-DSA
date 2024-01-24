#Dockerfile.,

FROM openjdk:21
RUN mkdir /usr/app/ 
COPY target/DSA-App.jar /usr/app 
WORKDIR /usr/app/ 
ENTRYPOINT [ "java","-jar","DSA-App.jar" ]