class Parent
{
    Parent() {};

    void print()
    {
        System.out.println("This is a Parent");
    }
}

class Child extends Parent
{
    Child(){};

    void print()
    {
        System.out.println("This is a Child");
    }

    void testWork()
    {
        System.out.println("BlaBlaBla try call me");
    }
}

// Example
//        Parent par = new Parent();
//        par.print(); // call Parent
//
//        Child ch = new Child();
//        ch.print(); // call Child
//
//        Parent parCh = new Child();
//        parCh.print(); // call Child
//        parCh.testWork(); // error!
