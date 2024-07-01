package com.ohgiraffers.section01.xmlmapper;

import com.ohgiraffers.common.CategoryAndMenuDTO;
import com.ohgiraffers.common.MenuAndCategoryDTO;
import com.ohgiraffers.common.MenuDTO;


import java.util.List;

public interface ElementTestMapper {

    List<String> selectCacheTest();

    List<MenuDTO> selectResultMapTest();

    List<MenuDTO> selectResultMapConstructorTest();

    List<CategoryAndMenuDTO> selectResultMapCollectionTest();

    List<MenuAndCategoryDTO> selectResultMapAssociationTest();

    List<MenuDTO> selectSqlTest();

    int insertMenuTest(MenuDTO menuDTO);

    int insertNewCategory(MenuAndCategoryDTO menuAndCategory);

    int insertNewMenu(MenuAndCategoryDTO menuAndCategory);
}
