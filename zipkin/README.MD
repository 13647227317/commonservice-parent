微服务链路跟踪中心： zipkin
服务端： zipkin-server
源码地址：https://github.com/openzipkin/zipkin.git
也可以直接在官网下载发布包
数据可存储在内存、mysql、es里，默认存储在内存中，生产环境推荐es
客服端：
服务引入依赖spring-cloud-starter-zipkin，配置zipkin相关参数即可，数据可直接发送至zipkin-server，也可以发送至mq，
生产环境建议发送至mq

本想自己构建zipkin-server，但是使用zipkin-server 2.12.9依赖搭建好zipkin-server后启动各种报错，后续有时间可以研究一下