/*
 * Copyright 2013-2026, Seqera Labs
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
package nextflow.util;

import nextflow.script.dsl.Nullable;
import nextflow.script.types.Record;

/**
 * A simple Java-based record fixture used in TypeHelperTest.
 * Defined in Java so that getDeclaredFields() returns exactly the declared
 * fields without any Groovy-added synthetic fields.
 */
public class Sample implements Record {
    public String name;
    public Integer count;
    @Nullable
    public String optional;
}
