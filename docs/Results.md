# Results

These are the results for running across the different ways to do chmod.

All results where run against Oracle Java 7 

Hardware:
OS  : OS X 10.9.2
CPU : 2.3 GHz Intel Core i7
Mem : 16 GB

## JNA

```
Result: 73730.305 ±(99.9%) 1144.286 ops/s [Average]
  Statistics: (min, avg, max) = (55544.403, 73730.305, 78984.895), stdev = 4844.977
  Confidence interval (99.9%): [72586.019, 74874.591]


# Run complete. Total time: 00:08:05

Benchmark                                 Mode  Samples      Score      Error  Units
c.g.d.j.f.o.j.JNAFileOperations.chmod    thrpt      200  73730.305 ± 1144.286  ops/s
```

## Fork

```
Result: 366.856 ±(99.9%) 1.908 ops/s [Average]
  Statistics: (min, avg, max) = (329.887, 366.856, 378.315), stdev = 8.078
  Confidence interval (99.9%): [364.948, 368.764]


# Run complete. Total time: 00:16:07

Benchmark                                 (mode)   Mode  Samples    Score   Error  Units
c.g.d.j.f.o.f.ForkFileOperations.chmod      0777  thrpt      200  363.973 ± 2.370  ops/s
c.g.d.j.f.o.f.ForkFileOperations.chmod      0755  thrpt      200  366.856 ± 1.908  ops/s
```

## Java 7 NIO

```
Result: 123764.016 ±(99.9%) 2202.005 ops/s [Average]
  Statistics: (min, avg, max) = (83595.279, 123764.016, 132371.924), stdev = 9323.428
  Confidence interval (99.9%): [121562.010, 125966.021]


# Run complete. Total time: 00:08:03

Benchmark                                  Mode  Samples       Score      Error  Units
c.g.d.j.f.o.j.JavaFileOperations.chmod    thrpt      200  123764.016 ± 2202.005  ops/s
```

## Java 6 Reflection

```
Result: 120217.883 ±(99.9%) 1056.684 ops/s [Average]
  Statistics: (min, avg, max) = (95966.313, 120217.883, 126644.254), stdev = 4474.066
  Confidence interval (99.9%): [119161.200, 121274.567]


# Run complete. Total time: 00:16:06

Benchmark                                        (mode)   Mode  Samples       Score      Error  Units
c.g.d.j.f.o.j.JavaReflectFileOperations.chmod      0777  thrpt      200  121866.015 ±  323.911  ops/s
c.g.d.j.f.o.j.JavaReflectFileOperations.chmod      0755  thrpt      200  120217.883 ± 1056.684  ops/s
```

## JNR-FFI

```
Result: 128113.517 ±(99.9%) 1138.167 ops/s [Average]
  Statistics: (min, avg, max) = (99209.585, 128113.517, 135954.357), stdev = 4819.072
  Confidence interval (99.9%): [126975.349, 129251.684]


# Run complete. Total time: 00:16:10

Benchmark                                     (mode)   Mode  Samples       Score      Error  Units
c.g.d.j.f.o.j.f.JNRFFIFileOperations.chmod      0777  thrpt      200  130965.546 ±  551.339  ops/s
c.g.d.j.f.o.j.f.JNRFFIFileOperations.chmod      0755  thrpt      200  128113.517 ± 1138.167  ops/s
```

# Results

|       | JNR - FFI   | Java 7 NIO  | Java 6 Reflection | JNA        | Fork    |
|-------|-------------|-------------|-------------------|------------|---------|
| min   |  99,209.585 |  83,595.279 |  95,966.313       | 55,544.403 | 329.887 |
| avg   | 128,113.517 | 123,764.016 | 120,217.883       | 73,730.305 | 366.856 |
| max   | 135,954.357 | 132,371.924 | 126,644.254       | 78,984.895 | 378.315 |
| stdev |   4,819.072 |   9,323.428 |   4,474.066       |  4,844.977 |   8.078 |
