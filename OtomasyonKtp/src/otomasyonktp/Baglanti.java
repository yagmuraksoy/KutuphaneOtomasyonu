/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otomasyonktp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/**
 *
 * @author YAGMUR
 */
public class Baglanti {
     private String dbName="KitapDb";
  private String dbUserName= "root";
  private String dbPass="";
   private String driver="com.mysql.jdbc.Driver";
  private String url="jdbc:mysql://localhost/";
    Connection conn=null;
    Statement st=null;
    
      public Baglanti (){
    }

     public Statement baglan(){
    
        try {
             Class.forName(driver);
             conn=DriverManager.getConnection(url+dbName,dbUserName,dbPass);
             st=conn.createStatement();
        } catch (Exception e) {
            System.out.println("Bağlantı hatası"+e);

        }
        return st;
    }
}
