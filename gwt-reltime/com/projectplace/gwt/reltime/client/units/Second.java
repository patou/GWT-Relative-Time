/*
 * RelativeTime is an OpenSource GWT time comparison library for creating human
 * readable time. It's straight port of Lincoln Baxter's PrettyTime library.
 * 
 * Copyright (C) 2009 - Lincoln Baxter, III <lincoln@ocpsoft.com>
 * Copyright (C) 2010 - PEZ <pez@pezius.com>
 * 
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see the file COPYING.LESSER3 or visit the
 * GNU website at <http://www.gnu.org/licenses/>.
 */
package com.projectplace.gwt.reltime.client.units;

import com.projectplace.gwt.reltime.client.AbstractTimeUnit;
import com.projectplace.gwt.reltime.client.TimeFormat;
import com.projectplace.gwt.reltime.client.TimeUnit;

public class Second extends AbstractTimeUnit implements TimeUnit {

	public Second(String locale) {
		super(locale);
		millisPerUnit = 1000L;
	}

	protected String getResourceKeyPrefix() {
		return "Second";
	}

	public long getMillisPerUnit() {
		return millisPerUnit;
	}

	public TimeFormat getFormat() {
		return format;
	}

	public void setFormat(final TimeFormat format) {
		this.format = format;
	}

	public long getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(final long maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getPluralName() {
		return pluralName;
	}

	public void setPluralName(final String pluralName) {
		this.pluralName = pluralName;
	}

    @Override
    public String getTimeStamp(String prefix, long quantity, String suffix) {
        return timeMessages.seconds(prefix, (int) quantity, suffix);
    }
}