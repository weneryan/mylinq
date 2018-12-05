FROM image.service.ob.local:5000/base/java:2.1

MAINTAINER remoting <remoting@qq.com>

# COPY target/*.jar  /data/webapps/ROOT.jar
COPY target/*.war  /opt/app.war
CMD java -jar  /opt/app.war
