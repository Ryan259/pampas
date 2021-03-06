/*
 *
 *  *  Copyright 2009-2018.
 *  *
 *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *    you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *    Unless required by applicable law or agreed to in writing, software
 *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *    See the License for the specific language governing permissions and
 *  *    limitations under the License.
 *
 */

package com.github.pampas.core.server;

import io.netty.util.NetUtil;
import lombok.Data;

/**
 * Created by darrenfu on 18-1-22.
 *
 * @author: darrenfu
 * @date: 18-1-22
 */
@Data
public class ServerConfig {

    // *********************system configuration*********************

    private Integer boss;
    private Integer worker;


    public boolean tcpNoDelay = true;

    public boolean soKeepAlive = true;

    public int soBacklog = NetUtil.SOMAXCONN;


    // StandardThreadExecutor 业务线程池配置

    public int coreThread = 10;

    public int maxThreads = 200;

    public static ServerConfig defaultConfig() {
        ServerConfig serverConfig = new ServerConfig();
        return serverConfig;
    }


}
