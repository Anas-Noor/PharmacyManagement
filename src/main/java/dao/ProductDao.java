package dao;
import products.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class ProductDao {
    public static List<Product> getAllProducts() {
        List<Product> results = new ArrayList<>();
        try{
            ResultSet rs = DBService.query("select * from products");
            while (true){
                assert rs != null;
                if (!rs.next()) break;
                results.add(new Product
                        (
                                Long.valueOf(rs.getString("id")),
                                rs.getString("product_name"),
                                (Long.valueOf(rs.getString("p_category_id"))),
                                Long.valueOf(rs.getString("price"))));
            }
            DBService.con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return results;
    }
}
