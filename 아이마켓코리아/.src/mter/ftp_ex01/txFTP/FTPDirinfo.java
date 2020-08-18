/*
 * 작성된 날짜: Aug 14, 2020
 * Copyright (c) 2020 TmaxSoft co., Ltd. All rights reserved.
 */
package mter.ftp_ex01.txFTP;

import com.tmax.promapper.engine.base.ProMapperDataObject;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;
import proframe.tool.record.common.*;
import com.tmax.promapper.engine.base.ResourceMeta;
import com.tmax.promapper.engine.util.StringUtil;


/**
 * @file              mter.ftp_ex01.txFTP.FTPDirinfo.java
 * @filetype          java source file
 * @brief            
 * @version           1.0
 * @history
 * 성 명              일 자                     근 거 자 료                      변 경 내 용
 * -----------        --------                  --------------                   --------------------------    
 * AnyLink :       Aug 14, 2020                AnyLink 개발 :                신규 작성
 * 
 */

public class FTPDirinfo extends ProMapperDataObject implements ResourceMeta {
    private static final long serialVersionUID= 1L;
    public FTPDirinfo() {
            super();
    }
    private boolean _setFlag = false;
    private String SrcFilePath = null;
    
    public String getSrcFilePath() {
        return SrcFilePath;
    }

    public String getSrcFilePath(boolean _masked) {
        return StringUtil.nullableStringValueOf(getSrcFilePath());
    }
                      
    public void setSrcFilePath(String SrcFilePath) {
        this.SrcFilePath = SrcFilePath;
        _setFlag = true;
    }

    public void setSrcFilePath(String SrcFilePath, boolean _masked) {
        setSrcFilePath(SrcFilePath);
    }


            
    private String SrcFilePattern = null;
    
    public String getSrcFilePattern() {
        return SrcFilePattern;
    }

    public String getSrcFilePattern(boolean _masked) {
        return StringUtil.nullableStringValueOf(getSrcFilePattern());
    }
                      
    public void setSrcFilePattern(String SrcFilePattern) {
        this.SrcFilePattern = SrcFilePattern;
        _setFlag = true;
    }

    public void setSrcFilePattern(String SrcFilePattern, boolean _masked) {
        setSrcFilePattern(SrcFilePattern);
    }


            
    private String LocalFilePath = null;
    
    public String getLocalFilePath() {
        return LocalFilePath;
    }

    public String getLocalFilePath(boolean _masked) {
        return StringUtil.nullableStringValueOf(getLocalFilePath());
    }
                      
    public void setLocalFilePath(String LocalFilePath) {
        this.LocalFilePath = LocalFilePath;
        _setFlag = true;
    }

    public void setLocalFilePath(String LocalFilePath, boolean _masked) {
        setLocalFilePath(LocalFilePath);
    }


            
    private String LocalFilePattern = null;
    
    public String getLocalFilePattern() {
        return LocalFilePattern;
    }

    public String getLocalFilePattern(boolean _masked) {
        return StringUtil.nullableStringValueOf(getLocalFilePattern());
    }
                      
    public void setLocalFilePattern(String LocalFilePattern) {
        this.LocalFilePattern = LocalFilePattern;
        _setFlag = true;
    }

    public void setLocalFilePattern(String LocalFilePattern, boolean _masked) {
        setLocalFilePattern(LocalFilePattern);
    }


            
    private String TgtFilePath = null;
    
    public String getTgtFilePath() {
        return TgtFilePath;
    }

    public String getTgtFilePath(boolean _masked) {
        return StringUtil.nullableStringValueOf(getTgtFilePath());
    }
                      
    public void setTgtFilePath(String TgtFilePath) {
        this.TgtFilePath = TgtFilePath;
        _setFlag = true;
    }

    public void setTgtFilePath(String TgtFilePath, boolean _masked) {
        setTgtFilePath(TgtFilePath);
    }


            
    private String TgtFilePattern = null;
    
    public String getTgtFilePattern() {
        return TgtFilePattern;
    }

    public String getTgtFilePattern(boolean _masked) {
        return StringUtil.nullableStringValueOf(getTgtFilePattern());
    }
                      
    public void setTgtFilePattern(String TgtFilePattern) {
        this.TgtFilePattern = TgtFilePattern;
        _setFlag = true;
    }

    public void setTgtFilePattern(String TgtFilePattern, boolean _masked) {
        setTgtFilePattern(TgtFilePattern);
    }


            
    public Object clone() {
        FTPDirinfo copyObj = new FTPDirinfo();    
        clone(copyObj);        
        return copyObj;
    }
    public void clone(proframe.dto.DataObject __fTPDirinfo) {
        FTPDirinfo _fTPDirinfo = (FTPDirinfo) __fTPDirinfo;
        _fTPDirinfo.setSrcFilePath(SrcFilePath);
        _fTPDirinfo.setSrcFilePattern(SrcFilePattern);
        _fTPDirinfo.setLocalFilePath(LocalFilePath);
        _fTPDirinfo.setLocalFilePattern(LocalFilePattern);
        _fTPDirinfo.setTgtFilePath(TgtFilePath);
        _fTPDirinfo.setTgtFilePattern(TgtFilePattern);
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
            buffer.append("SrcFilePath : ").append(SrcFilePath).append("\n");
            buffer.append("SrcFilePattern : ").append(SrcFilePattern).append("\n");
            buffer.append("LocalFilePath : ").append(LocalFilePath).append("\n");
            buffer.append("LocalFilePattern : ").append(LocalFilePattern).append("\n");
            buffer.append("TgtFilePath : ").append(TgtFilePath).append("\n");
            buffer.append("TgtFilePattern : ").append(TgtFilePattern).append("\n");
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
            buffer.append("SrcFilePath : ").append(SrcFilePath).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("SrcFilePattern : ").append(SrcFilePattern).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("LocalFilePath : ").append(LocalFilePath).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("LocalFilePattern : ").append(LocalFilePattern).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("TgtFilePath : ").append(TgtFilePath).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("TgtFilePattern : ").append(TgtFilePattern).append("\n");
        }
    }    
    private static final Map parentfieldPropertyMap = null;
    private static final Map fieldPropertyMap = null;
    
/*    static {
        parentfieldPropertyMap = ProMapperDataObject.getFieldPropertyMapByStatic();
        fieldPropertyMap = new java.util.LinkedHashMap( parentfieldPropertyMap.size() + 6);
        fieldPropertyMap.putAll( parentfieldPropertyMap );

        fieldPropertyMap.put("SrcFilePath"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("SrcFilePattern"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("LocalFilePath"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("LocalFilePattern"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("TgtFilePath"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("TgtFilePattern"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
    }*/
    
    public Map getFieldPropertyMap() {
        return fieldPropertyMap;
    }
    
    public static Map getFieldPropertyMapByStatic() {
        return fieldPropertyMap;
    }
    private static final List<String> fieldNameList = new ArrayList<String>(6);
    
    static {        
        fieldNameList.add("SrcFilePath");
        fieldNameList.add("SrcFilePattern");
        fieldNameList.add("LocalFilePath");
        fieldNameList.add("LocalFilePattern");
        fieldNameList.add("TgtFilePath");
        fieldNameList.add("TgtFilePattern");
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
            case 1028806053 : return getSrcFilePath();
            case 274958864 : return getSrcFilePattern();
            case -1374582740 : return getLocalFilePath();
            case -1975749079 : return getLocalFilePattern();
            case 731548450 : return getTgtFilePath();
            case 896272243 : return getTgtFilePattern();
            default : return null;
        }
    }
    public void set(String fieldName, Object arg) {
        int hashCode = fieldName.hashCode();
        
        switch(hashCode) {
            case 1028806053 : setSrcFilePath((String)arg);break;
            case 274958864 : setSrcFilePattern((String)arg);break;
            case -1374582740 : setLocalFilePath((String)arg);break;
            case -1975749079 : setLocalFilePattern((String)arg);break;
            case 731548450 : setTgtFilePath((String)arg);break;
            case 896272243 : setTgtFilePattern((String)arg);break;
            default : return;
        }
    }
    public boolean isEmptyDataObjectMethod(){ 
        if (SrcFilePath != null) return false;
        if (SrcFilePattern != null) return false;
        if (LocalFilePath != null) return false;
        if (LocalFilePattern != null) return false;
        if (TgtFilePath != null) return false;
        if (TgtFilePattern != null) return false;

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
            return "FTPDirinfo";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)){
            return "0";
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)){
            return "FTPDirinfo";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)){
            return "mter.ftp_ex01.txFTP:FTPDirinfo.umsg";
        } else if (input.equalsIgnoreCase(META_RESOURCE_TYPE)){
            return "STRUCTURE";
        } else if (input.equalsIgnoreCase(META_RESOURCE_PATH)){
            return "mter.ftp_ex01.txFTP";
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
