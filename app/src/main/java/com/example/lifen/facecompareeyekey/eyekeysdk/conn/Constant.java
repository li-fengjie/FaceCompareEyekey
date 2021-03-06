package com.example.lifen.facecompareeyekey.eyekeysdk.conn;

public interface Constant {
  /**
   * 访问云平台服务接口的地址
   */
  String API_SERVER = "http://api.eyekey.com/";
  String Check = API_SERVER + "/face/Check";
  String Match = API_SERVER + "/face/Match";
  String FaceGather = API_SERVER + "/FaceGather";
  String People = API_SERVER + "/People";
  String Crowd = API_SERVER + "/Crowd";
  String Info = API_SERVER + "/Info";
  /**
   * 用户不存在
   */
  String RES_CODE_1025 = "1025";

  String RES_CODE_0000 = "0000";

}
