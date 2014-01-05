package net.bunselmeyer.hitch.app;

import net.bunselmeyer.hitch.jetty.JettyHttpServer;
import net.bunselmeyer.hitch.netty.NettyHttpServer;

public interface HttpServer {

    HttpServer listen(int port) throws Exception;

    public static HttpServer createJettyServer(App app) {
        return new JettyHttpServer(app);
    }

    public static HttpServer createNettyHttpServer(App app) {
        return new NettyHttpServer(app);
    }
}
