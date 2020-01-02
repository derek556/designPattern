package com.iteratorCombine;

import com.iteratorCombine.menuInfo.Menu;
import com.iteratorCombine.menuInfo.MenuComponent;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class CompositeIterator implements Iterator {

    Deque<Iterator<MenuComponent>> deque = new ArrayDeque();//需要迭代的为ArrayDeque，元素为Iterator

    public CompositeIterator(Iterator iterator) {
        deque.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (deque.isEmpty()) {
            return false;
        }else {
            Iterator iterator = deque.peekFirst(); //从队列中获取一个迭代器（先进后出）
            if (!iterator.hasNext()) {//迭代器为空，从队列中移除
                deque.pop();
                return hasNext();//递归调用，获取队列中的下个迭代器
            }else {//当前迭代器还有元素
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator<MenuComponent> iterator = deque.peek();//从队列中获取一个迭代器对象
            MenuComponent menuComponent = iterator.next();//获取迭代器中的一个元素
            if (menuComponent instanceof Menu) {
                deque.push(menuComponent.createIterator());//菜单需要被再次迭代，放入队列中
            }
            return menuComponent;//无论是何种类型的元素，都返回该元素
        }else {
            return null;
        }
    }
}
