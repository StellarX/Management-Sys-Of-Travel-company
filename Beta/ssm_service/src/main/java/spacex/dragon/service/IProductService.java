package spacex.dragon.service;

import spacex.dragon.domain.Product;

import java.util.List;

public interface IProductService {
    public List<Product> findAll() throws Exception;

    void save(Product pro) throws Exception;
}
