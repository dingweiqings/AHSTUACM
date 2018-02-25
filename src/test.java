
public class test {
	public static void main(String[] args) {
	Animal a1=Animal.getAnimal();
    Animal a2=Animal.getAnimal();
    Animal a3=new Animal();

//    System.out.println("a1: "+a1+"  a2: "+a2);
//    System.out.println("a3 name " +a3.getName()+" a3 food "+a3.getFood()+"  a3  age "+a3.getAge());
    Integer a=new Integer(2);
    a.toString();
    Integer b=2;
    Integer d=3;
    int c=3;
    System.out.println(a==b);
    System.out.println(a==c);
    System.out.println(b==d);
    System.out.println("a "+a.hashCode() +"b "+b.hashCode()+" d "+d.hashCode());
   String sa="Hello";
   String sb="Hello";
   String sc=new String("Hello");
   System.out.println(sa==sb);
   System.out.println(sa==sc);
   System.out.println("sa "+sa.hashCode()+" sb "+sb.hashCode()+"  sc "+  sc.hashCode());
	}
}
