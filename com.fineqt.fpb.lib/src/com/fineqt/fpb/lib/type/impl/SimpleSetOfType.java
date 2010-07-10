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
package com.fineqt.fpb.lib.type.impl;

import com.fineqt.fpb.lib.meta.PModuleExt;
import com.fineqt.fpb.lib.model.fpbmodule.PFpbTypeEV;
import com.fineqt.fpb.lib.model.fpbmodule.PSetOf;
import com.fineqt.fpb.lib.model.fpbmodule.PType;

public class SimpleSetOfType extends PSetOfTypeExtBase {

	public SimpleSetOfType(PType pmodel, PModuleExt pmoduleExt) {
		super((PSetOf)pmodel, pmoduleExt);
	}

	public static class PTypeEVExt4Fpb extends PFpbSetOfEVExt {

		public PTypeEVExt4Fpb(PFpbTypeEV model) {
			super(model);
		}
		
	}
	
}
