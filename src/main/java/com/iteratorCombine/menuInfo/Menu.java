package com.iteratorCombine.menuInfo;

import com.iteratorCombine.CompositeIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{

    ArrayList<MenuComponent> menuComponents = new ArrayList();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponent.remove(menuComponent);
    }

    public MenuComponent getchild(int i) {
        return menuComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return false;
    }

    public void print() {
        System.out.println(getName()+"  ----    "+getDescription());
        Iterator iterable = menuComponents.iterator();
        while (iterable.hasNext()) {
            MenuComponent component = (MenuComponent) iterable.next();
            component.print();
        }
    }

    public Iterator createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }

}
