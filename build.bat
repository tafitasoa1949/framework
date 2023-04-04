jar cvf framework.jar -C framework\build\web\WEB-INF\classes ETU2059
copy framework.jar test_framework\build\web\WEB-INF\lib\
jar cvf framework.war -C framework\build\web .
copy framework.war C:\Program Files\Apache Software Foundation\Tomcat 9.0\webapps\