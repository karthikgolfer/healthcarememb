package com.karthikgolfer.healthcarememinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SqlService {

	
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> executeQuery(String sql) {
        return jdbcTemplate.queryForList(sql);
    }
    
    public List<Map<String, Object>> getallbenefits() {
    	String benefitsql = "select * from dbo.Benefit";
        return executeQuery(benefitsql);
    }
}
