package spacex.dragon.dao;

import org.apache.ibatis.annotations.Select;
import spacex.dragon.domain.Traveller;

import java.util.List;

public interface ITravellerDao {

    @Select("select * from traveller where id in(select travellerId from order_traveller where orderId=#{ordersId})")
    List<Traveller> findByOrdersId(String ordersId) throws Exception;
}
