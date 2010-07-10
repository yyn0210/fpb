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
package com.fineqt.fpb.lib.builtin;

import com.fineqt.fpb.lib.api.value.IHexstringValue;


public interface PHexstringValue extends PStringValue, IHexstringValue {
	String DOUBLE_QUOTATION_RIGHT_MARK = DOUBLE_QUOTATION_MARK + "H";
	String SINGLE_QUOTATION_RIGHT_MARK = SINGLE_QUOTATION_MARK + "H";
}
