package com.github.dcapwell.java.file.operations;

public final class Chmods {
  public static final int OK = 0;
  public static final int Bad = 1;

  public static String toString(int mode) {
    StringBuilder sb = new StringBuilder(4);
    sb.append(0);
    // owner
    sb.append(optCode(mode, 0400, 0200, 0100));
    // group
    sb.append(optCode(mode, 040, 020, 010));
    // other
    sb.append(optCode(mode, 04, 02, 01));

    return sb.toString();
  }

  private static int optCode(int mode, int read, int write, int exec) {
    int result = 0;
    if (isSet(mode, read)) {
      result += 4;
    }
    if (isSet(mode, write)) {
      result += 2;
    }
    if (isSet(mode, exec)) {
      result += 1;
    }
    return result;
  }

  private static boolean isSet(int mode, int testbit) {
    return (mode & testbit) == testbit;
  }
}
