FROM ubuntu:vivid

MAINTAINER "Coduno <team@cod.uno>"

RUN apt-get update && apt-get -y install curl git
RUN curl -s -L https://coduno.github.io/cli/install.sh | tee | bash -s - -y

ONBUILD WORKDIR /run
ONBUILD ENTRYPOINT ["/bin/bash", "-c", "coduno prepare < /dev/null > prepare.log && coduno run --stats"]
