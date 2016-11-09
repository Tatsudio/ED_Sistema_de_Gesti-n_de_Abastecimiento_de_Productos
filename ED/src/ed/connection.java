/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed;

import java.sql.*;
/**
 *
 * @author Jung
 */
public class connection {
    
    public static void main(String[] args){
        Connection conn = null;
        try{
            String driver_name = "oracle.jdbc.driver.OracleDriver";
            Class.forName(driver_name);
            String server_name = "127.0.0.1";
            String server_port = "1521";
            String sid = "orcl";
            String url = "jdbc:oracle:thin:@"+server_name+":"+server_port+":"+sid;
            String username = "C##DM_ALMACEN";
            String password = "ALMACEN";
            conn = DriverManager.getConnection(url,username,password);
            System.out.println("Etzito! xd");
            
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
