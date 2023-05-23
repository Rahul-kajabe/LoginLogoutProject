FROM openjdk:8

COPY target/login_app.jar /user/app/

WORKDIR /user/app/

ENTRYPOINT ["java","-jar","login_app.jar"]