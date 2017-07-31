package cn.infidea.guozhiran.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Administrator on 2017/6/16.
 */
public class DbTool {

    public static Connection conn;
    public static PreparedStatement pst;
    public static ResultSet rs;

    /**
     * 更新语句insert,delete,update
     * 返回boolean,如果成功true，失败false
     */
    public static boolean isSuccessUpdate(String sql) {
        boolean flag = false;

        try {
            conn = DBCPUtil.getConnection();
            pst = conn.prepareStatement(sql);
            int i = pst.executeUpdate();
            if (i > 0) {
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBCPUtil.release(pst, conn);
        }
        return flag;

    }

    /**
     * 查询是否有数据的方法 select
     * 返回boolean,如果有数据true，没有false
     */
    public static boolean hasDataQuery(String sql) {
        boolean flag = false;
        try {
            conn = DBCPUtil.getConnection();
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBCPUtil.release(pst, conn);
        }
        return flag;

    }

    /**
     * 查询有多少条数据的方法 select
     * 返回int
     */
    public static int countQuery(String sql) {
        int count = 0;
        try {
            conn = DBCPUtil.getConnection();
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                //指针跳转到最后一行，并返回当前行数
                rs.last();
                count = rs.getRow();

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBCPUtil.release(pst, rs, conn);
        }
        return count;
    }

    /**
     * 返回用户id select
     * 返回int
     */
    public static int uidQuery(String sql) {
        int uid = 0;
        try {
            conn = DBCPUtil.getConnection();
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                uid = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBCPUtil.release(pst, rs, conn);
        }
        return uid;
    }
}