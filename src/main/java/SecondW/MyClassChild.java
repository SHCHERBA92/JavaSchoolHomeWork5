package SecondW;

public class MyClassChild extends MyClassParent{
    private Integer ChildInt1 = 1;
    private Integer ChildInt2 = 2;
    private Integer ChildInt3 = 3;

    private void SumChildInt1()
    {
        System.out.println(this.ChildInt1+1);
    }

    private void SumChildInt2()
    {
        System.out.println(this.ChildInt2+2);
    }

    private void SumChildInt3()
    {
        System.out.println(this.ChildInt3+3);
    }
}
