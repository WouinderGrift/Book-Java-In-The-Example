package AnotherViewArray;

/**
 * Очередь - массив с принципом работ: первый вошел - первый вышел
 */
public class Queue {
    private Object que[];
    private int putIndex;   //входной индекс
    private int getIndex;   //выходной индекс

    //Создание пустой очереди
    Queue(int size){
        //резервирование памяти
        que = new Object[size + 1];
        getIndex = putIndex = 0;
    }

    //Создание очереди из другой очереди
    Queue(Queue NewQue){
        putIndex = NewQue.putIndex;
        getIndex = NewQue.getIndex;
        que = new Object[NewQue.que.length];

        //копирование элементов из предыдущей очереди
        System.arraycopy(NewQue.que, 0, que, 0 , NewQue.que.length);
    }

    //Создание очереди из массива
    Queue(Object arrQue[]){
        putIndex = 0;
        getIndex = 0;
        que = new Object[arrQue.length + 1];

        //Копирование элементов массива в очередь
        for(int i = 0; i < arrQue.length; i++){
            put(arrQue[i]);     //метод будет позже
        }
    }

    //Проверка переполнение очереди
    boolean isFull(){
        return (putIndex == (que.length - 1));
    }

    //Проверка пучтоты очереди
    boolean isEmpty(){
        return (getIndex == putIndex);
    }

    //Добавление в очередь
    void put(Object obj) throws IllegalStateException{
        if(isFull()){
            throw new IllegalStateException("Очередь переполнена");
        }

        putIndex++;
        que[putIndex] = obj;
    }

    //Извлечение объекта из очереди
    Object get() throws IllegalStateException{
        if(isEmpty()){
            throw new IllegalStateException("Очередь пуста");
        }

        getIndex++;
        return que[getIndex];
    }

}
