import java.util.Arrays;
public class StudentManagement {
    int pos = 0;
    int MAX = 100;
    int n = MAX - 1;
    Student[] students = new Student[MAX];
    public void addStudent(Student newStudent){
        for(int i = n; i > pos; i--){
            students[i] = students[i-1];
        }
        students[pos] = newStudent;
        pos++;
    }
    public String studentsByGroups(){
        String[] lop = new String[100];
        String danhsach = "";
        if(students[0] != null) {
            lop[0] = students[0].getGroup();
            String templop = students[0].getGroup();
            int tongsolop = 1;
            int lopindex = 1;
            for (int j = 1; j < pos; j++) {
                if (templop != students[j].getGroup()) {
                    tongsolop += 1;
                    lop[lopindex] = students[j].getGroup();
                    lopindex += 1;
                    templop = students[j].getGroup();
                }
            }
            for(int i = 0; i < tongsolop;i++){
                danhsach = danhsach + lop[i]+"\n";
                for(int j = 0; j < pos; j++) {
                    if (students[j].getGroup() == lop[i]){
                        danhsach = danhsach + students[j].getInfo()+"\n";
                    }
                }
            }
            //System.out.println(tongsolop);
        }
        return danhsach;
    }
    public void removeStudent(String id){
        int delete_pos = 0;
        for(int i = 0; i < pos; i++){
            if(students[i].getId() == id){
                //System.out.println("ok");
                for(int j = delete_pos; j < pos; j++){
                    students[j] = students[j+1];
                }
                break;
            }
            delete_pos+=1;
        }
        pos--;
    }
    public boolean sameGroup(Student s1, Student s2){
        if (s1.getGroup() == s2.getGroup()){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
    }
}
