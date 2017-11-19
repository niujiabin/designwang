package design.job.controller;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;
import org.apache.axis.message.MessageElement;
import org.apache.axis.types.Schema;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.web.client.RestTemplate;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

public class predictClient {

    public static void main(String[] args) throws ServiceException, RemoteException, DocumentException, MalformedURLException {
        Service sv = new Service();  //new 一个服务
        Call call = (Call) sv.createCall();  //创建一个call对象
        call.setTargetEndpointAddress(new URL("http://localhost:8000/?wsdl"));  //设置要调用的接口地址以上一篇的为例子
        call.setOperationName(new QName("spyne/examples/hello/soap",   "predict"));  //设置要调用的接口方法
        call.addParameter(new QName("spyne/examples/hello/soap",   "str"), org.apache.axis.encoding.XMLType.XSD_STRING,javax.xml.rpc.ParameterMode.IN);//设置参数名 id  第二个参数表示String类型,第三个参数表示入参
        call.setReturnType(XMLType.XSD_SCHEMA);//返回参数类型
        //晕 这里设置null才好使
        call.setEncodingStyle(null);
        //开始调用方法,假设我传入的参数id的内容是1001   调用之后会根据id返回users信息，以xml格式的字符串返回，也可以json格式主要看对方用什么方式返回
        Object o = call.invoke(new Object[]{"niujiabin"});
        Schema schema = (Schema)o;
        MessageElement[] messageElements = schema.get_any();
        StringBuffer str = new StringBuffer("");
        //从这儿可以直接获取预测值
        for (MessageElement m : messageElements) {
            str.append(m.getValue());
        }
        System.out.println(str);
        //Document doc = DocumentHelper.parseText(result);//转成Document对象
        //Element root = doc.getRootElement();//用dom4j方式拿到xml的根节点然后打印结果信息
       // System.out.println("id="+root.element("UsersID").getText()+"    name="+root.element("UsersName").getText()+"     sex="+root.element("UsersSex").getText());
    }



}
