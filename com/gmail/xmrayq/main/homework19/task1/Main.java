package com.gmail.xmrayq.main.homework19.task1;

public class Main {

    public static void main(String[] args) {

        ListServiceFactory listServiceFactory = createListServiceFactory(EnumList.LINKED_LIST);
        ListService listService = listServiceFactory.createListservice();
        listService.writeCollection();

    }

    static ListServiceFactory createListServiceFactory(Object createList) {
        if (createList == EnumList.ARRAY_LIST) {
            return new ArrayListFactory();
        } else if (createList == EnumList.LINKED_LIST) {
            return new LinkedListFactory();

        } else {
            throw new RuntimeException(" No Array Collection");
        }
    }
}

enum EnumList {

    ARRAY_LIST,
    LINKED_LIST;

}
