/*-
 * Copyright (C) 2007 Erik Larsson
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

package org.catacombae.dmgextractor.io;

// /* unused... remnants of old ideas */
public class CharArrayBuilder {
    /*
     * private int growConstant; private char[] backingArray; private int pos;
     * 
     * public CharArrayBuilder() { this(512); } public CharArrayBuilder(int
     * capacity) { growConstant = capacity; backingArray = new char[capacity]; pos =
     * 0; }
     * 
     * public void put(char c) { if(pos == backingArray.length) growArray();
     * backingArray[pos++] = c; }
     * 
     * public byte[] clearBuffer() { byte[] result = new byte[pos];
     * System.arraycopy(backingArray, 0, result, 0, result.length); backingArray =
     * new byte[growConstant]; pos = 0; return result; }
     * 
     * private void growArray() { byte[] oldArray = backingArray; byte[] newArray =
     * new byte[backingArray.length+growConstant]; System.arraycopy(oldArray, 0,
     * newArray, 0, oldArray.length); backingArray = newArray; }
     */
}
