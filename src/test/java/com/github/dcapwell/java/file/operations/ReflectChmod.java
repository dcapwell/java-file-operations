package com.github.dcapwell.java.file.operations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class ReflectChmod implements Chmod {
  private final Method chmodMethod;

  public ReflectChmod() throws ClassNotFoundException, NoSuchMethodException {
    Class<?> fspClass = Class.forName("java.util.prefs.FileSystemPreferences");
    chmodMethod = fspClass.getDeclaredMethod("chmod", String.class, Integer.TYPE);
    chmodMethod.setAccessible(true);
  }

  @Override
  public int chmod(String filename, int mode) {
    try {
      return ((Integer) chmodMethod.invoke(null, filename, mode)).intValue();
    } catch (IllegalAccessException e) {
      return Chmods.Bad;
    } catch (InvocationTargetException e) {
      return Chmods.Bad;
    }
  }
}
