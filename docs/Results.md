# Results

These are the results for running across the different ways to do chmod.

Hardware:
OS  : OS X 10.9.2
CPU : 2.3 GHz Intel Core i7
Mem : 16 GB

## Oracle JDK 6

### JNA

```
# Benchmark mode: Throughput, ops/time
# Benchmark: com.github.dcapwell.java.file.operations.jna.JNAFileOperations.chmod
# Parameters: (mode = 0777)

Result: 74763.711 ±(99.9%) 587.673 ops/s [Average]
  Statistics: (min, avg, max) = (70384.049, 74763.711, 78686.495), stdev = 2488.244
  Confidence interval (99.9%): [74176.038, 75351.384]

c.g.d.j.f.o.jna.JNAFileOperations.chmod                0777  thrpt      200   74763.711 ± 587.673  ops/s

# Benchmark mode: Throughput, ops/time
# Benchmark: com.github.dcapwell.java.file.operations.jna.JNAFileOperations.chmod
# Parameters: (mode = 0755)

Result: 75158.776 ±(99.9%) 595.001 ops/s [Average]
  Statistics: (min, avg, max) = (68334.544, 75158.776, 78414.992), stdev = 2519.271
  Confidence interval (99.9%): [74563.776, 75753.777]

c.g.d.j.f.o.jna.JNAFileOperations.chmod                0755  thrpt      200   75158.776 ± 595.001  ops/s
```

### Fork

```
# Benchmark mode: Throughput, ops/time
# Benchmark: com.github.dcapwell.java.file.operations.fork.ForkFileOperations.chmod
# Parameters: (mode = 0777)

Result: 177.826 ±(99.9%) 0.858 ops/s [Average]
  Statistics: (min, avg, max) = (159.641, 177.826, 184.391), stdev = 3.631
  Confidence interval (99.9%): [176.969, 178.684]

c.g.d.j.f.o.fork.ForkFileOperations.chmod              0777  thrpt      200     177.826 ±   0.858  ops/s

# Benchmark mode: Throughput, ops/time
# Benchmark: com.github.dcapwell.java.file.operations.fork.ForkFileOperations.chmod
# Parameters: (mode = 0755)

Result: 176.938 ±(99.9%) 1.297 ops/s [Average]
  Statistics: (min, avg, max) = (162.310, 176.938, 192.520), stdev = 5.492
  Confidence interval (99.9%): [175.641, 178.236]

c.g.d.j.f.o.fork.ForkFileOperations.chmod              0755  thrpt      200     176.938 ±   1.297  ops/s
```

### Java 6 Reflection

```
# Benchmark mode: Throughput, ops/time
# Benchmark: com.github.dcapwell.java.file.operations.java6.JavaReflectFileOperations.chmod
# Parameters: (mode = 0777)

Result: 119339.092 ±(99.9%) 565.809 ops/s [Average]
  Statistics: (min, avg, max) = (114145.892, 119339.092, 124648.102), stdev = 2395.670
  Confidence interval (99.9%): [118773.283, 119904.901]

c.g.d.j.f.o.java6.JavaReflectFileOperations.chmod      0777  thrpt      200  119339.092 ± 565.809  ops/s

# Benchmark mode: Throughput, ops/time
# Benchmark: com.github.dcapwell.java.file.operations.java6.JavaReflectFileOperations.chmod
# Parameters: (mode = 0755)

Result: 120633.863 ±(99.9%) 549.694 ops/s [Average]
  Statistics: (min, avg, max) = (116393.157, 120633.863, 126097.537), stdev = 2327.438
  Confidence interval (99.9%): [120084.169, 121183.556]

c.g.d.j.f.o.java6.JavaReflectFileOperations.chmod      0755  thrpt      200  120633.863 ± 549.694  ops/s
```

### JNR-FFI

```
# Benchmark mode: Throughput, ops/time
# Benchmark: com.github.dcapwell.java.file.operations.jnr.ffi.JNRFFIFileOperations.chmod
# Parameters: (mode = 0777)

Result: 126086.347 ±(99.9%) 465.560 ops/s [Average]
  Statistics: (min, avg, max) = (120376.705, 126086.347, 130950.413), stdev = 1971.212
  Confidence interval (99.9%): [125620.786, 126551.907]

c.g.d.j.f.o.jnr.ffi.JNRFFIFileOperations.chmod         0777  thrpt      200  126086.347 ± 465.560  ops/s

# Benchmark mode: Throughput, ops/time
# Benchmark: com.github.dcapwell.java.file.operations.jnr.ffi.JNRFFIFileOperations.chmod
# Parameters: (mode = 0755)

Result: 125174.266 ±(99.9%) 629.872 ops/s [Average]
  Statistics: (min, avg, max) = (118595.301, 125174.266, 129706.006), stdev = 2666.918
  Confidence interval (99.9%): [124544.394, 125804.138]

c.g.d.j.f.o.jnr.ffi.JNRFFIFileOperations.chmod         0755  thrpt      200  125174.266 ± 629.872  ops/s
```

### Results

Numbers are from the param run that has the smallest stdev.

|       | JNR - FFI   | Java 6 Reflection | JNA        | Fork    |
|-------|-------------|-------------------|------------|---------|
| min   | 120,376.705 | 116,393.157       | 70,384.049 | 159.641 |
| avg   | 126,086.347 | 120,633.863       | 74,763.711 | 177.826 |
| max   | 130,950.413 | 126,097.537       | 78,686.495 | 184.391 |
| stdev |   1,971.212 |   2,327.438       |  2,488.244 |   3.631 |

## Oracle JDK 7

### JNA

```
Result: 73730.305 ±(99.9%) 1144.286 ops/s [Average]
  Statistics: (min, avg, max) = (55544.403, 73730.305, 78984.895), stdev = 4844.977
  Confidence interval (99.9%): [72586.019, 74874.591]


# Run complete. Total time: 00:08:05

Benchmark                                 Mode  Samples      Score      Error  Units
c.g.d.j.f.o.j.JNAFileOperations.chmod    thrpt      200  73730.305 ± 1144.286  ops/s
```

### Fork

```
Result: 366.856 ±(99.9%) 1.908 ops/s [Average]
  Statistics: (min, avg, max) = (329.887, 366.856, 378.315), stdev = 8.078
  Confidence interval (99.9%): [364.948, 368.764]


# Run complete. Total time: 00:16:07

Benchmark                                 (mode)   Mode  Samples    Score   Error  Units
c.g.d.j.f.o.f.ForkFileOperations.chmod      0777  thrpt      200  363.973 ± 2.370  ops/s
c.g.d.j.f.o.f.ForkFileOperations.chmod      0755  thrpt      200  366.856 ± 1.908  ops/s
```

### Java 7 NIO

```
Result: 123764.016 ±(99.9%) 2202.005 ops/s [Average]
  Statistics: (min, avg, max) = (83595.279, 123764.016, 132371.924), stdev = 9323.428
  Confidence interval (99.9%): [121562.010, 125966.021]


# Run complete. Total time: 00:08:03

Benchmark                                  Mode  Samples       Score      Error  Units
c.g.d.j.f.o.j.JavaFileOperations.chmod    thrpt      200  123764.016 ± 2202.005  ops/s
```

### Java 6 Reflection

```
Result: 120217.883 ±(99.9%) 1056.684 ops/s [Average]
  Statistics: (min, avg, max) = (95966.313, 120217.883, 126644.254), stdev = 4474.066
  Confidence interval (99.9%): [119161.200, 121274.567]


# Run complete. Total time: 00:16:06

Benchmark                                        (mode)   Mode  Samples       Score      Error  Units
c.g.d.j.f.o.j.JavaReflectFileOperations.chmod      0777  thrpt      200  121866.015 ±  323.911  ops/s
c.g.d.j.f.o.j.JavaReflectFileOperations.chmod      0755  thrpt      200  120217.883 ± 1056.684  ops/s
```

### JNR-FFI

```
Result: 128113.517 ±(99.9%) 1138.167 ops/s [Average]
  Statistics: (min, avg, max) = (99209.585, 128113.517, 135954.357), stdev = 4819.072
  Confidence interval (99.9%): [126975.349, 129251.684]


# Run complete. Total time: 00:16:10

Benchmark                                     (mode)   Mode  Samples       Score      Error  Units
c.g.d.j.f.o.j.f.JNRFFIFileOperations.chmod      0777  thrpt      200  130965.546 ±  551.339  ops/s
c.g.d.j.f.o.j.f.JNRFFIFileOperations.chmod      0755  thrpt      200  128113.517 ± 1138.167  ops/s
```

### Results

|       | JNR - FFI   | Java 7 NIO  | Java 6 Reflection | JNA        | Fork    |
|-------|-------------|-------------|-------------------|------------|---------|
| min   |  99,209.585 |  83,595.279 |  95,966.313       | 55,544.403 | 329.887 |
| avg   | 128,113.517 | 123,764.016 | 120,217.883       | 73,730.305 | 366.856 |
| max   | 135,954.357 | 132,371.924 | 126,644.254       | 78,984.895 | 378.315 |
| stdev |   4,819.072 |   9,323.428 |   4,474.066       |  4,844.977 |   8.078 |

## Oracle JDK 8

### JNA
### Fork
### Java 7 NIO
### Java 6 Reflection
### JNR-FFI

### Results

Numbers are from the param run that has the smallest stdev.
