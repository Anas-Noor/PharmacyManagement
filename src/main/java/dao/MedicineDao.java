package dao;
import products.Medicine;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class ProductDao {
    public static List<Medicine> getAllProducts() {
        List<Medicine> results = new ArrayList<>();
        try{
            ResultSet rs = DBService.query("select * from medicines");
            while (true){
                assert rs != null;
                if (!rs.next()) break;
                results.add(new Medicine
                        (
                                Long.valueOf(rs.getString("id")),
                                rs.getString("product_name"),
                                (Long.valueOf(rs.getString("category_id"))),
                                Long.valueOf(rs.getString("price"))));
            }
            DBService.con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return results;
    }
}
