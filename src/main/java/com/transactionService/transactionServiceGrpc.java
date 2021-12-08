package com.transactionService;

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
    comments = "Source: transactionService.proto")
public final class transactionServiceGrpc {

  private transactionServiceGrpc() {}

  public static final String SERVICE_NAME = "transactionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.transactionService.containsTransaction,
      com.transactionService.containsTransaction> getGetTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransaction",
      requestType = com.transactionService.containsTransaction.class,
      responseType = com.transactionService.containsTransaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.transactionService.containsTransaction,
      com.transactionService.containsTransaction> getGetTransactionMethod() {
    io.grpc.MethodDescriptor<com.transactionService.containsTransaction, com.transactionService.containsTransaction> getGetTransactionMethod;
    if ((getGetTransactionMethod = transactionServiceGrpc.getGetTransactionMethod) == null) {
      synchronized (transactionServiceGrpc.class) {
        if ((getGetTransactionMethod = transactionServiceGrpc.getGetTransactionMethod) == null) {
          transactionServiceGrpc.getGetTransactionMethod = getGetTransactionMethod = 
              io.grpc.MethodDescriptor.<com.transactionService.containsTransaction, com.transactionService.containsTransaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "transactionService", "GetTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.transactionService.containsTransaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.transactionService.containsTransaction.getDefaultInstance()))
                  .setSchemaDescriptor(new transactionServiceMethodDescriptorSupplier("GetTransaction"))
                  .build();
          }
        }
     }
     return getGetTransactionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static transactionServiceStub newStub(io.grpc.Channel channel) {
    return new transactionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static transactionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new transactionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static transactionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new transactionServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class transactionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public void getTransaction(com.transactionService.containsTransaction request,
        io.grpc.stub.StreamObserver<com.transactionService.containsTransaction> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTransactionMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.transactionService.containsTransaction,
                com.transactionService.containsTransaction>(
                  this, METHODID_GET_TRANSACTION)))
          .build();
    }
  }

  /**
   */
  public static final class transactionServiceStub extends io.grpc.stub.AbstractStub<transactionServiceStub> {
    private transactionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private transactionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected transactionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new transactionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public void getTransaction(com.transactionService.containsTransaction request,
        io.grpc.stub.StreamObserver<com.transactionService.containsTransaction> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetTransactionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class transactionServiceBlockingStub extends io.grpc.stub.AbstractStub<transactionServiceBlockingStub> {
    private transactionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private transactionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected transactionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new transactionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public java.util.Iterator<com.transactionService.containsTransaction> getTransaction(
        com.transactionService.containsTransaction request) {
      return blockingServerStreamingCall(
          getChannel(), getGetTransactionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class transactionServiceFutureStub extends io.grpc.stub.AbstractStub<transactionServiceFutureStub> {
    private transactionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private transactionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected transactionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new transactionServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_TRANSACTION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final transactionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(transactionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TRANSACTION:
          serviceImpl.getTransaction((com.transactionService.containsTransaction) request,
              (io.grpc.stub.StreamObserver<com.transactionService.containsTransaction>) responseObserver);
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

  private static abstract class transactionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    transactionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.transactionService.transactionServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("transactionService");
    }
  }

  private static final class transactionServiceFileDescriptorSupplier
      extends transactionServiceBaseDescriptorSupplier {
    transactionServiceFileDescriptorSupplier() {}
  }

  private static final class transactionServiceMethodDescriptorSupplier
      extends transactionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    transactionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (transactionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new transactionServiceFileDescriptorSupplier())
              .addMethod(getGetTransactionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
