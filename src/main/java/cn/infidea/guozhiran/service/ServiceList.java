package cn.infidea.guozhiran.service;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

// The Java class will be hosted at the URI path "/helloworld"
@Path("/serviceList")
public class ServiceList {
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces(MediaType.APPLICATION_JSON)
    public JSONObject serviceList() {
        JSONObject j=new JSONObject(true);
        j.put("err",1);
        //所有的服务列表
        JSONArray serviceItems=new JSONArray();

        //1、公司注册大项
        JSONObject serviceItem=new JSONObject(true);
        serviceItem.put("id",1);
        serviceItem.put("typename","公司注册");
        serviceItem.put("bg","https://www.infidea.cn/guozhiran/img/bg/zhuce_bg.jpg");

        //2、公司变更大项
        JSONObject serviceItem2=new JSONObject(true);
        serviceItem2.put("id",2);
        serviceItem2.put("typename","公司变更");
        serviceItem2.put("bg","https://www.infidea.cn/guozhiran/img/bg/biangeng_bg.jpg");

        //3、代理记账大项
        JSONObject serviceItem3=new JSONObject(true);
        serviceItem3.put("id",3);
        serviceItem3.put("typename","代理记账");
        serviceItem3.put("bg","https://www.infidea.cn/guozhiran/img/bg/jizhang_bg.jpg");

        //4、知识产权大项
        JSONObject serviceItem4=new JSONObject(true);
        serviceItem4.put("id",4);
        serviceItem4.put("typename","知识产权");
        serviceItem4.put("bg","https://www.infidea.cn/guozhiran/img/bg/shangbiao_bg.jpg");


        //1.1 有限责任公司注册
        JSONObject item1_1=new JSONObject(true);
        item1_1.put("id",11);
        item1_1.put("name","有限责任公司注册");
        item1_1.put("desc","线上提交材料，为你快速注册公司");
        item1_1.put("img","https://www.infidea.cn/guozhiran/img/tipsImg.jpg");

        //1.2 合伙企业注册
        JSONObject item1_2=new JSONObject(true);
        item1_2.put("id",12);
        item1_2.put("name","合伙企业注册");
        item1_2.put("desc","股权、注册一步到位的服务");
        item1_2.put("img","https://www.infidea.cn/guozhiran/img/tipsImg.jpg");

        //1.3 个人独资企业注册
        JSONObject item1_3=new JSONObject(true);
        item1_3.put("id",13);
        item1_3.put("name","个人独资企业注册");
        item1_3.put("desc","线上提交材料，为你快速注册公司");
        item1_3.put("img","https://www.infidea.cn/guozhiran/img/tipsImg.jpg");

        //1.4 分公司注册
        JSONObject item1_4=new JSONObject(true);
        item1_4.put("id",14);
        item1_4.put("name","个人独资企业注册");
        item1_4.put("desc","线上提交材料，为你快速注册公司");
        item1_4.put("img","https://www.infidea.cn/guozhiran/img/tipsImg.jpg");


        //2.1 公司股权变更
        JSONObject item2_1=new JSONObject(true);
        item2_1.put("id",21);
        item2_1.put("name","公司股权变更");
        item2_1.put("desc","工商、税务、法务可一步到位，省心更放心");
        item2_1.put("img","https://www.infidea.cn/guozhiran/img/tipsImg.jpg");

        //2.2 公司经营范围变更
        JSONObject item2_2=new JSONObject(true);
        item2_2.put("id",22);
        item2_2.put("name","公司经营范围变更");
        item2_2.put("desc","满足企业经营范围需求，让企业经营更合规");
        item2_2.put("img","https://www.infidea.cn/guozhiran/img/tipsImg.jpg");

        //2.3 公司注册地址变更
        JSONObject item2_3=new JSONObject(true);
        item2_3.put("id",23);
        item2_3.put("name","公司注册地址变更");
        item2_3.put("desc","全程可视化，服务流程透明");
        item2_3.put("img","https://www.infidea.cn/guozhiran/img/tipsImg.jpg");

        //2.4 公司名称变更
        JSONObject item2_4=new JSONObject(true);
        item2_4.put("id",24);
        item2_4.put("name","公司名称变更");
        item2_4.put("desc","专业代理人，助力变更心仪的企业名称");
        item2_4.put("img","https://www.infidea.cn/guozhiran/img/tipsImg.jpg");

        //2.5 法人、高管或注册资本变更
        JSONObject item2_5=new JSONObject(true);
        item2_5.put("id",25);
        item2_5.put("name","法人、高管或注册资本变更");
        item2_5.put("desc","全程可视化，服务流程透明");
        item2_5.put("img","https://www.infidea.cn/guozhiran/img/tipsImg.jpg");

        //3.1 小规模纳税人记账(一年）
        JSONObject item3_1=new JSONObject(true);
        item3_1.put("id",31);
        item3_1.put("name","小规模代理记账(一年）");
        item3_1.put("desc","从业三年以上会计师，专业又贴心");
        item3_1.put("img","https://www.infidea.cn/guozhiran/img/tipsImg.jpg");

        //3.2 小规模纳税人记账(季度）
        JSONObject item3_2=new JSONObject(true);
        item3_2.put("id",32);
        item3_2.put("name","小规模代理记账(季度）");
        item3_2.put("desc","从业三年以上会计师，专业又贴心");
        item3_2.put("img","https://www.infidea.cn/guozhiran/img/tipsImg.jpg");

        //3.3 一般纳税人记账(半年）
        JSONObject item3_3=new JSONObject(true);
        item3_3.put("id",33);
        item3_3.put("name","一般纳税人记账(半年）");
        item3_3.put("desc","从业五年以上会计师，专业又贴心");
        item3_3.put("img","https://www.infidea.cn/guozhiran/img/tipsImg.jpg");

        //3.4 一般纳税人记账(一年）
        JSONObject item3_4=new JSONObject(true);
        item3_4.put("id",34);
        item3_4.put("name","一般纳税人记账(一年）");
        item3_4.put("desc","从业五年以上会计师，专业又贴心");
        item3_4.put("img","https://www.infidea.cn/guozhiran/img/tipsImg.jpg");

        //4.1商标注册
        JSONObject item4_1=new JSONObject(true);
        item4_1.put("id",41);
        item4_1.put("name","普通商标注册");
        item4_1.put("desc","专业股份，快速相应，4个工作日下发申请号");
        item4_1.put("img","https://www.infidea.cn/guozhiran/img/tipsImg.jpg");

        //4.2 专利注册
        JSONObject item4_2=new JSONObject(true);
        item4_2.put("id",42);
        item4_2.put("name","发明专利");
        item4_2.put("desc","对产品方法或者其改进，所提出的记得技术方案");
        item4_2.put("img","https://www.infidea.cn/guozhiran/img/tipsImg.jpg");

        //4.3 软件著作权
        JSONObject item4_3=new JSONObject(true);
        item4_3.put("id",43);
        item4_3.put("name","软件著作权");
        item4_3.put("desc","专业顾问，经验丰富，快速响应，顺利拿证！");
        item4_3.put("img","https://www.infidea.cn/guozhiran/img/tipsImg.jpg");

        //4.4 软件著作权
        JSONObject item4_4=new JSONObject(true);
        item4_4.put("id",44);
        item4_4.put("name","文字美术著作权");
        item4_4.put("desc","专业顾问，经验丰富，高效沟通，顺利拿证！");
        item4_4.put("img","https://www.infidea.cn/guozhiran/img/tipsImg.jpg");

        //4.5 外观设计专利
        JSONObject item4_5=new JSONObject(true);
        item4_5.put("id",45);
        item4_5.put("name","外观设计专利");
        item4_5.put("desc","形状 图案 色彩或其结合富有美感适用于工业应用的新设计");
        item4_5.put("img","https://www.infidea.cn/guozhiran/img/tipsImg.jpg");

        //4.5 实用新型专利
        JSONObject item4_6=new JSONObject(true);
        item4_6.put("id",45);
        item4_6.put("name","实用新型专利");
        item4_6.put("desc","对产品的形状 构造或者其结合适用于实用的新技术方案");
        item4_6.put("img","https://www.infidea.cn/guozhiran/img/tipsImg.jpg");

        //1 公司注册添加项目
        JSONArray gongsi_items=new JSONArray();
        gongsi_items.add(item1_1);
        gongsi_items.add(item1_2);
        gongsi_items.add(item1_3);
        gongsi_items.add(item1_4);
        serviceItem.put("items",gongsi_items);

        //2 公司变更添加项目
        JSONArray biangeng_items=new JSONArray();
        biangeng_items.add(item2_1);
        biangeng_items.add(item2_2);
        biangeng_items.add(item2_3);
        biangeng_items.add(item2_4);
        biangeng_items.add(item2_5);
        serviceItem2.put("items",biangeng_items);

        //3 代理记账添加项目
        JSONArray jizhang_items=new JSONArray();
        jizhang_items.add(item3_1);
        jizhang_items.add(item3_2);
        jizhang_items.add(item3_3);
        jizhang_items.add(item3_4);
        serviceItem3.put("items",jizhang_items);

        //4 知识产权添加项目
        JSONArray zhishi_items=new JSONArray();
        zhishi_items.add(item4_1);
        zhishi_items.add(item4_2);
        zhishi_items.add(item4_3);
        zhishi_items.add(item4_4);
        zhishi_items.add(item4_5);
        zhishi_items.add(item4_6);
        serviceItem4.put("items",zhishi_items);


        //添加注册，记账等大项
        serviceItems.add(serviceItem);
        serviceItems.add(serviceItem2);
        serviceItems.add(serviceItem3);
        serviceItems.add(serviceItem4);
        j.put("msg",serviceItems);
        return j;
    }

}
