// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

public interface LoopOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.jetbrains.kotlin.backend.common.serialization.proto.Loop)
    org.jetbrains.kotlin.protobuf.MessageLiteOrBuilder {

  /**
   * <code>required int32 loop_id = 1;</code>
   */
  boolean hasLoopId();
  /**
   * <code>required int32 loop_id = 1;</code>
   */
  int getLoopId();

  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression condition = 2;</code>
   */
  boolean hasCondition();
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression condition = 2;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression getCondition();

  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex label = 3;</code>
   */
  boolean hasLabel();
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex label = 3;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex getLabel();

  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression body = 4;</code>
   */
  boolean hasBody();
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression body = 4;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression getBody();

  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin origin = 5;</code>
   */
  boolean hasOrigin();
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin origin = 5;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin getOrigin();
}