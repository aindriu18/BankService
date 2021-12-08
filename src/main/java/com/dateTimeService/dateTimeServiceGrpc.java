package com.dateTimeService;

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
    comments = "Source: dateTimeService.proto")
public final class dateTimeServiceGrpc {

  private dateTimeServiceGrpc() {}

  public static final String SERVICE_NAME = "dateTimeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dateTimeService.containsDateTime,
      com.dateTimeService.containsDateTime> getGetDateTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDateTime",
      requestType = com.dateTimeService.containsDateTime.class,
      responseType = com.dateTimeService.containsDateTime.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dateTimeService.containsDateTime,
      com.dateTimeService.containsDateTime> getGetDateTimeMethod() {
    io.grpc.MethodDescriptor<com.dateTimeService.containsDateTime, com.dateTimeService.containsDateTime> getGetDateTimeMethod;
    if ((getGetDateTimeMethod = dateTimeServiceGrpc.getGetDateTimeMethod) == null) {
      synchronized (dateTimeServiceGrpc.class) {
        if ((getGetDateTimeMethod = dateTimeServiceGrpc.getGetDateTimeMethod) == null) {
          dateTimeServiceGrpc.getGetDateTimeMethod = getGetDateTimeMethod = 
              io.grpc.MethodDescriptor.<com.dateTimeService.containsDateTime, com.dateTimeService.containsDateTime>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dateTimeService", "GetDateTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dateTimeService.containsDateTime.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dateTimeService.containsDateTime.getDefaultInstance()))
                  .setSchemaDescriptor(new dateTimeServiceMethodDescriptorSupplier("GetDateTime"))
                  .build();
          }
        }
     }
     return getGetDateTimeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static dateTimeServiceStub newStub(io.grpc.Channel channel) {
    return new dateTimeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static dateTimeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new dateTimeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static dateTimeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new dateTimeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class dateTimeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getDateTime(com.dateTimeService.containsDateTime request,
        io.grpc.stub.StreamObserver<com.dateTimeService.containsDateTime> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDateTimeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDateTimeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.dateTimeService.containsDateTime,
                com.dateTimeService.containsDateTime>(
                  this, METHODID_GET_DATE_TIME)))
          .build();
    }
  }

  /**
   */
  public static final class dateTimeServiceStub extends io.grpc.stub.AbstractStub<dateTimeServiceStub> {
    private dateTimeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private dateTimeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected dateTimeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new dateTimeServiceStub(channel, callOptions);
    }

    /**
     */
    public void getDateTime(com.dateTimeService.containsDateTime request,
        io.grpc.stub.StreamObserver<com.dateTimeService.containsDateTime> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDateTimeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class dateTimeServiceBlockingStub extends io.grpc.stub.AbstractStub<dateTimeServiceBlockingStub> {
    private dateTimeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private dateTimeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected dateTimeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new dateTimeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dateTimeService.containsDateTime getDateTime(com.dateTimeService.containsDateTime request) {
      return blockingUnaryCall(
          getChannel(), getGetDateTimeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class dateTimeServiceFutureStub extends io.grpc.stub.AbstractStub<dateTimeServiceFutureStub> {
    private dateTimeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private dateTimeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected dateTimeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new dateTimeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dateTimeService.containsDateTime> getDateTime(
        com.dateTimeService.containsDateTime request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDateTimeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DATE_TIME = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final dateTimeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(dateTimeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DATE_TIME:
          serviceImpl.getDateTime((com.dateTimeService.containsDateTime) request,
              (io.grpc.stub.StreamObserver<com.dateTimeService.containsDateTime>) responseObserver);
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

  private static abstract class dateTimeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    dateTimeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dateTimeService.dateTimeServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("dateTimeService");
    }
  }

  private static final class dateTimeServiceFileDescriptorSupplier
      extends dateTimeServiceBaseDescriptorSupplier {
    dateTimeServiceFileDescriptorSupplier() {}
  }

  private static final class dateTimeServiceMethodDescriptorSupplier
      extends dateTimeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    dateTimeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (dateTimeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new dateTimeServiceFileDescriptorSupplier())
              .addMethod(getGetDateTimeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
