import java.util.*;

public class NumberOfMoves {

    public static void main(String[] args) {

        List<Integer> arr1= null;
        List<Integer> arr2= null;
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr2.add(2);
        arr1.add(4);
        System.out.print(Calculate(arr1, arr2));
    }

    public static List<Integer> Calculate(List<Integer> arr1, List<Integer> arr2){
        List<Integer> result = new List<Integer>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean con  tains(Object o) {
                return false;
            }

            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Integer integer) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Integer get(int index) {
                return null;
            }

            @Override
            public Integer set(int index, Integer element) {
                return null;
            }

            @Override
            public void add(int index, Integer element) {

            }

            @Override
            public Integer remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Integer> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Integer> listIterator(int index) {
                return null;
            }

            @Override
            public List<Integer> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        int cal = 0;
        int index = 0;
        int temp = arr2.get(index);

        for(int i=0 ; i<arr1.size(); ){
            if(temp >= arr1.get(i)){
                cal++;
                i++;
            }else {
                result.add(index,cal);
                index++;
                temp = arr2.get(index);
            }
        }
        result.add(index,cal);
        return result;
    }
}
