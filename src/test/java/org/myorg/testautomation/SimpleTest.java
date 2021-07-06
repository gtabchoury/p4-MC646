package org.myorg.testautomation;

import org.apache.commons.collections4.list.FixedSizeList;
import org.graphwalker.core.condition.EdgeCoverage;
import org.graphwalker.core.condition.ReachedVertex;
import org.graphwalker.core.condition.TimeDuration;
import org.graphwalker.core.generator.AStarPath;
import org.graphwalker.core.generator.RandomPath;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.core.model.Edge;
import org.graphwalker.java.test.TestBuilder;
import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SimpleTest extends ExecutionContext implements FixedSizeListInterface {
    public final static Path MODEL_PATH = Paths.get("org/myorg/testautomation/projeto4.json");

    private FixedSizeList<Integer> fixedSizeList;

    @Override
    public void e_fixed_size_list() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        fixedSizeList = FixedSizeList.fixedSizeList(list);
    }
    @Override
    public void e_remove() {
        try {fixedSizeList.remove(0);}catch (UnsupportedOperationException e){}
    }
    @Override
    public void e_Reset() {
        //
    }
    @Override
    public void e_iterator() {
        fixedSizeList.iterator();
    }
    @Override
    public void e_get() {
        fixedSizeList.get(0);
    }
    @Override
    public void e_add_all() {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        try {fixedSizeList.addAll(list);}catch (UnsupportedOperationException e){}
    }
    @Override
    public void e_retain_all() {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        try {fixedSizeList.retainAll(list);}catch (UnsupportedOperationException e){}
    }
    @Override
    public void e_set() {
        fixedSizeList.set(0, 10);
    }
    @Override
    public void e_index_of() {
        fixedSizeList.indexOf(1);
    }
    @Override
    public void e_max_size() {
        fixedSizeList.maxSize();
    }
    @Override
    public void e_remove_if() {
        //
    }
    @Override
    public void e_list_iterator() {
        fixedSizeList.listIterator();
    }
    @Override
    public void e_is_full() {
        fixedSizeList.isFull();
    }
    @Override
    public void e_clear() {
        try {fixedSizeList.clear();}catch (UnsupportedOperationException e){}
    }
    @Override
    public void e_add() {
        try {fixedSizeList.add(6);}catch (UnsupportedOperationException e){}
    }
    @Override
    public void e_last_index_of() {
        fixedSizeList.lastIndexOf(1);
    }
    @Override
    public void e_remove_all() {
        try {fixedSizeList.removeAll(fixedSizeList);}catch (UnsupportedOperationException e){}
    }
    @Override
    public void e_sublist() {
        fixedSizeList.subList(0, 1);
    }

    @Override
    public void v_Start() {
        //System.out.println("v_Start: Insert test code here!");
    }
    @Override
    public void v_full_size_list() {
        //System.out.println("v_full_size_list: Insert test code here!");
    }
    @Override
    public void v_Unsupported() {
        //System.out.println("v_Unsupported: Insert test code here!");
    }

    @Test
    public void runSmokeTest() {
        System.out.println(new TestBuilder()
                .addContext(new SimpleTest().setNextElement(new Edge().setName("e_fixed_size_list").build()),
                        MODEL_PATH,
                        new AStarPath(new ReachedVertex("v_full_size_list")))
                .execute().getResultsAsString());
        System.out.println(new TestBuilder()
                .addContext(new SimpleTest().setNextElement(new Edge().setName("e_fixed_size_list").build()),
                        MODEL_PATH,
                        new AStarPath(new ReachedVertex("v_Unsupported")))
                .execute().getResultsAsString());
    }

    @Test
    public void runFunctionalTest() {
        System.out.println(new TestBuilder()
                .addContext(new SimpleTest().setNextElement(new Edge().setName("e_fixed_size_list").build()),
                        MODEL_PATH,
                        new RandomPath(new EdgeCoverage(100)))
                .execute().getResultsAsString());
    }

    @Test
    public void runStabilityTest() {
        System.out.println(new TestBuilder()
                .addContext(new SimpleTest().setNextElement(new Edge().setName("e_fixed_size_list").build()),
                        MODEL_PATH,
                        new RandomPath(new TimeDuration(30, TimeUnit.SECONDS)))
                .execute().getResultsAsString());
    }
}
