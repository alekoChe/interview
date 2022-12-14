//import java.sql.*;
//
//public class DbHandler {
//    private static final String CON_STR = "jdbc:sqlite:students.s3db";
//    private Connection connection;
//    public static Statement st;
//    private static DbHandler instance = null;
//    private Student student = new Student();;
//
//    private static final String CREATE_STUDENT_TABLE =
//            "CREATE TABLE if not exists 'students' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'name' text, 'mark' INT);";
//
//    private static final String INSERT_STUDENT_INTO_TABLE_STUDENTS =
//            "INSERT INTO products (name, mark) VALUES(?, ?)";
//
//    public static synchronized DbHandler getInstance() throws SQLException, ClassNotFoundException {
//        if (instance == null)
//            instance = new DbHandler();
//        return instance;
//    }
//
//    private DbHandler() throws SQLException, ClassNotFoundException {
//        Class.forName("org.sqlite.JDBC");
//        this.connection = DriverManager.getConnection(CON_STR);
//        createDB();
//    }
//
//    public void createDB() throws ClassNotFoundException, SQLException
//    {
//        //Statement statmt = this.connection.createStatement();
//        st = connection.createStatement();
//        st.execute(CREATE_STUDENT_TABLE);
//
//        System.out.println("Таблица students создана или уже существует.");
//    }
//
//    public void addStudent(Student student) {
//        //student = new Student();
//        try (PreparedStatement statement = this.connection.prepareStatement(
//                INSERT_STUDENT_INTO_TABLE_STUDENTS)) {
//            statement.setObject(1, student.name);
//            statement.setObject(2, student.mark);
//
//            statement.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
