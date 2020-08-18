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
 * @file              mter.ftp_ex01.txFTP.FTPInfoList.java
 * @filetype          java source file
 * @brief            
 * @version           1.0
 * @history
 * 성 명              일 자                     근 거 자 료                      변 경 내 용
 * -----------        --------                  --------------                   --------------------------    
 * AnyLink :       Aug 14, 2020                AnyLink 개발 :                신규 작성
 * 
 */

public class FTPInfoList extends ProMapperDataObject implements ResourceMeta {
    private static final long serialVersionUID= 1L;
    public FTPInfoList() {
            super();
    }
    private boolean _setFlag = false;
        private ArrayList<mter.ftp_ex01.txFTP.FTPInfo> FTPInfo = new ArrayList<mter.ftp_ex01.txFTP.FTPInfo>();
    
    public void clearFTPInfo() {
        FTPInfo.clear();
    }
    
    public void ensureCapacityFTPInfo(int minCapacity) {
        FTPInfo.ensureCapacity( minCapacity );
    }
    public void createFTPInfo(int _size) {
        FTPInfo.ensureCapacity(_size);
        for(int i = FTPInfo.size(); i < _size; i++) {
            FTPInfo.add(new mter.ftp_ex01.txFTP.FTPInfo());
        }
    }
     public FTPInfoList fillFTPInfo(int _index) {
        createFTPInfo(_index+1);
        return this;
    }
    
    public int sizeFTPInfo() {
        if (FTPInfo != null)
            return FTPInfo.size();
        else
            return 0;
    }
    
    public mter.ftp_ex01.txFTP.FTPInfo[] getFTPInfo() {
        return (mter.ftp_ex01.txFTP.FTPInfo[])FTPInfo.toArray(new mter.ftp_ex01.txFTP.FTPInfo[FTPInfo.size()]);
    }
    public mter.ftp_ex01.txFTP.FTPInfo getFTPInfo(int _index) {
        return FTPInfo.get(_index);
    }
    
    public void setFTPInfo(mter.ftp_ex01.txFTP.FTPInfo[] FTPInfo) {
        this.FTPInfo.clear();
        for(int i = 0; i < FTPInfo.length; i++) {
            this.FTPInfo.add(FTPInfo[i]);
        }
        _setFlag = true;
    }
    public void setFTPInfo(int _index, mter.ftp_ex01.txFTP.FTPInfo FTPInfo) {
        this.FTPInfo.set(_index, FTPInfo);
        _setFlag = true;
    }
    
    public void addFTPInfo(int _index, mter.ftp_ex01.txFTP.FTPInfo FTPInfo) {
        this.FTPInfo.add(_index, FTPInfo);
        _setFlag = true;
    }
    public void addFTPInfo(mter.ftp_ex01.txFTP.FTPInfo FTPInfo) {
        this.FTPInfo.add(FTPInfo);
        _setFlag = true;
    }
    
    public mter.ftp_ex01.txFTP.FTPInfo removeFTPInfo(int _index) {
        return this.FTPInfo.remove(_index);
    }
    
    
    public Object clone() {
        FTPInfoList copyObj = new FTPInfoList();    
        clone(copyObj);        
        return copyObj;
    }
    public void clone(proframe.dto.DataObject __fTPInfoList) {
        FTPInfoList _fTPInfoList = (FTPInfoList) __fTPInfoList;
        for (int index0 = 0; index0 < getFTPInfo().length; index0++) {
            _fTPInfoList.addFTPInfo(index0, (mter.ftp_ex01.txFTP.FTPInfo)getFTPInfo(index0).clone());
        }
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
        _size = sizeFTPInfo();
        for (int index = 0; index < _size; index++) {
                buffer.append("FTPInfo(").append(index).append(") : ").append(getFTPInfo(index)).append(" ");
        }
                            
        
            if(_size != 0 ) {
                buffer.append("\n");
            }
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
        _size = sizeFTPInfo();
        for (int index = 0; index < _size; index++) {
            if (buffer.length() < limit) {
                buffer.append("FTPInfo(").append(index).append(") : ").append(getFTPInfo(index)).append(" ");
            }
        }
                            
        if(buffer.length() < limit) {
        
            if(_size != 0 ) {
                buffer.append("\n");
            }
        }
    }    
    private static final Map parentfieldPropertyMap = null;
    private static final Map fieldPropertyMap = null;
    
/*    static {
        parentfieldPropertyMap = ProMapperDataObject.getFieldPropertyMapByStatic();
        fieldPropertyMap = new java.util.LinkedHashMap( parentfieldPropertyMap.size() + 1);
        fieldPropertyMap.putAll( parentfieldPropertyMap );

        fieldPropertyMap.put("FTPInfo"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_INCLUDE, -1, "unbounded" , "mter.ftp_ex01.txFTP.FTPInfo"));
    }*/
    
    public Map getFieldPropertyMap() {
        return fieldPropertyMap;
    }
    
    public static Map getFieldPropertyMapByStatic() {
        return fieldPropertyMap;
    }
    private static final List<String> fieldNameList = new ArrayList<String>(1);
    
    static {        
        fieldNameList.add("FTPInfo");
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
            case 181762320 : return getFTPInfo();
            default : return null;
        }
    }
    public void set(String fieldName, Object arg) {
        int hashCode = fieldName.hashCode();
        
        switch(hashCode) {
            case 181762320 : setFTPInfo((mter.ftp_ex01.txFTP.FTPInfo[])arg);break;
            default : return;
        }
    }
    public boolean isEmptyDataObjectMethod(){ 
        if (FTPInfo.size() > 0) return false;

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
            return "FTPInfoList";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)){
            return "0";
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)){
            return "FTPInfoList";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)){
            return "mter.ftp_ex01.txFTP:FTPInfoList.umsg";
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
