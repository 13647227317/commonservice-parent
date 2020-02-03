微服务注册中心、配置中心。
官网地址：https://nacos.io/zh-cn/docs/what-is-nacos.html
源码地址：https://github.com/alibaba/nacos.git
快速开始：
一、通过源码生成nacos-server jar包
git clone https://github.com/alibaba/nacos.git
cd nacos/
mvn -Prelease-nacos -Dmaven.test.skip=true clean install -U  
nacos/distribution目录即nacos-server发布目录
二、启动nacos-server
默认使用嵌入式数据库，0.7版本以后增加支持mysql数据源能力
linux：sh startup.sh -m standalone
windows：cmd startup.cmd

三、nacos集群搭建
1、在conf/cluster.conf配置nacos-server集群节点，各节点上该配置相同
2、修改各节点application.properties的mysql配置，各节点连接通一个mysql数据库
3、分别启动各节点

四、配置中心与注册中心使用demo见nacos-demo与consumer-demo