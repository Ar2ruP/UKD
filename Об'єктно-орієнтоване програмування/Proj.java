class Student {
    String Name;

    public Student(String name) {
        this.Name = name;
    }
}

class Group {
    Student[] arrayStudent;
    int indexStudent = 0;

    public void addStudent(Student s) {
        arrayStudent[indexStudent++] = s;
    }
}

    public Group(int size) {
        arrayStudent = new Student[size];
    }
}

public class Main {
}


/* класс студент(name, конструктор для name)
    клас група(arreySrudents, addStudent,конструктор розмір групи)*/
