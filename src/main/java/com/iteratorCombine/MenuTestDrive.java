package com.iteratorCombine;

import com.iteratorCombine.menuInfo.Menu;
import com.iteratorCombine.menuInfo.MenuComponent;
import com.iteratorCombine.menuInfo.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MenuTestDrive {

    public static void main(String[] args) {

        Menu l1 = new Menu("l1", "L1菜单");
        Menu l2 = new Menu("l2", "L2菜单");
        Menu l3 = new Menu("l3", "L3菜单");

        for (int i = 0; i < 30; i++) {
            int index = i + 1;
            boolean flag = true;
            if (index % 3 == 0) {
                flag = false;
            }
            MenuItem menuItem = new MenuItem("name(" + index + ")",
                    "description(" + index + ")",
                    flag,
                    index * 10);
            if (index < 10) {
                l1.add(menuItem);
            } else if (index >= 10 && index < 20) {
                l2.add(menuItem);
            }else {
                l3.add(menuItem);
            }
        }

        l1.add(l2);
        l2.add(l3);

        Iterator<MenuComponent> iterator = l1.createIterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            if (!menuComponent.isVegetarian()) {//菜单对象如果不实现isVegetarian（）方法，会调用父类方法，抛出异常
                menuComponent.print();
            }
        }





    }

}
