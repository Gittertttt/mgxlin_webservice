package com.lhb.ws.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.lhb.ws.service.WsService;
import com.lhb.ws.util.XmlTools;
import org.dom4j.DocumentException;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import javax.lang.model.element.VariableElement;

/**
 * @author lhb
 * @date 2022/2/14 12:39
 */
@Component
@WebService(serviceName = "WsService", // 与接口中指定的name一致
        targetNamespace = "http://ws.lhb.com", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.lhb.ws.service.WsService"// 接口地址
)
public class WsServiceImpl implements WsService {
    @Override
    public String ws(String xml) {
        try {
            JSONObject jsonObject = XmlTools.documentToJSONObject(xml);
            String username = jsonObject.get("username").toString();
            String password = jsonObject.get("password").toString();
            System.out.println("解析到的数据: username:"+username +"-password:"+ password +"\n");
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return xml+"解析成功";
    }
}
