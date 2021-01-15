/*
 * Copyright 2013-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cloudfoundry.client.v3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.cloudfoundry.AllowNulls;
import org.cloudfoundry.Nullable;
import org.immutables.value.Value;

import java.util.Map;

/**
 * The metadata payload for a resource
 */
@JsonDeserialize
@Value.Immutable
abstract class _Metadata {

    /**
     * The metadata annotations
     */
    @AllowNulls
    @JsonInclude
    @JsonProperty("annotations")
    @Nullable
    abstract Map<String, String> getAnnotations();

    /**
     * The metadata labels
     */
    @AllowNulls
    @JsonInclude
    @JsonProperty("labels")
    @Nullable
    abstract Map<String, String> getLabels();

}
