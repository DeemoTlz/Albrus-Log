SLF4J作为日志门面（接口），程序中应尽量使用SLF4J接口输出日志：

```java
Logger logger = LoggerFactory.getLogger(Xxx.class);
```

pom:

```java
slf4j-log4j12: slf4j的log4j实现；
log4j-slf4j-impl: slf4j的log4j2实现，若使用LOG4J2作为日志框架，仅导入此jar即可（会附属导入SLF4J jar包）；
log4j-over-slf4j: 将LOG4J转为SLF4J API调用（统一第三方类库日志框架不一致时导入）；
```




    