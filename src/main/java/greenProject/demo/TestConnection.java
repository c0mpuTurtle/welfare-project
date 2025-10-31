package greenProject.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/welfare_project?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=Asia/Seoul";
        String user = "root";
        String password = "1234";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("✅ DB 연결 성공!");
        } catch (Exception e) {
            System.out.println("❌ DB 연결 실패");
            e.printStackTrace();
        }
    }
}
