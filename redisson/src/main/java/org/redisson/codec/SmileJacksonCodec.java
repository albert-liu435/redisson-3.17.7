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
package org.redisson.codec;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.smile.SmileFactory;

/**Smile 另一个二进制的JSON编码
 * Smile binary codec.
 * <p>
 * Fully thread-safe.
 *
 * @author Nikita Koksharov
 *
 */
public class SmileJacksonCodec extends JsonJacksonCodec {

    public SmileJacksonCodec() {
        super(new ObjectMapper(new SmileFactory()));
    }

    public SmileJacksonCodec(ClassLoader classLoader) {
        super(createObjectMapper(classLoader, new ObjectMapper(new SmileFactory())));
    }

    public SmileJacksonCodec(ClassLoader classLoader, SmileJacksonCodec codec) {
        super(createObjectMapper(classLoader, codec.mapObjectMapper.copy()));
    }

}
