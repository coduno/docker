FROM coduno/base
RUN apt-get install -y openjdk-8-jdk gradle

RUN cd /tests && gradle --refresh-dependencies test
