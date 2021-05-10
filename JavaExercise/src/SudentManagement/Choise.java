package SudentManagement;

/**
 *
 * @author Admin
 */
public class Choise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StudentList sl = new StudentList();
        while (true) {
            //Show menu option
            Manager.menu();
            int choice = Validation.checkInputIntLimit(1, 5);
            switch (choice) {
                case 1:
                    sl.createStudent();
                    break;
                case 2:
                    sl.findAndSort();
                    break;
                case 3:
                    sl.updateOrDelete();
                    break;
                case 4:
                    sl.report();
                    break;
                case 5:
                    return;
            }

        }
    }
}
