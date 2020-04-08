# ***SpringCloud学习***
最近学习了尚硅谷周阳老师的springcloud2020版,感觉很不错.故记录下来加深印象.具体详细的笔记可以在网上找到.我这里只是对每个模块的作用,有什么意义做下梳理,
这样几十个模块看起来就不会很乱,回头复习的时候可以更加有条理.
##### 1. 父工程搭建
##### 2.支付模块payment8001工程搭建
```text
模块搭建步骤:(注:后面所有的工程搭建步骤都是这四步曲,后面不在赘述)
1) pom文件引依赖   
2) yml文件编写  
3）主启动类编写
4）业务代码编写
该模块作用:
 主要用来熟悉一个基本增删改查的工程如何一步步搭建
```
##### 3.消费模块order80工程搭建
    该模块作用:
    主要练习restTempleate如何远程调用支付模块的接口
##### 4.公共模块commons环境搭建
    该模块作用:
    抽取公共的组件,例如实体类放在公共模块下,这样每个模块就不需要
    自己写实体类,只要引入公共的maven坐标,就能拥有该实体类
##### 5.eureka7001和7002集群环境搭建
```text
步骤:
1) 建立两个eureka服务工程,引入相关maven坐标,在启动类上使用@EnableEurekaServer注解,表示这是个eureka服务端,
在配置文件里配置eureka相关信息,将两个eureka服务配置成相互注册
2) 将支付模块和消费模块引入eureka客户端坐标,在启动类使用@EnableEurekaClient标记为eureka客户端,修改配置,
将自己注入到两个eureka服务当中.
3）按顺序启动eureka7001和eureka7002,在启动支付模块和消费模块.
该模块作用:
练习如何搭建eureka集群
```
##### 6.支付模块payment8001和8002集群环境搭建
```text
步骤:
1)新建一个支付模块payment8002,配置端口号为8002,其他代码和支付模块8001一样
2)消费模块order80在调用时,路径使用支付模块的配置的服务名,通过在RestTemplate上使用@LoadBalanced,可以实现负载均衡,
默认是轮询策略
该模块作用:
练习Ribbon和Eureka整合后消费模块可以直接调用服务而不用再关心地址和端口号，且该服务还有负载均衡功能了
```
##### 7.支付模块payment8004和消费模块consumerzk-order80,使用zookeeper作为注册中心
```text
注意:引入spring-cloud-starter-zookeeper-discovery maven坐标后,里面会自带zookeeper包,需要先排除,在手动引入你
zookeeper对应的版本
该模块作用:
练习使用zookeeper作为服务中心,来实现服务间调用
```
##### 8.支付模块payment8006和消费模块consumerconsul-order80,使用consul作为注册中心
```text
该模块作用:
练习使用consul作为服务中心,来实现服务间调用
```
##### 9.消费模块consumer-feign-order80,使用openFeign来调用服务
```text
该模块作用:
练习使用openFeign来远程调用服务
```
##### 10.消费模块consumer-feign-hystrix-order80,支付模块provider-hystrix-payment8001,hystrix监控平台dashboard9001
```text
该模块作用:
练习使用hystrix来实现服务的降级和熔断,9001模块搭建hystrix界面化监控平台.
```
##### 11.网关模块gateway9527
```text
该模块作用:
练习使用通过gateway网关来访问微服务
```
##### 12.配置中心服务端config-center-3344和配置中心客户端config-center-3355
```text
该模块作用:
练习使用配置中心从Git上获取配置文件
```
##### 13.config-center-3344消息总线服务端,config-center-3355,config-center-3366消息总线客户端
```text
该模块作用:
练习使用消息总线实现,客户端变动,所有服务端实时更新.
```