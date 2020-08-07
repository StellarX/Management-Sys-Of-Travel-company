package spacex.dragon.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import spacex.dragon.domain.Product;
import java.util.List;

public interface IProductDao {

    //query all product info
    @Select("select * from product")
    public List<Product> findAll() throws Exception;

    @Insert("insert into product(productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    public void save(Product pro);

    @Select("select * from product where id=#{id}")
    public Product findById(String id) throws Exception;
}
