// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_serializer.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver10;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.actionid.*;
import org.projectfloodlight.openflow.protocol.bsntlv.*;
import org.projectfloodlight.openflow.protocol.errormsg.*;
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.instructionid.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import org.projectfloodlight.openflow.protocol.OFFlowModCommand;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;

public class OFFlowModCommandSerializerVer10 {

    public final static short ADD_VAL = (short) 0x0;
    public final static short MODIFY_VAL = (short) 0x1;
    public final static short MODIFY_STRICT_VAL = (short) 0x2;
    public final static short DELETE_VAL = (short) 0x3;
    public final static short DELETE_STRICT_VAL = (short) 0x4;

    public static OFFlowModCommand readFrom(ChannelBuffer bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ChannelBuffer bb, OFFlowModCommand e) {
        bb.writeShort(toWireValue(e));
    }

    public static void putTo(OFFlowModCommand e, PrimitiveSink sink) {
        sink.putShort(toWireValue(e));
    }

    public static OFFlowModCommand ofWireValue(short val) {
        switch(val) {
            case ADD_VAL:
                return OFFlowModCommand.ADD;
            case MODIFY_VAL:
                return OFFlowModCommand.MODIFY;
            case MODIFY_STRICT_VAL:
                return OFFlowModCommand.MODIFY_STRICT;
            case DELETE_VAL:
                return OFFlowModCommand.DELETE;
            case DELETE_STRICT_VAL:
                return OFFlowModCommand.DELETE_STRICT;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFFlowModCommand in version 1.0: " + val);
        }
    }


    public static short toWireValue(OFFlowModCommand e) {
        switch(e) {
            case ADD:
                return ADD_VAL;
            case MODIFY:
                return MODIFY_VAL;
            case MODIFY_STRICT:
                return MODIFY_STRICT_VAL;
            case DELETE:
                return DELETE_VAL;
            case DELETE_STRICT:
                return DELETE_STRICT_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFFlowModCommand in version 1.0: " + e);
        }
    }

}
