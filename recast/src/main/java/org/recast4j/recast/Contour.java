/*
Copyright (c) 2009-2010 Mikko Mononen memon@inside.org
recast4j Copyright (c) 2015-2019 Piotr Piastucki piotr@jtilia.org

This software is provided 'as-is', without any express or implied
warranty.  In no event will the authors be held liable for any damages
arising from the use of this software.
Permission is granted to anyone to use this software for any purpose,
including commercial applications, and to alter it and redistribute it
freely, subject to the following restrictions:
1. The origin of this software must not be misrepresented; you must not
 claim that you wrote the original software. If you use this software
 in a product, an acknowledgment in the product documentation would be
 appreciated but is not required.
2. Altered source versions must be plainly marked as such, and must not be
 misrepresented as being the original software.
3. This notice may not be removed or altered from any source distribution.
*/
package org.recast4j.recast;

/** Represents a simple, non-overlapping contour in field space. */
public class Contour {

    /** Simplified contour vertex and connection data. [Size: 4 * #nverts] */
    public int[] verts;
    /** The number of vertices in the simplified contour. */
    public int nverts;
    /** Raw contour vertex and connection data. [Size: 4 * #nrverts] */
    public int[] rverts;
    /** The number of vertices in the raw contour. */
    public int nrverts;
    /** The region id of the contour. */
    public int area;
    /** The area id of the contour. */
    public int reg;

}
