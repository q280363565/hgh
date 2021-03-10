package cn.edu.nxu.it;

import cn.edu.nxu.it.config.MainConfig;
import com.jfinal.server.undertow.UndertowServer;

public class Application {

    public static void main(String[] args) {
        //  JFinal.start("web-app/src/main/webapp", 8080, "/", 15);
        UndertowServer.start(MainConfig.class);

    }
}
