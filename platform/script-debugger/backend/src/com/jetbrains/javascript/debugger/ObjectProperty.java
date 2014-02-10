// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package com.jetbrains.javascript.debugger;

import com.intellij.openapi.util.AsyncResult;

/**
 * Exposes additional data if variable is a property of object and its property descriptor
 * is available.
 */
public interface ObjectProperty extends Variable {
  /**
   * @return whether property described as 'writable'
   */
  boolean isWritable();

  /**
   * @return property getter value (function or undefined) or null if not an accessor property
   */
  Value getGetter();

  /**
   * @return property setter value (function or undefined) or null if not an accessor property
   */
  Value getSetter();

  /**
   * @return whether property described as 'configurable'
   */
  boolean isConfigurable();

  /**
   * @return whether property described as 'enumerable'
   */
  boolean isEnumerable();

  /**
   * Asynchronously evaluates property getter and returns property value
   */
  AsyncResult<Value> evaluateGet(EvaluateContext evaluateContext);
}
