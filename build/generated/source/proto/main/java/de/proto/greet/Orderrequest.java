// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order.proto

package de.proto.greet;

/**
 * Protobuf type {@code greet.Orderrequest}
 */
public final class Orderrequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:greet.Orderrequest)
    OrderrequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Orderrequest.newBuilder() to construct.
  private Orderrequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Orderrequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Orderrequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Orderrequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            de.proto.greet.Product.Builder subBuilder = null;
            if (produkt_ != null) {
              subBuilder = produkt_.toBuilder();
            }
            produkt_ = input.readMessage(de.proto.greet.Product.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(produkt_);
              produkt_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return de.proto.greet.OrderOuterClass.internal_static_greet_Orderrequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return de.proto.greet.OrderOuterClass.internal_static_greet_Orderrequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            de.proto.greet.Orderrequest.class, de.proto.greet.Orderrequest.Builder.class);
  }

  public static final int PRODUKT_FIELD_NUMBER = 1;
  private de.proto.greet.Product produkt_;
  /**
   * <code>.greet.Product produkt = 1;</code>
   * @return Whether the produkt field is set.
   */
  @java.lang.Override
  public boolean hasProdukt() {
    return produkt_ != null;
  }
  /**
   * <code>.greet.Product produkt = 1;</code>
   * @return The produkt.
   */
  @java.lang.Override
  public de.proto.greet.Product getProdukt() {
    return produkt_ == null ? de.proto.greet.Product.getDefaultInstance() : produkt_;
  }
  /**
   * <code>.greet.Product produkt = 1;</code>
   */
  @java.lang.Override
  public de.proto.greet.ProductOrBuilder getProduktOrBuilder() {
    return getProdukt();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (produkt_ != null) {
      output.writeMessage(1, getProdukt());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (produkt_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getProdukt());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof de.proto.greet.Orderrequest)) {
      return super.equals(obj);
    }
    de.proto.greet.Orderrequest other = (de.proto.greet.Orderrequest) obj;

    if (hasProdukt() != other.hasProdukt()) return false;
    if (hasProdukt()) {
      if (!getProdukt()
          .equals(other.getProdukt())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasProdukt()) {
      hash = (37 * hash) + PRODUKT_FIELD_NUMBER;
      hash = (53 * hash) + getProdukt().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static de.proto.greet.Orderrequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static de.proto.greet.Orderrequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static de.proto.greet.Orderrequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static de.proto.greet.Orderrequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static de.proto.greet.Orderrequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static de.proto.greet.Orderrequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static de.proto.greet.Orderrequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static de.proto.greet.Orderrequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static de.proto.greet.Orderrequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static de.proto.greet.Orderrequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static de.proto.greet.Orderrequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static de.proto.greet.Orderrequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(de.proto.greet.Orderrequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code greet.Orderrequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:greet.Orderrequest)
      de.proto.greet.OrderrequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return de.proto.greet.OrderOuterClass.internal_static_greet_Orderrequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return de.proto.greet.OrderOuterClass.internal_static_greet_Orderrequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              de.proto.greet.Orderrequest.class, de.proto.greet.Orderrequest.Builder.class);
    }

    // Construct using de.proto.greet.Orderrequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (produktBuilder_ == null) {
        produkt_ = null;
      } else {
        produkt_ = null;
        produktBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return de.proto.greet.OrderOuterClass.internal_static_greet_Orderrequest_descriptor;
    }

    @java.lang.Override
    public de.proto.greet.Orderrequest getDefaultInstanceForType() {
      return de.proto.greet.Orderrequest.getDefaultInstance();
    }

    @java.lang.Override
    public de.proto.greet.Orderrequest build() {
      de.proto.greet.Orderrequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public de.proto.greet.Orderrequest buildPartial() {
      de.proto.greet.Orderrequest result = new de.proto.greet.Orderrequest(this);
      if (produktBuilder_ == null) {
        result.produkt_ = produkt_;
      } else {
        result.produkt_ = produktBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof de.proto.greet.Orderrequest) {
        return mergeFrom((de.proto.greet.Orderrequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(de.proto.greet.Orderrequest other) {
      if (other == de.proto.greet.Orderrequest.getDefaultInstance()) return this;
      if (other.hasProdukt()) {
        mergeProdukt(other.getProdukt());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      de.proto.greet.Orderrequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (de.proto.greet.Orderrequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private de.proto.greet.Product produkt_;
    private com.google.protobuf.SingleFieldBuilderV3<
        de.proto.greet.Product, de.proto.greet.Product.Builder, de.proto.greet.ProductOrBuilder> produktBuilder_;
    /**
     * <code>.greet.Product produkt = 1;</code>
     * @return Whether the produkt field is set.
     */
    public boolean hasProdukt() {
      return produktBuilder_ != null || produkt_ != null;
    }
    /**
     * <code>.greet.Product produkt = 1;</code>
     * @return The produkt.
     */
    public de.proto.greet.Product getProdukt() {
      if (produktBuilder_ == null) {
        return produkt_ == null ? de.proto.greet.Product.getDefaultInstance() : produkt_;
      } else {
        return produktBuilder_.getMessage();
      }
    }
    /**
     * <code>.greet.Product produkt = 1;</code>
     */
    public Builder setProdukt(de.proto.greet.Product value) {
      if (produktBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        produkt_ = value;
        onChanged();
      } else {
        produktBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.greet.Product produkt = 1;</code>
     */
    public Builder setProdukt(
        de.proto.greet.Product.Builder builderForValue) {
      if (produktBuilder_ == null) {
        produkt_ = builderForValue.build();
        onChanged();
      } else {
        produktBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.greet.Product produkt = 1;</code>
     */
    public Builder mergeProdukt(de.proto.greet.Product value) {
      if (produktBuilder_ == null) {
        if (produkt_ != null) {
          produkt_ =
            de.proto.greet.Product.newBuilder(produkt_).mergeFrom(value).buildPartial();
        } else {
          produkt_ = value;
        }
        onChanged();
      } else {
        produktBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.greet.Product produkt = 1;</code>
     */
    public Builder clearProdukt() {
      if (produktBuilder_ == null) {
        produkt_ = null;
        onChanged();
      } else {
        produkt_ = null;
        produktBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.greet.Product produkt = 1;</code>
     */
    public de.proto.greet.Product.Builder getProduktBuilder() {
      
      onChanged();
      return getProduktFieldBuilder().getBuilder();
    }
    /**
     * <code>.greet.Product produkt = 1;</code>
     */
    public de.proto.greet.ProductOrBuilder getProduktOrBuilder() {
      if (produktBuilder_ != null) {
        return produktBuilder_.getMessageOrBuilder();
      } else {
        return produkt_ == null ?
            de.proto.greet.Product.getDefaultInstance() : produkt_;
      }
    }
    /**
     * <code>.greet.Product produkt = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        de.proto.greet.Product, de.proto.greet.Product.Builder, de.proto.greet.ProductOrBuilder> 
        getProduktFieldBuilder() {
      if (produktBuilder_ == null) {
        produktBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            de.proto.greet.Product, de.proto.greet.Product.Builder, de.proto.greet.ProductOrBuilder>(
                getProdukt(),
                getParentForChildren(),
                isClean());
        produkt_ = null;
      }
      return produktBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:greet.Orderrequest)
  }

  // @@protoc_insertion_point(class_scope:greet.Orderrequest)
  private static final de.proto.greet.Orderrequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new de.proto.greet.Orderrequest();
  }

  public static de.proto.greet.Orderrequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Orderrequest>
      PARSER = new com.google.protobuf.AbstractParser<Orderrequest>() {
    @java.lang.Override
    public Orderrequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Orderrequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Orderrequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Orderrequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public de.proto.greet.Orderrequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

