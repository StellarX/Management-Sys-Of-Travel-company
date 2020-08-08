package spacex.dragon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spacex.dragon.dao.IPermissionDao;
import spacex.dragon.domain.Permission;
import spacex.dragon.service.IPermissionService;

import java.util.List;
@Service
public class PermissionServiceImpl implements IPermissionService {

    @Autowired
    private IPermissionDao permissionDao;

    @Override
    public void save(Permission permission) throws Exception{
        permissionDao.save(permission);
    }

    @Override
    public List<Permission> findAll() throws Exception{
        return permissionDao.findAll();
    }
}
