package ClasesInterface;
import Interfaces.IntList;
import java.util.*;

public class IntArrayList implements IntList {

    private ArrayList <Integer> list;

    public IntArrayList(ArrayList<Integer> list) {
        int capacidad = 10;
        Integer[] arrayVacio = new Integer[capacidad];
        Arrays.fill(arrayVacio, null);
        ArrayList<Integer> listaVacia = new ArrayList<Integer>(Arrays.asList(arrayVacio));

        while(listaVacia.size()<list.size()){
            capacidad = (int)Math.ceil(capacidad * 1.5);
            Integer[] arrayVacio2 = new Integer[capacidad];
            Arrays.fill(arrayVacio2, null);
            ArrayList<Integer> listaVacia2 = new ArrayList<Integer>(Arrays.asList(arrayVacio2));
            listaVacia = listaVacia2;

        }
        for(int i = 0; i < list.size(); i++){
            listaVacia.set(i, list.get(i));
        }
        this.list = listaVacia;
    }
    @Override
    public void add(int addNumber) {
        int nuevaCapacidad;
        if(list.contains(null)){
            int indice = list.indexOf(null);
            list.set(indice,addNumber);
        }else{
            int posicionAdd = list.size();
            nuevaCapacidad = (int)Math.ceil(list.size() * 1.5);
            for(int i = list.size();i< nuevaCapacidad;i++){
                list.add(i, null);
            }
            list.set(posicionAdd,addNumber);
        }
    }

    @Override
    public int get(int id) {
        return list.get(id);
    }

    //setters y getters

    public ArrayList<Integer> getList() {
        return list;
    }

    @Override
    public String toString() {
        return list + " --> Capacidad: " + list.size();
    }
}
