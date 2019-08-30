// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

/**
 * Protobuf type {@code org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument}
 */
public final class IrTypeArgument extends
    org.jetbrains.kotlin.protobuf.GeneratedMessageLite implements
    // @@protoc_insertion_point(message_implements:org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument)
    IrTypeArgumentOrBuilder {
  // Use IrTypeArgument.newBuilder() to construct.
  private IrTypeArgument(org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private IrTypeArgument(boolean noInit) { this.unknownFields = org.jetbrains.kotlin.protobuf.ByteString.EMPTY;}

  private static final IrTypeArgument defaultInstance;
  public static IrTypeArgument getDefaultInstance() {
    return defaultInstance;
  }

  public IrTypeArgument getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final org.jetbrains.kotlin.protobuf.ByteString unknownFields;
  private IrTypeArgument(
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
            org.jetbrains.kotlin.backend.common.serialization.proto.IrStarProjection.Builder subBuilder = null;
            if (kindCase_ == 1) {
              subBuilder = ((org.jetbrains.kotlin.backend.common.serialization.proto.IrStarProjection) kind_).toBuilder();
            }
            kind_ = input.readMessage(org.jetbrains.kotlin.backend.common.serialization.proto.IrStarProjection.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((org.jetbrains.kotlin.backend.common.serialization.proto.IrStarProjection) kind_);
              kind_ = subBuilder.buildPartial();
            }
            kindCase_ = 1;
            break;
          }
          case 18: {
            org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection.Builder subBuilder = null;
            if (kindCase_ == 2) {
              subBuilder = ((org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection) kind_).toBuilder();
            }
            kind_ = input.readMessage(org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection) kind_);
              kind_ = subBuilder.buildPartial();
            }
            kindCase_ = 2;
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
  public static org.jetbrains.kotlin.protobuf.Parser<IrTypeArgument> PARSER =
      new org.jetbrains.kotlin.protobuf.AbstractParser<IrTypeArgument>() {
    public IrTypeArgument parsePartialFrom(
        org.jetbrains.kotlin.protobuf.CodedInputStream input,
        org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
      return new IrTypeArgument(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public org.jetbrains.kotlin.protobuf.Parser<IrTypeArgument> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  private int kindCase_ = 0;
  private java.lang.Object kind_;
  public enum KindCase
      implements org.jetbrains.kotlin.protobuf.Internal.EnumLite {
    STAR(1),
    TYPE(2),
    KIND_NOT_SET(0);
    private int value = 0;
    private KindCase(int value) {
      this.value = value;
    }
    public static KindCase valueOf(int value) {
      switch (value) {
        case 1: return STAR;
        case 2: return TYPE;
        case 0: return KIND_NOT_SET;
        default: throw new java.lang.IllegalArgumentException(
          "Value is undefined for this oneof enum.");
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public KindCase
  getKindCase() {
    return KindCase.valueOf(
        kindCase_);
  }

  public static final int STAR_FIELD_NUMBER = 1;
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStarProjection star = 1;</code>
   */
  public boolean hasStar() {
    return kindCase_ == 1;
  }
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStarProjection star = 1;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.IrStarProjection getStar() {
    if (kindCase_ == 1) {
       return (org.jetbrains.kotlin.backend.common.serialization.proto.IrStarProjection) kind_;
    }
    return org.jetbrains.kotlin.backend.common.serialization.proto.IrStarProjection.getDefaultInstance();
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection type = 2;</code>
   */
  public boolean hasType() {
    return kindCase_ == 2;
  }
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection type = 2;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection getType() {
    if (kindCase_ == 2) {
       return (org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection) kind_;
    }
    return org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection.getDefaultInstance();
  }

  private void initFields() {
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (hasType()) {
      if (!getType().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(org.jetbrains.kotlin.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (kindCase_ == 1) {
      output.writeMessage(1, (org.jetbrains.kotlin.backend.common.serialization.proto.IrStarProjection) kind_);
    }
    if (kindCase_ == 2) {
      output.writeMessage(2, (org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection) kind_);
    }
    output.writeRawBytes(unknownFields);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (kindCase_ == 1) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeMessageSize(1, (org.jetbrains.kotlin.backend.common.serialization.proto.IrStarProjection) kind_);
    }
    if (kindCase_ == 2) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeMessageSize(2, (org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection) kind_);
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

  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument parseFrom(
      org.jetbrains.kotlin.protobuf.ByteString data)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument parseFrom(
      org.jetbrains.kotlin.protobuf.ByteString data,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument parseFrom(byte[] data)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument parseFrom(
      byte[] data,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument parseFrom(
      java.io.InputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument parseDelimitedFrom(
      java.io.InputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument parseFrom(
      org.jetbrains.kotlin.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument parseFrom(
      org.jetbrains.kotlin.protobuf.CodedInputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  /**
   * Protobuf type {@code org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument}
   */
  public static final class Builder extends
      org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder<
        org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument, Builder>
      implements
      // @@protoc_insertion_point(builder_implements:org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument)
      org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgumentOrBuilder {
    // Construct using org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument.newBuilder()
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
      kindCase_ = 0;
      kind_ = null;
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument getDefaultInstanceForType() {
      return org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument.getDefaultInstance();
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument build() {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument buildPartial() {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument result = new org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (kindCase_ == 1) {
        result.kind_ = kind_;
      }
      if (kindCase_ == 2) {
        result.kind_ = kind_;
      }
      result.bitField0_ = to_bitField0_;
      result.kindCase_ = kindCase_;
      return result;
    }

    public Builder mergeFrom(org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument other) {
      if (other == org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument.getDefaultInstance()) return this;
      switch (other.getKindCase()) {
        case STAR: {
          mergeStar(other.getStar());
          break;
        }
        case TYPE: {
          mergeType(other.getType());
          break;
        }
        case KIND_NOT_SET: {
          break;
        }
      }
      setUnknownFields(
          getUnknownFields().concat(other.unknownFields));
      return this;
    }

    public final boolean isInitialized() {
      if (hasType()) {
        if (!getType().isInitialized()) {
          
          return false;
        }
      }
      return true;
    }

    public Builder mergeFrom(
        org.jetbrains.kotlin.protobuf.CodedInputStream input,
        org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int kindCase_ = 0;
    private java.lang.Object kind_;
    public KindCase
        getKindCase() {
      return KindCase.valueOf(
          kindCase_);
    }

    public Builder clearKind() {
      kindCase_ = 0;
      kind_ = null;
      return this;
    }

    private int bitField0_;

    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStarProjection star = 1;</code>
     */
    public boolean hasStar() {
      return kindCase_ == 1;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStarProjection star = 1;</code>
     */
    public org.jetbrains.kotlin.backend.common.serialization.proto.IrStarProjection getStar() {
      if (kindCase_ == 1) {
        return (org.jetbrains.kotlin.backend.common.serialization.proto.IrStarProjection) kind_;
      }
      return org.jetbrains.kotlin.backend.common.serialization.proto.IrStarProjection.getDefaultInstance();
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStarProjection star = 1;</code>
     */
    public Builder setStar(org.jetbrains.kotlin.backend.common.serialization.proto.IrStarProjection value) {
      if (value == null) {
        throw new NullPointerException();
      }
      kind_ = value;

      kindCase_ = 1;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStarProjection star = 1;</code>
     */
    public Builder setStar(
        org.jetbrains.kotlin.backend.common.serialization.proto.IrStarProjection.Builder builderForValue) {
      kind_ = builderForValue.build();

      kindCase_ = 1;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStarProjection star = 1;</code>
     */
    public Builder mergeStar(org.jetbrains.kotlin.backend.common.serialization.proto.IrStarProjection value) {
      if (kindCase_ == 1 &&
          kind_ != org.jetbrains.kotlin.backend.common.serialization.proto.IrStarProjection.getDefaultInstance()) {
        kind_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrStarProjection.newBuilder((org.jetbrains.kotlin.backend.common.serialization.proto.IrStarProjection) kind_)
            .mergeFrom(value).buildPartial();
      } else {
        kind_ = value;
      }

      kindCase_ = 1;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStarProjection star = 1;</code>
     */
    public Builder clearStar() {
      if (kindCase_ == 1) {
        kindCase_ = 0;
        kind_ = null;
        
      }
      return this;
    }

    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection type = 2;</code>
     */
    public boolean hasType() {
      return kindCase_ == 2;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection type = 2;</code>
     */
    public org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection getType() {
      if (kindCase_ == 2) {
        return (org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection) kind_;
      }
      return org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection.getDefaultInstance();
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection type = 2;</code>
     */
    public Builder setType(org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection value) {
      if (value == null) {
        throw new NullPointerException();
      }
      kind_ = value;

      kindCase_ = 2;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection type = 2;</code>
     */
    public Builder setType(
        org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection.Builder builderForValue) {
      kind_ = builderForValue.build();

      kindCase_ = 2;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection type = 2;</code>
     */
    public Builder mergeType(org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection value) {
      if (kindCase_ == 2 &&
          kind_ != org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection.getDefaultInstance()) {
        kind_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection.newBuilder((org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection) kind_)
            .mergeFrom(value).buildPartial();
      } else {
        kind_ = value;
      }

      kindCase_ = 2;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection type = 2;</code>
     */
    public Builder clearType() {
      if (kindCase_ == 2) {
        kindCase_ = 0;
        kind_ = null;
        
      }
      return this;
    }

    // @@protoc_insertion_point(builder_scope:org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument)
  }

  static {
    defaultInstance = new IrTypeArgument(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument)
}
