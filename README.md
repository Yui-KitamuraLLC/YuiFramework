# YuiFramework
Java Utilities framework 
Provided by [Yui-Kitamura LLC.](https://yui.eng.pro/llc/)  

## How to use
We host the releases on [Maven Central](https://mvnrepository.com/artifact/pro.eng.yui/YuiFramework)  
So please use the **latest** if you don`t have any special issue.

### pom.xml
```xml
<dependency>
    <!-- https://mvnrepository.com/artifact/pro.eng.yui/YuiFramework -->
    <groupId>pro.eng.yui</groupId>
    <artifactId>YuiFramework</artifactId>
    <version>1.0.0-SNAPSHOT-003</version>
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