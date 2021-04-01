package cn.edu.nxu.it;

import cn.edu.nxu.it.config.MainConfig;
import com.jfinal.server.undertow.UndertowServer;

public class Application {

    public static void main(String[] args) {
        //开启undertow的JSP支持
       /*
       UndertowServer.create(MainConfig.class)
                .configWeb(wb -> {
                    wb.getDeploymentInfo().addServlet(JspServletBuilder.createServlet("Default Jsp Servlet", "*.jsp"));

                    HashMap<String, org.apache.jasper.deploy.TagLibraryInfo> tagLibraryInfo = new HashMap<String, TagLibraryInfo>();
                    JspServletBuilder.setupDeployment(wb.getDeploymentInfo(), new HashMap(),
                            tagLibraryInfo, new HackInstanceManager());
                })
                .start();
        */
        UndertowServer.start(MainConfig.class);

    }
}
