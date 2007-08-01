// PathVisio,
// a tool for data visualization and analysis using Biological Pathways
// Copyright 2006-2007 BiGCaT Bioinformatics
//
// Licensed under the Apache License, Version 2.0 (the "License"); 
// you may not use this file except in compliance with the License. 
// You may obtain a copy of the License at 
// 
// http://www.apache.org/licenses/LICENSE-2.0 
//  
// Unless required by applicable law or agreed to in writing, software 
// distributed under the License is distributed on an "AS IS" BASIS, 
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
// See the License for the specific language governing permissions and 
// limitations under the License.
//
package org.pathvisio.wikipathways;

import java.io.File;

import org.pathvisio.Globals;
import org.pathvisio.model.PropertyType;
import org.pathvisio.preferences.GlobalPreference;

public class WikiPathwaysEngine {
	public static void init() throws Exception {
		GlobalPreference.FILE_LOG.setDefault(new File(getApplicationDir(), ".wikipathwaysLog").toString());
		
		PropertyType.CENTERX.setHidden(true);
		PropertyType.CENTERY.setHidden(true);
		PropertyType.ENDX.setHidden(true);
		PropertyType.ENDY.setHidden(true);
		PropertyType.HEIGHT.setHidden(true);
		PropertyType.LAST_MODIFIED.setHidden(true);
		PropertyType.ORGANISM.setHidden(true);
		PropertyType.ROTATION.setHidden(true);
		PropertyType.STARTX.setHidden(true);
		PropertyType.STARTY.setHidden(true);
		PropertyType.WIDTH.setHidden(true);
	}
		
	private static File DIR_APPLICATION;
	/**
	 * Get the working directory of this application
	 */
	public static File getApplicationDir() {
		if(DIR_APPLICATION == null) {
			DIR_APPLICATION = new File(System.getProperty("user.home"), "." + Globals.APPLICATION_NAME);
			if(!DIR_APPLICATION.exists()) DIR_APPLICATION.mkdir();
		}
		return DIR_APPLICATION;
	}
}
