package com.example;

import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.State;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Scope;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import org.openjdk.jmh.infra.Blackhole;
import java.util.Map;

/**
 * Created by hyleung on 2016-03-02.
 */
@BenchmarkMode(Mode.AverageTime)
@State(Scope.Benchmark)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class MyBenchmark {
    private ObjectMapper mapper = new ObjectMapper();
    @Benchmark
    public void serializeMapToJson(Blackhole blackhole) throws Exception {
        Map<String,String> map = new HashMap<String,String>();
        map.put("key", "value");
        String jsonResult = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
        blackhole.consume(jsonResult);
    }

}
