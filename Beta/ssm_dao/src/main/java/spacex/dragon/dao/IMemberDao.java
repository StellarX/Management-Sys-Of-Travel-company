package spacex.dragon.dao;

import org.apache.ibatis.annotations.Select;
import spacex.dragon.domain.Member;

public interface IMemberDao {

    @Select("select * from member where id = #{id}")
    public Member findById(String id) throws Exception;
}
