// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: JKLNLJJJPGK.proto

package emu.grasscutter.net.proto;

public final class JKLNLJJJPGKOuterClass {
  private JKLNLJJJPGKOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface JKLNLJJJPGKOrBuilder extends
      // @@protoc_insertion_point(interface_extends:JKLNLJJJPGK)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 HFGCJMEBDEC = 3;</code>
     * @return The hFGCJMEBDEC.
     */
    int getHFGCJMEBDEC();
  }
  /**
   * Protobuf type {@code JKLNLJJJPGK}
   */
  public static final class JKLNLJJJPGK extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:JKLNLJJJPGK)
      JKLNLJJJPGKOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use JKLNLJJJPGK.newBuilder() to construct.
    private JKLNLJJJPGK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private JKLNLJJJPGK() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new JKLNLJJJPGK();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private JKLNLJJJPGK(
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
            case 24: {

              hFGCJMEBDEC_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.internal_static_JKLNLJJJPGK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.internal_static_JKLNLJJJPGK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK.class, emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK.Builder.class);
    }

    public static final int HFGCJMEBDEC_FIELD_NUMBER = 3;
    private int hFGCJMEBDEC_;
    /**
     * <code>uint32 HFGCJMEBDEC = 3;</code>
     * @return The hFGCJMEBDEC.
     */
    @java.lang.Override
    public int getHFGCJMEBDEC() {
      return hFGCJMEBDEC_;
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
      if (hFGCJMEBDEC_ != 0) {
        output.writeUInt32(3, hFGCJMEBDEC_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (hFGCJMEBDEC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, hFGCJMEBDEC_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK other = (emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK) obj;

      if (getHFGCJMEBDEC()
          != other.getHFGCJMEBDEC()) return false;
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
      hash = (37 * hash) + HFGCJMEBDEC_FIELD_NUMBER;
      hash = (53 * hash) + getHFGCJMEBDEC();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK prototype) {
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
     * Protobuf type {@code JKLNLJJJPGK}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:JKLNLJJJPGK)
        emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGKOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.internal_static_JKLNLJJJPGK_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.internal_static_JKLNLJJJPGK_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK.class, emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK.newBuilder()
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
        hFGCJMEBDEC_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.internal_static_JKLNLJJJPGK_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK build() {
        emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK buildPartial() {
        emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK result = new emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK(this);
        result.hFGCJMEBDEC_ = hFGCJMEBDEC_;
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
        if (other instanceof emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK) {
          return mergeFrom((emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK other) {
        if (other == emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK.getDefaultInstance()) return this;
        if (other.getHFGCJMEBDEC() != 0) {
          setHFGCJMEBDEC(other.getHFGCJMEBDEC());
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
        emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int hFGCJMEBDEC_ ;
      /**
       * <code>uint32 HFGCJMEBDEC = 3;</code>
       * @return The hFGCJMEBDEC.
       */
      @java.lang.Override
      public int getHFGCJMEBDEC() {
        return hFGCJMEBDEC_;
      }
      /**
       * <code>uint32 HFGCJMEBDEC = 3;</code>
       * @param value The hFGCJMEBDEC to set.
       * @return This builder for chaining.
       */
      public Builder setHFGCJMEBDEC(int value) {
        
        hFGCJMEBDEC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 HFGCJMEBDEC = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearHFGCJMEBDEC() {
        
        hFGCJMEBDEC_ = 0;
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


      // @@protoc_insertion_point(builder_scope:JKLNLJJJPGK)
    }

    // @@protoc_insertion_point(class_scope:JKLNLJJJPGK)
    private static final emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK();
    }

    public static emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<JKLNLJJJPGK>
        PARSER = new com.google.protobuf.AbstractParser<JKLNLJJJPGK>() {
      @java.lang.Override
      public JKLNLJJJPGK parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new JKLNLJJJPGK(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<JKLNLJJJPGK> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JKLNLJJJPGK> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.JKLNLJJJPGKOuterClass.JKLNLJJJPGK getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JKLNLJJJPGK_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JKLNLJJJPGK_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021JKLNLJJJPGK.proto\"\"\n\013JKLNLJJJPGK\022\023\n\013HF" +
      "GCJMEBDEC\030\003 \001(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_JKLNLJJJPGK_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_JKLNLJJJPGK_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JKLNLJJJPGK_descriptor,
        new java.lang.String[] { "HFGCJMEBDEC", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
