/*
 * Copyright 2015 DuraSpace, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fcrepo.audit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author awoods
 * @since 2016-07-03
 */
public class UuidPathMinterTest {

    private static final String UUID = "27c605e4-98c6-4240-86be-f1bb1971d694";

    private static final String IDENTIFIER_PATH = "27/c6/05/e4/" + UUID;

    @Test
    public void get() {
        final UuidPathMinter pathMinter = new UuidPathMinter();
        final String path = pathMinter.get(UUID);
        assertEquals(IDENTIFIER_PATH, path);
    }

}