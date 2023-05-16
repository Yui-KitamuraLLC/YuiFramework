# YuiFramework
![Apache License, Version 2.0, January 2004](https://img.shields.io/github/license/apache/maven.svg?label=License)
![GitHub Workflow Status](https://img.shields.io/github/actions/workflow/status/Yui-KitamuraLLC/YuiFramework/buildJar.yml)
![GitHub top language](https://img.shields.io/github/languages/top/Yui-KitamuraLLC/YuiFramework)
![GitHub all releases](https://img.shields.io/github/downloads/Yui-KitamuraLLC/YuiFramework/total)
![GitHub repo size](https://img.shields.io/github/repo-size/Yui-KitamuraLLC/YuiFramework)
![GitHub issues](https://img.shields.io/github/issues/Yui-KitamuraLLC/YuiFramework)

Java Utilities framework 
Provided by [Yui-Kitamura LLC.](https://yui.eng.pro/llc/) ![GitHub Sponsors](https://img.shields.io/github/sponsors/Yui-KitamuraLLC)  

## How to use
We host the releases on [Maven Central](https://mvnrepository.com/artifact/pro.eng.yui/YuiFramework)  
So please use the **latest** if you don`t have any special issue.  
![Maven Central](https://img.shields.io/maven-central/v/pro.eng.yui/YuiFramework.svg?label=Maven%20Central)

### pom.xml
```xml
<dependency>
    <!-- https://mvnrepository.com/artifact/pro.eng.yui/YuiFramework -->
    <groupId>pro.eng.yui</groupId>
    <artifactId>YuiFramework</artifactId>
    <version>1.0.0-SNAPSHOT-005</version>
</dependency>
```
### module-info.java
```java
module yourModuleName {
   require pro.eng.yui.YuiFramework;
   ...
```
### in-your-source.java
```java
YuiFrame.StringUtils.eq(arg1, arg2);
```

## JavaDoc
You can see the JavaDocs in [our JavaDoc site](https://yui-kitamurallc.github.io/YuiFramework/)  

