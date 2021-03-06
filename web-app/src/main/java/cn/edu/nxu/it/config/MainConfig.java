package cn.edu.nxu.it.config;

import com.jfinal.config.*;
import com.jfinal.ext.handler.ContextPathHandler;
import com.jfinal.ext.interceptor.SessionInViewInterceptor;
import com.jfinal.template.Engine;


public class MainConfig extends JFinalConfig {
    @Override
    public void configConstant(Constants constants) {

        //加载配置文件 文件放到/src/main/resources下
        //PropKit.use("myconfig.properties.example");

        //配置JFInal的开发模式
        //constants.setDevMode(PropKit.getBoolean("devMode", true));

        //允许直接访问JSP文件
        constants.setDenyAccessJsp(false);

    }

    @Override
    public void configRoute(Routes routes) {
        //配置模板的基础路径 /开头的路径是从webapp开始
        //routes.setBaseViewPath("/WEB-INF/templates");

        // 开启路由扫描，扫描仅会在该包以及该包的子包下进行
        //routes.scan("cn.edu.nxu.it.controller.");

    }

    @Override
    public void configEngine(Engine engine) {

    }

    @Override
    public void configPlugin(Plugins plugins) {
        //数据库支持

        //添加Druid数据库连接池插件，分别传入 druid 可以根据jdbcurl自动识别驱动类型
      /*
        DruidPlugin druidPlugin = new DruidPlugin(
                PropKit.get("jdbc.url"), // jdbc url
                PropKit.get("jdbc.username", "root"),  //数据库连接用户名
                PropKit.get("jdbc.password", "root")  //数据库连接密码
        );
        //通过add方法添加插件
        plugins.add(druidPlugin);
    */

        //添加ActiveRecord插件
    /*
        ActiveRecordPlugin activeRecordPlugin = new ActiveRecordPlugin(druidPlugin);
        plugins.add(activeRecordPlugin);
        //设置ActiveRecord插件数据库方言，默认为MysqlDialect
        activeRecordPlugin.setDialect(new MysqlDialect());
        //根据配置文件配置ActiveRecord插件的开发模式
        activeRecordPlugin.setDevMode(PropKit.getBoolean("devMode", false));
        //根据配置文件配置ActiveRecord插件是否输出SQL语句
        activeRecordPlugin.setShowSql(PropKit.getBoolean("showSql", false));
        activeRecordPlugin.getEngine().setToClassPathSourceFactory();
        activeRecordPlugin.getEngine().setCompressorOn(' ');
        activeRecordPlugin.getEngine().setBaseTemplatePath("sql");
        activeRecordPlugin.addSqlTemplate("all.jtl");

        //调用生成器生成的表映射
        //_MappingKit.mapping(activeRecordPlugin);
    */
    }

    @Override
    public void configInterceptor(Interceptors interceptors) {
        //配置SessionInView拦截器 可以在模板中直接调用session
        interceptors.add(new SessionInViewInterceptor());
    }

    @Override
    public void configHandler(Handlers handlers) {
        /*
        添加上下文路径handler，可以在模板中使用base变量获得项目的上下文路径
        便于中间件中有多个项目上引用资源的URL调用
        */
        handlers.add(new ContextPathHandler("base"));
    }
}
