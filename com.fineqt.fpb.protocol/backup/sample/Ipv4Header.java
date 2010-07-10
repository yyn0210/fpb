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

import com.fineqt.fpb.lib.api.IBitstringValue;
import com.fineqt.fpb.lib.api.IIntegerValue;
import com.fineqt.fpb.lib.api.IListValue;
import com.fineqt.fpb.lib.api.IOctetstringValue;
import com.fineqt.fpb.lib.api.IRecordSetValue;

public interface Ipv4Header extends IRecordSetValue {
	IIntegerValue getVersion();
	IIntegerValue getHeaderLength();
	IBitstringValue getTypeOfService();
	IIntegerValue getTotalLength();
	IIntegerValue getIdentification();
	IIntegerValue getReserved();
	IIntegerValue getDoNotFlagFlag();
	IIntegerValue getMoreFlagsFlag();
	IIntegerValue getFragmentOffset();
	IIntegerValue getTimeToLive();
	IIntegerValue getProtocol();
	IOctetstringValue getHcs();
	IOctetstringValue getSourceAddress();
	IOctetstringValue getDestinationAddress();
	IListValue<Ipv4OptionItem> getOptions();
}
