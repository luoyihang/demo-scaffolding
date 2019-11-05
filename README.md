[TOP]

# 打包方法
 * 一级父pom增加
```xml
<plugin>
    <artifactId>maven-compiler-plugin</artifactId>
    <version>3.8.0</version>
    <configuration>
        <source>1.8</source>
        <target>1.8</target>
    </configuration>
</plugin>
```
* 二级父pom不需要动
* 子模块 Main方法所在的模块增加
```xml
<!-- springboot 打包插件 -->
<plugin>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-maven-plugin</artifactId>
</plugin>
```
* 子模块 非Main方法所在的模块不需要动
* 子模块 如果接口模块增加
```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-compiler-plugin</artifactId>
</plugin>
```