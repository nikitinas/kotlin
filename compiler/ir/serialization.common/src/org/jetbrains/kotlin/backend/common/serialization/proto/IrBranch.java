// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

/**
 * Protobuf type {@code org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch}
 */
public final class IrBranch extends
    org.jetbrains.kotlin.protobuf.GeneratedMessageLite implements
    // @@protoc_insertion_point(message_implements:org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch)
    IrBranchOrBuilder {
  // Use IrBranch.newBuilder() to construct.
  private IrBranch(org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private IrBranch(boolean noInit) { this.unknownFields = org.jetbrains.kotlin.protobuf.ByteString.EMPTY;}

  private static final IrBranch defaultInstance;
  public static IrBranch getDefaultInstance() {
    return defaultInstance;
  }

  public IrBranch getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final org.jetbrains.kotlin.protobuf.ByteString unknownFields;
  private IrBranch(
      org.jetbrains.kotlin.protobuf.CodedInputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    initFields();
    int mutable_bitField0_ = 0;
    org.jetbrains.kotlin.protobuf.ByteString.Output unknownFieldsOutput =
        org.jetbrains.kotlin.protobuf.ByteString.newOutput();
    org.jetbrains.kotlin.protobuf.CodedOutputStream unknownFieldsCodedOutput =
        org.jetbrains.kotlin.protobuf.CodedOutputStream.newInstance(
            unknownFieldsOutput);
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(input, unknownFieldsCodedOutput,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
              subBuilder = condition_.toBuilder();
            }
            condition_ = input.readMessage(org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(condition_);
              condition_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 18: {
            org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
              subBuilder = result_.toBuilder();
            }
            result_ = input.readMessage(org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(result_);
              result_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
            break;
          }
        }
      }
    } catch (org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      try {
        unknownFieldsCodedOutput.flush();
      } catch (java.io.IOException e) {
      // Should not happen
      } finally {
        unknownFields = unknownFieldsOutput.toByteString();
      }
      makeExtensionsImmutable();
    }
  }
  public static org.jetbrains.kotlin.protobuf.Parser<IrBranch> PARSER =
      new org.jetbrains.kotlin.protobuf.AbstractParser<IrBranch>() {
    public IrBranch parsePartialFrom(
        org.jetbrains.kotlin.protobuf.CodedInputStream input,
        org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
      return new IrBranch(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public org.jetbrains.kotlin.protobuf.Parser<IrBranch> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int CONDITION_FIELD_NUMBER = 1;
  private org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression condition_;
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression condition = 1;</code>
   */
  public boolean hasCondition() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression condition = 1;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression getCondition() {
    return condition_;
  }

  public static final int RESULT_FIELD_NUMBER = 2;
  private org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression result_;
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression result = 2;</code>
   */
  public boolean hasResult() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression result = 2;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression getResult() {
    return result_;
  }

  private void initFields() {
    condition_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.getDefaultInstance();
    result_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.getDefaultInstance();
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasCondition()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasResult()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getCondition().isInitialized()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getResult().isInitialized()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(org.jetbrains.kotlin.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, condition_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(2, result_);
    }
    output.writeRawBytes(unknownFields);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeMessageSize(1, condition_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeMessageSize(2, result_);
    }
    size += unknownFields.size();
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  protected java.lang.Object writeReplace()
      throws java.io.ObjectStreamException {
    return super.writeReplace();
  }

  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch parseFrom(
      org.jetbrains.kotlin.protobuf.ByteString data)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch parseFrom(
      org.jetbrains.kotlin.protobuf.ByteString data,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch parseFrom(byte[] data)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch parseFrom(
      byte[] data,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch parseFrom(
      java.io.InputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch parseDelimitedFrom(
      java.io.InputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch parseFrom(
      org.jetbrains.kotlin.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch parseFrom(
      org.jetbrains.kotlin.protobuf.CodedInputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  /**
   * Protobuf type {@code org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch}
   */
  public static final class Builder extends
      org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder<
        org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch, Builder>
      implements
      // @@protoc_insertion_point(builder_implements:org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch)
      org.jetbrains.kotlin.backend.common.serialization.proto.IrBranchOrBuilder {
    // Construct using org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      condition_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.getDefaultInstance();
      bitField0_ = (bitField0_ & ~0x00000001);
      result_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.getDefaultInstance();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch getDefaultInstanceForType() {
      return org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch.getDefaultInstance();
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch build() {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch buildPartial() {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch result = new org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.condition_ = condition_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.result_ = result_;
      result.bitField0_ = to_bitField0_;
      return result;
    }

    public Builder mergeFrom(org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch other) {
      if (other == org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch.getDefaultInstance()) return this;
      if (other.hasCondition()) {
        mergeCondition(other.getCondition());
      }
      if (other.hasResult()) {
        mergeResult(other.getResult());
      }
      setUnknownFields(
          getUnknownFields().concat(other.unknownFields));
      return this;
    }

    public final boolean isInitialized() {
      if (!hasCondition()) {
        
        return false;
      }
      if (!hasResult()) {
        
        return false;
      }
      if (!getCondition().isInitialized()) {
        
        return false;
      }
      if (!getResult().isInitialized()) {
        
        return false;
      }
      return true;
    }

    public Builder mergeFrom(
        org.jetbrains.kotlin.protobuf.CodedInputStream input,
        org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression condition_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.getDefaultInstance();
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression condition = 1;</code>
     */
    public boolean hasCondition() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression condition = 1;</code>
     */
    public org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression getCondition() {
      return condition_;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression condition = 1;</code>
     */
    public Builder setCondition(org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression value) {
      if (value == null) {
        throw new NullPointerException();
      }
      condition_ = value;

      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression condition = 1;</code>
     */
    public Builder setCondition(
        org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.Builder builderForValue) {
      condition_ = builderForValue.build();

      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression condition = 1;</code>
     */
    public Builder mergeCondition(org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression value) {
      if (((bitField0_ & 0x00000001) == 0x00000001) &&
          condition_ != org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.getDefaultInstance()) {
        condition_ =
          org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.newBuilder(condition_).mergeFrom(value).buildPartial();
      } else {
        condition_ = value;
      }

      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression condition = 1;</code>
     */
    public Builder clearCondition() {
      condition_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.getDefaultInstance();

      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    private org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression result_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.getDefaultInstance();
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression result = 2;</code>
     */
    public boolean hasResult() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression result = 2;</code>
     */
    public org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression getResult() {
      return result_;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression result = 2;</code>
     */
    public Builder setResult(org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression value) {
      if (value == null) {
        throw new NullPointerException();
      }
      result_ = value;

      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression result = 2;</code>
     */
    public Builder setResult(
        org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.Builder builderForValue) {
      result_ = builderForValue.build();

      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression result = 2;</code>
     */
    public Builder mergeResult(org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression value) {
      if (((bitField0_ & 0x00000002) == 0x00000002) &&
          result_ != org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.getDefaultInstance()) {
        result_ =
          org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.newBuilder(result_).mergeFrom(value).buildPartial();
      } else {
        result_ = value;
      }

      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression result = 2;</code>
     */
    public Builder clearResult() {
      result_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.getDefaultInstance();

      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch)
  }

  static {
    defaultInstance = new IrBranch(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch)
}
