// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order.proto

package de.proto.greet;

public final class OrderOuterClass {
  private OrderOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greet_Product_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greet_Product_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greet_Order_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greet_Order_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greet_ProductRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greet_ProductRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greet_ProductResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greet_ProductResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greet_Orderrequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greet_Orderrequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greet_OrderResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greet_OrderResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013order.proto\022\005greet\"9\n\007Product\022\n\n\002id\030\001 " +
      "\001(\t\022\023\n\013productname\030\002 \001(\t\022\r\n\005price\030\003 \001(\001\"" +
      "9\n\005Order\022\017\n\007OrderId\030\001 \001(\t\022\037\n\007product\030\002 \001" +
      "(\0132\016.greet.Product\"\034\n\016ProductRequest\022\n\n\002" +
      "id\030\001 \001(\t\"A\n\017ProductResponse\022\n\n\002id\030\001 \001(\t\022" +
      "\023\n\013productName\030\002 \001(\t\022\r\n\005price\030\003 \001(\001\"/\n\014O" +
      "rderrequest\022\037\n\007produkt\030\001 \001(\0132\016.greet.Pro" +
      "duct\"\037\n\rOrderResponse\022\016\n\006result\030\001 \001(\t2\220\001" +
      "\n\014OrderService\022>\n\013ShowProduct\022\025.greet.Pr" +
      "oductRequest\032\026.greet.ProductResponse\"\000\022@" +
      "\n\021AddProductToOrder\022\023.greet.Orderrequest" +
      "\032\024.greet.OrderResponse\"\000B\022\n\016de.proto.gre" +
      "etP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_greet_Product_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greet_Product_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greet_Product_descriptor,
        new java.lang.String[] { "Id", "Productname", "Price", });
    internal_static_greet_Order_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_greet_Order_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greet_Order_descriptor,
        new java.lang.String[] { "OrderId", "Product", });
    internal_static_greet_ProductRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_greet_ProductRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greet_ProductRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_greet_ProductResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_greet_ProductResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greet_ProductResponse_descriptor,
        new java.lang.String[] { "Id", "ProductName", "Price", });
    internal_static_greet_Orderrequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_greet_Orderrequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greet_Orderrequest_descriptor,
        new java.lang.String[] { "Produkt", });
    internal_static_greet_OrderResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_greet_OrderResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greet_OrderResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
