package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.Statement;

public class StoredPostTestSuite {
    @Test
    public void testUpdateVipLevels()throws Exception{
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL =\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        //When
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement.execute(sqlProcedureCall);
        //Then
        String sqlCheckTable = "SELECT count(*) as HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if (rs.next()){
            howMany = rs.getInt("HOW_MANY");
        }
        Assert.assertEquals(0,howMany);
    }
    @Test
    public void testUpdateBestSellers() throws Exception{
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER=NULL";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        //When
        String sqlProcedureCall = "CALL UpdateBestSellers()";
        statement.execute(sqlProcedureCall);
        //then
        String sqlCheckTable = "SELECT COUNT(*) AS QUANTITY_BESTSELLERS FROM BOOKS WHERE BESTSELLER=NULL";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany=-2;
        if (rs.next()){
            howMany = rs.getInt("QUANTITY_BESTSELLERS");
        }
        Assert.assertEquals(0,howMany);
    }

}
