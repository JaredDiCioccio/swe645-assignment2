FROM tomcat:9.0.76-jdk21-openjdk-slim-bullseye

LABEL maintainer=”jdiciocc@gmu.edu”

ADD ./target/assignment1.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD [ "catalina.sh", "run" ]
