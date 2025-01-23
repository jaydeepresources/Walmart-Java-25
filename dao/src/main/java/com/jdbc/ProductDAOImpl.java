package com.jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDAOImpl implements ProductDAO {
    @Override
    public Integer insert(Product product) {
        String insertQuery = "insert into test.products(PRODUCT_NAME, PRODUCT_PRICE, PRODUCT_RATING) values(?, ?, ?)";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = DBUtil.getConnection().prepareStatement(insertQuery);
            preparedStatement.setString(1, product.getProductName());
            preparedStatement.setFloat(2, product.getProductPrice());
            preparedStatement.setFloat(3, product.getProductRating());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        int res = 0;
        try {
            res = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return res;
    }

}
