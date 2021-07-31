FROM openjdk:8
ADD target/Audit-Benchmark.jar Audit-Benchmark.jar
EXPOSE 9300
ENTRYPOINT ["java","-jar","Audit-Benchmark.jar"]
