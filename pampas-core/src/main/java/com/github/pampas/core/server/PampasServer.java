package com.github.pampas.core.server;

import java.net.InetAddress;

/**
 * Description:
 * User: darrenfu
 * Date: 2018-09-17
 */
public interface PampasServer {

    String id();

    String serverName();

    InetAddress address();

    Integer port();

    ServerState status();
}