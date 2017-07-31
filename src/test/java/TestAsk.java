import cn.infidea.guozhiran.dao.DbTool;
import org.junit.Test;

public class TestAsk {
    @Test
    public void testAsk (){
        String sql="select * from customer_ask";
        System.out.println(DbTool.hasDataQuery(sql));
    }
    @Test
    public void testAskCount (){
        String sql="select count(*) from customer_ask";
        System.out.println(DbTool.countQuery(sql));
    }
}
