package com.qa.Categories;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import com.qa.Categories.TestCat1;
import com.qa.Categories.TestCat2;
import com.qa.Categories.TestCat3;
import com.qa.Categories.TestCat4;
import com.qa.Categories.TestCat5;


@RunWith(Categories.class)
@SuiteClasses({TestCat1.class, TestCat2.class, TestCat3.class, TestCat4.class, TestCat5.class})
public class CatRunner {

}