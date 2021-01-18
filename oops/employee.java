package oops;

class employee1 {
    int salary;
    String name;
    String post;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int emp_salary) {
        salary = emp_salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String emp_name) {
        name = emp_name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String emp_post) {
        post = emp_post;
    }
}

public class employee {
    public static void main(String[] args) {
        //insantiating employee
        employee1 hitesh = new employee1();
        //setiing attributes
        hitesh.setName("Hitesh Gupta");
        hitesh.setPost("Full Stack Developer");
        hitesh.setSalary(50000);
        //getting attributes
        System.err.println("Details of Employee");
        System.out.println("----------------------------------");
        System.out.println(hitesh.getName());
        System.out.println(hitesh.getPost());
        System.out.println(hitesh.getSalary());
        System.out.println("----------------------------------");
    }
}
