FROM openjdk:8
ADD target/labfat.jar labfat.jar
ENTRYPOINT ["java", "-jar","labfat.jar"]
EXPOSE 8080