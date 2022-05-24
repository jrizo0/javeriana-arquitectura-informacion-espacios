From tomcat:8.0.51-jre8-alpine
CMD ["catalina.sh","run"]
RUN rm -rf /usr/local/tomcat/webapps/*
COPY ./target/webapp.war /usr/local/tomcat/webapps/ROOT.war
