package com.yang.learn.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EnumSingletonDemo {

    /**
     * 枚举单例，保证实例唯一
     */
    public enum ConnectionManager {
        connectionFactory;
        private Connection connection;

        private ConnectionManager() {
            try {
                String url = "jdbc:mysql://127.0.0.1:3306/test_db?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
                String username = "yang";
                String password = "yang";
                String driverName = "com.mysql.cj.jdbc.Driver";
                Class.forName(driverName);
                connection = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        public Connection getConnection() {
            return connection;
        }
    }

    /**
     * 获取连接实例
     *
     * @return Connection
     */
    public static Connection getConnection() {
        return ConnectionManager.connectionFactory.getConnection();
    }

}
