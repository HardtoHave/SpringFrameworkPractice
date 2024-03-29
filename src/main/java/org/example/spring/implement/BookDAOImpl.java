package org.example.spring.implement;

import org.example.spring.dao.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAOImpl implements BookDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public Integer getPriceByBookId(Integer bookId) {
        String sql="select price from b_book where book_id=?";
        return jdbcTemplate.queryForObject(sql, Integer.class,bookId);
    }

    @Override
    public void updateStock(Integer bookId) {
        String sql="update b_book set stock=stock-1 where book_id=?";
        jdbcTemplate.update(sql,bookId);
    }

    @Override
    public void updateBalance(Integer userId, Integer price) {
        String sql="update b_user set balance=balance-? where user_id=?";
        jdbcTemplate.update(sql,price,userId);
    }
}
