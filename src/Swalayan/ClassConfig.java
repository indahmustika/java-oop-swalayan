package Swalayan;

import java.sql.Connection;
import java.sql.DriverManager;

public class ClassConfig {

    static Connection conn;

    static Connection Conn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/mymart", "root", "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static void main(String[] args) {
        System.out.println(ClassConfig.Conn());
    }
}
