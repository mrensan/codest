package net.ensan.codest.despat.facade;

import org.junit.Test;

import java.sql.Connection;

import static org.junit.Assert.*;

public class HelperFacadeTest {
    @Test
    public void facadePatternTest() throws Exception {

        String tableName = "Employee";

        //generating MySql HTML report and Oracle PDF report without using Facade
        Connection con = MySqlHelper.getMySqlDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateMySqlHTMLReport(tableName, con);
        Connection con1 = OracleHelper.getOracleDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOraclePDFReport(tableName, con1);

        //generating MySql HTML report and Oracle PDF report using Facade
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);

        // As you can see that using Facade interface is a lot easier and cleaner
        // way and avoid having a lot of logic at client side.
    }

}