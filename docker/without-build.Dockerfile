FROM openjdk:17 as RUN-APPS
LABEL DEVELOPER="gamardy@gmail.com"
LABEL APPS-NAME="dukcapil-validation-service"
USER root
WORKDIR /apps

COPY target/*.jar /apps/app.jar
RUN ls -ltr
ENTRYPOINT [ "java","-jar","app.jar"]
