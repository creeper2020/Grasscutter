// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGMsgOpTimer.proto

package emu.grasscutter.net.proto;

public final class GCGMsgOpTimerOuterClass {
  private GCGMsgOpTimerOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGMsgOpTimerOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGMsgOpTimer)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>fixed64 time_stamp = 3;</code>
     * @return The timeStamp.
     */
    long getTimeStamp();

    /**
     * <code>fixed64 begin_time = 4;</code>
     * @return The beginTime.
     */
    long getBeginTime();

    /**
     * <code>uint32 controller_id = 5;</code>
     * @return The controllerId.
     */
    int getControllerId();

    /**
     * <code>.GCGPhaseType phase = 9;</code>
     * @return The enum numeric value on the wire for phase.
     */
    int getPhaseValue();
    /**
     * <code>.GCGPhaseType phase = 9;</code>
     * @return The phase.
     */
    emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.GCGPhaseType getPhase();
  }
  /**
   * <pre>
   * Obf: HDBIKIIAINO
   * </pre>
   *
   * Protobuf type {@code GCGMsgOpTimer}
   */
  public static final class GCGMsgOpTimer extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGMsgOpTimer)
      GCGMsgOpTimerOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGMsgOpTimer.newBuilder() to construct.
    private GCGMsgOpTimer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGMsgOpTimer() {
      phase_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGMsgOpTimer();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGMsgOpTimer(
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
            case 25: {

              timeStamp_ = input.readFixed64();
              break;
            }
            case 33: {

              beginTime_ = input.readFixed64();
              break;
            }
            case 40: {

              controllerId_ = input.readUInt32();
              break;
            }
            case 72: {
              int rawValue = input.readEnum();

              phase_ = rawValue;
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
      return emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.internal_static_GCGMsgOpTimer_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.internal_static_GCGMsgOpTimer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer.class, emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer.Builder.class);
    }

    public static final int TIME_STAMP_FIELD_NUMBER = 3;
    private long timeStamp_;
    /**
     * <code>fixed64 time_stamp = 3;</code>
     * @return The timeStamp.
     */
    @java.lang.Override
    public long getTimeStamp() {
      return timeStamp_;
    }

    public static final int BEGIN_TIME_FIELD_NUMBER = 4;
    private long beginTime_;
    /**
     * <code>fixed64 begin_time = 4;</code>
     * @return The beginTime.
     */
    @java.lang.Override
    public long getBeginTime() {
      return beginTime_;
    }

    public static final int CONTROLLER_ID_FIELD_NUMBER = 5;
    private int controllerId_;
    /**
     * <code>uint32 controller_id = 5;</code>
     * @return The controllerId.
     */
    @java.lang.Override
    public int getControllerId() {
      return controllerId_;
    }

    public static final int PHASE_FIELD_NUMBER = 9;
    private int phase_;
    /**
     * <code>.GCGPhaseType phase = 9;</code>
     * @return The enum numeric value on the wire for phase.
     */
    @java.lang.Override public int getPhaseValue() {
      return phase_;
    }
    /**
     * <code>.GCGPhaseType phase = 9;</code>
     * @return The phase.
     */
    @java.lang.Override public emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.GCGPhaseType getPhase() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.GCGPhaseType result = emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.GCGPhaseType.valueOf(phase_);
      return result == null ? emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.GCGPhaseType.UNRECOGNIZED : result;
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
      if (timeStamp_ != 0L) {
        output.writeFixed64(3, timeStamp_);
      }
      if (beginTime_ != 0L) {
        output.writeFixed64(4, beginTime_);
      }
      if (controllerId_ != 0) {
        output.writeUInt32(5, controllerId_);
      }
      if (phase_ != emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.GCGPhaseType.OFOHJIEDJKD_GcgPhaseInvalid.getNumber()) {
        output.writeEnum(9, phase_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (timeStamp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed64Size(3, timeStamp_);
      }
      if (beginTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed64Size(4, beginTime_);
      }
      if (controllerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, controllerId_);
      }
      if (phase_ != emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.GCGPhaseType.OFOHJIEDJKD_GcgPhaseInvalid.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(9, phase_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer other = (emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer) obj;

      if (getTimeStamp()
          != other.getTimeStamp()) return false;
      if (getBeginTime()
          != other.getBeginTime()) return false;
      if (getControllerId()
          != other.getControllerId()) return false;
      if (phase_ != other.phase_) return false;
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
      hash = (37 * hash) + TIME_STAMP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTimeStamp());
      hash = (37 * hash) + BEGIN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getBeginTime());
      hash = (37 * hash) + CONTROLLER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getControllerId();
      hash = (37 * hash) + PHASE_FIELD_NUMBER;
      hash = (53 * hash) + phase_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer prototype) {
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
     * <pre>
     * Obf: HDBIKIIAINO
     * </pre>
     *
     * Protobuf type {@code GCGMsgOpTimer}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGMsgOpTimer)
        emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.internal_static_GCGMsgOpTimer_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.internal_static_GCGMsgOpTimer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer.class, emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer.newBuilder()
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
        timeStamp_ = 0L;

        beginTime_ = 0L;

        controllerId_ = 0;

        phase_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.internal_static_GCGMsgOpTimer_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer build() {
        emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer buildPartial() {
        emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer result = new emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer(this);
        result.timeStamp_ = timeStamp_;
        result.beginTime_ = beginTime_;
        result.controllerId_ = controllerId_;
        result.phase_ = phase_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer) {
          return mergeFrom((emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer other) {
        if (other == emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer.getDefaultInstance()) return this;
        if (other.getTimeStamp() != 0L) {
          setTimeStamp(other.getTimeStamp());
        }
        if (other.getBeginTime() != 0L) {
          setBeginTime(other.getBeginTime());
        }
        if (other.getControllerId() != 0) {
          setControllerId(other.getControllerId());
        }
        if (other.phase_ != 0) {
          setPhaseValue(other.getPhaseValue());
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
        emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long timeStamp_ ;
      /**
       * <code>fixed64 time_stamp = 3;</code>
       * @return The timeStamp.
       */
      @java.lang.Override
      public long getTimeStamp() {
        return timeStamp_;
      }
      /**
       * <code>fixed64 time_stamp = 3;</code>
       * @param value The timeStamp to set.
       * @return This builder for chaining.
       */
      public Builder setTimeStamp(long value) {
        
        timeStamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed64 time_stamp = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimeStamp() {
        
        timeStamp_ = 0L;
        onChanged();
        return this;
      }

      private long beginTime_ ;
      /**
       * <code>fixed64 begin_time = 4;</code>
       * @return The beginTime.
       */
      @java.lang.Override
      public long getBeginTime() {
        return beginTime_;
      }
      /**
       * <code>fixed64 begin_time = 4;</code>
       * @param value The beginTime to set.
       * @return This builder for chaining.
       */
      public Builder setBeginTime(long value) {
        
        beginTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed64 begin_time = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearBeginTime() {
        
        beginTime_ = 0L;
        onChanged();
        return this;
      }

      private int controllerId_ ;
      /**
       * <code>uint32 controller_id = 5;</code>
       * @return The controllerId.
       */
      @java.lang.Override
      public int getControllerId() {
        return controllerId_;
      }
      /**
       * <code>uint32 controller_id = 5;</code>
       * @param value The controllerId to set.
       * @return This builder for chaining.
       */
      public Builder setControllerId(int value) {
        
        controllerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 controller_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearControllerId() {
        
        controllerId_ = 0;
        onChanged();
        return this;
      }

      private int phase_ = 0;
      /**
       * <code>.GCGPhaseType phase = 9;</code>
       * @return The enum numeric value on the wire for phase.
       */
      @java.lang.Override public int getPhaseValue() {
        return phase_;
      }
      /**
       * <code>.GCGPhaseType phase = 9;</code>
       * @param value The enum numeric value on the wire for phase to set.
       * @return This builder for chaining.
       */
      public Builder setPhaseValue(int value) {
        
        phase_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GCGPhaseType phase = 9;</code>
       * @return The phase.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.GCGPhaseType getPhase() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.GCGPhaseType result = emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.GCGPhaseType.valueOf(phase_);
        return result == null ? emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.GCGPhaseType.UNRECOGNIZED : result;
      }
      /**
       * <code>.GCGPhaseType phase = 9;</code>
       * @param value The phase to set.
       * @return This builder for chaining.
       */
      public Builder setPhase(emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.GCGPhaseType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        phase_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GCGPhaseType phase = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearPhase() {
        
        phase_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGMsgOpTimer)
    }

    // @@protoc_insertion_point(class_scope:GCGMsgOpTimer)
    private static final emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer();
    }

    public static emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGMsgOpTimer>
        PARSER = new com.google.protobuf.AbstractParser<GCGMsgOpTimer>() {
      @java.lang.Override
      public GCGMsgOpTimer parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGMsgOpTimer(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGMsgOpTimer> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGMsgOpTimer> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGMsgOpTimer_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGMsgOpTimer_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023GCGMsgOpTimer.proto\032\022GCGPhaseType.prot" +
      "o\"l\n\rGCGMsgOpTimer\022\022\n\ntime_stamp\030\003 \001(\006\022\022" +
      "\n\nbegin_time\030\004 \001(\006\022\025\n\rcontroller_id\030\005 \001(" +
      "\r\022\034\n\005phase\030\t \001(\0162\r.GCGPhaseTypeB\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.getDescriptor(),
        });
    internal_static_GCGMsgOpTimer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGMsgOpTimer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGMsgOpTimer_descriptor,
        new java.lang.String[] { "TimeStamp", "BeginTime", "ControllerId", "Phase", });
    emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
