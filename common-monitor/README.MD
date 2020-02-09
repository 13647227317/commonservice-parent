快速开始：
admin-server： 
引入admin-server依赖，@EnableAdminServer开启即可，如果通过注册中心来获取client实例，则需要配置注册中心
另外配置日志文件、邮件通知等，具体参考官网
admin-client：
引入admin-client依赖，通过management.endpoints.web.exposure.include配置端点，如果不使用注册中心则要配置admin-server地址
