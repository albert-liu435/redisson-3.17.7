/**
 * Copyright (c) 2013-2021 Nikita Koksharov
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.redisson.connection;

import java.net.InetSocketAddress;

/**
 * redis连接监听器接口
 * Redis connection listener
 *
 * @author Nikita Koksharov
 *
 */
public interface ConnectionListener {

    /**
     * This method will be triggered when Redisson
     * connected to Redis server.
     *
     * @param addr - Redis server network address
     */
    void onConnect(InetSocketAddress addr);

    /**
     * This method will be triggered when Redisson
     * discovers that Redis server in disconnected state.
     *
     * @param addr - Redis server network address
     */
    void onDisconnect(InetSocketAddress addr);

}
