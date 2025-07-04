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
package org.apache.commons.lang3.tuple;

import java.util.Objects;

/**
 * A mutable triple consisting of three {@link Object} elements.
 *
 * <p>Not #ThreadSafe#</p>
 *
 * @param <L> the left element type.
 * @param <M> the middle element type.
 * @param <R> the right element type.
 * @since 3.2
 */
public class MutableTriple<L, M, R> extends Triple<L, M, R> {

    /**
     * The empty array singleton.
     * <p>
     * Consider using {@link #emptyArray()} to avoid generics warnings.
     * </p>
     *
     * @since 3.10
     */
    public static final MutableTriple<?, ?, ?>[] EMPTY_ARRAY = {};

    /** Serialization version */
    private static final long serialVersionUID = 1L;

    /**
     * Returns the empty array singleton that can be assigned without compiler warning.
     *
     * @param <L> the left element type.
     * @param <M> the middle element type.
     * @param <R> the right element type.
     * @return the empty array singleton that can be assigned without compiler warning.
     * @since 3.10
     */
    @SuppressWarnings("unchecked")
    public static <L, M, R> MutableTriple<L, M, R>[] emptyArray() {
        return (MutableTriple<L, M, R>[]) EMPTY_ARRAY;
    }

    /**
     * Obtains a mutable triple of three objects inferring the generic types.
     *
     * <p>This factory allows the triple to be created using inference to
     * obtain the generic types.</p>
     *
     * @param <L> the left element type.
     * @param <M> the middle element type.
     * @param <R> the right element type.
     * @param left  the left element, may be null.
     * @param middle  the middle element, may be null.
     * @param right  the right element, may be null.
     * @return a triple formed from the three parameters, not null.
     */
    public static <L, M, R> MutableTriple<L, M, R> of(final L left, final M middle, final R right) {
        return new MutableTriple<>(left, middle, right);
    }

    /**
     * Obtains a mutable triple of three non-null objects inferring the generic types.
     *
     * <p>This factory allows the triple to be created using inference to
     * obtain the generic types.</p>
     *
     * @param <L> the left element type.
     * @param <M> the middle element type.
     * @param <R> the right element type.
     * @param left  the left element, may not be null.
     * @param middle  the middle element, may not be null.
     * @param right  the right element, may not be null.
     * @return a triple formed from the three parameters, not null.
     * @throws NullPointerException if any input is null.
     * @since 3.13.0
     */
    public static <L, M, R> MutableTriple<L, M, R> ofNonNull(final L left, final M middle, final R right) {
        return of(Objects.requireNonNull(left, "left"), Objects.requireNonNull(middle, "middle"), Objects.requireNonNull(right, "right"));
    }

    /** Left object. */
    public L left;
    /** Middle object. */
    public M middle;

    /** Right object. */
    public R right;

    /**
     * Create a new triple instance of three nulls.
     */
    public MutableTriple() {
    }

    /**
     * Create a new triple instance.
     *
     * @param left  the left value, may be null.
     * @param middle  the middle value, may be null.
     * @param right  the right value, may be null.
     */
    public MutableTriple(final L left, final M middle, final R right) {
        this.left = left;
        this.middle = middle;
        this.right = right;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public L getLeft() {
        return left;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public M getMiddle() {
        return middle;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public R getRight() {
        return right;
    }

    /**
     * Sets the left element of the triple.
     *
     * @param left  the new value of the left element, may be null.
     */
    public void setLeft(final L left) {
        this.left = left;
    }

    /**
     * Sets the middle element of the triple.
     *
     * @param middle  the new value of the middle element, may be null.
     */
    public void setMiddle(final M middle) {
        this.middle = middle;
    }

    /**
     * Sets the right element of the triple.
     *
     * @param right  the new value of the right element, may be null.
     */
    public void setRight(final R right) {
        this.right = right;
    }
}

