/*
 * [The "BSD license"]
 *  Copyright (c) 2012 Terence Parr
 *  Copyright (c) 2012 Sam Harwell
 *  All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions
 *  are met:
 *
 *  1. Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *  2. Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *  3. The name of the author may not be used to endorse or promote products
 *     derived from this software without specific prior written permission.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 *  IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 *  OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 *  IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 *  INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 *  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 *  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 *  THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 *  THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.uwyn.rife.antlr4.runtime;

import com.uwyn.rife.antlr4.runtime.misc.Interval;
import com.uwyn.rife.antlr4.runtime.misc.NotNull;

/** A source of characters for an ANTLR lexer. */
public interface CharStream extends IntStream {
	/**
	 * The minimum allowed value for a character in a {@code CharStream}.
	 */
	public static final int MIN_CHAR = Character.MIN_VALUE;

	/**
	 * The maximum allowed value for a character in a {@code CharStream}.
	 * <p/>
	 * This value is {@code Character.MAX_VALUE - 1}, which reserves the value
	 * {@code Character.MAX_VALUE} for special use within an implementing class.
	 * For some implementations, the data buffers required for supporting the
	 * marked ranges of {@link IntStream} are stored as {@code char[]} instead
	 * of {@code int[]}, with {@code Character.MAX_VALUE} being used instead of
	 * {@code -1} to mark the end of the stream internally.
	 */
	public static final int MAX_CHAR = Character.MAX_VALUE-1;

	/**
	 * This method returns the text for a range of characters within this input
	 * stream. This method is guaranteed to not throw an exception if the
	 * specified {@code interval} lies entirely within a marked range. For more
	 * information about marked ranges, see {@link IntStream#mark}.
	 *
	 * @param interval an interval within the stream
	 * @return the text of the specified interval
	 *
	 * @throws NullPointerException if {@code interval} is {@code null}
	 * @throws IllegalArgumentException if {@code interval.a < 0}, or if
	 * {@code interval.b < interval.a - 1}, or if {@code interval.b} lies at or
	 * past the end of the stream
	 * @throws UnsupportedOperationException if the stream does not support
	 * getting the text of the specified interval
	 */
	@NotNull
	public String getText(@NotNull Interval interval);
}
