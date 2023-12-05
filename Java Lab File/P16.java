import java.sql.*;

class DatabaseExample {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/jdbcdemo";
    private static final String USER = "vky";
    private static final String PASSWORD = "root123";

    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);

            // Example using PreparedStatement
            preparedStatementExample(connection);

            // Example using CallableStatement
            callableStatementExample(connection);

            // Close the connection
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private static void preparedStatementExample(Connection connection) throws SQLException {
        System.out.println("Prepared Statement Example:");

        // Create a prepared statement
        String insertQuery = "INSERT INTO employee (id, name, salary) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

        // Set values for the prepared statement
        preparedStatement.setInt(1, 101);
        preparedStatement.setString(2, "John Doe");
        preparedStatement.setDouble(3, 50000.00);

        // Execute the prepared statement
        int rowsAffected = preparedStatement.executeUpdate();
        System.out.println(rowsAffected + " row(s) affected");

        // Close the prepared statement
        preparedStatement.close();
    }

    private static void callableStatementExample(Connection connection) throws SQLException {
        System.out.println("\nCallable Statement Example:");

        // Create a callable statement for calling a stored procedure
        String storedProcedureCall = "{CALL getEmployeeDetails(?, ?)}";
        CallableStatement callableStatement = connection.prepareCall(storedProcedureCall);

        // Set input parameter for the stored procedure
        callableStatement.setInt(1, 101);

        // Register output parameter for the stored procedure
        callableStatement.registerOutParameter(2, Types.VARCHAR);

        // Execute the stored procedure
        callableStatement.execute();

        // Retrieve the output parameter value
        String employeeName = callableStatement.getString(2);
        System.out.println("Employee Name: " + employeeName);

        // Close the callable statement
        callableStatement.close();
    }

}
