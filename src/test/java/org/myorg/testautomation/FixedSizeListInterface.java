package org.myorg.testautomation;

import org.graphwalker.java.annotation.Edge;
import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;

@Model(file = "org/myorg/testautomation/projeto4.json")
public interface FixedSizeListInterface {

    @Edge()
    void e_fixed_size_list();
    @Edge()
    void e_remove();
    @Edge()
    void e_Reset();
    @Edge()
    void e_iterator();
    @Edge()
    void e_get();
    @Edge()
    void e_add_all();
    @Edge()
    void e_retain_all();
    @Edge()
    void e_set();
    @Edge()
    void e_index_of();
    @Edge()
    void e_max_size();
    @Edge()
    void e_remove_if();
    @Edge()
    void e_list_iterator();
    @Edge()
    void e_is_full();
    @Edge()
    void e_clear();
    @Edge()
    void e_add();
    @Edge()
    void e_last_index_of();
    @Edge()
    void e_remove_all();
    @Edge()
    void e_sublist();


    @Vertex()
    void v_Start();
    @Vertex()
    void v_full_size_list();
    @Vertex()
    void v_Unsupported();
}
