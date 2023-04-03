package ma.enset.stubs;

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
    comments = "Source: jeu.proto")
public final class NbrMgServiceGrpc {

  private NbrMgServiceGrpc() {}

  public static final String SERVICE_NAME = "NbrMgService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.enset.stubs.Jeu.Request,
      ma.enset.stubs.Jeu.Response> getNbrMagiqueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "nbrMagique",
      requestType = ma.enset.stubs.Jeu.Request.class,
      responseType = ma.enset.stubs.Jeu.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ma.enset.stubs.Jeu.Request,
      ma.enset.stubs.Jeu.Response> getNbrMagiqueMethod() {
    io.grpc.MethodDescriptor<ma.enset.stubs.Jeu.Request, ma.enset.stubs.Jeu.Response> getNbrMagiqueMethod;
    if ((getNbrMagiqueMethod = NbrMgServiceGrpc.getNbrMagiqueMethod) == null) {
      synchronized (NbrMgServiceGrpc.class) {
        if ((getNbrMagiqueMethod = NbrMgServiceGrpc.getNbrMagiqueMethod) == null) {
          NbrMgServiceGrpc.getNbrMagiqueMethod = getNbrMagiqueMethod = 
              io.grpc.MethodDescriptor.<ma.enset.stubs.Jeu.Request, ma.enset.stubs.Jeu.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "NbrMgService", "nbrMagique"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Jeu.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Jeu.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new NbrMgServiceMethodDescriptorSupplier("nbrMagique"))
                  .build();
          }
        }
     }
     return getNbrMagiqueMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NbrMgServiceStub newStub(io.grpc.Channel channel) {
    return new NbrMgServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NbrMgServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NbrMgServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NbrMgServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NbrMgServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class NbrMgServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Jeu.Request> nbrMagique(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Jeu.Response> responseObserver) {
      return asyncUnimplementedStreamingCall(getNbrMagiqueMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNbrMagiqueMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ma.enset.stubs.Jeu.Request,
                ma.enset.stubs.Jeu.Response>(
                  this, METHODID_NBR_MAGIQUE)))
          .build();
    }
  }

  /**
   */
  public static final class NbrMgServiceStub extends io.grpc.stub.AbstractStub<NbrMgServiceStub> {
    private NbrMgServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NbrMgServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NbrMgServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NbrMgServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Jeu.Request> nbrMagique(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Jeu.Response> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getNbrMagiqueMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class NbrMgServiceBlockingStub extends io.grpc.stub.AbstractStub<NbrMgServiceBlockingStub> {
    private NbrMgServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NbrMgServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NbrMgServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NbrMgServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class NbrMgServiceFutureStub extends io.grpc.stub.AbstractStub<NbrMgServiceFutureStub> {
    private NbrMgServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NbrMgServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NbrMgServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NbrMgServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_NBR_MAGIQUE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NbrMgServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NbrMgServiceImplBase serviceImpl, int methodId) {
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
        case METHODID_NBR_MAGIQUE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.nbrMagique(
              (io.grpc.stub.StreamObserver<ma.enset.stubs.Jeu.Response>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class NbrMgServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NbrMgServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.enset.stubs.Jeu.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NbrMgService");
    }
  }

  private static final class NbrMgServiceFileDescriptorSupplier
      extends NbrMgServiceBaseDescriptorSupplier {
    NbrMgServiceFileDescriptorSupplier() {}
  }

  private static final class NbrMgServiceMethodDescriptorSupplier
      extends NbrMgServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NbrMgServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NbrMgServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NbrMgServiceFileDescriptorSupplier())
              .addMethod(getNbrMagiqueMethod())
              .build();
        }
      }
    }
    return result;
  }
}
