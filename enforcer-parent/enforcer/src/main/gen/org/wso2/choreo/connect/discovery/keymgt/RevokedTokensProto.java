// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/keymgt/revoked_tokens.proto

package org.wso2.choreo.connect.discovery.keymgt;

public final class RevokedTokensProto {
  private RevokedTokensProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wso2_discovery_keymgt_RevokedToken_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wso2_discovery_keymgt_RevokedToken_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*wso2/discovery/keymgt/revoked_tokens.p" +
      "roto\022\025wso2.discovery.keymgt\"/\n\014RevokedTo" +
      "ken\022\013\n\003jti\030\001 \001(\t\022\022\n\nexpirytime\030\002 \001(\003B\205\001\n" +
      "(org.wso2.choreo.connect.discovery.keymg" +
      "tB\022RevokedTokensProtoP\001ZCgithub.com/envo" +
      "yproxy/go-control-plane/wso2/discovery/k" +
      "eymgt;keymgtb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_wso2_discovery_keymgt_RevokedToken_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_wso2_discovery_keymgt_RevokedToken_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wso2_discovery_keymgt_RevokedToken_descriptor,
        new java.lang.String[] { "Jti", "Expirytime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}