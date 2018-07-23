import com.sun.org.apache.bcel.internal.generic.Select;

import java.sql.*;
import java.util.Scanner;

public class SecondJCDTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite id");
        int a = scanner.nextInt();
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kcs", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (connection != null);{
            System.out.println("prisijungeme!!!");;
        }

        try {
            Statement st = connection.createStatement();
            ResultSet resultSet = st.executeQuery("Select * from students where students_id = "+a);
           resultSet.next();
            System.out.println(resultSet.getInt("students_id") +" "+ resultSet.getString("name") +" "+ resultSet.getString("surname") +" "+ resultSet.getString("phone") +" "+ resultSet.getString("email") );
        } catch (SQLException e) {
            e.printStackTrace();

        }


    }
}
