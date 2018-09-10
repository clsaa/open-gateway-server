FROM java:8
ADD open-gateway-server-1.0-SNAPSHOT.jar open-gateway-server.jar
RUN sh -c 'touch /open-gateway-server.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java -Xmx64M $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /open-gateway-server.jar" ]