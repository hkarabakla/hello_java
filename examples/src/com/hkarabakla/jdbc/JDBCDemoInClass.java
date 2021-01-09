package com.hkarabakla.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemoInClass {

    public static void main(String[] args) {

        Student st1 = new Student(1, "Student 1", 4.0);
        Student st2 = new Student(2, "Student 2", 3.2);

        try (Connection conn = DriverManager.getConnection("jdbc:h2:mem:default2", "admin", "admin")) {

            String ddl = "CREATE TABLE IF NOT EXISTS students" +
                    " (id int PRIMARY KEY AUTO_INCREMENT, name varchar(30)," +
                    " grade double)";

            try (Statement st = conn.createStatement()) {

                int createdTableCount = st.executeUpdate(ddl);
                System.out.println("Table is created !");


                String insert = "INSERT INTO students(name, grade) VALUES(?, ?)";

                try (PreparedStatement ps1 = conn.prepareStatement(insert)) {
                    ps1.setString(1, st1.getName());
                    ps1.setDouble(2, st1.getGrade());

                    System.out.println("Created student number : " + ps1.executeUpdate());

                    ps1.setString(1, st2.getName());
                    ps1.setDouble(2, st2.getGrade());

                    System.out.println("Created student number : " + ps1.executeUpdate());
                }

                String select = "SELECT * from students";

                ResultSet resultSet = st.executeQuery(select);
                List<Student> students = new ArrayList<>();

                while (resultSet.next()) {
                    Student stFromDB = new Student(resultSet.getInt(1),
                            resultSet.getString(2),
                            resultSet.getDouble(3));
                    students.add(stFromDB);
                }

                students.forEach(System.out::println);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
