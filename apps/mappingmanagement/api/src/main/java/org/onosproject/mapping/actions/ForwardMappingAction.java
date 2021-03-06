/*
 * Copyright 2017-present Open Networking Laboratory
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
package org.onosproject.mapping.actions;

import java.util.Objects;

/**
 * Represents a Forward Action mapping.
 */
public final class ForwardMappingAction implements MappingAction {

    /**
     * Default constructor of ForwardMappingAction.
     */
    ForwardMappingAction() {
    }

    @Override
    public Type type() {
        return Type.FORWARD;
    }

    @Override
    public String toString() {
        return type().toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(type());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ForwardMappingAction) {
            return true;
        }
        return false;
    }
}
