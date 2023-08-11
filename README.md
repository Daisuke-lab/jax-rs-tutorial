
## Take Away

- jax-rsはpackageがばらばらでもpomのgroupIdが一致していれば@Pathを探知してくれる。(ex. com.example.demo.mainに@ApplicationPathを定義して、com.example.demo.apiに@Pathを定義していても以下の条件を満たしていればpathとして探知してくれる。)
- 古いtomcat等では使えない。
- warの中のWEB-INF/libに入っていて、groupIdが一致しているものはそれも探知してくれる。
- localのmavenをlocalのrepoにdeployするときはmvn install (not mvn deploy)
- localpathをsystem scopeで無理やり指定してpomのdependencyに入れるやり方だとWEB-INF/classesの方にjarが取り込まれ、きちんと@Pathが認識されない。

## Build
```
docker build . -t jax-rs-build-artifacts
docker run -v %cd%/target:/root/workspace/main/target jax-rs-build-artifacts
```
👇
target/main-1.warが獲得できる。

## Deploy
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

- Restart Container
```
docker restart demo
```

後はadmin consoleからdeploy。



## Meta
 ```
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
