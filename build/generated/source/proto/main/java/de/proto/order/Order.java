// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order.proto

package de.proto.order;

/**
 * Protobuf type {@code order.Order}
 */
public final class Order extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:order.Order)
    OrderOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Order.newBuilder() to construct.
  private Order(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Order() {
    orderId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Order();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Order(
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
            java.lang.String s = input.readStringRequireUtf8();

            orderId_ = s;
            break;
          }
          case 18: {
            de.proto.order.Product.Builder subBuilder = null;
            if (product_ != null) {
              subBuilder = product_.toBuilder();
            }
            product_ = input.readMessage(de.proto.order.Product.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(product_);
              product_ = subBuilder.buildPartial();
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
    return de.proto.order.OrderOuterClass.internal_static_order_Order_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return de.proto.order.OrderOuterClass.internal_static_order_Order_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            de.proto.order.Order.class, de.proto.order.Order.Builder.class);
  }

  public static final int ORDERID_FIELD_NUMBER = 1;
  private volatile java.lang.Object orderId_;
  /**
   * <code>string OrderId = 1;</code>
   * @return The orderId.
   */
  @java.lang.Override
  public java.lang.String getOrderId() {
    java.lang.Object ref = orderId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orderId_ = s;
      return s;
    }
  }
  /**
   * <code>string OrderId = 1;</code>
   * @return The bytes for orderId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOrderIdBytes() {
    java.lang.Object ref = orderId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orderId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRODUCT_FIELD_NUMBER = 2;
  private de.proto.order.Product product_;
  /**
   * <code>.order.Product product = 2;</code>
   * @return Whether the product field is set.
   */
  @java.lang.Override
  public boolean hasProduct() {
    return product_ != null;
  }
  /**
   * <code>.order.Product product = 2;</code>
   * @return The product.
   */
  @java.lang.Override
  public de.proto.order.Product getProduct() {
    return product_ == null ? de.proto.order.Product.getDefaultInstance() : product_;
  }
  /**
   * <code>.order.Product product = 2;</code>
   */
  @java.lang.Override
  public de.proto.order.ProductOrBuilder getProductOrBuilder() {
    return getProduct();
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
    if (!getOrderIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, orderId_);
    }
    if (product_ != null) {
      output.writeMessage(2, getProduct());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getOrderIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, orderId_);
    }
    if (product_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getProduct());
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
    if (!(obj instanceof de.proto.order.Order)) {
      return super.equals(obj);
    }
    de.proto.order.Order other = (de.proto.order.Order) obj;

    if (!getOrderId()
        .equals(other.getOrderId())) return false;
    if (hasProduct() != other.hasProduct()) return false;
    if (hasProduct()) {
      if (!getProduct()
          .equals(other.getProduct())) return false;
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
    hash = (37 * hash) + ORDERID_FIELD_NUMBER;
    hash = (53 * hash) + getOrderId().hashCode();
    if (hasProduct()) {
      hash = (37 * hash) + PRODUCT_FIELD_NUMBER;
      hash = (53 * hash) + getProduct().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static de.proto.order.Order parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static de.proto.order.Order parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static de.proto.order.Order parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static de.proto.order.Order parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static de.proto.order.Order parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static de.proto.order.Order parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static de.proto.order.Order parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static de.proto.order.Order parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static de.proto.order.Order parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static de.proto.order.Order parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static de.proto.order.Order parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static de.proto.order.Order parseFrom(
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
  public static Builder newBuilder(de.proto.order.Order prototype) {
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
   * Protobuf type {@code order.Order}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:order.Order)
      de.proto.order.OrderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return de.proto.order.OrderOuterClass.internal_static_order_Order_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return de.proto.order.OrderOuterClass.internal_static_order_Order_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              de.proto.order.Order.class, de.proto.order.Order.Builder.class);
    }

    // Construct using de.proto.order.Order.newBuilder()
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
      orderId_ = "";

      if (productBuilder_ == null) {
        product_ = null;
      } else {
        product_ = null;
        productBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return de.proto.order.OrderOuterClass.internal_static_order_Order_descriptor;
    }

    @java.lang.Override
    public de.proto.order.Order getDefaultInstanceForType() {
      return de.proto.order.Order.getDefaultInstance();
    }

    @java.lang.Override
    public de.proto.order.Order build() {
      de.proto.order.Order result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public de.proto.order.Order buildPartial() {
      de.proto.order.Order result = new de.proto.order.Order(this);
      result.orderId_ = orderId_;
      if (productBuilder_ == null) {
        result.product_ = product_;
      } else {
        result.product_ = productBuilder_.build();
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
      if (other instanceof de.proto.order.Order) {
        return mergeFrom((de.proto.order.Order)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(de.proto.order.Order other) {
      if (other == de.proto.order.Order.getDefaultInstance()) return this;
      if (!other.getOrderId().isEmpty()) {
        orderId_ = other.orderId_;
        onChanged();
      }
      if (other.hasProduct()) {
        mergeProduct(other.getProduct());
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
      de.proto.order.Order parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (de.proto.order.Order) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object orderId_ = "";
    /**
     * <code>string OrderId = 1;</code>
     * @return The orderId.
     */
    public java.lang.String getOrderId() {
      java.lang.Object ref = orderId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orderId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string OrderId = 1;</code>
     * @return The bytes for orderId.
     */
    public com.google.protobuf.ByteString
        getOrderIdBytes() {
      java.lang.Object ref = orderId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orderId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string OrderId = 1;</code>
     * @param value The orderId to set.
     * @return This builder for chaining.
     */
    public Builder setOrderId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      orderId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string OrderId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrderId() {
      
      orderId_ = getDefaultInstance().getOrderId();
      onChanged();
      return this;
    }
    /**
     * <code>string OrderId = 1;</code>
     * @param value The bytes for orderId to set.
     * @return This builder for chaining.
     */
    public Builder setOrderIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      orderId_ = value;
      onChanged();
      return this;
    }

    private de.proto.order.Product product_;
    private com.google.protobuf.SingleFieldBuilderV3<
        de.proto.order.Product, de.proto.order.Product.Builder, de.proto.order.ProductOrBuilder> productBuilder_;
    /**
     * <code>.order.Product product = 2;</code>
     * @return Whether the product field is set.
     */
    public boolean hasProduct() {
      return productBuilder_ != null || product_ != null;
    }
    /**
     * <code>.order.Product product = 2;</code>
     * @return The product.
     */
    public de.proto.order.Product getProduct() {
      if (productBuilder_ == null) {
        return product_ == null ? de.proto.order.Product.getDefaultInstance() : product_;
      } else {
        return productBuilder_.getMessage();
      }
    }
    /**
     * <code>.order.Product product = 2;</code>
     */
    public Builder setProduct(de.proto.order.Product value) {
      if (productBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        product_ = value;
        onChanged();
      } else {
        productBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.order.Product product = 2;</code>
     */
    public Builder setProduct(
        de.proto.order.Product.Builder builderForValue) {
      if (productBuilder_ == null) {
        product_ = builderForValue.build();
        onChanged();
      } else {
        productBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.order.Product product = 2;</code>
     */
    public Builder mergeProduct(de.proto.order.Product value) {
      if (productBuilder_ == null) {
        if (product_ != null) {
          product_ =
            de.proto.order.Product.newBuilder(product_).mergeFrom(value).buildPartial();
        } else {
          product_ = value;
        }
        onChanged();
      } else {
        productBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.order.Product product = 2;</code>
     */
    public Builder clearProduct() {
      if (productBuilder_ == null) {
        product_ = null;
        onChanged();
      } else {
        product_ = null;
        productBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.order.Product product = 2;</code>
     */
    public de.proto.order.Product.Builder getProductBuilder() {
      
      onChanged();
      return getProductFieldBuilder().getBuilder();
    }
    /**
     * <code>.order.Product product = 2;</code>
     */
    public de.proto.order.ProductOrBuilder getProductOrBuilder() {
      if (productBuilder_ != null) {
        return productBuilder_.getMessageOrBuilder();
      } else {
        return product_ == null ?
            de.proto.order.Product.getDefaultInstance() : product_;
      }
    }
    /**
     * <code>.order.Product product = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        de.proto.order.Product, de.proto.order.Product.Builder, de.proto.order.ProductOrBuilder> 
        getProductFieldBuilder() {
      if (productBuilder_ == null) {
        productBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            de.proto.order.Product, de.proto.order.Product.Builder, de.proto.order.ProductOrBuilder>(
                getProduct(),
                getParentForChildren(),
                isClean());
        product_ = null;
      }
      return productBuilder_;
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


    // @@protoc_insertion_point(builder_scope:order.Order)
  }

  // @@protoc_insertion_point(class_scope:order.Order)
  private static final de.proto.order.Order DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new de.proto.order.Order();
  }

  public static de.proto.order.Order getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Order>
      PARSER = new com.google.protobuf.AbstractParser<Order>() {
    @java.lang.Override
    public Order parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Order(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Order> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Order> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public de.proto.order.Order getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
