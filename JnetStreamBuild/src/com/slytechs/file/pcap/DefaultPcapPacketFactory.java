/**
 * Copyright (C) 2008 Sly Technologies, Inc. This library is free software; you
 * can redistribute it and/or modify it under the terms of the GNU Lesser
 * General Public License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version. This
 * library is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details. You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */
package com.slytechs.file.pcap;

import java.io.IOException;

import org.jnetstream.capture.file.pcap.PcapPacket;
import org.jnetstream.protocol.ProtocolEntry;

import com.slytechs.capture.file.AbstractFilePacketFactory;
import com.slytechs.capture.file.editor.EditorHandle;
import com.slytechs.capture.file.editor.FileEditor;

/**
 * @author Mark Bednarczyk
 * @author Sly Technologies, Inc.
 */
public class DefaultPcapPacketFactory
    extends AbstractFilePacketFactory<PcapPacket> implements
    PcapPacketFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.slytechs.file.snoop.SnoopPacketFactory#newPacket(com.slytechs.capture.file.editor.FileEditor,
	 *      com.slytechs.capture.file.editor.EditorHandle,
	 *      org.jnetstream.protocol.ProtocolEntry)
	 */
	public PcapPacket newPacket(FileEditor editor, EditorHandle handle,
	    ProtocolEntry dlt) throws IOException {
		
		return new PcapPacketImpl(editor, handle, dlt);
	}
}