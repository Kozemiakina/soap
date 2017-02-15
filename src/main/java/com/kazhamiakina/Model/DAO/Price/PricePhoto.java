package com.kazhamiakina.Model.DAO.Price;

import com.kazhamiakina.Model.DAO.DAOJDBCPrice;

import java.util.ResourceBundle;

/**
 * Created by alisa on 20.01.2017.
 */
public class PricePhoto extends DAOJDBCPrice {

    public PricePhoto(){
        super(ResourceBundle.getBundle("PriceQuery.QueryPricePhoto"));

    }


}
