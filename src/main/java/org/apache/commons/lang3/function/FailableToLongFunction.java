/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.lang3.function;

import java.util.function.ToLongFunction;

/**
 * A functional interface like {@link ToLongFunction} that declares a {@link Throwable}.
 *
 * @param <T> the type of the first argument to the function
 * @param <E> The kind of thrown exception or error.
 * @since 3.11
 */
@FunctionalInterface
public interface FailableToLongFunction<T, E extends Throwable> {

    /** NOP singleton */
    @SuppressWarnings("rawtypes")
    FailableToLongFunction NOP = t -> 0L;

    /**
     * Gets the NOP singleton.
     *
     * @param <T> the type of the argument to the function
     * @param <E> The kind of thrown exception or error.
     * @return The NOP singleton.
     */
    @SuppressWarnings("unchecked")
    static <T, E extends Throwable> FailableToLongFunction<T, E> nop() {
        return NOP;
    }

    /**
     * Applies this function to the given arguments.
     *
     * @param t the first function argument
     * @return the function result
     * @throws E Thrown when the function fails.
     */
    long applyAsLong(T t) throws E;
}
