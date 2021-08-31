package Exercicio3;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RetiraElemento {
    private List<Integer> list;


    public List<Integer> getList() {
        return list;
    }

    public RetiraElemento() {
        list = new LinkedList<>();
    }

    public void addAll(Integer... values){
        Collections.addAll(list, values);
    }
    public void clear(){
        list.clear();
    }
    public void retiraValor(Integer i){
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer value = iterator.next();
            if(value.equals(i)){
                iterator.remove();
            }
        }
    }
}
