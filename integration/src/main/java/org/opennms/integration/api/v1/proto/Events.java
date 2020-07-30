// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: events.proto

package org.opennms.integration.api.v1.proto;

public final class Events {
  private Events() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AckOrBuilder extends
      // @@protoc_insertion_point(interface_extends:oia.Ack)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool succeeded = 1;</code>
     */
    boolean getSucceeded();
  }
  /**
   * Protobuf type {@code oia.Ack}
   */
  public  static final class Ack extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:oia.Ack)
      AckOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Ack.newBuilder() to construct.
    private Ack(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Ack() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Ack();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Ack(
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
            case 8: {

              succeeded_ = input.readBool();
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
      return org.opennms.integration.api.v1.proto.Events.internal_static_oia_Ack_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.integration.api.v1.proto.Events.internal_static_oia_Ack_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.integration.api.v1.proto.Events.Ack.class, org.opennms.integration.api.v1.proto.Events.Ack.Builder.class);
    }

    public static final int SUCCEEDED_FIELD_NUMBER = 1;
    private boolean succeeded_;
    /**
     * <code>bool succeeded = 1;</code>
     */
    public boolean getSucceeded() {
      return succeeded_;
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
      if (succeeded_ != false) {
        output.writeBool(1, succeeded_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (succeeded_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, succeeded_);
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
      if (!(obj instanceof org.opennms.integration.api.v1.proto.Events.Ack)) {
        return super.equals(obj);
      }
      org.opennms.integration.api.v1.proto.Events.Ack other = (org.opennms.integration.api.v1.proto.Events.Ack) obj;

      if (getSucceeded()
          != other.getSucceeded()) return false;
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
      hash = (37 * hash) + SUCCEEDED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getSucceeded());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.integration.api.v1.proto.Events.Ack parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.integration.api.v1.proto.Events.Ack parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.integration.api.v1.proto.Events.Ack parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.integration.api.v1.proto.Events.Ack parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.integration.api.v1.proto.Events.Ack parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.integration.api.v1.proto.Events.Ack parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.integration.api.v1.proto.Events.Ack parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.integration.api.v1.proto.Events.Ack parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.integration.api.v1.proto.Events.Ack parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.opennms.integration.api.v1.proto.Events.Ack parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.integration.api.v1.proto.Events.Ack parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.integration.api.v1.proto.Events.Ack parseFrom(
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
    public static Builder newBuilder(org.opennms.integration.api.v1.proto.Events.Ack prototype) {
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
     * Protobuf type {@code oia.Ack}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:oia.Ack)
        org.opennms.integration.api.v1.proto.Events.AckOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.integration.api.v1.proto.Events.internal_static_oia_Ack_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.integration.api.v1.proto.Events.internal_static_oia_Ack_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.integration.api.v1.proto.Events.Ack.class, org.opennms.integration.api.v1.proto.Events.Ack.Builder.class);
      }

      // Construct using org.opennms.integration.api.v1.proto.Events.Ack.newBuilder()
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
        succeeded_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.integration.api.v1.proto.Events.internal_static_oia_Ack_descriptor;
      }

      @java.lang.Override
      public org.opennms.integration.api.v1.proto.Events.Ack getDefaultInstanceForType() {
        return org.opennms.integration.api.v1.proto.Events.Ack.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.integration.api.v1.proto.Events.Ack build() {
        org.opennms.integration.api.v1.proto.Events.Ack result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.integration.api.v1.proto.Events.Ack buildPartial() {
        org.opennms.integration.api.v1.proto.Events.Ack result = new org.opennms.integration.api.v1.proto.Events.Ack(this);
        result.succeeded_ = succeeded_;
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
        if (other instanceof org.opennms.integration.api.v1.proto.Events.Ack) {
          return mergeFrom((org.opennms.integration.api.v1.proto.Events.Ack)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.integration.api.v1.proto.Events.Ack other) {
        if (other == org.opennms.integration.api.v1.proto.Events.Ack.getDefaultInstance()) return this;
        if (other.getSucceeded() != false) {
          setSucceeded(other.getSucceeded());
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
        org.opennms.integration.api.v1.proto.Events.Ack parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.opennms.integration.api.v1.proto.Events.Ack) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean succeeded_ ;
      /**
       * <code>bool succeeded = 1;</code>
       */
      public boolean getSucceeded() {
        return succeeded_;
      }
      /**
       * <code>bool succeeded = 1;</code>
       */
      public Builder setSucceeded(boolean value) {
        
        succeeded_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool succeeded = 1;</code>
       */
      public Builder clearSucceeded() {
        
        succeeded_ = false;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:oia.Ack)
    }

    // @@protoc_insertion_point(class_scope:oia.Ack)
    private static final org.opennms.integration.api.v1.proto.Events.Ack DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.integration.api.v1.proto.Events.Ack();
    }

    public static org.opennms.integration.api.v1.proto.Events.Ack getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Ack>
        PARSER = new com.google.protobuf.AbstractParser<Ack>() {
      @java.lang.Override
      public Ack parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Ack(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Ack> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Ack> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.integration.api.v1.proto.Events.Ack getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_oia_Ack_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_oia_Ack_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014events.proto\022\003oia\032\013model.proto\"\030\n\003Ack\022" +
      "\021\n\tsucceeded\030\001 \001(\0102k\n\016EventForwarder\022-\n\t" +
      "sendAsync\022\022.oia.InMemoryEvent\032\n.oia.Empt" +
      "y\"\000\022*\n\010sendSync\022\022.oia.InMemoryEvent\032\010.oi" +
      "a.Ack\"\000B-\n$org.opennms.integration.api.v" +
      "1.protoZ\005.;oiab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.opennms.integration.api.v1.proto.Model.getDescriptor(),
        });
    internal_static_oia_Ack_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_oia_Ack_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_oia_Ack_descriptor,
        new java.lang.String[] { "Succeeded", });
    org.opennms.integration.api.v1.proto.Model.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
