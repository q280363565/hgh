package cn.edu.nxu.it;

import com.jfinal.core.JFinal;

public class JettyStarter {
    public static void main(String[] args) {
        JFinal.start("web-app/src/main/webapp", 8080, "/", 15);
    }
}
