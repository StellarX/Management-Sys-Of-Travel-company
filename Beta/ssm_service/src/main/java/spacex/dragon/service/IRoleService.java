package spacex.dragon.service;

import spacex.dragon.domain.Permission;
import spacex.dragon.domain.Role;
import java.util.List;

public interface IRoleService {

    public List<Role> findAll() throws Exception;

    public Role findById(String roleId) throws Exception;

    void save(Role role) throws Exception;

    List<Permission> findOtherPermissions(String roleId) throws Exception;

    void addPermissionToRole(String roleId, String[] permissionIds) throws Exception;
}
