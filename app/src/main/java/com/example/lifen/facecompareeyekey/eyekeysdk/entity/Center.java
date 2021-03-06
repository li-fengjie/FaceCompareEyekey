package com.example.lifen.facecompareeyekey.eyekeysdk.entity;

/**
 * 居中位置
 *
 * @author wangzhi
 */
public class Center {

  private int x;

  private int y;

  public int getX() {
    return this.x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return this.y;
  }

  public void setY(int y) {
    this.y = y;
  }

  @Override
  public String toString() {
    return "Center [x=" + x + ", y=" + y + "]";
  }
}
