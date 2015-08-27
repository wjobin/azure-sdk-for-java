/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.websites.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import com.microsoft.windowsazure.core.LazyHashMap;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

/**
* The parameters supplied Update Configuration Web Site operation.
*/
public class WebSiteUpdateConfigurationParameters {
    private Boolean alwaysOn;
    
    /**
    * Optional. Indicates if site's Always On feature enabled.
    * @return The AlwaysOn value.
    */
    public Boolean isAlwaysOn() {
        return this.alwaysOn;
    }
    
    /**
    * Optional. Indicates if site's Always On feature enabled.
    * @param alwaysOnValue The AlwaysOn value.
    */
    public void setAlwaysOn(final Boolean alwaysOnValue) {
        this.alwaysOn = alwaysOnValue;
    }
    
    private HashMap<String, String> appSettings;
    
    /**
    * Optional. A set of name/value pairs that contain application settings for
    * a web site.
    * @return The AppSettings value.
    */
    public HashMap<String, String> getAppSettings() {
        return this.appSettings;
    }
    
    /**
    * Optional. A set of name/value pairs that contain application settings for
    * a web site.
    * @param appSettingsValue The AppSettings value.
    */
    public void setAppSettings(final HashMap<String, String> appSettingsValue) {
        this.appSettings = appSettingsValue;
    }
    
    private String autoSwapSlotName;
    
    /**
    * Optional. Sets the slot name to swap with after successful deployment.
    * @return The AutoSwapSlotName value.
    */
    public String getAutoSwapSlotName() {
        return this.autoSwapSlotName;
    }
    
    /**
    * Optional. Sets the slot name to swap with after successful deployment.
    * @param autoSwapSlotNameValue The AutoSwapSlotName value.
    */
    public void setAutoSwapSlotName(final String autoSwapSlotNameValue) {
        this.autoSwapSlotName = autoSwapSlotNameValue;
    }
    
    private ArrayList<WebSiteUpdateConfigurationParameters.ConnectionStringInfo> connectionStrings;
    
    /**
    * Optional. The connection strings for database and other external
    * resources.
    * @return The ConnectionStrings value.
    */
    public ArrayList<WebSiteUpdateConfigurationParameters.ConnectionStringInfo> getConnectionStrings() {
        return this.connectionStrings;
    }
    
    /**
    * Optional. The connection strings for database and other external
    * resources.
    * @param connectionStringsValue The ConnectionStrings value.
    */
    public void setConnectionStrings(final ArrayList<WebSiteUpdateConfigurationParameters.ConnectionStringInfo> connectionStringsValue) {
        this.connectionStrings = connectionStringsValue;
    }
    
    private ArrayList<String> defaultDocuments;
    
    /**
    * Optional. One or more string elements that list, in order of preference,
    * the name of the file that a web site returns when the web site's domain
    * name is requested by itself. For example, if the default document for
    * http://contoso.com is default.htm, the page
    * http://www.contoso.com/default.htm is returned when the browser is
    * pointed to http://www.contoso.com.
    * @return The DefaultDocuments value.
    */
    public ArrayList<String> getDefaultDocuments() {
        return this.defaultDocuments;
    }
    
    /**
    * Optional. One or more string elements that list, in order of preference,
    * the name of the file that a web site returns when the web site's domain
    * name is requested by itself. For example, if the default document for
    * http://contoso.com is default.htm, the page
    * http://www.contoso.com/default.htm is returned when the browser is
    * pointed to http://www.contoso.com.
    * @param defaultDocumentsValue The DefaultDocuments value.
    */
    public void setDefaultDocuments(final ArrayList<String> defaultDocumentsValue) {
        this.defaultDocuments = defaultDocumentsValue;
    }
    
    private Boolean detailedErrorLoggingEnabled;
    
    /**
    * Optional. Indicates if detailed error logging is enabled.
    * @return The DetailedErrorLoggingEnabled value.
    */
    public Boolean isDetailedErrorLoggingEnabled() {
        return this.detailedErrorLoggingEnabled;
    }
    
    /**
    * Optional. Indicates if detailed error logging is enabled.
    * @param detailedErrorLoggingEnabledValue The DetailedErrorLoggingEnabled
    * value.
    */
    public void setDetailedErrorLoggingEnabled(final Boolean detailedErrorLoggingEnabledValue) {
        this.detailedErrorLoggingEnabled = detailedErrorLoggingEnabledValue;
    }
    
    private String documentRoot;
    
    /**
    * Optional. The document root.
    * @return The DocumentRoot value.
    */
    public String getDocumentRoot() {
        return this.documentRoot;
    }
    
    /**
    * Optional. The document root.
    * @param documentRootValue The DocumentRoot value.
    */
    public void setDocumentRoot(final String documentRootValue) {
        this.documentRoot = documentRootValue;
    }
    
    private ArrayList<WebSiteUpdateConfigurationParameters.HandlerMapping> handlerMappings;
    
    /**
    * Optional. Specifies custom executable programs for handling requests for
    * specific file name extensions.
    * @return The HandlerMappings value.
    */
    public ArrayList<WebSiteUpdateConfigurationParameters.HandlerMapping> getHandlerMappings() {
        return this.handlerMappings;
    }
    
    /**
    * Optional. Specifies custom executable programs for handling requests for
    * specific file name extensions.
    * @param handlerMappingsValue The HandlerMappings value.
    */
    public void setHandlerMappings(final ArrayList<WebSiteUpdateConfigurationParameters.HandlerMapping> handlerMappingsValue) {
        this.handlerMappings = handlerMappingsValue;
    }
    
    private Boolean httpLoggingEnabled;
    
    /**
    * Optional. Indicates if HTTP error logging is enabled.
    * @return The HttpLoggingEnabled value.
    */
    public Boolean isHttpLoggingEnabled() {
        return this.httpLoggingEnabled;
    }
    
    /**
    * Optional. Indicates if HTTP error logging is enabled.
    * @param httpLoggingEnabledValue The HttpLoggingEnabled value.
    */
    public void setHttpLoggingEnabled(final Boolean httpLoggingEnabledValue) {
        this.httpLoggingEnabled = httpLoggingEnabledValue;
    }
    
    private String javaContainer;
    
    /**
    * Optional. The web site Java Container. Supported values are TOMCAT, JETTY
    * @return The JavaContainer value.
    */
    public String getJavaContainer() {
        return this.javaContainer;
    }
    
    /**
    * Optional. The web site Java Container. Supported values are TOMCAT, JETTY
    * @param javaContainerValue The JavaContainer value.
    */
    public void setJavaContainer(final String javaContainerValue) {
        this.javaContainer = javaContainerValue;
    }
    
    private String javaContainerVersion;
    
    /**
    * Optional. The web site Java Container Version. Supported values are
    * 7.0.50 if Java Container is TOMCAT and 9.1.0.20131115 if Java Container
    * is JETTY
    * @return The JavaContainerVersion value.
    */
    public String getJavaContainerVersion() {
        return this.javaContainerVersion;
    }
    
    /**
    * Optional. The web site Java Container Version. Supported values are
    * 7.0.50 if Java Container is TOMCAT and 9.1.0.20131115 if Java Container
    * is JETTY
    * @param javaContainerVersionValue The JavaContainerVersion value.
    */
    public void setJavaContainerVersion(final String javaContainerVersionValue) {
        this.javaContainerVersion = javaContainerVersionValue;
    }
    
    private String javaVersion;
    
    /**
    * Optional. The web site JDK version. Supported values are an empty string
    * (an empty string disables Java), 1.7.0_51
    * @return The JavaVersion value.
    */
    public String getJavaVersion() {
        return this.javaVersion;
    }
    
    /**
    * Optional. The web site JDK version. Supported values are an empty string
    * (an empty string disables Java), 1.7.0_51
    * @param javaVersionValue The JavaVersion value.
    */
    public void setJavaVersion(final String javaVersionValue) {
        this.javaVersion = javaVersionValue;
    }
    
    private WebSiteUpdateConfigurationParameters.SiteLimits limits;
    
    /**
    * Optional. The per site limits.
    * @return The Limits value.
    */
    public WebSiteUpdateConfigurationParameters.SiteLimits getLimits() {
        return this.limits;
    }
    
    /**
    * Optional. The per site limits.
    * @param limitsValue The Limits value.
    */
    public void setLimits(final WebSiteUpdateConfigurationParameters.SiteLimits limitsValue) {
        this.limits = limitsValue;
    }
    
    private Integer logsDirectorySizeLimit;
    
    /**
    * Optional. The size limit of the logs directory.
    * @return The LogsDirectorySizeLimit value.
    */
    public Integer getLogsDirectorySizeLimit() {
        return this.logsDirectorySizeLimit;
    }
    
    /**
    * Optional. The size limit of the logs directory.
    * @param logsDirectorySizeLimitValue The LogsDirectorySizeLimit value.
    */
    public void setLogsDirectorySizeLimit(final Integer logsDirectorySizeLimitValue) {
        this.logsDirectorySizeLimit = logsDirectorySizeLimitValue;
    }
    
    private ManagedPipelineMode managedPipelineMode;
    
    /**
    * Optional. The managed pipeline mode.
    * @return The ManagedPipelineMode value.
    */
    public ManagedPipelineMode getManagedPipelineMode() {
        return this.managedPipelineMode;
    }
    
    /**
    * Optional. The managed pipeline mode.
    * @param managedPipelineModeValue The ManagedPipelineMode value.
    */
    public void setManagedPipelineMode(final ManagedPipelineMode managedPipelineModeValue) {
        this.managedPipelineMode = managedPipelineModeValue;
    }
    
    private HashMap<String, String> metadata;
    
    /**
    * Optional. Name/value pairs for source control or other information.
    * @return The Metadata value.
    */
    public HashMap<String, String> getMetadata() {
        return this.metadata;
    }
    
    /**
    * Optional. Name/value pairs for source control or other information.
    * @param metadataValue The Metadata value.
    */
    public void setMetadata(final HashMap<String, String> metadataValue) {
        this.metadata = metadataValue;
    }
    
    private String netFrameworkVersion;
    
    /**
    * Optional. The .NET Framework version. Supported values are v2.0 and v4.0.
    * @return The NetFrameworkVersion value.
    */
    public String getNetFrameworkVersion() {
        return this.netFrameworkVersion;
    }
    
    /**
    * Optional. The .NET Framework version. Supported values are v2.0 and v4.0.
    * @param netFrameworkVersionValue The NetFrameworkVersion value.
    */
    public void setNetFrameworkVersion(final String netFrameworkVersionValue) {
        this.netFrameworkVersion = netFrameworkVersionValue;
    }
    
    private Integer numberOfWorkers;
    
    /**
    * Optional. The number of web workers allotted to the web site. If the web
    * site mode is Free, this value is 1. If the web site mode is Shared, this
    * value can range from 1 through 6. If the web site mode is Standard, this
    * value can range from 1 through 10.
    * @return The NumberOfWorkers value.
    */
    public Integer getNumberOfWorkers() {
        return this.numberOfWorkers;
    }
    
    /**
    * Optional. The number of web workers allotted to the web site. If the web
    * site mode is Free, this value is 1. If the web site mode is Shared, this
    * value can range from 1 through 6. If the web site mode is Standard, this
    * value can range from 1 through 10.
    * @param numberOfWorkersValue The NumberOfWorkers value.
    */
    public void setNumberOfWorkers(final Integer numberOfWorkersValue) {
        this.numberOfWorkers = numberOfWorkersValue;
    }
    
    private String phpVersion;
    
    /**
    * Optional. The web site PHP version. Supported values are an empty string
    * (an empty string disables PHP), 5.3, and 5.4.
    * @return The PhpVersion value.
    */
    public String getPhpVersion() {
        return this.phpVersion;
    }
    
    /**
    * Optional. The web site PHP version. Supported values are an empty string
    * (an empty string disables PHP), 5.3, and 5.4.
    * @param phpVersionValue The PhpVersion value.
    */
    public void setPhpVersion(final String phpVersionValue) {
        this.phpVersion = phpVersionValue;
    }
    
    private Boolean remoteDebuggingEnabled;
    
    /**
    * Optional. Indicates if remote debugging is enabled.
    * @return The RemoteDebuggingEnabled value.
    */
    public Boolean isRemoteDebuggingEnabled() {
        return this.remoteDebuggingEnabled;
    }
    
    /**
    * Optional. Indicates if remote debugging is enabled.
    * @param remoteDebuggingEnabledValue The RemoteDebuggingEnabled value.
    */
    public void setRemoteDebuggingEnabled(final Boolean remoteDebuggingEnabledValue) {
        this.remoteDebuggingEnabled = remoteDebuggingEnabledValue;
    }
    
    private RemoteDebuggingVersion remoteDebuggingVersion;
    
    /**
    * Optional. The remote debugging version.
    * @return The RemoteDebuggingVersion value.
    */
    public RemoteDebuggingVersion getRemoteDebuggingVersion() {
        return this.remoteDebuggingVersion;
    }
    
    /**
    * Optional. The remote debugging version.
    * @param remoteDebuggingVersionValue The RemoteDebuggingVersion value.
    */
    public void setRemoteDebuggingVersion(final RemoteDebuggingVersion remoteDebuggingVersionValue) {
        this.remoteDebuggingVersion = remoteDebuggingVersionValue;
    }
    
    private Boolean requestTracingEnabled;
    
    /**
    * Optional. Indicates if request tracing is enabled.
    * @return The RequestTracingEnabled value.
    */
    public Boolean isRequestTracingEnabled() {
        return this.requestTracingEnabled;
    }
    
    /**
    * Optional. Indicates if request tracing is enabled.
    * @param requestTracingEnabledValue The RequestTracingEnabled value.
    */
    public void setRequestTracingEnabled(final Boolean requestTracingEnabledValue) {
        this.requestTracingEnabled = requestTracingEnabledValue;
    }
    
    private Calendar requestTracingExpirationTime;
    
    /**
    * Optional. Time remaining until request tracing expires.
    * @return The RequestTracingExpirationTime value.
    */
    public Calendar getRequestTracingExpirationTime() {
        return this.requestTracingExpirationTime;
    }
    
    /**
    * Optional. Time remaining until request tracing expires.
    * @param requestTracingExpirationTimeValue The RequestTracingExpirationTime
    * value.
    */
    public void setRequestTracingExpirationTime(final Calendar requestTracingExpirationTimeValue) {
        this.requestTracingExpirationTime = requestTracingExpirationTimeValue;
    }
    
    private ArrayList<RoutingRule> routingRules;
    
    /**
    * Optional. List of routing rules for the website.
    * @return The RoutingRules value.
    */
    public ArrayList<RoutingRule> getRoutingRules() {
        return this.routingRules;
    }
    
    /**
    * Optional. List of routing rules for the website.
    * @param routingRulesValue The RoutingRules value.
    */
    public void setRoutingRules(final ArrayList<RoutingRule> routingRulesValue) {
        this.routingRules = routingRulesValue;
    }
    
    private String scmType;
    
    /**
    * Optional. The source control method that the web site is using (for
    * example, Local Git). If deployment from source control has not been set
    * up for the web site, this value is None.
    * @return The ScmType value.
    */
    public String getScmType() {
        return this.scmType;
    }
    
    /**
    * Optional. The source control method that the web site is using (for
    * example, Local Git). If deployment from source control has not been set
    * up for the web site, this value is None.
    * @param scmTypeValue The ScmType value.
    */
    public void setScmType(final String scmTypeValue) {
        this.scmType = scmTypeValue;
    }
    
    private Boolean siteAuthEnabled;
    
    /**
    * Optional. Gets or sets a value indicating whether the site's
    * Authentication / Authorization feature is enabled.
    * @return The SiteAuthEnabled value.
    */
    public Boolean isSiteAuthEnabled() {
        return this.siteAuthEnabled;
    }
    
    /**
    * Optional. Gets or sets a value indicating whether the site's
    * Authentication / Authorization feature is enabled.
    * @param siteAuthEnabledValue The SiteAuthEnabled value.
    */
    public void setSiteAuthEnabled(final Boolean siteAuthEnabledValue) {
        this.siteAuthEnabled = siteAuthEnabledValue;
    }
    
    private SiteAuthSettings siteAuthSettings;
    
    /**
    * Optional. Gets or sets the Authentication / Authorization settings of a
    * web site.
    * @return The SiteAuthSettings value.
    */
    public SiteAuthSettings getSiteAuthSettings() {
        return this.siteAuthSettings;
    }
    
    /**
    * Optional. Gets or sets the Authentication / Authorization settings of a
    * web site.
    * @param siteAuthSettingsValue The SiteAuthSettings value.
    */
    public void setSiteAuthSettings(final SiteAuthSettings siteAuthSettingsValue) {
        this.siteAuthSettings = siteAuthSettingsValue;
    }
    
    private Boolean use32BitWorkerProcess;
    
    /**
    * Optional. Indicates if 32-bit mode is enabled.
    * @return The Use32BitWorkerProcess value.
    */
    public Boolean isUse32BitWorkerProcess() {
        return this.use32BitWorkerProcess;
    }
    
    /**
    * Optional. Indicates if 32-bit mode is enabled.
    * @param use32BitWorkerProcessValue The Use32BitWorkerProcess value.
    */
    public void setUse32BitWorkerProcess(final Boolean use32BitWorkerProcessValue) {
        this.use32BitWorkerProcess = use32BitWorkerProcessValue;
    }
    
    private Boolean webSocketsEnabled;
    
    /**
    * Optional. Indicates if Web Sockets are enabled.
    * @return The WebSocketsEnabled value.
    */
    public Boolean isWebSocketsEnabled() {
        return this.webSocketsEnabled;
    }
    
    /**
    * Optional. Indicates if Web Sockets are enabled.
    * @param webSocketsEnabledValue The WebSocketsEnabled value.
    */
    public void setWebSocketsEnabled(final Boolean webSocketsEnabledValue) {
        this.webSocketsEnabled = webSocketsEnabledValue;
    }

    private List<VirtualApplication> virtualApplications;

    public List<VirtualApplication> getVirtualApplications() {
        return virtualApplications;
    }

    public void setVirtualApplications(List<VirtualApplication> virtualApplications) {
        this.virtualApplications = virtualApplications;
    }

    /**
    * Initializes a new instance of the WebSiteUpdateConfigurationParameters
    * class.
    *
    */
    public WebSiteUpdateConfigurationParameters() {
        this.setAppSettings(new LazyHashMap<String, String>());
        this.setConnectionStrings(new LazyArrayList<WebSiteUpdateConfigurationParameters.ConnectionStringInfo>());
        this.setDefaultDocuments(new LazyArrayList<String>());
        this.setHandlerMappings(new LazyArrayList<WebSiteUpdateConfigurationParameters.HandlerMapping>());
        this.setMetadata(new LazyHashMap<String, String>());
        this.setRoutingRules(new LazyArrayList<RoutingRule>());
    }
    
    /**
    * Connection string for database and other external resources.
    */
    public static class ConnectionStringInfo {
        private String connectionString;
        
        /**
        * Optional. The database connection string.
        * @return The ConnectionString value.
        */
        public String getConnectionString() {
            return this.connectionString;
        }
        
        /**
        * Optional. The database connection string.
        * @param connectionStringValue The ConnectionString value.
        */
        public void setConnectionString(final String connectionStringValue) {
            this.connectionString = connectionStringValue;
        }
        
        private String name;
        
        /**
        * Optional. The name of the connection string.
        * @return The Name value.
        */
        public String getName() {
            return this.name;
        }
        
        /**
        * Optional. The name of the connection string.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }
        
        private ConnectionStringType type;
        
        /**
        * Optional. The type of the connection string (for example, "MySQL").
        * @return The Type value.
        */
        public ConnectionStringType getType() {
            return this.type;
        }
        
        /**
        * Optional. The type of the connection string (for example, "MySQL").
        * @param typeValue The Type value.
        */
        public void setType(final ConnectionStringType typeValue) {
            this.type = typeValue;
        }
    }
    
    /**
    * Specifies a custom executable program for handling requests for specific
    * file name extensions.
    */
    public static class HandlerMapping {
        private String arguments;
        
        /**
        * Optional. A string that contains optional arguments for the script
        * processor specified by the
        * SiteConfig.HandlerMappings.HandlerMapping.ScriptProcessor element.
        * @return The Arguments value.
        */
        public String getArguments() {
            return this.arguments;
        }
        
        /**
        * Optional. A string that contains optional arguments for the script
        * processor specified by the
        * SiteConfig.HandlerMappings.HandlerMapping.ScriptProcessor element.
        * @param argumentsValue The Arguments value.
        */
        public void setArguments(final String argumentsValue) {
            this.arguments = argumentsValue;
        }
        
        private String extension;
        
        /**
        * Optional. A string that specifies the extension of the file type that
        * the script processor will handle (for example, *.php).
        * @return The Extension value.
        */
        public String getExtension() {
            return this.extension;
        }
        
        /**
        * Optional. A string that specifies the extension of the file type that
        * the script processor will handle (for example, *.php).
        * @param extensionValue The Extension value.
        */
        public void setExtension(final String extensionValue) {
            this.extension = extensionValue;
        }
        
        private String scriptProcessor;
        
        /**
        * Optional. The absolute path to the location of the executable file
        * that will handle the files specified in the
        * SiteConfig.HandlerMappings.HandlerMapping.Extension element.
        * @return The ScriptProcessor value.
        */
        public String getScriptProcessor() {
            return this.scriptProcessor;
        }
        
        /**
        * Optional. The absolute path to the location of the executable file
        * that will handle the files specified in the
        * SiteConfig.HandlerMappings.HandlerMapping.Extension element.
        * @param scriptProcessorValue The ScriptProcessor value.
        */
        public void setScriptProcessor(final String scriptProcessorValue) {
            this.scriptProcessor = scriptProcessorValue;
        }
    }
    
    /**
    * Per site limits
    */
    public static class SiteLimits {
        private Long maxDiskSizeInMb;
        
        /**
        * Optional. Maximum disk size allowed in MB
        * @return The MaxDiskSizeInMb value.
        */
        public Long getMaxDiskSizeInMb() {
            return this.maxDiskSizeInMb;
        }
        
        /**
        * Optional. Maximum disk size allowed in MB
        * @param maxDiskSizeInMbValue The MaxDiskSizeInMb value.
        */
        public void setMaxDiskSizeInMb(final Long maxDiskSizeInMbValue) {
            this.maxDiskSizeInMb = maxDiskSizeInMbValue;
        }
        
        private Long maxMemoryInMb;
        
        /**
        * Optional. Maximum memory allowed in MB
        * @return The MaxMemoryInMb value.
        */
        public Long getMaxMemoryInMb() {
            return this.maxMemoryInMb;
        }
        
        /**
        * Optional. Maximum memory allowed in MB
        * @param maxMemoryInMbValue The MaxMemoryInMb value.
        */
        public void setMaxMemoryInMb(final Long maxMemoryInMbValue) {
            this.maxMemoryInMb = maxMemoryInMbValue;
        }
        
        private Double maxPercentageCpu;
        
        /**
        * Optional. The name of the pair.
        * @return The MaxPercentageCpu value.
        */
        public Double getMaxPercentageCpu() {
            return this.maxPercentageCpu;
        }
        
        /**
        * Optional. The name of the pair.
        * @param maxPercentageCpuValue The MaxPercentageCpu value.
        */
        public void setMaxPercentageCpu(final Double maxPercentageCpuValue) {
            this.maxPercentageCpu = maxPercentageCpuValue;
        }
    }

    public static class VirtualApplication {
        private String virtualPath;
        private String virtualDirectory;
        private String physicalPath;
        private boolean preloadEnabled;

        public String getVirtualPath() {
            return virtualPath;
        }

        public void setVirtualPath(String virtualPath) {
            this.virtualPath = virtualPath;
        }

        public String getVirtualDirectory() {
            return virtualDirectory;
        }

        public void setVirtualDirectory(String virtualDirectory) {
            this.virtualDirectory = virtualDirectory;
        }

        public String getPhysicalPath() {
            return physicalPath;
        }

        public void setPhysicalPath(String physicalPath) {
            this.physicalPath = physicalPath;
        }

        public boolean isPreloadEnabled() {
            return preloadEnabled;
        }

        public void setPreloadEnabled(boolean preloadEnabled) {
            this.preloadEnabled = preloadEnabled;
        }
    }
}
