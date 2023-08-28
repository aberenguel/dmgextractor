/*-
 * Copyright (C) 2014 Erik Larsson
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.catacombae.dmg.encrypted;

/**
 * @author <a href="http://www.catacombae.org/" target="_top">Erik Larsson</a>
 */
public class Assert {
    public static void eq(long a, long b) {
        eq(a, b, null);
    }

    public static void eq(long a, long b, String message) {
        if (a != b)
            throw new InvalidAssertionException("Equality asserion " + a + " == " + b + " failed!" + (message != null ? " Message: " + message : ""));
    }

    public static void neq(long a, long b) {
        neq(a, b, null);
    }

    public static void neq(long a, long b, String message) {
        if (a == b)
            throw new InvalidAssertionException(
                    "Non-equality asserion " + a + " != " + b + " failed!" + (message != null ? " Message: " + message : ""));
    }

    public static class InvalidAssertionException extends RuntimeException {
        public InvalidAssertionException(String message) {
            super(message);
        }
    }
}
