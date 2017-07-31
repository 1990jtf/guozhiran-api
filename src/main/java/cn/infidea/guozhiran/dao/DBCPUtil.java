package cn.infidea.guozhiran.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSourceFactory;

public class DBCPUtil {
    static DataSource ds=null;

    /**
     * 静态代码块*/
    static {
        try {
            //读取配置文件
            InputStream in = DBCPUtil.class.getClassLoader().getResourceAsStream("dbcp.properties");
            Properties props = new Properties();
            props.load(in);
            // 根据配置文件创建数据库连接池（数据源）
            ds = BasicDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取一个连接
     */
    public static Connection getConnection() {
        try {
            return ds.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

	/*
     * PreparedStatement用于处理动态SQL语句，在执行前会有一个预编译过程，
	 * 这个过程是有时间开销的，虽然相对数据库的操作，该时间开销可以忽略不计，
	 * 但是PreparedStatement的预编译结果会被缓存，下次执行相同的预编译语句时，
	 * 就不需要编译，只要将参数直接传入编译过的语句执行代码中就会得到执行，所以，对于批量处理可以大大提高效率。
	 * Statement每次都会执行SQL语句，相关数据库都要执行SQL语句的编译。
	 */

    /**
     * 释放资源，适合update,delete,insert 没有rs结果集
     */
    public static void release(PreparedStatement pst, Connection conn) {
        if (pst != null) {
            try {
                pst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            pst = null;
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            conn = null;
        }
    }

    /**
     * 释放资源，适合query ，带有rs结果集
     */
    public static void release(PreparedStatement pst, ResultSet rs, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            rs = null;
        }
        if (pst != null) {
            try {
                pst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            pst = null;
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            conn = null;
        }
    }

    /**
     * 释放资源
     */
//    public static void release() {
//        try {
//            if (conn != null && !conn.isClosed()) {
//                conn.setAutoCommit(true);
//                conn.close();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

}

