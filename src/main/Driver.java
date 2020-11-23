


import com.mycompany.studentregistrationsystem_assignment.Student;
import com.mycompany.studentregistrationsystem_assignment.Module;
import com.mycompany.studentregistrationsystem_assignment.Course;

        
import org.joda.time.DateTime;

/**
 *
 * @author Mary Adedeji
 */
public class Driver {
   
        public static void main(String[] args) {
             
        DateTime todayDate = new DateTime(2020, 11, 21, 0, 0);
        
        Student student = new Student("Monica",new DateTime(1996,9,12,0,0),"Engineering", 123456);
        Student student1 = new Student("Victoria",new DateTime(1997,8,6,0,0),"Medicine", 1345678);
        Student student2 = new Student("Adam",new DateTime (1996, 7, 14, 0,0),"Nursing", 1456789);
        Student student3 = new Student("John",new DateTime (1995,10,19,0,0), "Accounting", 1567890);
        
        Course course  = new Course("Engineering", new DateTime(2020,10,9,0,0),new DateTime(2021,6,4,0,0));
        Course course1 = new Course("Medicine", new DateTime(2020,10,9,0,0),new DateTime(2021,6,4,0,0));
        Course course2 = new Course("Nursing", new DateTime(2020,10,9,0,0),new DateTime(2021,6,4,0,0));
        Course course3 = new Course("Accounting", new DateTime(2020,10,9,0,0),new DateTime(2021,6,4,0,0));
        
        
        Module module =  new Module("Programming","EE321");
        Module module1 = new Module("Anatomy","MD123");
        Module module2 = new Module("Auditing","NS456");
        Module module3 = new Module("Chemistry","AC789");
        
        
        course.addModules(module);
        course1.addModules(module1);
        course2.addModules(module2);
        course3.addModules(module3);
        
        
        module.addModule(student);
        module1.addModule(student1);
        module2.addModule(student2);
        module3.addModule(student3);
        
       System.out.println("------Course List-------");
       
       System.out.println(course.getCourseName());
       System.out.println(course1.getCourseName());
       System.out.println(course2.getCourseName());
       System.out.println(course3.getCourseName());
       
      
       
       
       System.out.println("------Module List-------");
       
       System.out.println(module.getModuleName());
       System.out.println(module1.getModuleName());
       System.out.println(module2.getModuleName());
       System.out.println(module3.getModuleName());
       
       
       System.out.println("------Usernames-------");
       
       
       System.out.println(student.getUserName(todayDate));
       System.out.println(student1.getUserName(todayDate));
       System.out.println(student2.getUserName(todayDate));
       System.out.println(student3.getUserName(todayDate));
       
       System.out.println("------Student Details-------");
       System.out.println(student.toString());
       System.out.println(student1.toString());
       System.out.println(student2.toString());
       System.out.println(student3.toString());
       
       
       
      
        }
        
    
}
