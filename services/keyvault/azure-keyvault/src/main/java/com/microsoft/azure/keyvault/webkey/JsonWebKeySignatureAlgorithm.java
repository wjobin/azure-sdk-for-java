/**
 *
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.microsoft.azure.keyvault.webkey;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Supported JsonWebKey Algorithms
 */
public final class JsonWebKeySignatureAlgorithm {

    public static final String RS256  = "RS256";
    public static final String RS384  = "RS384";
    public static final String RS512  = "RS512";
    public static final String RSNULL = "RSNULL";

    public static final List<String> ALL_ALGORITHMS = Collections.unmodifiableList(Arrays.asList(new String[] { RS256, RS384, RS512, RSNULL }));

    private JsonWebKeySignatureAlgorithm() {
        // not instantiable
    }
}
