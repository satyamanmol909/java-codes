class student{
    String name;
    int roll;
    public void output()
    {
        System.out.println("NAME="+this.name+"\nROLL="+this.roll);
    }
}
public class student_class {
    public static void main(String [] args)
    {
        student st=new student();
        st.name="satyam anmol";
        st.roll=1;
        st.output();
    }
}
