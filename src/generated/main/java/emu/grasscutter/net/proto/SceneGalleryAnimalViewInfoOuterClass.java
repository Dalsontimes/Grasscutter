// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryAnimalViewInfo.proto

package emu.grasscutter.net.proto;

public final class SceneGalleryAnimalViewInfoOuterClass {
  private SceneGalleryAnimalViewInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryAnimalViewInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryAnimalViewInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 JODHGJNHBDI = 13;</code>
     * @return The jODHGJNHBDI.
     */
    int getJODHGJNHBDI();

    /**
     * <code>uint32 GHJANEPNHCM = 6;</code>
     * @return The gHJANEPNHCM.
     */
    int getGHJANEPNHCM();

    /**
     * <code>uint32 entity_id = 7;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * <pre>
   * Obf: JHJEHIOGJDM
   * </pre>
   *
   * Protobuf type {@code SceneGalleryAnimalViewInfo}
   */
  public static final class SceneGalleryAnimalViewInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryAnimalViewInfo)
      SceneGalleryAnimalViewInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryAnimalViewInfo.newBuilder() to construct.
    private SceneGalleryAnimalViewInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryAnimalViewInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryAnimalViewInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneGalleryAnimalViewInfo(
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
            case 48: {

              gHJANEPNHCM_ = input.readUInt32();
              break;
            }
            case 56: {

              entityId_ = input.readUInt32();
              break;
            }
            case 104: {

              jODHGJNHBDI_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.internal_static_SceneGalleryAnimalViewInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.internal_static_SceneGalleryAnimalViewInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo.class, emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo.Builder.class);
    }

    public static final int JODHGJNHBDI_FIELD_NUMBER = 13;
    private int jODHGJNHBDI_;
    /**
     * <code>uint32 JODHGJNHBDI = 13;</code>
     * @return The jODHGJNHBDI.
     */
    @java.lang.Override
    public int getJODHGJNHBDI() {
      return jODHGJNHBDI_;
    }

    public static final int GHJANEPNHCM_FIELD_NUMBER = 6;
    private int gHJANEPNHCM_;
    /**
     * <code>uint32 GHJANEPNHCM = 6;</code>
     * @return The gHJANEPNHCM.
     */
    @java.lang.Override
    public int getGHJANEPNHCM() {
      return gHJANEPNHCM_;
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 7;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 7;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
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
      if (gHJANEPNHCM_ != 0) {
        output.writeUInt32(6, gHJANEPNHCM_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(7, entityId_);
      }
      if (jODHGJNHBDI_ != 0) {
        output.writeUInt32(13, jODHGJNHBDI_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gHJANEPNHCM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, gHJANEPNHCM_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, entityId_);
      }
      if (jODHGJNHBDI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, jODHGJNHBDI_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo other = (emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo) obj;

      if (getJODHGJNHBDI()
          != other.getJODHGJNHBDI()) return false;
      if (getGHJANEPNHCM()
          != other.getGHJANEPNHCM()) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
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
      hash = (37 * hash) + JODHGJNHBDI_FIELD_NUMBER;
      hash = (53 * hash) + getJODHGJNHBDI();
      hash = (37 * hash) + GHJANEPNHCM_FIELD_NUMBER;
      hash = (53 * hash) + getGHJANEPNHCM();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo prototype) {
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
     * Obf: JHJEHIOGJDM
     * </pre>
     *
     * Protobuf type {@code SceneGalleryAnimalViewInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryAnimalViewInfo)
        emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.internal_static_SceneGalleryAnimalViewInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.internal_static_SceneGalleryAnimalViewInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo.class, emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo.newBuilder()
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
        jODHGJNHBDI_ = 0;

        gHJANEPNHCM_ = 0;

        entityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.internal_static_SceneGalleryAnimalViewInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo build() {
        emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo buildPartial() {
        emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo result = new emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo(this);
        result.jODHGJNHBDI_ = jODHGJNHBDI_;
        result.gHJANEPNHCM_ = gHJANEPNHCM_;
        result.entityId_ = entityId_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo other) {
        if (other == emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo.getDefaultInstance()) return this;
        if (other.getJODHGJNHBDI() != 0) {
          setJODHGJNHBDI(other.getJODHGJNHBDI());
        }
        if (other.getGHJANEPNHCM() != 0) {
          setGHJANEPNHCM(other.getGHJANEPNHCM());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
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
        emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int jODHGJNHBDI_ ;
      /**
       * <code>uint32 JODHGJNHBDI = 13;</code>
       * @return The jODHGJNHBDI.
       */
      @java.lang.Override
      public int getJODHGJNHBDI() {
        return jODHGJNHBDI_;
      }
      /**
       * <code>uint32 JODHGJNHBDI = 13;</code>
       * @param value The jODHGJNHBDI to set.
       * @return This builder for chaining.
       */
      public Builder setJODHGJNHBDI(int value) {
        
        jODHGJNHBDI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 JODHGJNHBDI = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearJODHGJNHBDI() {
        
        jODHGJNHBDI_ = 0;
        onChanged();
        return this;
      }

      private int gHJANEPNHCM_ ;
      /**
       * <code>uint32 GHJANEPNHCM = 6;</code>
       * @return The gHJANEPNHCM.
       */
      @java.lang.Override
      public int getGHJANEPNHCM() {
        return gHJANEPNHCM_;
      }
      /**
       * <code>uint32 GHJANEPNHCM = 6;</code>
       * @param value The gHJANEPNHCM to set.
       * @return This builder for chaining.
       */
      public Builder setGHJANEPNHCM(int value) {
        
        gHJANEPNHCM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 GHJANEPNHCM = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearGHJANEPNHCM() {
        
        gHJANEPNHCM_ = 0;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 7;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 7;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryAnimalViewInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryAnimalViewInfo)
    private static final emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo();
    }

    public static emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryAnimalViewInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryAnimalViewInfo>() {
      @java.lang.Override
      public SceneGalleryAnimalViewInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneGalleryAnimalViewInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneGalleryAnimalViewInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryAnimalViewInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneGalleryAnimalViewInfoOuterClass.SceneGalleryAnimalViewInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryAnimalViewInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryAnimalViewInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n SceneGalleryAnimalViewInfo.proto\"Y\n\032Sc" +
      "eneGalleryAnimalViewInfo\022\023\n\013JODHGJNHBDI\030" +
      "\r \001(\r\022\023\n\013GHJANEPNHCM\030\006 \001(\r\022\021\n\tentity_id\030" +
      "\007 \001(\rB\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGalleryAnimalViewInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryAnimalViewInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryAnimalViewInfo_descriptor,
        new java.lang.String[] { "JODHGJNHBDI", "GHJANEPNHCM", "EntityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}