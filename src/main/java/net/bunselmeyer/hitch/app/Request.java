package net.bunselmeyer.hitch.app;

import io.netty.handler.codec.http.Cookie;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface Request {

    String protocol();

    String host();

    String path();

    String query();

    String uri();

    String method();

    Map<String, String> headers();

    String header(String name);

    Map<String, Cookie> cookies();

    Cookie cookie(String name);

    Map<String, String> routeParams();

    String routeParam(String name);

    Map<String, List<String>> queryParams();

    List<String> queryParams(String name);

    String queryParam(String name);

    <B> B bodyAsJson(Class<B> type) throws IOException;

    String bodyAsText() throws IOException;

    Map<String, List<String>> bodyPostParameters();

    List<String> bodyPostParameters(String name);

    String bodyPostParameter(String name);
}
