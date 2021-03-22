# 专业综合设计II

#### 介绍

宁夏大学信息工程学院专业综合设计II

#### 说明

1. 请大家fork本仓库到自己一个项目中
2. 根据每次布置的任务完成作业，编写代码，提交到自己的仓库
3. 将完成的内容提出pull request，由我确认。

#### 运行项目的方法

**以下操作需要进入项目的web-app目录完成**
1. 使用Undertow容器运行（默认）

```shell
  mvn exec:java -Pundertow
```

也可以运行Application类的主方法

```shell
  mvn package -Pundertow
```

或在web-app模块下target目录下找到web-app-release目录，执行start.bat

2. 使用Jetty容器运行

```shell
  mvn jetty:run -Pjetty
```

3. 使用Tomcat运行 需要先执行

```shell
  mvn war:war -Ptomcat
```

在web-app模块下target目录下会生成App.war，将其放置到Tomcat的webapps目录即可
