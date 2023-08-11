FROM maven:3.6.3-jdk-11

RUN mkdir -p /root/workspace
COPY . /root/workspace/
WORKDIR /root/workspace
VOLUME /root/workspace/target


RUN mvn install -f api/pom.xml
RUN mvn install -f common/pom.xml
RUN mvn install -f experiment/pom.xml


CMD mvn package -f main/pom.xml