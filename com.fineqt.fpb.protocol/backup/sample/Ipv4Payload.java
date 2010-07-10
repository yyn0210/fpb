/****************************************************************
Fine Packet Builder, copyright (C) 2007-2009 fineqt.com

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful, 
but WITHOUT ANY WARRANTY; without even the implied warranty of 
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the 
GNU General Public License for more details at gnu.org.
******************************************************************/
package com.fineqt.fpb.protocol.sample;

import com.fineqt.fpb.lib.api.IOctetstringValue;
import com.fineqt.fpb.lib.api.IUnionValue;

public interface Ipv4Payload extends IUnionValue {
	Icmpv4Protocol getIcmpv4();
	Ipv4Protocol getIpv4();
	IOctetstringValue getData();
}
