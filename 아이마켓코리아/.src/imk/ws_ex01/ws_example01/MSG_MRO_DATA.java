/*
 * 작성된 날짜: Aug 18, 2020
 * Copyright (c) 2020 TmaxSoft co., Ltd. All rights reserved.
 */
package imk.ws_ex01.ws_example01;

import com.tmax.promapper.engine.base.ProMapperDataObject;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;
import proframe.tool.record.common.*;
import com.tmax.promapper.engine.base.ResourceMeta;
import com.tmax.promapper.engine.util.StringUtil;


/**
 * @file              imk.ws_ex01.ws_example01.MSG_MRO_DATA.java
 * @filetype          java source file
 * @brief            
 * @version           1.0
 * @history
 * 성 명              일 자                     근 거 자 료                      변 경 내 용
 * -----------        --------                  --------------                   --------------------------    
 * AnyLink :       Aug 18, 2020                AnyLink 개발 :                신규 작성
 * 
 */

public class MSG_MRO_DATA extends ProMapperDataObject implements ResourceMeta {
    private static final long serialVersionUID= 1L;
    public MSG_MRO_DATA() {
            super();
    }
    private boolean _setFlag = false;
    private String CP_BYCP_OGN_NO = null;
    
    public String getCP_BYCP_OGN_NO() {
        return CP_BYCP_OGN_NO;
    }

    public String getCP_BYCP_OGN_NO(boolean _masked) {
        return StringUtil.nullableStringValueOf(getCP_BYCP_OGN_NO());
    }
                      
    public void setCP_BYCP_OGN_NO(String CP_BYCP_OGN_NO) {
        this.CP_BYCP_OGN_NO = CP_BYCP_OGN_NO;
        _setFlag = true;
    }

    public void setCP_BYCP_OGN_NO(String CP_BYCP_OGN_NO, boolean _masked) {
        setCP_BYCP_OGN_NO(CP_BYCP_OGN_NO);
    }


            
    private String CP_NM = null;
    
    public String getCP_NM() {
        return CP_NM;
    }

    public String getCP_NM(boolean _masked) {
        return StringUtil.nullableStringValueOf(getCP_NM());
    }
                      
    public void setCP_NM(String CP_NM) {
        this.CP_NM = CP_NM;
        _setFlag = true;
    }

    public void setCP_NM(String CP_NM, boolean _masked) {
        setCP_NM(CP_NM);
    }


            
    private String DEPT_ORG_OGN_NO = null;
    
    public String getDEPT_ORG_OGN_NO() {
        return DEPT_ORG_OGN_NO;
    }

    public String getDEPT_ORG_OGN_NO(boolean _masked) {
        return StringUtil.nullableStringValueOf(getDEPT_ORG_OGN_NO());
    }
                      
    public void setDEPT_ORG_OGN_NO(String DEPT_ORG_OGN_NO) {
        this.DEPT_ORG_OGN_NO = DEPT_ORG_OGN_NO;
        _setFlag = true;
    }

    public void setDEPT_ORG_OGN_NO(String DEPT_ORG_OGN_NO, boolean _masked) {
        setDEPT_ORG_OGN_NO(DEPT_ORG_OGN_NO);
    }


            
    private String BYCP_DEPT_NM = null;
    
    public String getBYCP_DEPT_NM() {
        return BYCP_DEPT_NM;
    }

    public String getBYCP_DEPT_NM(boolean _masked) {
        return StringUtil.nullableStringValueOf(getBYCP_DEPT_NM());
    }
                      
    public void setBYCP_DEPT_NM(String BYCP_DEPT_NM) {
        this.BYCP_DEPT_NM = BYCP_DEPT_NM;
        _setFlag = true;
    }

    public void setBYCP_DEPT_NM(String BYCP_DEPT_NM, boolean _masked) {
        setBYCP_DEPT_NM(BYCP_DEPT_NM);
    }


            
    private String BP_BYCP_OGN_NO = null;
    
    public String getBP_BYCP_OGN_NO() {
        return BP_BYCP_OGN_NO;
    }

    public String getBP_BYCP_OGN_NO(boolean _masked) {
        return StringUtil.nullableStringValueOf(getBP_BYCP_OGN_NO());
    }
                      
    public void setBP_BYCP_OGN_NO(String BP_BYCP_OGN_NO) {
        this.BP_BYCP_OGN_NO = BP_BYCP_OGN_NO;
        _setFlag = true;
    }

    public void setBP_BYCP_OGN_NO(String BP_BYCP_OGN_NO, boolean _masked) {
        setBP_BYCP_OGN_NO(BP_BYCP_OGN_NO);
    }


            
    private String BP_NM = null;
    
    public String getBP_NM() {
        return BP_NM;
    }

    public String getBP_NM(boolean _masked) {
        return StringUtil.nullableStringValueOf(getBP_NM());
    }
                      
    public void setBP_NM(String BP_NM) {
        this.BP_NM = BP_NM;
        _setFlag = true;
    }

    public void setBP_NM(String BP_NM, boolean _masked) {
        setBP_NM(BP_NM);
    }


            
    private String VALI_FR_YMD = null;
    
    public String getVALI_FR_YMD() {
        return VALI_FR_YMD;
    }

    public String getVALI_FR_YMD(boolean _masked) {
        return StringUtil.nullableStringValueOf(getVALI_FR_YMD());
    }
                      
    public void setVALI_FR_YMD(String VALI_FR_YMD) {
        this.VALI_FR_YMD = VALI_FR_YMD;
        _setFlag = true;
    }

    public void setVALI_FR_YMD(String VALI_FR_YMD, boolean _masked) {
        setVALI_FR_YMD(VALI_FR_YMD);
    }


            
    private String VALI_TO_YMD = null;
    
    public String getVALI_TO_YMD() {
        return VALI_TO_YMD;
    }

    public String getVALI_TO_YMD(boolean _masked) {
        return StringUtil.nullableStringValueOf(getVALI_TO_YMD());
    }
                      
    public void setVALI_TO_YMD(String VALI_TO_YMD) {
        this.VALI_TO_YMD = VALI_TO_YMD;
        _setFlag = true;
    }

    public void setVALI_TO_YMD(String VALI_TO_YMD, boolean _masked) {
        setVALI_TO_YMD(VALI_TO_YMD);
    }


            
    private String BLCK_YN = null;
    
    public String getBLCK_YN() {
        return BLCK_YN;
    }

    public String getBLCK_YN(boolean _masked) {
        return StringUtil.nullableStringValueOf(getBLCK_YN());
    }
                      
    public void setBLCK_YN(String BLCK_YN) {
        this.BLCK_YN = BLCK_YN;
        _setFlag = true;
    }

    public void setBLCK_YN(String BLCK_YN, boolean _masked) {
        setBLCK_YN(BLCK_YN);
    }


            
    private String RCVYN = null;
    
    public String getRCVYN() {
        return RCVYN;
    }

    public String getRCVYN(boolean _masked) {
        return StringUtil.nullableStringValueOf(getRCVYN());
    }
                      
    public void setRCVYN(String RCVYN) {
        this.RCVYN = RCVYN;
        _setFlag = true;
    }

    public void setRCVYN(String RCVYN, boolean _masked) {
        setRCVYN(RCVYN);
    }


            
    private String CRTDT = null;
    
    public String getCRTDT() {
        return CRTDT;
    }

    public String getCRTDT(boolean _masked) {
        return StringUtil.nullableStringValueOf(getCRTDT());
    }
                      
    public void setCRTDT(String CRTDT) {
        this.CRTDT = CRTDT;
        _setFlag = true;
    }

    public void setCRTDT(String CRTDT, boolean _masked) {
        setCRTDT(CRTDT);
    }


            
    public Object clone() {
        MSG_MRO_DATA copyObj = new MSG_MRO_DATA();    
        clone(copyObj);        
        return copyObj;
    }
    public void clone(proframe.dto.DataObject __mSG_MRO_DATA) {
        MSG_MRO_DATA _mSG_MRO_DATA = (MSG_MRO_DATA) __mSG_MRO_DATA;
        _mSG_MRO_DATA.setCP_BYCP_OGN_NO(CP_BYCP_OGN_NO);
        _mSG_MRO_DATA.setCP_NM(CP_NM);
        _mSG_MRO_DATA.setDEPT_ORG_OGN_NO(DEPT_ORG_OGN_NO);
        _mSG_MRO_DATA.setBYCP_DEPT_NM(BYCP_DEPT_NM);
        _mSG_MRO_DATA.setBP_BYCP_OGN_NO(BP_BYCP_OGN_NO);
        _mSG_MRO_DATA.setBP_NM(BP_NM);
        _mSG_MRO_DATA.setVALI_FR_YMD(VALI_FR_YMD);
        _mSG_MRO_DATA.setVALI_TO_YMD(VALI_TO_YMD);
        _mSG_MRO_DATA.setBLCK_YN(BLCK_YN);
        _mSG_MRO_DATA.setRCVYN(RCVYN);
        _mSG_MRO_DATA.setCRTDT(CRTDT);
    }
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append(super.toString());

            buffer.append('\n');
            toString_0(buffer);
        
        return buffer.toString();
    }
    
    private void toString_0(StringBuilder buffer) {
        int _size = 0; // field가 array인 경우 array size를 저장하는 변수
            buffer.append("CP_BYCP_OGN_NO : ").append(CP_BYCP_OGN_NO).append("\n");
            buffer.append("CP_NM : ").append(CP_NM).append("\n");
            buffer.append("DEPT_ORG_OGN_NO : ").append(DEPT_ORG_OGN_NO).append("\n");
            buffer.append("BYCP_DEPT_NM : ").append(BYCP_DEPT_NM).append("\n");
            buffer.append("BP_BYCP_OGN_NO : ").append(BP_BYCP_OGN_NO).append("\n");
            buffer.append("BP_NM : ").append(BP_NM).append("\n");
            buffer.append("VALI_FR_YMD : ").append(VALI_FR_YMD).append("\n");
            buffer.append("VALI_TO_YMD : ").append(VALI_TO_YMD).append("\n");
            buffer.append("BLCK_YN : ").append(BLCK_YN).append("\n");
            buffer.append("RCVYN : ").append(RCVYN).append("\n");
            buffer.append("CRTDT : ").append(CRTDT).append("\n");
    }    
    public String toString(int limit) {
        StringBuilder buffer = new StringBuilder();
        buffer.append(super.toString());
        int _size = 0; // field가 array인 경우 array size를 저장하는 변수
        
            buffer.append('\n');
            toString_0(buffer, limit);
        
        return buffer.toString();
    }
    
    private void toString_0(StringBuilder buffer, int limit) {
        int _size = 0; // field가 array인 경우 array size를 저장하는 변수
        if(buffer.length() < limit) {
            buffer.append("CP_BYCP_OGN_NO : ").append(CP_BYCP_OGN_NO).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("CP_NM : ").append(CP_NM).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("DEPT_ORG_OGN_NO : ").append(DEPT_ORG_OGN_NO).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("BYCP_DEPT_NM : ").append(BYCP_DEPT_NM).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("BP_BYCP_OGN_NO : ").append(BP_BYCP_OGN_NO).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("BP_NM : ").append(BP_NM).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("VALI_FR_YMD : ").append(VALI_FR_YMD).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("VALI_TO_YMD : ").append(VALI_TO_YMD).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("BLCK_YN : ").append(BLCK_YN).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("RCVYN : ").append(RCVYN).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("CRTDT : ").append(CRTDT).append("\n");
        }
    }    
    private static final Map parentfieldPropertyMap = null;
    private static final Map fieldPropertyMap = null;
    
/*    static {
        parentfieldPropertyMap = ProMapperDataObject.getFieldPropertyMapByStatic();
        fieldPropertyMap = new java.util.LinkedHashMap( parentfieldPropertyMap.size() + 11);
        fieldPropertyMap.putAll( parentfieldPropertyMap );

        fieldPropertyMap.put("CP_BYCP_OGN_NO"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("CP_NM"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("DEPT_ORG_OGN_NO"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("BYCP_DEPT_NM"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("BP_BYCP_OGN_NO"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("BP_NM"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("VALI_FR_YMD"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("VALI_TO_YMD"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("BLCK_YN"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("RCVYN"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("CRTDT"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
    }*/
    
    public Map getFieldPropertyMap() {
        return fieldPropertyMap;
    }
    
    public static Map getFieldPropertyMapByStatic() {
        return fieldPropertyMap;
    }
    private static final List<String> fieldNameList = new ArrayList<String>(11);
    
    static {        
        fieldNameList.add("CP_BYCP_OGN_NO");
        fieldNameList.add("CP_NM");
        fieldNameList.add("DEPT_ORG_OGN_NO");
        fieldNameList.add("BYCP_DEPT_NM");
        fieldNameList.add("BP_BYCP_OGN_NO");
        fieldNameList.add("BP_NM");
        fieldNameList.add("VALI_FR_YMD");
        fieldNameList.add("VALI_TO_YMD");
        fieldNameList.add("BLCK_YN");
        fieldNameList.add("RCVYN");
        fieldNameList.add("CRTDT");
    }
    
    public List<String> getFieldNameList(){
        return fieldNameList;
    }
    
    public boolean getSetFlag(){
        return _setFlag;
    }

    public Object get(String fieldName) {
        int hashCode = fieldName.hashCode();
        
        switch(hashCode) {
            case 1107027443 : return getCP_BYCP_OGN_NO();
            case 64352977 : return getCP_NM();
            case -343975617 : return getDEPT_ORG_OGN_NO();
            case 401526718 : return getBYCP_DEPT_NM();
            case 1612586068 : return getBP_BYCP_OGN_NO();
            case 63429456 : return getBP_NM();
            case -862729100 : return getVALI_FR_YMD();
            case -464691549 : return getVALI_TO_YMD();
            case 685720642 : return getBLCK_YN();
            case 77810202 : return getRCVYN();
            case 64401685 : return getCRTDT();
            default : return null;
        }
    }
    public void set(String fieldName, Object arg) {
        int hashCode = fieldName.hashCode();
        
        switch(hashCode) {
            case 1107027443 : setCP_BYCP_OGN_NO((String)arg);break;
            case 64352977 : setCP_NM((String)arg);break;
            case -343975617 : setDEPT_ORG_OGN_NO((String)arg);break;
            case 401526718 : setBYCP_DEPT_NM((String)arg);break;
            case 1612586068 : setBP_BYCP_OGN_NO((String)arg);break;
            case 63429456 : setBP_NM((String)arg);break;
            case -862729100 : setVALI_FR_YMD((String)arg);break;
            case -464691549 : setVALI_TO_YMD((String)arg);break;
            case 685720642 : setBLCK_YN((String)arg);break;
            case 77810202 : setRCVYN((String)arg);break;
            case 64401685 : setCRTDT((String)arg);break;
            default : return;
        }
    }
    public boolean isEmptyDataObjectMethod(){ 
        if (CP_BYCP_OGN_NO != null) return false;
        if (CP_NM != null) return false;
        if (DEPT_ORG_OGN_NO != null) return false;
        if (BYCP_DEPT_NM != null) return false;
        if (BP_BYCP_OGN_NO != null) return false;
        if (BP_NM != null) return false;
        if (VALI_FR_YMD != null) return false;
        if (VALI_TO_YMD != null) return false;
        if (BLCK_YN != null) return false;
        if (RCVYN != null) return false;
        if (CRTDT != null) return false;

        return true;
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
            return "MSG_MRO_DATA";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)){
            return null;
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)){
            return "MSG_MRO_DATA";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)){
            return "imk.ws_ex01.ws_example01:MSG_MRO_DATA.umsg";
        } else if (input.equalsIgnoreCase(META_RESOURCE_TYPE)){
            return "STRUCTURE";
        } else if (input.equalsIgnoreCase(META_RESOURCE_PATH)){
            return "imk.ws_ex01.ws_example01";
        } else if (input.equalsIgnoreCase(META_RESOURCE_GROUP)){
            return "";
        } else {
            String msg = "Expecting one of " + META_PHYSICAL_NAME + ", "
                    + META_VERSION_NO + ", " + META_LOGICAL_NAME + ", "
                    + META_RESOURCE_ID + ", " + META_RESOURCE_TYPE + ", "
                    + META_RESOURCE_PATH + ", " + META_RESOURCE_GROUP;
            throw new IllegalArgumentException(msg);
        }
    }
}
