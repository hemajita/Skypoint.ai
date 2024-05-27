//How to count occurrences of each character in a string in Java?
interface A{

    void m1();
    void m2();
    void m3();
}
abstract class B implements A{
    public void m1(){
        System.out.println("m1 method");
    }
  class C extends B{
public void m1(){
        System.out.println("m1 method");
    }
    public void m2(){
        System.out.println("m1 method");
    }
    public void m3(){
        System.out.println("m1 method");
    }

    }
class Ex{
    public static void main()
}
  }  
}

order ,user
Write a query to find the number of orders placed by each customer.
select count(orders) from customer;
select orders.ordersID
customer->customer id,name
order->customer id,order date,order id

select orders.ordersId,orders order date,
Customers.Customers name, from orders
Inner join Customers
  On orders.customerid=customer.customerid;