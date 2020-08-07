问题记录

1. db.properties里jdbc.url里不能写192.168.161.10 1hour
2. 执行verify install:install 解决了Maven里红色波浪线 1day
3. 在IDEA中打包Maven项目安装到本地仓库时报错:Failed to execute goal org.apache.maven.plugins:maven-install-plugin:2.4:install (default-cli) on project api: The packaging for this project did not assign a file to the build artifact
    解决：不要用plugins里的install，而用Lifecycle里的 1day
4. 执行添加product时出错，原因：insert语句里语法错误 10min
环境搭建 不知为什么
5. PL/SQL 插入数据没有查询到  原因：没有提交
6. PL/SQL 出现Dynamic Performance Tables not accessible...问题
    解决：使用system用户在pl/sql中找到username，然后在edit中选择“System privileges”tab，增加一个“select any dictionary”权限

待记忆
public class DateUtils {
    public static String date2String(Date date, String patt){
        SimpleDateFormat sdf = new SimpleDateFormat(patt);
        String format = sdf.format(date);
        return format;
    }
    public static Date string2Date(String str, String patt) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(patt);
        Date parse = sdf.parse(str);
        return parse;
    }
}

departureTimeStr = DateUtils.date2String(departureTime, "yyyy-MM-dd HH:mm:ss");


