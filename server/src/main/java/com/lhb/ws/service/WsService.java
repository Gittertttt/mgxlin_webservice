package com.lhb.ws.service;

import javax.jws.WebService;

/**
 * @author lhb
 * @date 2022/2/14 12:38
 */
@WebService(name = "WsService", // 暴露服务名称
        targetNamespace = "http://ws.lhb.com"// 命名空间,一般是接口的包名倒序
)
public interface WsService {
    String ws(String user);
}
