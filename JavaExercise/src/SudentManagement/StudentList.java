package SudentManagement;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * Nguyễn Xuân Thành
 */
public class StudentList {

    private ArrayList<Student> ls = new ArrayList<Student>();

    public StudentList() {
        ls.add(new Student("111", "Xuân Thành", "3", "Java"));
        ls.add(new Student("222", "Quang Bình", "2", ".Net"));
    }

    //Allow user create new student
    public void createStudent() {
        //loop until user input not duplicate
        while (true) {
            System.out.print("Enter id: ");
            String id = Validation.checkInputString();
            System.out.print("Enter name student: ");
            String name = Validation.checkInputString();
            //Check id exit
            if (Validation.checkIdExist(ls, id) != -1) {
                System.err.println("Id has exist student. Pleas re-input.");
                if (!Validation.checkInputYN()) {
                    return;
                }
            }
            System.out.print("Enter semester: ");
            String semester = Validation.checkInputString();
            System.out.print("Enter name course: ");
            String course = Validation.checkInputCourse();
            //check student exist or not
            ls.add(new Student(id, name, semester, course));
            System.out.println("Add student success.");
            System.out.print("Do you want to continue : y/n: ");
            if (!Validation.checkInputYN()) {
                return;
            }
        }
    }

    ////Allow user create find and sort
    public void findAndSort() {
        //check list empty
        if (ls.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        ArrayList<Student> listStudentFindByName = new ArrayList<>();
        System.out.print("Enter name to search: ");
        String name = Validation.checkInputString();
        //this code is used to find the student has name that contains ""
        for (Student student : ls) {
            //check student have name contains input
            if (student.getStudentName().contains(name)) {//
                listStudentFindByName.add(student);
            }
        }
        if (listStudentFindByName.isEmpty()) {
            System.err.println("Not exist.");
        } else {
            Collections.sort(listStudentFindByName);
            System.out.printf("%-15s%-15s%-15s\n", "Student name", "semester", "Course Name");
            //loop from first to last element of list student
            for (Student student : listStudentFindByName) {
                student.print();
            }
        }
    }
    //Update and Delete

    public void updateOrDelete() {
        if (ls.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        System.out.print("Enter id to update/delete: ");
        String id = Validation.checkInputString();
        int index = Validation.checkIdExist(ls, id);
        if (index == -1) {
            System.err.println("Not found student.");
            return;
        } else {

            System.out.print("Do you want to update (U) or delete (D) student: ");
            //check user want to update or delete
            if (Validation.checkInputUD() == 'U') {
                System.out.print("Enter name student: ");
                String name = Validation.checkInputString();
                System.out.print("Enter semester: ");
                String semester = Validation.checkInputString();
                System.out.print("Enter name course: ");
                String course = Validation.checkInputCourse();
                ls.get(index).setStudentName(name);
                ls.get(index).setSemester(semester);
                ls.get(index).setCourseName(course);
                System.err.println("Update success.");
                return;
            } else {
                ls.remove(index);
                System.err.println("Delete success.");
                return;
            }
        }
    }
    //Report

    public void report() {
        Collections.sort(ls);
        for (Student l : ls) {
            System.out.println(l);
        }
    }

    public ArrayList<Student> getLs() {
        return ls;
    }

    public void setLs(ArrayList<Student> ls) {
        this.ls = ls;
    }

}
