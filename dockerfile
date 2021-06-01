FROM openjdk:8
ADD niasp-0.0.1.jar /
ENV JAVA_OPTS -Xms256m -Xmx512m
ENTRYPOINT []
CMD java -jar niasp-0.0.1.jar -port=$PORT
