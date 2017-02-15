package com.kazhamiakina.Model.DAO.Price;

import com.kazhamiakina.Model.DAO.DAOJDBCPrice;

import java.util.ResourceBundle;

/**
 * Created by alisa on 21.01.2017.
 */
public class PriceLens extends DAOJDBCPrice {

    public PriceLens(){
        super(ResourceBundle.getBundle("PriceQuery.QueryPriceLens"));
    }


}
