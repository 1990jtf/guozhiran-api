package cn.infidea.guozhiran.service;

import cn.infidea.guozhiran.dao.DbTool;
import com.alibaba.fastjson.JSONObject;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

// The Java class will be hosted at the URI path "/helloworld"
@Path("/addCustomerAsk")
public class AddCustomerAsk {
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    public String getClichedMessage() {
        // Return some cliched textual content
        return "addCustomerAsk";
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public JSONObject addCustomerAsk(@FormParam("name") String name,
                                     @FormParam("telephone") String telephone,
                                     @FormParam("ask") String ask) {
        JSONObject j = new JSONObject();
        //获取当前时间
        Date date=new Date();
        SimpleDateFormat temp=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String now=temp.format(date);
        String sql="insert into customer_ask (name,telephone,ask) values ('"+name+"',"+telephone+",'"+ask+"')";
        System.out.print(sql);
        if(DbTool.isSuccessUpdate(sql)){
            j.put("err",1);
        }
        else{
            j.put("err",0);
        }
        return j;
    }
}
