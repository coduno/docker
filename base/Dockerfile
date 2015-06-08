FROM ubuntu:vivid

MAINTAINER "Coduno <team@cod.uno>"

RUN apt-get -y install curl git
RUN curl -s https://coduno.github.io/cli/install.sh | bash -s - -y

WORKDIR /run

ENTRYPOINT ["/bin/bash", "-c", "coduno prepare > prepare.log && coduno run --stats"]
