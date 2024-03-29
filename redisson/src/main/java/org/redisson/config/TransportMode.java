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
package org.redisson.config;

/**
 * 网络的传输方式
 * TransportMode.NIO,
 * TransportMode.EPOLL - 需要依赖里有netty-transport-native-epoll包（Linux） TransportMode.KQUEUE - 需要依赖里有 netty-transport-native-kqueue包（macOS）
 *
 * @author Nikita Koksharov
 */
public enum TransportMode {

    /**
     * NIO传输方式
     * Use NIO transport.
     */
    NIO,

    /**
     * Use EPOLL transport. Activates an unix socket if servers binded to loopback interface.
     * Requires <b>netty-transport-native-epoll</b> lib in classpath.
     */
    EPOLL,

    /**
     * Use KQUEUE transport. Requires <b>netty-transport-native-kqueue</b> lib in classpath.
     */
    KQUEUE,

}
