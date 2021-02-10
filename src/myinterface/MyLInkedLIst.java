package myinterface;

public interface MyLInkedLIst {
    void addFirst(int element);
    boolean isEmpty();
    int size();
    void addLast(int element);
    void addLastWithOutUsingTail(int element);
    void traverse();
    void addAfterGivenNode(int givenElement ,int element);
    int removeFirst();
    int removeLast();
    int removeGivenNode(int givenElement);
    boolean search(int element);

}
