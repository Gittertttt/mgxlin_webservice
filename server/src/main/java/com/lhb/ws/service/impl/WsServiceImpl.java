package com.lhb.ws.service.impl;

import com.lhb.ws.service.WsService;

import javax.jws.WebService;

/**
 * @author lhb
 * @date 2022/2/14 12:39
 */

@WebService(serviceName = "WsService", // 与接口中指定的name一致
        targetNamespace = "http://ws.lhb.com", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.lhb.ws.service.WsService"// 接口地址
)
public class WsServiceImpl implements WsService {
    @Override
    public String ws(String user) {
        return user+"访问成功";
    }
}
