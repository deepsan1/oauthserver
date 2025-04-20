FROM dvmarques/openjdk-17-jdk-alpine-with-timezone
EXPOSE 9000
ADD target/spring-boot-image-new.jar spring-boot-image-snew.jar
ENTRYPOINT [ "java","-jar","/spring-boot-image-new.jar" ]
