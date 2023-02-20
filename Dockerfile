FROM bladex/alpine-java:openjdk8-openj9_cn_slim

MAINTAINER crush_ing@163.com

RUN mkdir -p /blade

WORKDIR /blade

EXPOSE 8090

ADD ./target/welfare_lottery_platform-1.0-SNAPSHOT.jar ./app.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]
