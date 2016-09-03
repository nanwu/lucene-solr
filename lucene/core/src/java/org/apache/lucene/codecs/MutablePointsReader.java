/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.lucene.codecs;

/** {@link PointsReader} whose order of points can be changed.
 *  This class is useful for codecs to optimize flush.
 *  @lucene.internal */
public abstract class MutablePointsReader extends PointsReader {

  /** Sole constructor. */
  protected MutablePointsReader() {}

  /** Fill {@code packedValue} with the packed bytes of the i-th value. */
  public abstract void getValue(int i, byte[] packedValue);

  /** Get the k-th byte of the i-th value. */
  public abstract byte getByteAt(int i, int k);

  /** Return the doc ID of the i-th value. */
  public abstract int getDocID(int i);

  /** Swap the i-th and j-th values. */
  public abstract void swap(int i, int j);

}
