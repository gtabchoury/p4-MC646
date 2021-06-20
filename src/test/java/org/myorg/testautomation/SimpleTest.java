package org.myorg.testautomation;

import org.graphwalker.core.condition.EdgeCoverage;
import org.graphwalker.core.generator.RandomPath;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.core.model.Edge;
import org.graphwalker.java.test.TestBuilder;
import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class SimpleTest extends ExecutionContext implements FixedSizeListInterface {
    public final static Path MODEL_PATH = Paths.get("org/myorg/testautomation/projeto4.json");

    @Override
    public void e_fixed_size_list() {
        System.out.println("e_fixed_size_list: Insert test code here!");
    }
    @Override
    public void e_remove() {
        System.out.println("e_remove: Insert test code here!");
    }
    @Override
    public void e_Reset() {
        System.out.println("e_Reset: Insert test code here!");
    }
    @Override
    public void e_iterator() {
        System.out.println("e_iterator: Insert test code here!");
    }
    @Override
    public void e_get() {
        System.out.println("e_get: Insert test code here!");
    }
    @Override
    public void e_add_all() {
        System.out.println("e_add_all: Insert test code here!");
    }
    @Override
    public void e_retain_all() {
        System.out.println("e_retain_all: Insert test code here!");
    }
    @Override
    public void e_set() {
        System.out.println("e_set: Insert test code here!");
    }
    @Override
    public void e_index_of() {
        System.out.println("e_index_of: Insert test code here!");
    }
    @Override
    public void e_max_size() {
        System.out.println("e_max_size: Insert test code here!");
    }
    @Override
    public void e_remove_if() {
        System.out.println("e_remove_if: Insert test code here!");
    }
    @Override
    public void e_list_iterator() {
        System.out.println("e_list_iterator: Insert test code here!");
    }
    @Override
    public void e_is_full() {
        System.out.println("e_is_full: Insert test code here!");
    }
    @Override
    public void e_clear() {
        System.out.println("e_clear: Insert test code here!");
    }
    @Override
    public void e_add() {
        System.out.println("e_add: Insert test code here!");
    }
    @Override
    public void e_last_index_of() {
        System.out.println("e_last_index_of: Insert test code here!");
    }
    @Override
    public void e_remove_all() {
        System.out.println("e_remove_all: Insert test code here!");
    }
    @Override
    public void e_sublist() {
        System.out.println("e_sublist: Insert test code here!");
    }

    @Override
    public void v_Start() {
        System.out.println("v_Start: Insert test code here!");
    }
    @Override
    public void v_full_size_list() {
        System.out.println("v_full_size_list: Insert test code here!");
    }
    @Override
    public void v_Unsupported() {
        System.out.println("v_Unsupported: Insert test code here!");
    }


    @Test
    public void runSmokeTest() {
        new TestBuilder()
                .addContext(new SimpleTest().setNextElement(new Edge().setName("e_fixed_size_list").build()),
                        MODEL_PATH,
                        new RandomPath(new EdgeCoverage(100)))
                .execute();
    }

    @Test
    public void runFunctionalTest() {
        new TestBuilder()
                .addContext(new SimpleTest().setNextElement(new Edge().setName("e_fixed_size_list").build()),
                        MODEL_PATH,
                        new RandomPath(new EdgeCoverage(100)))
                .execute();
    }

    @Test
    public void runStabilityTest() {
        new TestBuilder()
                .addContext(new SimpleTest().setNextElement(new Edge().setName("e_fixed_size_list").build()),
                        MODEL_PATH,
                        new RandomPath(new EdgeCoverage(100)))
                .execute();
    }
}
