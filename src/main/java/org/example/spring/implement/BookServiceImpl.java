package org.example.spring.implement;

import org.example.spring.dao.BookDAO;
import org.example.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDAO bookDAO;
    @Override
    @Transactional(
            propagation = Propagation.REQUIRES_NEW
    )
    public void buyBook(Integer userId, Integer bookId) {
        Integer price=bookDAO.getPriceByBookId(bookId);
        bookDAO.updateStock(bookId);
        bookDAO.updateBalance(userId,price);
    }
}
