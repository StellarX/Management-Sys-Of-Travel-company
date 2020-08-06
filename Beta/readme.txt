问题记录

1. db.properties里jdbc.url里不能写192.168.161.10
2. 执行verify install:install 解决了Maven里红色波浪线
3. 在IDEA中打包Maven项目安装到本地仓库时报错:Failed to execute goal org.apache.maven.plugins:maven-install-plugin:2.4:install (default-cli) on project api: The packaging for this project did not assign a file to the build artifact
    解决：不要用plugins里的install，而用Lifecycle里的

环境搭建 不知为什么


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


