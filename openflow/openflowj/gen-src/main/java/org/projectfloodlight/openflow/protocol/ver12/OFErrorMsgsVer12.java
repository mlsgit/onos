// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_factory_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver12;

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


public class OFErrorMsgsVer12 implements OFErrorMsgs {
    public final static OFErrorMsgsVer12 INSTANCE = new OFErrorMsgsVer12();

    private final XidGenerator xidGenerator = XidGenerators.global();



    public OFBadActionErrorMsg.Builder buildBadActionErrorMsg() {
        return new OFBadActionErrorMsgVer12.Builder().setXid(nextXid());
    }

    public OFBadRequestErrorMsg.Builder buildBadRequestErrorMsg() {
        return new OFBadRequestErrorMsgVer12.Builder().setXid(nextXid());
    }

    public OFFlowModFailedErrorMsg.Builder buildFlowModFailedErrorMsg() {
        return new OFFlowModFailedErrorMsgVer12.Builder().setXid(nextXid());
    }

    public OFHelloFailedErrorMsg.Builder buildHelloFailedErrorMsg() {
        return new OFHelloFailedErrorMsgVer12.Builder().setXid(nextXid());
    }

    public OFPortModFailedErrorMsg.Builder buildPortModFailedErrorMsg() {
        return new OFPortModFailedErrorMsgVer12.Builder().setXid(nextXid());
    }

    public OFQueueOpFailedErrorMsg.Builder buildQueueOpFailedErrorMsg() {
        return new OFQueueOpFailedErrorMsgVer12.Builder().setXid(nextXid());
    }

    public OFBadInstructionErrorMsg.Builder buildBadInstructionErrorMsg() {
        return new OFBadInstructionErrorMsgVer12.Builder().setXid(nextXid());
    }

    public OFBadMatchErrorMsg.Builder buildBadMatchErrorMsg() {
        return new OFBadMatchErrorMsgVer12.Builder().setXid(nextXid());
    }

    public OFGroupModFailedErrorMsg.Builder buildGroupModFailedErrorMsg() {
        return new OFGroupModFailedErrorMsgVer12.Builder().setXid(nextXid());
    }

    public OFSwitchConfigFailedErrorMsg.Builder buildSwitchConfigFailedErrorMsg() {
        return new OFSwitchConfigFailedErrorMsgVer12.Builder().setXid(nextXid());
    }

    public OFTableModFailedErrorMsg.Builder buildTableModFailedErrorMsg() {
        return new OFTableModFailedErrorMsgVer12.Builder().setXid(nextXid());
    }

    public OFExperimenterErrorMsg.Builder buildExperimenterErrorMsg() {
        return new OFExperimenterErrorMsgVer12.Builder().setXid(nextXid());
    }

    public OFRoleRequestFailedErrorMsg.Builder buildRoleRequestFailedErrorMsg() {
        return new OFRoleRequestFailedErrorMsgVer12.Builder().setXid(nextXid());
    }

    public OFMeterModFailedErrorMsg.Builder buildMeterModFailedErrorMsg() {
        throw new UnsupportedOperationException("OFMeterModFailedErrorMsg not supported in version 1.2");
    }

    public OFTableFeaturesFailedErrorMsg.Builder buildTableFeaturesFailedErrorMsg() {
        throw new UnsupportedOperationException("OFTableFeaturesFailedErrorMsg not supported in version 1.2");
    }

    public OFMessageReader<OFErrorMsg> getReader() {
        return OFErrorMsgVer12.READER;
    }

    public long nextXid() {
        return xidGenerator.nextXid();
    }

    public OFVersion getVersion() {
            return OFVersion.OF_12;
    }
}
