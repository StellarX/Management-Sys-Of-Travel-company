## 开发中的所有问题记录
1. db.properties里jdbc.url里不能写192.168.161.10，改成localhost
    - debug time：1h
2. 执行verify install:install 解决了Maven里红色波浪线 
    - debug time：1day
3. 在IDEA中打包Maven项目安装到本地仓库时报错:Failed to execute goal org.apache.maven.plugins:maven-install-plugin:2.4:install (default-cli) on project api: The packaging for this project did not assign a file to the build artifact
    - 解决：不要用plugins里的install，而用Lifecycle里的 
    - debug time：1day
4. 执行添加product时出错，原因：insert语句里语法错误 
    - debug time：10min
5. PL/SQL 插入数据没有查询到  原因：忘记commit
    - debug time：10min
6. PL/SQL 出现Dynamic Performance Tables not accessible...问题 
    - 解决：使用system用户在pl/sql中找到username，然后在edit中选择“System privileges”tab，增加一个“select any dictionary”权限
    - debug time：10min
7. 点击订单详情出错，提示id=？ 重新install后 又好了
    - debug time：15min
8. 用户登陆验证时，IRoleDao中的findRoleByUserId写成了findRoleById
    - debug time：1h30min
9. 日志信息没有存储到数据库，重新clean、install 2次后，才好了
    - debug time：20min


