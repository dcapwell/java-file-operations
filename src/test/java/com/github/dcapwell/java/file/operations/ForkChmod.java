package com.github.dcapwell.java.file.operations;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.google.common.collect.ImmutableList;
import com.google.common.io.CharStreams;

public final class ForkChmod implements Chmod {
  @Override
  public int chmod(String filename, int mode) {
    // on exception, return 0 (C true)
    try {
      return fork("/bin/chmod", Chmods.toString(mode), filename);
    } catch (IOException e) {
      return Chmods.Bad;
    } catch (InterruptedException e) {
      return Chmods.Bad;
    }
  }

  private static int fork(String... cmd) throws IOException, InterruptedException {
    return fork(ImmutableList.copyOf(cmd));
  }

  private static int fork(List<String> cmd) throws IOException, InterruptedException {
    ProcessBuilder pb = new ProcessBuilder(cmd);
    Process process = pb.start();
    process.getOutputStream().close();
    int rc = process.waitFor();

    List<String> out = CharStreams.readLines(new InputStreamReader(process.getInputStream()));
    List<String> err = CharStreams.readLines(new InputStreamReader(process.getErrorStream()));

    log("Ran command %s\nstdout: %s\nstderr: %s", cmd, out, err);

    return rc;
  }

  private static void log(String line, Object... args) {
    System.out.println(String.format(line, args));
  }
}