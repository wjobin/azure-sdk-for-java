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

package com.microsoft.azure.management.network.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import java.util.ArrayList;

/**
* Dns Settings of a resource
*/
public class DnsSettings {
    private ArrayList<String> appliedDnsServers;
    
    /**
    * Optional. Gets or sets list of Applied DNS servers IP addresses
    * @return The AppliedDnsServers value.
    */
    public ArrayList<String> getAppliedDnsServers() {
        return this.appliedDnsServers;
    }
    
    /**
    * Optional. Gets or sets list of Applied DNS servers IP addresses
    * @param appliedDnsServersValue The AppliedDnsServers value.
    */
    public void setAppliedDnsServers(final ArrayList<String> appliedDnsServersValue) {
        this.appliedDnsServers = appliedDnsServersValue;
    }
    
    private ArrayList<String> dnsServers;
    
    /**
    * Optional. Gets or sets list of DNS servers IP addresses
    * @return The DnsServers value.
    */
    public ArrayList<String> getDnsServers() {
        return this.dnsServers;
    }
    
    /**
    * Optional. Gets or sets list of DNS servers IP addresses
    * @param dnsServersValue The DnsServers value.
    */
    public void setDnsServers(final ArrayList<String> dnsServersValue) {
        this.dnsServers = dnsServersValue;
    }
    
    /**
    * Initializes a new instance of the DnsSettings class.
    *
    */
    public DnsSettings() {
        this.setAppliedDnsServers(new LazyArrayList<String>());
        this.setDnsServers(new LazyArrayList<String>());
    }
}