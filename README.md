# General

A simple Spring Boot application designed to be run on Tomcat application server. It uses maven to build and package and targets Java Version 17.

## Installation

Installation is simple using maven.

1. `mvn install`
2. `mvn package`
3. Copy the generated `assignment1.war` file to the `webapps/` dir of your Tomcat installation.
4. Visit `your-tomcat-ip:port/assignment1` to view survey form.

### Example build output:

```
"C:\Program Files\Java\jdk-17.0.5\bin\java.exe" "-Dmaven.multiModuleProjectDirectory=C:\projects\SWE645\Assignment1 Part2" "-Dmaven.home=C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.2\plugins\maven\lib\maven3" "-Dclassworlds.conf=C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.2\plugins\maven\lib\maven3\bin\m2.conf" "-Dmaven.ext.class.path=C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.2\plugins\maven\lib\maven-event-listener.jar" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.2\lib\idea_rt.jar=55168:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.2\plugins\maven\lib\maven3\boot\plexus-classworlds-2.6.0.jar;C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.2\plugins\maven\lib\maven3\boot\plexus-classworlds.license" org.codehaus.classworlds.Launcher -Didea.version=2021.2.2 package
[INFO] Scanning for projects...
[INFO] 
[INFO] ---------------------< com.jmd.swe645:assignment1 >---------------------
[INFO] Building assignment1 0.0.2
[INFO] --------------------------------[ war ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:3.2.0:resources (default-resources) @ assignment1 ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] Copying 1 resource
[INFO] Copying 27 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.10.1:compile (default-compile) @ assignment1 ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:3.2.0:testResources (default-testResources) @ assignment1 ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] skip non existing resourceDirectory C:\projects\SWE645\Assignment1 Part2\src\test\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.10.1:testCompile (default-testCompile) @ assignment1 ---
[INFO] No sources to compile
[INFO] 
[INFO] --- maven-surefire-plugin:2.22.2:test (default-test) @ assignment1 ---
[INFO] No tests to run.
[INFO] 
[INFO] --- maven-war-plugin:3.3.2:war (default-war) @ assignment1 ---
[INFO] Packaging webapp
[INFO] Assembling webapp [assignment1] in [C:\projects\SWE645\Assignment1 Part2\target\assignment1]
[INFO] Processing war project
[INFO] Building war: C:\projects\SWE645\Assignment1 Part2\target\assignment1.war
[INFO] 
[INFO] --- spring-boot-maven-plugin:2.7.12:repackage (repackage) @ assignment1 ---
[INFO] Replacing main artifact with repackaged archive
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.698 s
[INFO] Finished at: 2023-06-02T15:23:17-04:00
[INFO] ------------------------------------------------------------------------

Process finished with exit code 0
```

### Example webpage

![image](https://github.com/JaredDiCioccio/SWE645/assets/633075/f27aab39-87ae-4b59-a721-777e5a376a04)
