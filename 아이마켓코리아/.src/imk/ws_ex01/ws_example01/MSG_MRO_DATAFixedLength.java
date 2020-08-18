/*
 * 작성된 날짜: Aug 18, 2020
 * Copyright (c) 2020 TmaxSoft co., Ltd. All rights reserved.
 */
package imk.ws_ex01.ws_example01;

import com.tmax.promapper.engine.base.ProMapperDataObject;
import proframe.dto.DataObject;
import java.util.logging.Level;
import com.tmax.anylink.logging.Logger;
import com.tmax.promapper.engine.base.MessageFieldProperty;
import com.tmax.promapper.engine.base.MessageFieldType;
import com.tmax.promapper.engine.base.ResourceMeta;
import com.tmax.promapper.engine.base.Message;
import com.tmax.promapper.engine.util.Constants;
import com.tmax.promapper.engine.util.FixedLengthMarshalField;
import com.tmax.promapper.engine.util.FixedLengthMarshalFieldV2;
import com.tmax.promapper.engine.util.FixedLengthUnmarshalField;

import com.tmax.promapper.engine.base.FixedLengthMessage;

/**
 * @file              imk.ws_ex01.ws_example01.MSG_MRO_DATAFixedLength.java
 * @filetype          java source file
 * @brief            
 * @version           1.0
 * @template-version  2014-11-12
 * @history
 * 성 명              일 자                     근 거 자 료                      변 경 내 용
 * -----------        --------                  --------------                   --------------------------    
 * AnyLink :       Aug 18, 2020                AnyLink 개발 :                신규 작성
 * 
 */



public class MSG_MRO_DATAFixedLength extends com.tmax.promapper.engine.base.FixedLengthMessage implements ResourceMeta {
    private static java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FixedLengthMessage.class.getName());

    public MSG_MRO_DATAFixedLength() {
        super();
    }

    public MSG_MRO_DATAFixedLength(int conversionType) {
        super(conversionType);
    }

    public MSG_MRO_DATAFixedLength(String charsetName) {
        super(charsetName);
    }
    
    public void setMasked(boolean _masked) {
        super.setMasked(_masked);
    }

    /* marshal method */
    public byte [] marshalObject(Object obj) throws Exception {
        FixedLengthMarshalFieldV2 flFld = new FixedLengthMarshalFieldV2();
        imk.ws_ex01.ws_example01.MSG_MRO_DATA __root = (imk.ws_ex01.ws_example01.MSG_MRO_DATA)obj;

        if(__root == null) {
            marshallNullObject(flFld);
        } else {
            
            /** CRTDT */
            if(logger.isLoggable(java.util.logging.Level.FINEST)) { 
                 logger.finest("FieldName = CRTDT,  StartOffset = " + flFld.getTotalLength() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, EOD = false");
            }
            flFld.setStringField(this, __root.getCRTDT(this.masked), 10, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
            
            /** RCVYN */
            if(logger.isLoggable(java.util.logging.Level.FINEST)) { 
                 logger.finest("FieldName = RCVYN,  StartOffset = " + flFld.getTotalLength() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, EOD = false");
            }
            flFld.setStringField(this, __root.getRCVYN(this.masked), 10, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
            
            /** BLCK_YN */
            if(logger.isLoggable(java.util.logging.Level.FINEST)) { 
                 logger.finest("FieldName = BLCK_YN,  StartOffset = " + flFld.getTotalLength() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, EOD = false");
            }
            flFld.setStringField(this, __root.getBLCK_YN(this.masked), 10, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
            
            /** VALI_TO_YMD */
            if(logger.isLoggable(java.util.logging.Level.FINEST)) { 
                 logger.finest("FieldName = VALI_TO_YMD,  StartOffset = " + flFld.getTotalLength() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, EOD = false");
            }
            flFld.setStringField(this, __root.getVALI_TO_YMD(this.masked), 10, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
            
            /** VALI_FR_YMD */
            if(logger.isLoggable(java.util.logging.Level.FINEST)) { 
                 logger.finest("FieldName = VALI_FR_YMD,  StartOffset = " + flFld.getTotalLength() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, EOD = false");
            }
            flFld.setStringField(this, __root.getVALI_FR_YMD(this.masked), 10, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
            
            /** BP_NM */
            if(logger.isLoggable(java.util.logging.Level.FINEST)) { 
                 logger.finest("FieldName = BP_NM,  StartOffset = " + flFld.getTotalLength() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, EOD = false");
            }
            flFld.setStringField(this, __root.getBP_NM(this.masked), 10, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
            
            /** BP_BYCP_OGN_NO */
            if(logger.isLoggable(java.util.logging.Level.FINEST)) { 
                 logger.finest("FieldName = BP_BYCP_OGN_NO,  StartOffset = " + flFld.getTotalLength() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, EOD = false");
            }
            flFld.setStringField(this, __root.getBP_BYCP_OGN_NO(this.masked), 10, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
            
            /** BYCP_DEPT_NM */
            if(logger.isLoggable(java.util.logging.Level.FINEST)) { 
                 logger.finest("FieldName = BYCP_DEPT_NM,  StartOffset = " + flFld.getTotalLength() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, EOD = false");
            }
            flFld.setStringField(this, __root.getBYCP_DEPT_NM(this.masked), 10, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
            
            /** DEPT_ORG_OGN_NO */
            if(logger.isLoggable(java.util.logging.Level.FINEST)) { 
                 logger.finest("FieldName = DEPT_ORG_OGN_NO,  StartOffset = " + flFld.getTotalLength() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, EOD = false");
            }
            flFld.setStringField(this, __root.getDEPT_ORG_OGN_NO(this.masked), 10, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
            
            /** CP_NM */
            if(logger.isLoggable(java.util.logging.Level.FINEST)) { 
                 logger.finest("FieldName = CP_NM,  StartOffset = " + flFld.getTotalLength() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, EOD = false");
            }
            flFld.setStringField(this, __root.getCP_NM(this.masked), 10, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
            
            /** CP_BYCP_OGN_NO */
            if(logger.isLoggable(java.util.logging.Level.FINEST)) { 
                 logger.finest("FieldName = CP_BYCP_OGN_NO,  StartOffset = " + flFld.getTotalLength() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, EOD = false");
            }
            flFld.setStringField(this, __root.getCP_BYCP_OGN_NO(this.masked), 10, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
        }
        
        return flFld.getMessage();
    }

        
    private void marshallNullObject(FixedLengthMarshalFieldV2 flFld) throws Exception {
            
            /** CRTDT */
            if(logger.isLoggable(java.util.logging.Level.FINEST)) { 
                 logger.finest("FieldName = CRTDT,  StartOffset = " + flFld.getTotalLength() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, EOD = false");
            }
            
                flFld.padByteArrayField(this, 10, " ");
            
            /** RCVYN */
            if(logger.isLoggable(java.util.logging.Level.FINEST)) { 
                 logger.finest("FieldName = RCVYN,  StartOffset = " + flFld.getTotalLength() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, EOD = false");
            }
            
                flFld.padByteArrayField(this, 10, " ");
            
            /** BLCK_YN */
            if(logger.isLoggable(java.util.logging.Level.FINEST)) { 
                 logger.finest("FieldName = BLCK_YN,  StartOffset = " + flFld.getTotalLength() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, EOD = false");
            }
            
                flFld.padByteArrayField(this, 10, " ");
            
            /** VALI_TO_YMD */
            if(logger.isLoggable(java.util.logging.Level.FINEST)) { 
                 logger.finest("FieldName = VALI_TO_YMD,  StartOffset = " + flFld.getTotalLength() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, EOD = false");
            }
            
                flFld.padByteArrayField(this, 10, " ");
            
            /** VALI_FR_YMD */
            if(logger.isLoggable(java.util.logging.Level.FINEST)) { 
                 logger.finest("FieldName = VALI_FR_YMD,  StartOffset = " + flFld.getTotalLength() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, EOD = false");
            }
            
                flFld.padByteArrayField(this, 10, " ");
            
            /** BP_NM */
            if(logger.isLoggable(java.util.logging.Level.FINEST)) { 
                 logger.finest("FieldName = BP_NM,  StartOffset = " + flFld.getTotalLength() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, EOD = false");
            }
            
                flFld.padByteArrayField(this, 10, " ");
            
            /** BP_BYCP_OGN_NO */
            if(logger.isLoggable(java.util.logging.Level.FINEST)) { 
                 logger.finest("FieldName = BP_BYCP_OGN_NO,  StartOffset = " + flFld.getTotalLength() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, EOD = false");
            }
            
                flFld.padByteArrayField(this, 10, " ");
            
            /** BYCP_DEPT_NM */
            if(logger.isLoggable(java.util.logging.Level.FINEST)) { 
                 logger.finest("FieldName = BYCP_DEPT_NM,  StartOffset = " + flFld.getTotalLength() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, EOD = false");
            }
            
                flFld.padByteArrayField(this, 10, " ");
            
            /** DEPT_ORG_OGN_NO */
            if(logger.isLoggable(java.util.logging.Level.FINEST)) { 
                 logger.finest("FieldName = DEPT_ORG_OGN_NO,  StartOffset = " + flFld.getTotalLength() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, EOD = false");
            }
            
                flFld.padByteArrayField(this, 10, " ");
            
            /** CP_NM */
            if(logger.isLoggable(java.util.logging.Level.FINEST)) { 
                 logger.finest("FieldName = CP_NM,  StartOffset = " + flFld.getTotalLength() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, EOD = false");
            }
            
                flFld.padByteArrayField(this, 10, " ");
            
            /** CP_BYCP_OGN_NO */
            if(logger.isLoggable(java.util.logging.Level.FINEST)) { 
                 logger.finest("FieldName = CP_BYCP_OGN_NO,  StartOffset = " + flFld.getTotalLength() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, EOD = false");
            }
            
                flFld.padByteArrayField(this, 10, " ");
    }

    /* unmarshal method */
    public Object unmarshalObject(byte[] message, int startOffset) throws Exception{
        imk.ws_ex01.ws_example01.MSG_MRO_DATA dataObject = new imk.ws_ex01.ws_example01.MSG_MRO_DATA();
        setOffset(unmarshalObject(message, startOffset, dataObject));
            return dataObject;
    }
    
    public int unmarshalObject(byte[] message, int startOffset, Object dataObject) throws Exception {        
        if(logger.isLoggable(Level.FINEST)) {
            logger.finest("#Unmarshall Start. Message Class = [MSG_MRO_DATAFixedLength], byte[] length = " + message.length + ", Start Offset = " + startOffset);
        }

        imk.ws_ex01.ws_example01.MSG_MRO_DATA __root = (imk.ws_ex01.ws_example01.MSG_MRO_DATA)dataObject;
        FixedLengthUnmarshalField flFld = new FixedLengthUnmarshalField(message, startOffset);
        

        /** CP_BYCP_OGN_NO */
        if(logger.isLoggable(java.util.logging.Level.FINEST)) {
            logger.finest("FieldName = CP_BYCP_OGN_NO,  StartOffset = " + flFld.getOffset() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, trimFlag=default, rootTrimFlag=none, unsigned=false");
        }
        __root.setCP_BYCP_OGN_NO(flFld.getStringField(this, 10, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE), this.masked);
    successFieldCount++;

        /** CP_NM */
        if(logger.isLoggable(java.util.logging.Level.FINEST)) {
            logger.finest("FieldName = CP_NM,  StartOffset = " + flFld.getOffset() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, trimFlag=default, rootTrimFlag=none, unsigned=false");
        }
        __root.setCP_NM(flFld.getStringField(this, 10, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE), this.masked);
    successFieldCount++;

        /** DEPT_ORG_OGN_NO */
        if(logger.isLoggable(java.util.logging.Level.FINEST)) {
            logger.finest("FieldName = DEPT_ORG_OGN_NO,  StartOffset = " + flFld.getOffset() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, trimFlag=default, rootTrimFlag=none, unsigned=false");
        }
        __root.setDEPT_ORG_OGN_NO(flFld.getStringField(this, 10, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE), this.masked);
    successFieldCount++;

        /** BYCP_DEPT_NM */
        if(logger.isLoggable(java.util.logging.Level.FINEST)) {
            logger.finest("FieldName = BYCP_DEPT_NM,  StartOffset = " + flFld.getOffset() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, trimFlag=default, rootTrimFlag=none, unsigned=false");
        }
        __root.setBYCP_DEPT_NM(flFld.getStringField(this, 10, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE), this.masked);
    successFieldCount++;

        /** BP_BYCP_OGN_NO */
        if(logger.isLoggable(java.util.logging.Level.FINEST)) {
            logger.finest("FieldName = BP_BYCP_OGN_NO,  StartOffset = " + flFld.getOffset() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, trimFlag=default, rootTrimFlag=none, unsigned=false");
        }
        __root.setBP_BYCP_OGN_NO(flFld.getStringField(this, 10, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE), this.masked);
    successFieldCount++;

        /** BP_NM */
        if(logger.isLoggable(java.util.logging.Level.FINEST)) {
            logger.finest("FieldName = BP_NM,  StartOffset = " + flFld.getOffset() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, trimFlag=default, rootTrimFlag=none, unsigned=false");
        }
        __root.setBP_NM(flFld.getStringField(this, 10, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE), this.masked);
    successFieldCount++;

        /** VALI_FR_YMD */
        if(logger.isLoggable(java.util.logging.Level.FINEST)) {
            logger.finest("FieldName = VALI_FR_YMD,  StartOffset = " + flFld.getOffset() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, trimFlag=default, rootTrimFlag=none, unsigned=false");
        }
        __root.setVALI_FR_YMD(flFld.getStringField(this, 10, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE), this.masked);
    successFieldCount++;

        /** VALI_TO_YMD */
        if(logger.isLoggable(java.util.logging.Level.FINEST)) {
            logger.finest("FieldName = VALI_TO_YMD,  StartOffset = " + flFld.getOffset() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, trimFlag=default, rootTrimFlag=none, unsigned=false");
        }
        __root.setVALI_TO_YMD(flFld.getStringField(this, 10, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE), this.masked);
    successFieldCount++;

        /** BLCK_YN */
        if(logger.isLoggable(java.util.logging.Level.FINEST)) {
            logger.finest("FieldName = BLCK_YN,  StartOffset = " + flFld.getOffset() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, trimFlag=default, rootTrimFlag=none, unsigned=false");
        }
        __root.setBLCK_YN(flFld.getStringField(this, 10, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE), this.masked);
    successFieldCount++;

        /** RCVYN */
        if(logger.isLoggable(java.util.logging.Level.FINEST)) {
            logger.finest("FieldName = RCVYN,  StartOffset = " + flFld.getOffset() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, trimFlag=default, rootTrimFlag=none, unsigned=false");
        }
        __root.setRCVYN(flFld.getStringField(this, 10, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE), this.masked);
    successFieldCount++;

        /** CRTDT */
        if(logger.isLoggable(java.util.logging.Level.FINEST)) {
            logger.finest("FieldName = CRTDT,  StartOffset = " + flFld.getOffset() + " Length=10, fill= , decimal=0, point=true, sign=false, encodeOption=Constants.ENCODE_CHAR, trimFlag=default, rootTrimFlag=none, unsigned=false");
        }
        __root.setCRTDT(flFld.getStringField(this, 10, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE), this.masked);
    successFieldCount++;

        setOffset(flFld.getOffset());
        __root.setMessageProperties(fieldPropertyMap);
        return getOffset();
    }
    
    protected static java.util.Map<String, MessageFieldProperty> fieldPropertyMap = new java.util.LinkedHashMap();
    public java.util.Map<String, MessageFieldProperty> getFieldPropertyMap() {
        return fieldPropertyMap;
    }
    static {
    MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("CP_BYCP_OGN_NO", "CP_BYCP_OGN_NO", MessageFieldType.STRING, (String)null, null, "10", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        fieldPropertyMap.put("CP_BYCP_OGN_NO", fldProp);
        
        fldProp = new MessageFieldProperty("CP_NM", "CP_NM", MessageFieldType.STRING, (String)null, null, "10", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        fieldPropertyMap.put("CP_NM", fldProp);
        
        fldProp = new MessageFieldProperty("DEPT_ORG_OGN_NO", "DEPT_ORG_OGN_NO", MessageFieldType.STRING, (String)null, null, "10", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        fieldPropertyMap.put("DEPT_ORG_OGN_NO", fldProp);
        
        fldProp = new MessageFieldProperty("BYCP_DEPT_NM", "BYCP_DEPT_NM", MessageFieldType.STRING, (String)null, null, "10", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        fieldPropertyMap.put("BYCP_DEPT_NM", fldProp);
        
        fldProp = new MessageFieldProperty("BP_BYCP_OGN_NO", "BP_BYCP_OGN_NO", MessageFieldType.STRING, (String)null, null, "10", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        fieldPropertyMap.put("BP_BYCP_OGN_NO", fldProp);
        
        fldProp = new MessageFieldProperty("BP_NM", "BP_NM", MessageFieldType.STRING, (String)null, null, "10", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        fieldPropertyMap.put("BP_NM", fldProp);
        
        fldProp = new MessageFieldProperty("VALI_FR_YMD", "VALI_FR_YMD", MessageFieldType.STRING, (String)null, null, "10", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        fieldPropertyMap.put("VALI_FR_YMD", fldProp);
        
        fldProp = new MessageFieldProperty("VALI_TO_YMD", "VALI_TO_YMD", MessageFieldType.STRING, (String)null, null, "10", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        fieldPropertyMap.put("VALI_TO_YMD", fldProp);
        
        fldProp = new MessageFieldProperty("BLCK_YN", "BLCK_YN", MessageFieldType.STRING, (String)null, null, "10", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        fieldPropertyMap.put("BLCK_YN", fldProp);
        
        fldProp = new MessageFieldProperty("RCVYN", "RCVYN", MessageFieldType.STRING, (String)null, null, "10", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        fieldPropertyMap.put("RCVYN", fldProp);
        
        fldProp = new MessageFieldProperty("CRTDT", "CRTDT", MessageFieldType.STRING, (String)null, null, "10", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        fieldPropertyMap.put("CRTDT", fldProp);
        
    }

    /**
     * @param input 
     *  values of input variable are 
     *                                         physicalname
     *                                        versionno
     *                                        logicalname
     *                                        resourceid
     *                                   resourceType
     *                                   resourcePath
     *                                   resourceGroup
     * @return 
     */
    public String getMetaData(String input) {

        if (input.equalsIgnoreCase(META_PHYSICAL_NAME)) {
            return "MSG_MRO_DATAFixedLength";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)) {
            return null;
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)) {
            return "MSG_MRO_DATA";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)) {
            return "imk.ws_ex01.ws_example01:MSG_MRO_DATAFixedLength.msg";
        } else if (input.equalsIgnoreCase(META_RESOURCE_TYPE)) {
            return "MESSAGE";
        } else if (input.equalsIgnoreCase(META_RESOURCE_PATH)) {
            return "imk.ws_ex01.ws_example01";
        } else if (input.equalsIgnoreCase(META_RESOURCE_GROUP)) {
            return "";
        } else if (input.equalsIgnoreCase(META_MESSAGE_TYPE)) {
              return "FixedLength";
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_NAME)) {
            return "MSG_MRO_DATA";
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_PATH)) {
            return "imk.ws_ex01.ws_example01";
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_ID)) {
            return "imk.ws_ex01.ws_example01:MSG_MRO_DATA.umsg";
        } else {
            String msg = "Expecting one of " + META_PHYSICAL_NAME + ", "
                    + META_VERSION_NO + ", " + META_LOGICAL_NAME + ", "
                    + META_RESOURCE_ID + ", " + META_RESOURCE_TYPE + ", "
                    + META_RESOURCE_PATH + ", " + META_RESOURCE_GROUP + " , "
                    + META_MESSAGE_TYPE + " , " + META_MESSAGE_STRUCTURE_NAME
                    + " , " + META_MESSAGE_STRUCTURE_PATH + " , "
                    + META_MESSAGE_STRUCTURE_ID;
            
            throw new IllegalArgumentException(msg);
        }
    }        
}
