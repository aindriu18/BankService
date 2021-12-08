package com.balanceService;

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
    comments = "Source: balanceService.proto")
public final class balanceServiceGrpc {

  private balanceServiceGrpc() {}

  public static final String SERVICE_NAME = "balanceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.balanceService.containsBalance,
      com.balanceService.containsBalance> getGetBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBalance",
      requestType = com.balanceService.containsBalance.class,
      responseType = com.balanceService.containsBalance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.balanceService.containsBalance,
      com.balanceService.containsBalance> getGetBalanceMethod() {
    io.grpc.MethodDescriptor<com.balanceService.containsBalance, com.balanceService.containsBalance> getGetBalanceMethod;
    if ((getGetBalanceMethod = balanceServiceGrpc.getGetBalanceMethod) == null) {
      synchronized (balanceServiceGrpc.class) {
        if ((getGetBalanceMethod = balanceServiceGrpc.getGetBalanceMethod) == null) {
          balanceServiceGrpc.getGetBalanceMethod = getGetBalanceMethod = 
              io.grpc.MethodDescriptor.<com.balanceService.containsBalance, com.balanceService.containsBalance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "balanceService", "GetBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balanceService.containsBalance.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balanceService.containsBalance.getDefaultInstance()))
                  .setSchemaDescriptor(new balanceServiceMethodDescriptorSupplier("GetBalance"))
                  .build();
          }
        }
     }
     return getGetBalanceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static balanceServiceStub newStub(io.grpc.Channel channel) {
    return new balanceServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static balanceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new balanceServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static balanceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new balanceServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class balanceServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getBalance(com.balanceService.containsBalance request,
        io.grpc.stub.StreamObserver<com.balanceService.containsBalance> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBalanceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.balanceService.containsBalance,
                com.balanceService.containsBalance>(
                  this, METHODID_GET_BALANCE)))
          .build();
    }
  }

  /**
   */
  public static final class balanceServiceStub extends io.grpc.stub.AbstractStub<balanceServiceStub> {
    private balanceServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private balanceServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected balanceServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new balanceServiceStub(channel, callOptions);
    }

    /**
     */
    public void getBalance(com.balanceService.containsBalance request,
        io.grpc.stub.StreamObserver<com.balanceService.containsBalance> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class balanceServiceBlockingStub extends io.grpc.stub.AbstractStub<balanceServiceBlockingStub> {
    private balanceServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private balanceServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected balanceServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new balanceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.balanceService.containsBalance getBalance(com.balanceService.containsBalance request) {
      return blockingUnaryCall(
          getChannel(), getGetBalanceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class balanceServiceFutureStub extends io.grpc.stub.AbstractStub<balanceServiceFutureStub> {
    private balanceServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private balanceServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected balanceServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new balanceServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.balanceService.containsBalance> getBalance(
        com.balanceService.containsBalance request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BALANCE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final balanceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(balanceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BALANCE:
          serviceImpl.getBalance((com.balanceService.containsBalance) request,
              (io.grpc.stub.StreamObserver<com.balanceService.containsBalance>) responseObserver);
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

  private static abstract class balanceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    balanceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.balanceService.balanceServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("balanceService");
    }
  }

  private static final class balanceServiceFileDescriptorSupplier
      extends balanceServiceBaseDescriptorSupplier {
    balanceServiceFileDescriptorSupplier() {}
  }

  private static final class balanceServiceMethodDescriptorSupplier
      extends balanceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    balanceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (balanceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new balanceServiceFileDescriptorSupplier())
              .addMethod(getGetBalanceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
