// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package com.jetbrains.javascript.debugger;

import com.intellij.openapi.util.AsyncResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface CallFrame {
  /**
   * @return the scopes known in this frame; ordered, innermost first, global scope last
   */
  @NotNull
  Scope[] getVariableScopes();

  /**
   * @return the receiver variable known in this frame
   */
  AsyncResult<Variable> getReceiverVariable();

  int getLine();

  int getColumn();

  /**
   * @return the name of the current function of this frame
   */
  @Nullable
  String getFunctionName();

  /**
   * @return context for evaluating expressions in scope of this frame
   */
  EvaluateContext getEvaluateContext();
}