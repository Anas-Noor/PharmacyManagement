package Service;

import dao.ProductDao;
import products.Product;

import java.util.List;

public class ProductService {
    public List<Product> getAllProducts(){
        return ProductDao.getAllProducts();
    }
}
