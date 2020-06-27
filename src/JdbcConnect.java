import java.sql.*;


public class JdbcConnect {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcconnectdb",
                    "root","jesus");

            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from employee");

            while(rs.next()){
                System.out.println("Id : "+rs.getInt(1));
                System.out.println("Name : "+rs.getString(2));
                System.out.println("City : "+rs.getString(3));
                System.out.println("\n");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
