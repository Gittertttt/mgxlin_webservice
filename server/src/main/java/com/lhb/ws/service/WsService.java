package com.lhb.ws.service;

import javax.jws.WebService;

/**
 * name: 暴露服务名称
 * targetNamespace: 命名空间,一般是接口的包名倒序
 *
 * @author lhb
 * @date 2022/2/14 12:38
 */

@WebService(name = "WsService",targetNamespace = "http://ws.lhb.com")
public interface WsService {
    String ws(String xml);
}
