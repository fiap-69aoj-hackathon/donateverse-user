FROM openjdk:11.0-jdk-slim

LABEL source="https://github.com/fiap-69aoj-hackathon/donateverse-user" \
      maintainer="flavioso16@gmail.com"

ADD ./target/user-0.0.1-SNAPSHOT.jar user.jar
ADD ./docker-entrypoint.sh /

RUN chmod +x /docker-entrypoint.sh

EXPOSE 8080

ENTRYPOINT ["/docker-entrypoint.sh"]