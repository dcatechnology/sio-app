FROM openjdk:8
VOLUME /tmp
EXPOSE 8888
ADD ./build/libs/sio-app-config-server-0.0.1-SNAPSHOT.jar sio-config-server.jar
ENTRYPOINT ["java","-jar","/sio-config-server.jar"]