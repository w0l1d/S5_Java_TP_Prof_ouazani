package tp9.ex3;

import java.sql.*;
import java.util.Vector;

public class DbConnection {

    private static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    private static final String DB_URL = "jdbc:mariadb://localhost/lp_java_tp9";

    private static Connection con;

    private static PreparedStatement preStmInsertUser;

    static {
        try {
            preStmInsertUser = getConnection()
                    .prepareStatement("INSERT INTO users VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private static PreparedStatement preStmUpdateUser;

    static {
        try {
            preStmUpdateUser = getConnection()
                    .prepareStatement("UPDATE users SET " +
                            "nom = ?, prenom = ?, dateInsc = ?," +
                            " phone = ?, login = ?, password = ?," +
                            " montant = ?, adresse = ?, sex = ?, loisirs = ?;");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public static Connection getConnection() {
        if (con == null) {
            try {
                Class.forName(JDBC_DRIVER);
                con = DriverManager.getConnection(DB_URL);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return con;
    }



    public void insert(User user) throws SQLException {
        preStmInsertUser.setString(1, user.getNom());
        preStmInsertUser.setString(2, user.getPrenom());
        preStmInsertUser.setString(3, user.getDateInsc());
        preStmInsertUser.setString(4, user.getPhone());
        preStmInsertUser.setString(5, user.getLogin());
        preStmInsertUser.setString(6, user.getPassword());
        preStmInsertUser.setFloat(7, user.getMontant());
        preStmInsertUser.setString(8, user.getAdresse());
        preStmInsertUser.setString(9, user.getSexe());
        preStmInsertUser.setString(10, user.getLoisirs());
        preStmInsertUser.execute();
    }



    public Vector<User> getUsers() throws SQLException {
        Vector<User> users = new Vector<>();
        String sql = "SELECT * FROM users;";
        Statement stm = getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next())
            users.add(new User(rst));
        return users;
    }



}
