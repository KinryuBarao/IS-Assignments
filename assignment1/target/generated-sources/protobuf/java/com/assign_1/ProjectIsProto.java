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
    internal_static_com_assign_1_XML_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_assign_1_XML_fieldAccessorTable;
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
    internal_static_com_assign_1_O_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_assign_1_O_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_assign_1_C_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_assign_1_C_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020project_is.proto\022\014com.assign_1\"\030\n\003XML\022" +
      "\021\n\txmlString\030\001 \001(\t\"\033\n\rOwnersRequest\022\n\n\002i" +
      "d\030\004 \003(\005\"(\n\005Reply\022\037\n\006owners\030\001 \003(\0132\017.com.a" +
      "ssign_1.O\"`\n\001O\022\n\n\002id\030\001 \001(\005\022\014\n\004name\030\002 \001(\t" +
      "\022\021\n\ttelephone\030\003 \001(\005\022\017\n\007address\030\004 \001(\t\022\035\n\004" +
      "cars\030\005 \003(\0132\017.com.assign_1.C\"u\n\001C\022\n\n\002id\030\001" +
      " \001(\005\022\r\n\005brand\030\002 \001(\t\022\r\n\005model\030\003 \001(\t\022\023\n\013en" +
      "gine_size\030\004 \001(\005\022\r\n\005power\030\005 \001(\005\022\023\n\013consum" +
      "ption\030\006 \001(\005\022\r\n\005plate\030\007 \001(\t2\210\001\n\tProjectIs" +
      "\022=\n\007getCars\022\033.com.assign_1.OwnersRequest" +
      "\032\023.com.assign_1.Reply\"\000\022<\n\ngetCarsXml\022\033." +
      "com.assign_1.OwnersRequest\032\021.com.assign_" +
      "1.XMLB&\n\014com.assign_1B\016ProjectIsProtoP\001\242" +
      "\002\003PISb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_assign_1_XML_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_assign_1_XML_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_assign_1_XML_descriptor,
        new java.lang.String[] { "XmlString", });
    internal_static_com_assign_1_OwnersRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_assign_1_OwnersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_assign_1_OwnersRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_com_assign_1_Reply_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_assign_1_Reply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_assign_1_Reply_descriptor,
        new java.lang.String[] { "Owners", });
    internal_static_com_assign_1_O_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_assign_1_O_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_assign_1_O_descriptor,
        new java.lang.String[] { "Id", "Name", "Telephone", "Address", "Cars", });
    internal_static_com_assign_1_C_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_assign_1_C_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_assign_1_C_descriptor,
        new java.lang.String[] { "Id", "Brand", "Model", "EngineSize", "Power", "Consumption", "Plate", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
