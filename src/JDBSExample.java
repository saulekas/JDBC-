import java.sql.*;

public class JDBSExample {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kcs", "root", "");
        } catch (SQLException e) {
            System.out.println("Ivyko klaida" + e);
        }
        if (connection != null) {
            System.out.println("Prisijungeme !!!!");
//2 zingsnis sukurti statment
            try {
                Statement st = connection.createStatement();
                //3. executeinti.statment
                ResultSet resultSet = st.executeQuery("select  * from students");

                while (resultSet.next()) {
                    System.out.println(resultSet.getString("name") + " " + resultSet.getString("surname") + " " + resultSet.getString("phone") + " " + resultSet.getString("email") + " " + resultSet.getInt("students_id"));
                }


            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

}
