FROM coduno/base
RUN apt-get update -y && apt-get install -y openjdk-8-jdk gradle
RUN mkdir -p /run/src/main/java /run/src/test/java /run/build
ADD build.gradle /run/build.gradle
ADD coduno.yaml /run/coduno.yaml
RUN gradle --refresh-dependencies test
