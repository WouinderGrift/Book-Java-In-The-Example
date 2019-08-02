package CreateSelfDataStucture;

/**
 * Массив работающий по принципу: последний зашел - первый вышел
 * Пример стека для любого типа объектов
 */
public class SelfStack {
    private Object[] theArray;
    private int topOfStack;
    static final int DEFAULT_CAPACITY = 10;

    //Установка объема стека по умолчанию
    public SelfStack(){
        theArray = new Object[DEFAULT_CAPACITY];
        topOfStack = -1;
    }

    //Проверка стека на пустоту
    boolean isEmpty(){
        return topOfStack == -1;
    }

    //Возврат последнего элемента стека не изменяя его
    Object top(){
        if(isEmpty()){
            return null;
        }
        return theArray[topOfStack];
    }

    //Извлекает элемент из стека
    void pop(){
        if(isEmpty()){
            return;
        }
        topOfStack--;
    }

    // @return Извлекает и возвращает элемент с вершины стека
    Object topAndPop(){
        if(isEmpty()){
            return null;
        }
        return theArray[topOfStack--];
    }

    //Добавляет новый элемент в стек, где @param х - добавляемый элемент
    public void push(Object x){
        //Если стек переполнен, то автоматически удвоить размер
        if(topOfStack + 1 == theArray.length){
            doubleArray();      //метод объявлени ниже
        }
        theArray[++topOfStack] = x;
    }

    //Очистка стека
    void makeEmpty(){
        topOfStack = -1;
    }

    //Внутренний метод увеличения размера стека
    private  void doubleArray(){
        Object[] newArray;

        newArray = new Object[theArray.length * 2];

        for(int i=0; i < theArray.length; i++){
            System.arraycopy(theArray, 0, newArray, 0, theArray.length);
        }
        theArray = newArray;
    }
}
