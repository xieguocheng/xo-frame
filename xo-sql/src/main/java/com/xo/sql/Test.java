package com.xo.sql;

import com.xo.sql.bean.Student;
import com.xo.sql.mapper.StudentRowMapper;
import com.xo.sql.util.JdbcTemplate;
import com.xo.sql.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 * User: XO
 * Date: 2020/10/12
 */
public class Test {

    public static Student get(String id) {
        String sql = "SELECT * FROM student WHERE id = ?";
        List<Student> list = (List<Student>) JdbcTemplate.query(sql, new StudentRowMapper(),id);
        return list.size() > 0 ? list.get(0) : null;
    }

    public static void main(String[] args) throws Exception {
        Student student = get("1");
        System.out.println(student);
    }

}
