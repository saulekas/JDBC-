import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCUzdavinys112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite id");
        String id = scanner.nextLine();
        System.out.println("Iveskite varda");
        String name = scanner.nextLine();
        System.out.println("Iveskite pavarde");
        String surname = scanner.nextLine();
        System.out.println("Iveskite telefono nr");
        String phone = scanner.nextLine();
        System.out.println("Iveskite emeila");
        String email = scanner.nextLine();


        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kcs","root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (connection != null);{
            System.out.println("Prisijungete!!!");

            try {
                Statement st = connection.createStatement();
                st.executeUpdate("UPDATE students set name='" + name + "', surname='" + surname +"', phone='" + phone +"', email='" + email + "' where id=" + id);

            } catch (SQLException e) {
                e.printStackTrace();
            }


        }
    }
}
