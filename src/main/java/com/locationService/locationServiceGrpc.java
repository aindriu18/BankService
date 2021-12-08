package com.locationService;

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
    comments = "Source: locationService.proto")
public final class locationServiceGrpc {

  private locationServiceGrpc() {}

  public static final String SERVICE_NAME = "locationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.locationService.containsLocation,
      com.locationService.containsLocation> getGetLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLocation",
      requestType = com.locationService.containsLocation.class,
      responseType = com.locationService.containsLocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.locationService.containsLocation,
      com.locationService.containsLocation> getGetLocationMethod() {
    io.grpc.MethodDescriptor<com.locationService.containsLocation, com.locationService.containsLocation> getGetLocationMethod;
    if ((getGetLocationMethod = locationServiceGrpc.getGetLocationMethod) == null) {
      synchronized (locationServiceGrpc.class) {
        if ((getGetLocationMethod = locationServiceGrpc.getGetLocationMethod) == null) {
          locationServiceGrpc.getGetLocationMethod = getGetLocationMethod = 
              io.grpc.MethodDescriptor.<com.locationService.containsLocation, com.locationService.containsLocation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "locationService", "GetLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.locationService.containsLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.locationService.containsLocation.getDefaultInstance()))
                  .setSchemaDescriptor(new locationServiceMethodDescriptorSupplier("GetLocation"))
                  .build();
          }
        }
     }
     return getGetLocationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static locationServiceStub newStub(io.grpc.Channel channel) {
    return new locationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static locationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new locationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static locationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new locationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class locationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getLocation(com.locationService.containsLocation request,
        io.grpc.stub.StreamObserver<com.locationService.containsLocation> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLocationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.locationService.containsLocation,
                com.locationService.containsLocation>(
                  this, METHODID_GET_LOCATION)))
          .build();
    }
  }

  /**
   */
  public static final class locationServiceStub extends io.grpc.stub.AbstractStub<locationServiceStub> {
    private locationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private locationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected locationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new locationServiceStub(channel, callOptions);
    }

    /**
     */
    public void getLocation(com.locationService.containsLocation request,
        io.grpc.stub.StreamObserver<com.locationService.containsLocation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLocationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class locationServiceBlockingStub extends io.grpc.stub.AbstractStub<locationServiceBlockingStub> {
    private locationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private locationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected locationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new locationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.locationService.containsLocation getLocation(com.locationService.containsLocation request) {
      return blockingUnaryCall(
          getChannel(), getGetLocationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class locationServiceFutureStub extends io.grpc.stub.AbstractStub<locationServiceFutureStub> {
    private locationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private locationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected locationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new locationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.locationService.containsLocation> getLocation(
        com.locationService.containsLocation request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLocationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LOCATION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final locationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(locationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_LOCATION:
          serviceImpl.getLocation((com.locationService.containsLocation) request,
              (io.grpc.stub.StreamObserver<com.locationService.containsLocation>) responseObserver);
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

  private static abstract class locationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    locationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.locationService.locationServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("locationService");
    }
  }

  private static final class locationServiceFileDescriptorSupplier
      extends locationServiceBaseDescriptorSupplier {
    locationServiceFileDescriptorSupplier() {}
  }

  private static final class locationServiceMethodDescriptorSupplier
      extends locationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    locationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (locationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new locationServiceFileDescriptorSupplier())
              .addMethod(getGetLocationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
