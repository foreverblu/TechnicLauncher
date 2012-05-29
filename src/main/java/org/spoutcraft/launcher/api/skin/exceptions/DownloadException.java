/*
 * This file is part of LauncherAPI.
 *
 * Copyright (c) 2011-2012, SpoutDev <http://www.spout.org/>
 * LauncherAPI is licensed under the SpoutDev License Version 1.
 *
 * LauncherAPI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the SpoutDev License Version 1.
 *
 * LauncherAPI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the SpoutDev License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://www.spout.org/SpoutDevLicenseV1.txt> for the full license,
 * including the MIT license.
 */
package org.spoutcraft.launcher.api.skin.exceptions;

import java.io.IOException;

public class DownloadException extends IOException {
	private final Throwable cause;
	private final String message;

	public DownloadException(String message, Throwable cause) {
		this.cause = cause;
		this.message = message;
	}

	public DownloadException(Throwable cause) {
		this(null, cause);
	}

	public DownloadException(String message) {
		this(message, null);
	}

	public DownloadException() {
		this(null, null);
	}

	public Throwable getCause() {
		return this.cause;
	}

	public String getMessage() {
		return message;
	}

	private static final long serialVersionUID = 1L;
}