package com.kazhamiakina.Model.DAO.Price;

import com.kazhamiakina.Model.DAO.DAOJDBCPrice;

import java.util.ResourceBundle;

/**
 * Created by alisa on 21.01.2017.
 */
public class PriceVideo extends DAOJDBCPrice {

    public PriceVideo() {
        super(ResourceBundle.getBundle("PriceQuery.QueryPriceVideo"));
    }
}
