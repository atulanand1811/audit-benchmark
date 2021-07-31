FROM openjdk:8
ADD target/Audit-Benchmark.jar Audit-Benchmark.jar
EXPOSE 900
ENTRYPOINT ["java","-jar","Audit-Benchmark.jar"]
