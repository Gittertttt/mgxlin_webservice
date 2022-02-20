package example;

import com.lhb.ws.WsService_Service;

/**
*@author lhb
*@date 2022/2/14 13:02
*/public class HelloWorldClient {
  public static void main(String[] argv) {
    WsService_Service webServiceImpl = new WsService_Service();
    String result = webServiceImpl.getWsServiceImplPort().ws("<xml>\n" +
            "        <username>杰哥</username>\n" +
            "        <password>123</password>\n" +
            "    </xml>");
    System.out.println(result);
  }
}
