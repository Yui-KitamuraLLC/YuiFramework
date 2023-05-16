# YuiFramework
[![GitHub](https://img.shields.io/github/license/Yui-KitamuraLLC/YuiFramework)](https://github.com/Yui-KitamuraLLC/YuiFramework/blob/main/LICENSE)
[![GitHub Workflow Status](https://img.shields.io/github/actions/workflow/status/Yui-KitamuraLLC/YuiFramework/buildJar.yml)](https://github.com/Yui-KitamuraLLC/YuiFramework/actions)
![GitHub top language](https://img.shields.io/github/languages/top/Yui-KitamuraLLC/YuiFramework)
![GitHub all releases](https://img.shields.io/github/downloads/Yui-KitamuraLLC/YuiFramework/total)
![GitHub repo size](https://img.shields.io/github/repo-size/Yui-KitamuraLLC/YuiFramework)
[![GitHub issues](https://img.shields.io/github/issues/Yui-KitamuraLLC/YuiFramework)](https://github.com/Yui-KitamuraLLC/YuiFramework/issues)

Java Utilities framework 
Provided by [Yui-Kitamura LLC.](https://yui.eng.pro/llc/)
[![GitHub Sponsors](https://img.shields.io/github/sponsors/Yui-KitamuraLLC)](https://github.com/sponsors/Yui-KitamuraLLC)  

## How to use
We host the releases on [Maven Central](https://mvnrepository.com/artifact/pro.eng.yui/YuiFramework)  
So please use the **latest** if you don`t have any special issue.  
[![Maven Central](https://img.shields.io/maven-central/v/pro.eng.yui/YuiFramework.svg?label=Maven%20Central)](https://central.sonatype.com/artifact/pro.eng.yui/YuiFramework)

### pom.xml
```xml
<dependency>
    <!-- https://mvnrepository.com/artifact/pro.eng.yui/YuiFramework -->
    <groupId>pro.eng.yui</groupId>
    <artifactId>YuiFramework</artifactId>
    <version>1.0.0-SNAPSHOT-006</version>
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
[![Website](https://img.shields.io/website?down_message=offline&up_message=online&url=https%3A%2F%2Fyui-kitamurallc.github.io%2FYuiFramework)](https://yui-kitamurallc.github.io/YuiFramework)
