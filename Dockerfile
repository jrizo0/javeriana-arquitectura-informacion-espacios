#From payara/micro:latest
From payara/server:latest

#Get db connector
#RUN wget -O /opt/payara/deployments/database-connector.jar http://central.maven.org/maven2/org/apache/derby/derbyclient/10.14.1.0/derbyclient-10.14.1.0.jar

#Glassfish full
COPY ./target/webapp.war /opt/payara41/glassfish/domains/domain1/autodeploy/

#Glassfish micro
#COPY ./target/webapp.war /opt/payara/deployments/
#Default command to execute
#ENTRYPOINT ["--deploy","/opt/payara/deployments/webapp.war"]

#Tomcat
#From tomcat:8.0.51-jre8-alpine
#CMD ["catalina.sh","run"]
#RUN rm -rf /usr/local/tomcat/webapps/*
#COPY ./target/webapp.war /usr/local/tomcat/webapps/ROOT.war
