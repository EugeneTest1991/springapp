package springapp.service;

import java.util.List;

import springapp.domain.Product;

public class SimpleProductManager implements ProductManager {

	private static final long serialVersionUID = 1L;
	
    public List<Product> getProducts() {
        throw new UnsupportedOperationException();
    }

    public void increasePrice(int percentage) {
        throw new UnsupportedOperationException();        
    }

    public void setProducts(List<Product> products) {
        throw new UnsupportedOperationException();        
    }

}
