// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: project_is.proto

package com.assign_1;

public final class ProjectIsProto {
  private ProjectIsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_assign_1_OwnersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_assign_1_OwnersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_assign_1_Reply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_assign_1_Reply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_assign_1_Owners_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_assign_1_Owners_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_assign_1_Car_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_assign_1_Car_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020project_is.proto\022\014com.assign_1\"\033\n\rOwne" +
      "rsRequest\022\n\n\002id\030\004 \003(\005\"-\n\005Reply\022$\n\006owners" +
      "\030\001 \003(\0132\024.com.assign_1.Owners\"g\n\006Owners\022\n" +
      "\n\002id\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\021\n\ttelephone\030\003 " +
      "\001(\005\022\017\n\007address\030\004 \001(\t\022\037\n\004cars\030\005 \001(\0132\021.com" +
      ".assign_1.Car\"w\n\003Car\022\n\n\002id\030\001 \001(\005\022\r\n\005bran" +
      "d\030\002 \001(\t\022\r\n\005model\030\003 \001(\t\022\023\n\013engine_size\030\004 " +
      "\001(\005\022\r\n\005power\030\005 \001(\005\022\023\n\013consumption\030\006 \001(\005\022" +
      "\r\n\005plate\030\007 \001(\t2J\n\tProjectIs\022=\n\007getCars\022\033" +
      ".com.assign_1.OwnersRequest\032\023.com.assign" +
      "_1.Reply\"\000B&\n\014com.assign_1B\016ProjectIsPro" +
      "toP\001\242\002\003PISb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_assign_1_OwnersRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_assign_1_OwnersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_assign_1_OwnersRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_com_assign_1_Reply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_assign_1_Reply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_assign_1_Reply_descriptor,
        new java.lang.String[] { "Owners", });
    internal_static_com_assign_1_Owners_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_assign_1_Owners_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_assign_1_Owners_descriptor,
        new java.lang.String[] { "Id", "Name", "Telephone", "Address", "Cars", });
    internal_static_com_assign_1_Car_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_assign_1_Car_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_assign_1_Car_descriptor,
        new java.lang.String[] { "Id", "Brand", "Model", "EngineSize", "Power", "Consumption", "Plate", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
