package com.ocs.sample.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ocs.sample.dao.UserDao;
import com.ocs.sample.entity.User;

// DIコンテナの対象となる(DBにアクセスするクラスに付与するアノテーション)
@Repository
public class UserDaoImpl implements UserDao {
    // JDBC Templateを利用
    private final NamedParameterJdbcTemplate jdbcTemplate;
    
    // 依存性を注入する
    @Autowired
    public UserDaoImpl(NamedParameterJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
    
    @Override
	public List<User> getAll() {
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("SELECT u.id, u.username, u.salary, TO_CHAR(u.birth, 'YYYY/MM/DD') as birth FROM USER01 u");

        String sql = sqlBuilder.toString();
        // パラメータ設定用Map
        Map<String, String> param = new HashMap<>();
        
        //User一覧をMapのListで取得
        List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sql, param);
        
        //Return用の空のListを用意
        List<User> list = new ArrayList<User>();

		for (Map<String, Object> result: resultList){
            User user = new User();
            user.setId(((BigDecimal) result.get("id")).intValue());
            user.setName((String) result.get("username"));
            user.setBirth((Date) result.get("birth"));
            user.setSalary(((BigDecimal) result.get("salary")).intValue());
            list.add(user);
        }
		return list;
	}
}
