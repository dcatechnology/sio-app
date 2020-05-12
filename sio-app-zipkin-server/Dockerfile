FROM openjdk:8
VOLUME /tmp
EXPOSE 9411
ADD ./zipkin-server-2.21.1-exec.jar sio-zipkin-server.jar
ENTRYPOINT ["java","-jar","/sio-zipkin-server.jar"]