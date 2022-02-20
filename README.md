# webservice
server端采用 SpringBoot + CXF 集成WebService
client端使用idea自动构建，也可以使用jdk自带的wsimport命令。通过直接调用 wsdl 地址即可生成客户端代码。

运行截图：
1、实现了webservice交互并在接受消息后保存XML信息到日志；
2、解析出XML中所需要的业务字段
![image](https://github.com/mgxlin/webservice/blob/master/client/src/example/pic/0.png)
