import java.sql.*;

public class MyJDBC {
    public static void main(String[] args) throws SQLException {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "9863034062");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from people");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
