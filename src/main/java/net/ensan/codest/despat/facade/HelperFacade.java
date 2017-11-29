package net.ensan.codest.despat.facade;

import java.sql.Connection;

/**
 * <p>Facade Pattern provides a unified interface to a set of
 * interfaces in a subsystem and defines a higher-level interface
 * that makes the subsystem easier to use.
 *
 * <p>Important points:
 * <ul>
 *     <li>Facade pattern is more like a helper for client applications,
 *     it doesn’t hide subsystem interfaces from the client. Whether to use
 *     Facade or not is completely dependent on client code.</li>
 *     <li>Facade pattern can be applied at any point of development, usually
 *     when the number of interfaces grow and system gets complex.</li>
 *     <li>Subsystem interfaces are not aware of Facade and they shouldn’t
 *     have any reference of the Facade interface.</li>
 *     <li>Facade pattern should be applied for similar kind of interfaces,
 *     its purpose is to provide a single interface rather than multiple
 *     interfaces that does the similar kind of jobs.</li>
 *     <li>We can use Factory pattern with Facade to provide better interface
 *     to client systems.</li>
 * </ul>
 *
 * @author shahram at gmail.com Inspired from (Book: Java Design Patterns by Pankaj Kumar)
 */
public class HelperFacade {

    public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName) {
        Connection con = null;
        switch (dbType) {
            case MYSQL:
                con = MySqlHelper.getMySqlDBConnection();
                MySqlHelper mySqlHelper = new MySqlHelper();
                switch (reportType) {
                    case HTML:
                        mySqlHelper.generateMySqlHTMLReport(tableName, con);
                        break;
                    case PDF:
                        mySqlHelper.generateMySqlPDFReport(tableName, con);
                        break;
                }
                break;
            case ORACLE:
                con = OracleHelper.getOracleDBConnection();
                OracleHelper oracleHelper = new OracleHelper();
                switch (reportType) {
                    case HTML:
                        oracleHelper.generateOracleHTMLReport(tableName, con);
                        break;
                    case PDF:
                        oracleHelper.generateOraclePDFReport(tableName, con);
                        break;
                }
                break;
        }
    }

    public static enum DBTypes {
        MYSQL, ORACLE;
    }

    public static enum ReportTypes {
        HTML, PDF;
    }
}
