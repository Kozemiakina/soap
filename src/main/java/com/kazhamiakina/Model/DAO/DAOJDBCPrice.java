package com.kazhamiakina.Model.DAO;

import com.kazhamiakina.Model.Entity.Price;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by alisa on 23.01.2017.
 */
public class DAOJDBCPrice extends DAOAbstractJDBC<Price> {


    public DAOJDBCPrice(ResourceBundle resourceBundle) {
        super(resourceBundle);
    }

    @Override
    protected List<Price> parseResultSet(ResultSet rs)  {
        ArrayList<Price> result = new ArrayList<>();
        try {
            while (rs.next()){
                Price price = new Price();
                price.setId(rs.getInt("price_id"));
                price.setIdProduct(rs.getInt("product_id"));
                price.setPrice(rs.getDouble("price"));
                price.setCount(rs.getInt("count"));
                result.add(price);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;

    }


    @Override
    protected void prepareStatementForInsert(PreparedStatement statement, Price object) {
        try {
            statement.setInt(1,object.getIdProduct());
            statement.setDouble(2,object.getPrice());
            statement.setInt(3,object.getCount());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void prepareStatementForUpdate(PreparedStatement statement, Price object) {
        try {
            statement.setInt(1,object.getIdProduct());
            statement.setDouble(2,object.getPrice());
            statement.setInt(3,object.getCount());
            statement.setInt(4,object.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
