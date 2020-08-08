package spacex.dragon.service;

import spacex.dragon.domain.Role;
import java.util.List;

public interface IRoleService {

    public List<Role> findAll() throws Exception;

    void save(Role role) throws Exception;
}
