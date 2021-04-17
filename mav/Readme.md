```
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

mvn archetype:generate -DgroupId=groupid -DartifactId=artifactid   
-DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=booleanValue 
```
```
mvn clean compile  
mvn package
java -cp target/evantest-1.0-SNAPSHOT.jar com.evan.App

sudo cp /home/ec2-user/Java/mav/mvnweb/mvnweb/target/mvnweb.war /usr/share/tomcat/webapps
```
```
 <plugins>
             <plugin>
    <groupId>org.apache.tomcat.maven</groupId>
    <artifactId>tomcat7-maven-plugin</artifactId>
    <version>2.2</version>
    <configuration>
      <port>9090</port>
      <path>/</path>
    </configuration>
</plugin>

mvn tomcat7:run
```

#### for springboot mvc web
```
pom.xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>
```
```
 ./mvnw spring-boot:run
 ```
 ```
 ./mvnw clean package
 ```
```
java -jar target/springweb-0.0.1-SNAPSHOT.jar
```
##### port
```
fuser 8080/tcp
fuser -k 8080/tcp
```

```
sudo update-alternatives --config java
update-alternatives --config javac
```