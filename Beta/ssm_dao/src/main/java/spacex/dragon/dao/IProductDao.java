package spacex.dragon.dao;

import org.apache.ibatis.annotations.Select;
import spacex.dragon.domain.Product;
import java.util.List;

public interface IProductDao {

    //query all product info
    @Select("select * from product")
    public List<Product> findAll() throws Exception;
}
