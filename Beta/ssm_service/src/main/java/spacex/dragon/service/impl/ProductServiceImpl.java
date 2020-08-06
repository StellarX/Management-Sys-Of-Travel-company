package spacex.dragon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spacex.dragon.dao.IProductDao;
import spacex.dragon.domain.Product;
import spacex.dragon.service.IProductService;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductDao productDao;
    @Override
    public List<Product> findAll() throws Exception{
        return productDao.findAll();
    }

    @Override
    public void save(Product pro) throws Exception {
        productDao.save(pro);
    }
}
