# 百度地图API客户端
实际项目中使用到百度地图API，后来发现百度没有提供现成的Java客户端供开发者使用。开发人员不得不自己封装请求参数，发送http请求，然后解析响应。这过程代码繁琐，开发效率极低。

通过该项目把百度地图常用的API请求封装成一个个方法调用，简化请求地图服务的过程。目前支持的API有：
 - 地点检索服务
 - 地点输入提示服务
 - 正/逆地理编码服务
 - 时区服务
 
## 要求
 - Java 1.8 or later
 - Gradle 4.0 or later 