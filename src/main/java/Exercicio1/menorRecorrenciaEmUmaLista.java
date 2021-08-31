package Exercicio1;

import java.util.*;

public class menorRecorrenciaEmUmaLista {
    public int lowestRecurrenceInArrayInteger(Integer[] values){
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, values);
        return lowestRecurrenceInListInteger(list);
    }

    public int lowestRecurrenceInListInteger(List<Integer> values){
        List<Integer> listIndex;

        listIndex = listIndexFirstRecorrencesToListValues(values);
        int min = valueMinInIntegerList(listIndex);

        return min == -1 ? -1 : values.get(min);
    }
    private  List<Integer> listIndexFirstRecorrencesToListValues(List<Integer> values){
        List<Integer> listIndex = new ArrayList<>();
        Set<Integer> valuesVisited = new HashSet<>();

        for(int i = 0; i<values.size(); i++ ){
            int value = values.get(i);
            if(!valuesVisited.contains(value)) {
                valuesVisited.add(values.get(i));
                int indexRecorrence = firstRecorrence(i, values);
                if (indexRecorrence != -1)
                    listIndex.add(indexRecorrence);
            }
        }

        return listIndex;
    }
    private int firstRecorrence(int i, List<Integer> values){
        int value = values.get(i);
        int first = -1;

        for(int j = i+1; j<values.size();j++){
            if(value == values.get(j)){
                first = j;
                break;
            }
        }

        return first;
    }

    private int valueMinInIntegerList(List<Integer> listaIndex){
        return listaIndex.size()>0 ? Collections.min(listaIndex) : -1;
    }
}
