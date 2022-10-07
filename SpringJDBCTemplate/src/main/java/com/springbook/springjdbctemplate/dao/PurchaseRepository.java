package com.springbook.springjdbctemplate.dao;

import com.springbook.springjdbctemplate.model.Purchase;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PurchaseRepository {

    private final JdbcTemplate jdbc;

    public PurchaseRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void savePurchase(Purchase purchase) {
        String sql = "insert into Purchase values (null, ?, ?)";
        jdbc.update(sql, purchase.getProduct(), purchase.getPrice());
    }
}
