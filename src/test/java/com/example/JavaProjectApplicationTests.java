package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootTest
class JavaProjectApplicationTests {
    
    @Autowired
    private DataSource dataSource;
    
    @Test
    void contextLoads() throws Exception {
        // 测试数据库连接
        Connection conn = dataSource.getConnection();
        try {
            if (conn != null) {
                System.out.println("Connection Successful!");
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // 测试数据库连接
        System.out.println("数据库连接：" + dataSource.getClass());
        try {
            if (dataSource != null) {
                System.out.println("Connection Successful!");
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
}
