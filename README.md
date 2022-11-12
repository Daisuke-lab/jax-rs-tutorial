
## Meta
 ```aidl
java :
java version "11.0.11" 2021-04-20 LTS
Java(TM) SE Runtime Environment 18.9 (build 11.0.11+9-LTS-194)
Java HotSpot(TM) 64-Bit Server VM 18.9 (build 11.0.11+9-LTS-194, mixed mode)


maven:
Apache Maven 3.8.6 (84538c9988a25aec085021c365c560670ad80f63)
Maven home: C:\tools\apache-maven-3.8.6
Java version: 11.0.11, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-11.0.11
Default locale: en_GB, platform encoding: MS932
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"

```

## Wildfly
- run
```
docker run -d --name demo -p 8080:8080 -p 9990:9990 ^
jboss/wildfly /opt/jboss/wildfly/bin/standalone.sh ^
-b=0.0.0.0 -bmanagement=0.0.0.0
```

- Create user
```
docker exec demo /opt/jboss/wildfly/bin/add-user.sh root root --silent
```

