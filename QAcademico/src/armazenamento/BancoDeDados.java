package armazenamento;

import java.sql.*;

public class BancoDeDados
{
//	 // register the driver 
//    String sDriverName = "org.sqlite.JDBC";
//    Class.forName(sDriverName);
//
//    // now we set up a set of fairly basic string variables to use in the body of the code proper
//    String sTempDb = "hello.db";
//    String sJdbc = "jdbc:sqlite";
//    String sDbUrl = sJdbc + ":" + sTempDb;
//    // which will produce a legitimate Url for SqlLite JDBC :
//    // jdbc:sqlite:hello.db
//    int iTimeout = 30;
//    String sMakeTable = "CREATE TABLE dummy (id numeric, response text)";
//    String sMakeInsert = "INSERT INTO dummy VALUES(1,'Hello from the database')";
//    String sMakeSelect = "SELECT response from dummy";
//
//    // create a database connection
//    Connection conn = DriverManager.getConnection(sDbUrl);{
//    try {
//        Statement stmt = conn.createStatement();
//        try {
//            stmt.setQueryTimeout(iTimeout);
////            stmt.executeUpdate( sMakeTable );
////              stmt.executeUpdate( sMakeInsert );
//            ResultSet rs = stmt.executeQuery(sMakeSelect);
//            try {
//                while(rs.next())
//                    {
//                        String sResult = rs.getString("response");
//                        System.out.println(sResult);
//                    }
//            } finally {
//                try { rs.close(); } catch (Exception ignore) {}
//            }
//        } finally {
//            try { stmt.close(); } catch (Exception ignore) {}
//        }
//    } finally {
//        try { conn.close(); } catch (Exception ignore) {}
//    }
//}
}

