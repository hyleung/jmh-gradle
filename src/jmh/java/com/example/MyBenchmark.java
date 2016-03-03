package com.example;

import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import java.util.concurrent.TimeUnit;

/**
 * Created by hyleung on 2016-03-02.
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class MyBenchmark {

    @Benchmark
    public void myMethod() {

    }

}
