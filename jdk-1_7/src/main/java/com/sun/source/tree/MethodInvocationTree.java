/*
 * Copyright (c) 2005, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package com.sun.source.tree;

import java.util.List;

/**
 * A tree node for a method invocation expression.
 * <p>
 * For example:
 * <pre>
 *   <em>identifier</em> ( <em>arguments</em> )
 *
 *   this . <em>typeArguments</em> <em>identifier</em> ( <em>arguments</em> )
 * </pre>
 *
 * @author Peter von der Ah&eacute;
 * @author Jonathan Gibbons
 * @jls section 15.12
 * @since 1.6
 */
public interface MethodInvocationTree extends ExpressionTree {
    List<? extends Tree> getTypeArguments();

    ExpressionTree getMethodSelect();

    List<? extends ExpressionTree> getArguments();
}