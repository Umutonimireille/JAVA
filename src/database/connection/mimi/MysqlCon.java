package database.connection.mimi;

import java.sql.*;

public class MysqlCon {

    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Java_DB?characterEncoding=utf8","oxane","oxane123456");

            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from User");
            while(rs.next())
                System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getString(5));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }

}


