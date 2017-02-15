import com.kazhamiakina.Model.DAO.Price.PriceLens;
import com.kazhamiakina.Model.Entity.Price;

/**
 * Created by alisa on 10.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        PriceLens priceLens = new PriceLens();
       Price[] prices1  =  priceLens.getAll().toArray(new Price[]{});

        System.out.println(prices1[0]);
    }
}
