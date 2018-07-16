package com.gmail.xmrayq.main.homework19.task1;

public interface ListServiceFactory {
    ListService createListservice();
}

class ArrayListFactory implements ListServiceFactory{


    @Override
    public ListService createListservice() {
        return new ArrayListService();
    }
}
class LinkedListFactory implements ListServiceFactory{


    @Override
    public ListService createListservice() {
        return new LinkedListService();
    }
}