From payara/micro:latest

#RUN wget -O /opt/payara/deployments/database-connector.jar http://central.maven.org/maven2/org/apache/derby/derbyclient/10.14.1.0/derbyclient-10.14.1.0.jar

#para glassfish full
#COPY ./target/webapp.war /opt/payara41/glassfish/domains/domain1/autodeploy/

#para glassfish micro
COPY ./target/webapp.war /opt/payara/deployments/
#Default command to execute
#ENTRYPOINT ["--deploy","/opt/payara/deployments/webapp.war"]


#From tomcat:8.0.51-jre8-alpine
#CMD ["catalina.sh","run"]
#RUN rm -rf /usr/local/tomcat/webapps/*
#COPY ./target/webapp.war /usr/local/tomcat/webapps/ROOT.war
