package scau.utils;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA
 * User: lcwei1
 * Date: 2019/1/23
 * Time: 14:56
 * Description: SQLite 数据库操作
 */
public class SQLiteUtil {

    final static Logger LOG = Logger.getLogger("SQLiteUtil");

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private String dbFilePath;

    public SQLiteUtil(String dbFilePath) throws SQLException, ClassNotFoundException {
        this.dbFilePath = dbFilePath;
        connection = getConnection(dbFilePath);
    }

    private Connection getConnection(String dbFilePath) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:" + dbFilePath);
        return conn;
    }

    private Connection getConnection() throws SQLException, ClassNotFoundException {
        if (null == connection) connection = getConnection(dbFilePath);
        return connection;
    }


    /**
     * 数据库查询语句
     *
     * @param sql
     * @param rse
     * @param <T>
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public <T> T executeQuery(String sql, ResultSetExtractor<T> rse) throws SQLException, ClassNotFoundException {
        try {
            resultSet = getStatement().executeQuery(sql);
//            T rs = rse.extractData(resultSet);
            return rse.extractData(resultSet);
        } finally {
            destroyed();
        }

    }

    public int executeUpdate(String sql) throws SQLException, ClassNotFoundException {
        try {
//            int c = getStatement().executeUpdate(sql);
            return getStatement().executeUpdate(sql);
        } finally {
            destroyed();
        }
    }


    public void executeUpdate(String... sqls) throws SQLException, ClassNotFoundException {
        try {
            for (String sql : sqls) {
                getStatement().executeUpdate(sql);
            }
        } finally {
            destroyed();
        }
    }

    public void executeUpdate(List<String> sqls) throws SQLException, ClassNotFoundException {
        try {
            for (String sql : sqls) {
                getStatement().executeUpdate(sql);
            }
        } finally {
            destroyed();
        }
    }




    public <T> List<T> executeQuery(String sql, RowMapper<T> rm) throws SQLException, ClassNotFoundException {
        List<T> rsList = new ArrayList<T>();
        try {
            resultSet = getStatement().executeQuery(sql);
            while (resultSet.next()) {
                rsList.add(rm.mapRow(resultSet, resultSet.getRow()));
            }
        } finally {
            destroyed();
        }
        return rsList;
    }


    private Statement getStatement() throws SQLException, ClassNotFoundException {
        if (null == statement) statement = getConnection().createStatement();
        return statement;
    }

    /**
     * 数据库资源关闭
     */
    public void destroyed() {

    }
}
