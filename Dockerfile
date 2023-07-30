FROM tomcat:9.0.76-jdk21-openjdk-slim-bullseye

LABEL maintainer="jdiciocc@gmu.edu"

#COPY  ./server.xml /usr/local/tomcat/conf/server.xml
COPY  ./src/main/resources/application.properties /usr/local/tomcat/conf

RUN echo "# Add app_conf to Tomcat CLASSPATH" > $CATALINA_HOME/bin/setenv.sh
RUN echo "CLASSPATH=\$CATALINA_HOME/app_conf/" >> $CATALINA_HOME/bin/setenv.sh
RUN chmod 750 $CATALINA_HOME/bin/setenv.sh

EXPOSE 8080

COPY  ./target/assignment3.war /usr/local/tomcat/webapps/

#CMD [ "catalina.sh", "run" ]
CMD ["bash"]