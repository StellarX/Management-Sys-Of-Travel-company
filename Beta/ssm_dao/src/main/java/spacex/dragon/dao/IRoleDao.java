package spacex.dragon.dao;

import org.apache.ibatis.annotations.Select;
import spacex.dragon.domain.Role;

import java.util.List;

public interface IRoleDao {

    @Select("select * from role where id in (select roleId from users_role where userId=#{userId})")
    List<Role> findRoleByUserId(String userId) throws Exception;
}
