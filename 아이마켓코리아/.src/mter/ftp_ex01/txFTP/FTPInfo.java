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
 * @file              mter.ftp_ex01.txFTP.FTPInfo.java
 * @filetype          java source file
 * @brief            
 * @version           1.0
 * @history
 * 성 명              일 자                     근 거 자 료                      변 경 내 용
 * -----------        --------                  --------------                   --------------------------    
 * AnyLink :       Aug 14, 2020                AnyLink 개발 :                신규 작성
 * 
 */

public class FTPInfo extends ProMapperDataObject implements ResourceMeta {
    private static final long serialVersionUID= 1L;
    public FTPInfo() {
            super();
    }
    private boolean _setFlag = false;
    private String FilePath = null;
    
    public String getFilePath() {
        return FilePath;
    }

    public String getFilePath(boolean _masked) {
        return StringUtil.nullableStringValueOf(getFilePath());
    }
                      
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
        _setFlag = true;
    }

    public void setFilePath(String FilePath, boolean _masked) {
        setFilePath(FilePath);
    }


            
    private String FileName = null;
    
    public String getFileName() {
        return FileName;
    }

    public String getFileName(boolean _masked) {
        return StringUtil.nullableStringValueOf(getFileName());
    }
                      
    public void setFileName(String FileName) {
        this.FileName = FileName;
        _setFlag = true;
    }

    public void setFileName(String FileName, boolean _masked) {
        setFileName(FileName);
    }


            
    private long FileSize;
    
    public long getFileSize() {
        return FileSize;
    }

    public String getFileSize(boolean _masked) {
        return String.valueOf(getFileSize());
    }
                      
    public void setFileSize(long FileSize) {
        this.FileSize = FileSize;
        _setFlag = true;
    }

    public void setFileSize(long FileSize, boolean _masked) {
        setFileSize(FileSize);
    }


            
    private boolean Result;
    
    public boolean getResult() {
        return Result;
    }

    public String getResult(boolean _masked) {
        return String.valueOf(getResult());
    }
                      
    public void setResult(boolean Result) {
        this.Result = Result;
        _setFlag = true;
    }

    public void setResult(boolean Result, boolean _masked) {
        setResult(Result);
    }


            
    public Object clone() {
        FTPInfo copyObj = new FTPInfo();    
        clone(copyObj);        
        return copyObj;
    }
    public void clone(proframe.dto.DataObject __fTPInfo) {
        FTPInfo _fTPInfo = (FTPInfo) __fTPInfo;
        _fTPInfo.setFilePath(FilePath);
        _fTPInfo.setFileName(FileName);
        _fTPInfo.setFileSize(FileSize);
        _fTPInfo.setResult(Result);
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
            buffer.append("FilePath : ").append(FilePath).append("\n");
            buffer.append("FileName : ").append(FileName).append("\n");
            buffer.append("FileSize : ").append(FileSize).append("\n");
            buffer.append("Result : ").append(Result).append("\n");
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
            buffer.append("FilePath : ").append(FilePath).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("FileName : ").append(FileName).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("FileSize : ").append(FileSize).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("Result : ").append(Result).append("\n");
        }
    }    
    private static final Map parentfieldPropertyMap = null;
    private static final Map fieldPropertyMap = null;
    
/*    static {
        parentfieldPropertyMap = ProMapperDataObject.getFieldPropertyMapByStatic();
        fieldPropertyMap = new java.util.LinkedHashMap( parentfieldPropertyMap.size() + 4);
        fieldPropertyMap.putAll( parentfieldPropertyMap );

        fieldPropertyMap.put("FilePath"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("FileName"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("FileSize"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_PRIMITIVE_LONG, -1, null, null));
        fieldPropertyMap.put("Result"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_PRIMITIVE_BOOLEAN, -1, null, null));
    }*/
    
    public Map getFieldPropertyMap() {
        return fieldPropertyMap;
    }
    
    public static Map getFieldPropertyMapByStatic() {
        return fieldPropertyMap;
    }
    private static final List<String> fieldNameList = new ArrayList<String>(4);
    
    static {        
        fieldNameList.add("FilePath");
        fieldNameList.add("FileName");
        fieldNameList.add("FileSize");
        fieldNameList.add("Result");
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
            case -671018015 : return getFilePath();
            case -671077817 : return getFileName();
            case -670920771 : return Long.valueOf(getFileSize());
            case -1850559427 : return Boolean.valueOf(getResult());
            default : return null;
        }
    }
    public void set(String fieldName, Object arg) {
        int hashCode = fieldName.hashCode();
        
        switch(hashCode) {
            case -671018015 : setFilePath((String)arg);break;
            case -671077817 : setFileName((String)arg);break;
            case -670920771 : setFileSize(((Long)arg).longValue());break;
            case -1850559427 : setResult(((Boolean)arg).booleanValue());break;
            default : return;
        }
    }
    public boolean isEmptyDataObjectMethod(){ 
        if (FilePath != null) return false;
        if (FileName != null) return false;
        if(true) return false;
        if(true) return false;

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
            return "FTPInfo";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)){
            return "0";
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)){
            return "FTPInfo";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)){
            return "mter.ftp_ex01.txFTP:FTPInfo.umsg";
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
