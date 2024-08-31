import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        Connection c = null;
        Statement stmt = null;
        String SQLStatement = "SELECT * FROM public.\"Employee\";";
        try {
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres", "Root11448");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");
            stmt = c.createStatement();
            ResultSet rs = ((Statement) stmt).executeQuery(SQLStatement);
            while ( rs.next() ) {
                int id = rs.getInt("Emp_ID");
                String  name = rs.getString("Emp_Name");
                System.out.println( "ID = " + id );
                System.out.println( "NAME = " + name );
                System.out.println("Operation completed successfully");
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
    }
}