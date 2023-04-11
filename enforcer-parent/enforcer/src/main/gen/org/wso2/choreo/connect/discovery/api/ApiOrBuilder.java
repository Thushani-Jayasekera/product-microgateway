// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/api/api.proto

package org.wso2.choreo.connect.discovery.api;

public interface ApiOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wso2.discovery.api.Api)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string title = 2;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>string version = 3;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <code>string version = 3;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <code>string apiType = 4;</code>
   * @return The apiType.
   */
  java.lang.String getApiType();
  /**
   * <code>string apiType = 4;</code>
   * @return The bytes for apiType.
   */
  com.google.protobuf.ByteString
      getApiTypeBytes();

  /**
   * <code>string description = 5;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 5;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>.wso2.discovery.api.EndpointCluster productionEndpoints = 6;</code>
   * @return Whether the productionEndpoints field is set.
   */
  boolean hasProductionEndpoints();
  /**
   * <code>.wso2.discovery.api.EndpointCluster productionEndpoints = 6;</code>
   * @return The productionEndpoints.
   */
  org.wso2.choreo.connect.discovery.api.EndpointCluster getProductionEndpoints();
  /**
   * <code>.wso2.discovery.api.EndpointCluster productionEndpoints = 6;</code>
   */
  org.wso2.choreo.connect.discovery.api.EndpointClusterOrBuilder getProductionEndpointsOrBuilder();

  /**
   * <code>.wso2.discovery.api.EndpointCluster sandboxEndpoints = 7;</code>
   * @return Whether the sandboxEndpoints field is set.
   */
  boolean hasSandboxEndpoints();
  /**
   * <code>.wso2.discovery.api.EndpointCluster sandboxEndpoints = 7;</code>
   * @return The sandboxEndpoints.
   */
  org.wso2.choreo.connect.discovery.api.EndpointCluster getSandboxEndpoints();
  /**
   * <code>.wso2.discovery.api.EndpointCluster sandboxEndpoints = 7;</code>
   */
  org.wso2.choreo.connect.discovery.api.EndpointClusterOrBuilder getSandboxEndpointsOrBuilder();

  /**
   * <code>repeated .wso2.discovery.api.Resource resources = 8;</code>
   */
  java.util.List<org.wso2.choreo.connect.discovery.api.Resource> 
      getResourcesList();
  /**
   * <code>repeated .wso2.discovery.api.Resource resources = 8;</code>
   */
  org.wso2.choreo.connect.discovery.api.Resource getResources(int index);
  /**
   * <code>repeated .wso2.discovery.api.Resource resources = 8;</code>
   */
  int getResourcesCount();
  /**
   * <code>repeated .wso2.discovery.api.Resource resources = 8;</code>
   */
  java.util.List<? extends org.wso2.choreo.connect.discovery.api.ResourceOrBuilder> 
      getResourcesOrBuilderList();
  /**
   * <code>repeated .wso2.discovery.api.Resource resources = 8;</code>
   */
  org.wso2.choreo.connect.discovery.api.ResourceOrBuilder getResourcesOrBuilder(
      int index);

  /**
   * <code>string basePath = 9;</code>
   * @return The basePath.
   */
  java.lang.String getBasePath();
  /**
   * <code>string basePath = 9;</code>
   * @return The bytes for basePath.
   */
  com.google.protobuf.ByteString
      getBasePathBytes();

  /**
   * <code>string tier = 10;</code>
   * @return The tier.
   */
  java.lang.String getTier();
  /**
   * <code>string tier = 10;</code>
   * @return The bytes for tier.
   */
  com.google.protobuf.ByteString
      getTierBytes();

  /**
   * <code>string apiLifeCycleState = 11;</code>
   * @return The apiLifeCycleState.
   */
  java.lang.String getApiLifeCycleState();
  /**
   * <code>string apiLifeCycleState = 11;</code>
   * @return The bytes for apiLifeCycleState.
   */
  com.google.protobuf.ByteString
      getApiLifeCycleStateBytes();

  /**
   * <code>repeated .wso2.discovery.api.SecurityScheme securityScheme = 12;</code>
   */
  java.util.List<org.wso2.choreo.connect.discovery.api.SecurityScheme> 
      getSecuritySchemeList();
  /**
   * <code>repeated .wso2.discovery.api.SecurityScheme securityScheme = 12;</code>
   */
  org.wso2.choreo.connect.discovery.api.SecurityScheme getSecurityScheme(int index);
  /**
   * <code>repeated .wso2.discovery.api.SecurityScheme securityScheme = 12;</code>
   */
  int getSecuritySchemeCount();
  /**
   * <code>repeated .wso2.discovery.api.SecurityScheme securityScheme = 12;</code>
   */
  java.util.List<? extends org.wso2.choreo.connect.discovery.api.SecuritySchemeOrBuilder> 
      getSecuritySchemeOrBuilderList();
  /**
   * <code>repeated .wso2.discovery.api.SecurityScheme securityScheme = 12;</code>
   */
  org.wso2.choreo.connect.discovery.api.SecuritySchemeOrBuilder getSecuritySchemeOrBuilder(
      int index);

  /**
   * <code>repeated .wso2.discovery.api.SecurityList security = 13;</code>
   */
  java.util.List<org.wso2.choreo.connect.discovery.api.SecurityList> 
      getSecurityList();
  /**
   * <code>repeated .wso2.discovery.api.SecurityList security = 13;</code>
   */
  org.wso2.choreo.connect.discovery.api.SecurityList getSecurity(int index);
  /**
   * <code>repeated .wso2.discovery.api.SecurityList security = 13;</code>
   */
  int getSecurityCount();
  /**
   * <code>repeated .wso2.discovery.api.SecurityList security = 13;</code>
   */
  java.util.List<? extends org.wso2.choreo.connect.discovery.api.SecurityListOrBuilder> 
      getSecurityOrBuilderList();
  /**
   * <code>repeated .wso2.discovery.api.SecurityList security = 13;</code>
   */
  org.wso2.choreo.connect.discovery.api.SecurityListOrBuilder getSecurityOrBuilder(
      int index);

  /**
   * <code>.wso2.discovery.api.EndpointSecurity endpointSecurity = 14;</code>
   * @return Whether the endpointSecurity field is set.
   */
  boolean hasEndpointSecurity();
  /**
   * <code>.wso2.discovery.api.EndpointSecurity endpointSecurity = 14;</code>
   * @return The endpointSecurity.
   */
  org.wso2.choreo.connect.discovery.api.EndpointSecurity getEndpointSecurity();
  /**
   * <code>.wso2.discovery.api.EndpointSecurity endpointSecurity = 14;</code>
   */
  org.wso2.choreo.connect.discovery.api.EndpointSecurityOrBuilder getEndpointSecurityOrBuilder();

  /**
   * <code>string authorizationHeader = 15;</code>
   * @return The authorizationHeader.
   */
  java.lang.String getAuthorizationHeader();
  /**
   * <code>string authorizationHeader = 15;</code>
   * @return The bytes for authorizationHeader.
   */
  com.google.protobuf.ByteString
      getAuthorizationHeaderBytes();

  /**
   * <code>bool disableSecurity = 16;</code>
   * @return The disableSecurity.
   */
  boolean getDisableSecurity();

  /**
   * <code>string vhost = 17;</code>
   * @return The vhost.
   */
  java.lang.String getVhost();
  /**
   * <code>string vhost = 17;</code>
   * @return The bytes for vhost.
   */
  com.google.protobuf.ByteString
      getVhostBytes();

  /**
   * <code>string organizationId = 18;</code>
   * @return The organizationId.
   */
  java.lang.String getOrganizationId();
  /**
   * <code>string organizationId = 18;</code>
   * @return The bytes for organizationId.
   */
  com.google.protobuf.ByteString
      getOrganizationIdBytes();

  /**
   * <code>string apiProvider = 19;</code>
   * @return The apiProvider.
   */
  java.lang.String getApiProvider();
  /**
   * <code>string apiProvider = 19;</code>
   * @return The bytes for apiProvider.
   */
  com.google.protobuf.ByteString
      getApiProviderBytes();

  /**
   * <code>bool enableBackendJWT = 20;</code>
   * @return The enableBackendJWT.
   */
  boolean getEnableBackendJWT();

  /**
   * <code>string deploymentType = 21;</code>
   * @return The deploymentType.
   */
  java.lang.String getDeploymentType();
  /**
   * <code>string deploymentType = 21;</code>
   * @return The bytes for deploymentType.
   */
  com.google.protobuf.ByteString
      getDeploymentTypeBytes();
}
