import java.util.ArrayList;
import java.util.Arrays;

class Queue {
    public ArrayList<Integer> ArrayList = new ArrayList<Integer>(Arrays.asList(1, 5));
    int id = 0;
    public ArrayList<Integer> ArrayList2 = new ArrayList<>();

    public int get(int id) {
        ArrayList.get(id);
        System.out.println("Під індексом " + id + " знаходиться елемент " + ArrayList.get(id));
        return ArrayList.get(id);

    }

    public void size() {
        int SizeOfArray = 0;
        for (int id = 0; id < ArrayList.size(); id++) {
            SizeOfArray++;
        }
        System.out.println("Черга складається з " + SizeOfArray + " елементів.");
    }

    public boolean empty() {
        if (ArrayList.isEmpty()) {
            System.out.println("Черга пуста");
            return true;
        } else {
            return false;
        }
    }

    public void max_min() {
        int Max = -999;
        int Min = 999;
        int MaxID = 0;
        int MinID = 0;
        for (int id = 0; id < ArrayList.size(); id++) {
            if (ArrayList.get(id) < Min) {
                Min = ArrayList.get(id);
                MinID = id + 1;
            }
            if (ArrayList.get(id) > Max) {
                Max = ArrayList.get(id);
                MaxID = id + 1;
            }
        }
        System.out.println("Мінімальне значення " + Min + " під номером " + MinID);
        System.out.println("Максимальне значення " + Max + " під номером " + MaxID);
    }

    public void accumulate() {
        int sum = 0;
        for (int id = 0; id < ArrayList.size(); id++) {
            sum += ArrayList.get(id);
        }
        System.out.println("Сума всіх елементів дорівнює " + sum);
    }

    public void find(int FindMe) {
        boolean SayTrue=false;
        for (int id = 0; id < ArrayList.size(); id++) {
            if (FindMe == ArrayList.get(id)) {
                SayTrue = true;
            } else {
                SayTrue = false;

            }
        }
            if (SayTrue == true) {
                System.out.println("Наданий елементі існує у черзі");
            } else {
                System.out.println("Наданого елементу не існує у черзі");
            }


    }

    public Integer front() {
        int id = 0;
        do {
            id++;
        } while (ArrayList.get(id) == null);
        return ArrayList.get(id);

    }

    public Integer back() {
        return ArrayList.lastIndexOf(ArrayList);
    }


    public int push(int element) {
        int i;
        int maxID = 0;
        for (i = 0; i < ArrayList.size(); i++) {

            maxID = i;
        }
        ArrayList.add(maxID + 1, element);
        return ArrayList.size();
    }

    public boolean equals() {
        if (ArrayList == ArrayList2) {
            System.out.println("Черги рівні");
            return true;
        } else {
            System.out.println("Черги не є рівними");
            return false;
        }
    }

    public void pop() {
        ArrayList.remove(0);
    }


    public void for_each() {

        for (int OutArrayList : ArrayList) {
            System.out.println(OutArrayList);
        }
    }


}
