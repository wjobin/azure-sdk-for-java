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

package com.microsoft.azure.management.dns.models;

/**
* An A record.
*/
public class ARecord {
    private String ipv4Address;
    
    /**
    * Required. Gets or sets the IPv4 address of this A record in string
    * notation.
    * @return The Ipv4Address value.
    */
    public String getIpv4Address() {
        return this.ipv4Address;
    }
    
    /**
    * Required. Gets or sets the IPv4 address of this A record in string
    * notation.
    * @param ipv4AddressValue The Ipv4Address value.
    */
    public void setIpv4Address(final String ipv4AddressValue) {
        this.ipv4Address = ipv4AddressValue;
    }
    
    /**
    * Initializes a new instance of the ARecord class.
    *
    */
    public ARecord() {
    }
    
    /**
    * Initializes a new instance of the ARecord class with required arguments.
    *
    * @param ipv4Address Gets or sets the IPv4 address of this A record in
    * string notation.
    */
    public ARecord(String ipv4Address) {
        if (ipv4Address == null) {
            throw new NullPointerException("ipv4Address");
        }
        this.setIpv4Address(ipv4Address);
    }
}
