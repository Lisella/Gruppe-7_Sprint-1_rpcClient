package de.proto.order;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.32.1)",
    comments = "Source: order.proto")
public final class OrderServiceGrpc {

  private OrderServiceGrpc() {}

  public static final String SERVICE_NAME = "order.OrderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<de.proto.order.ProductRequest,
      de.proto.order.ProductResponse> getShowProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShowProduct",
      requestType = de.proto.order.ProductRequest.class,
      responseType = de.proto.order.ProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<de.proto.order.ProductRequest,
      de.proto.order.ProductResponse> getShowProductMethod() {
    io.grpc.MethodDescriptor<de.proto.order.ProductRequest, de.proto.order.ProductResponse> getShowProductMethod;
    if ((getShowProductMethod = OrderServiceGrpc.getShowProductMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getShowProductMethod = OrderServiceGrpc.getShowProductMethod) == null) {
          OrderServiceGrpc.getShowProductMethod = getShowProductMethod =
              io.grpc.MethodDescriptor.<de.proto.order.ProductRequest, de.proto.order.ProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ShowProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.proto.order.ProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.proto.order.ProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("ShowProduct"))
              .build();
        }
      }
    }
    return getShowProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<de.proto.order.Orderrequest,
      de.proto.order.OrderResponse> getShowOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShowOrder",
      requestType = de.proto.order.Orderrequest.class,
      responseType = de.proto.order.OrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<de.proto.order.Orderrequest,
      de.proto.order.OrderResponse> getShowOrderMethod() {
    io.grpc.MethodDescriptor<de.proto.order.Orderrequest, de.proto.order.OrderResponse> getShowOrderMethod;
    if ((getShowOrderMethod = OrderServiceGrpc.getShowOrderMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getShowOrderMethod = OrderServiceGrpc.getShowOrderMethod) == null) {
          OrderServiceGrpc.getShowOrderMethod = getShowOrderMethod =
              io.grpc.MethodDescriptor.<de.proto.order.Orderrequest, de.proto.order.OrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ShowOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.proto.order.Orderrequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.proto.order.OrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("ShowOrder"))
              .build();
        }
      }
    }
    return getShowOrderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrderServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderServiceStub>() {
        @java.lang.Override
        public OrderServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderServiceStub(channel, callOptions);
        }
      };
    return OrderServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderServiceBlockingStub>() {
        @java.lang.Override
        public OrderServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderServiceBlockingStub(channel, callOptions);
        }
      };
    return OrderServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderServiceFutureStub>() {
        @java.lang.Override
        public OrderServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderServiceFutureStub(channel, callOptions);
        }
      };
    return OrderServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class OrderServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void showProduct(de.proto.order.ProductRequest request,
        io.grpc.stub.StreamObserver<de.proto.order.ProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getShowProductMethod(), responseObserver);
    }

    /**
     */
    public void showOrder(de.proto.order.Orderrequest request,
        io.grpc.stub.StreamObserver<de.proto.order.OrderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getShowOrderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getShowProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                de.proto.order.ProductRequest,
                de.proto.order.ProductResponse>(
                  this, METHODID_SHOW_PRODUCT)))
          .addMethod(
            getShowOrderMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                de.proto.order.Orderrequest,
                de.proto.order.OrderResponse>(
                  this, METHODID_SHOW_ORDER)))
          .build();
    }
  }

  /**
   */
  public static final class OrderServiceStub extends io.grpc.stub.AbstractAsyncStub<OrderServiceStub> {
    private OrderServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderServiceStub(channel, callOptions);
    }

    /**
     */
    public void showProduct(de.proto.order.ProductRequest request,
        io.grpc.stub.StreamObserver<de.proto.order.ProductResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShowProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void showOrder(de.proto.order.Orderrequest request,
        io.grpc.stub.StreamObserver<de.proto.order.OrderResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getShowOrderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OrderServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<OrderServiceBlockingStub> {
    private OrderServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public de.proto.order.ProductResponse showProduct(de.proto.order.ProductRequest request) {
      return blockingUnaryCall(
          getChannel(), getShowProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<de.proto.order.OrderResponse> showOrder(
        de.proto.order.Orderrequest request) {
      return blockingServerStreamingCall(
          getChannel(), getShowOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OrderServiceFutureStub extends io.grpc.stub.AbstractFutureStub<OrderServiceFutureStub> {
    private OrderServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.proto.order.ProductResponse> showProduct(
        de.proto.order.ProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getShowProductMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SHOW_PRODUCT = 0;
  private static final int METHODID_SHOW_ORDER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OrderServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OrderServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SHOW_PRODUCT:
          serviceImpl.showProduct((de.proto.order.ProductRequest) request,
              (io.grpc.stub.StreamObserver<de.proto.order.ProductResponse>) responseObserver);
          break;
        case METHODID_SHOW_ORDER:
          serviceImpl.showOrder((de.proto.order.Orderrequest) request,
              (io.grpc.stub.StreamObserver<de.proto.order.OrderResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class OrderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return de.proto.order.OrderOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrderService");
    }
  }

  private static final class OrderServiceFileDescriptorSupplier
      extends OrderServiceBaseDescriptorSupplier {
    OrderServiceFileDescriptorSupplier() {}
  }

  private static final class OrderServiceMethodDescriptorSupplier
      extends OrderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OrderServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (OrderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrderServiceFileDescriptorSupplier())
              .addMethod(getShowProductMethod())
              .addMethod(getShowOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
