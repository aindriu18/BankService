package com.spendingLimitService;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: spendingLimitService.proto")
public final class spendingLimitServiceGrpc {

  private spendingLimitServiceGrpc() {}

  public static final String SERVICE_NAME = "spendingLimitService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.spendingLimitService.containsSpendingLimit,
      com.spendingLimitService.containsSpendingLimit> getGetSpendingLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSpendingLimit",
      requestType = com.spendingLimitService.containsSpendingLimit.class,
      responseType = com.spendingLimitService.containsSpendingLimit.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.spendingLimitService.containsSpendingLimit,
      com.spendingLimitService.containsSpendingLimit> getGetSpendingLimitMethod() {
    io.grpc.MethodDescriptor<com.spendingLimitService.containsSpendingLimit, com.spendingLimitService.containsSpendingLimit> getGetSpendingLimitMethod;
    if ((getGetSpendingLimitMethod = spendingLimitServiceGrpc.getGetSpendingLimitMethod) == null) {
      synchronized (spendingLimitServiceGrpc.class) {
        if ((getGetSpendingLimitMethod = spendingLimitServiceGrpc.getGetSpendingLimitMethod) == null) {
          spendingLimitServiceGrpc.getGetSpendingLimitMethod = getGetSpendingLimitMethod = 
              io.grpc.MethodDescriptor.<com.spendingLimitService.containsSpendingLimit, com.spendingLimitService.containsSpendingLimit>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "spendingLimitService", "GetSpendingLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.spendingLimitService.containsSpendingLimit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.spendingLimitService.containsSpendingLimit.getDefaultInstance()))
                  .setSchemaDescriptor(new spendingLimitServiceMethodDescriptorSupplier("GetSpendingLimit"))
                  .build();
          }
        }
     }
     return getGetSpendingLimitMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static spendingLimitServiceStub newStub(io.grpc.Channel channel) {
    return new spendingLimitServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static spendingLimitServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new spendingLimitServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static spendingLimitServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new spendingLimitServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class spendingLimitServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.spendingLimitService.containsSpendingLimit> getSpendingLimit(
        io.grpc.stub.StreamObserver<com.spendingLimitService.containsSpendingLimit> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetSpendingLimitMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSpendingLimitMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.spendingLimitService.containsSpendingLimit,
                com.spendingLimitService.containsSpendingLimit>(
                  this, METHODID_GET_SPENDING_LIMIT)))
          .build();
    }
  }

  /**
   */
  public static final class spendingLimitServiceStub extends io.grpc.stub.AbstractStub<spendingLimitServiceStub> {
    private spendingLimitServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private spendingLimitServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected spendingLimitServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new spendingLimitServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.spendingLimitService.containsSpendingLimit> getSpendingLimit(
        io.grpc.stub.StreamObserver<com.spendingLimitService.containsSpendingLimit> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGetSpendingLimitMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class spendingLimitServiceBlockingStub extends io.grpc.stub.AbstractStub<spendingLimitServiceBlockingStub> {
    private spendingLimitServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private spendingLimitServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected spendingLimitServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new spendingLimitServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class spendingLimitServiceFutureStub extends io.grpc.stub.AbstractStub<spendingLimitServiceFutureStub> {
    private spendingLimitServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private spendingLimitServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected spendingLimitServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new spendingLimitServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_SPENDING_LIMIT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final spendingLimitServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(spendingLimitServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SPENDING_LIMIT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getSpendingLimit(
              (io.grpc.stub.StreamObserver<com.spendingLimitService.containsSpendingLimit>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class spendingLimitServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    spendingLimitServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.spendingLimitService.spendingLimitServiceServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("spendingLimitService");
    }
  }

  private static final class spendingLimitServiceFileDescriptorSupplier
      extends spendingLimitServiceBaseDescriptorSupplier {
    spendingLimitServiceFileDescriptorSupplier() {}
  }

  private static final class spendingLimitServiceMethodDescriptorSupplier
      extends spendingLimitServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    spendingLimitServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (spendingLimitServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new spendingLimitServiceFileDescriptorSupplier())
              .addMethod(getGetSpendingLimitMethod())
              .build();
        }
      }
    }
    return result;
  }
}
