package Service;

import dao.ProductDao;
import products.Product;

import java.util.List;

public class ProductService {

    public static List<Product> getAllProducts(){
        return ProductDao.getAllProducts();
    }

    public static Object[][] getAllMedicines(){
        int count = (int) getAllProducts().stream().count();
        Object [][] data = new Object[count][4];
        for (int i = 0; i < count ; i++) {
            data[i][0] = getAllProducts().get(i).getM_name();
            data[i][1] = getAllProducts().get(i).getM_varient();
            data[i][2] = getAllProducts().get(i).getPrice();
            data[i][3] = getAllProducts().get(i).getQuantity();
        }
        return data;
    }

}
