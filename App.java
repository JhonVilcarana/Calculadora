import java.util.Scanner;

public class App {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=0, res=0;
		String sel=null;
		Scanner tec=new Scanner(System.in);
		System.out.println("Seleccione la opción\n");
		System.out.println("+: Suma"
				+ "\n-: Resta"
				+ "\n*: Multiplicación"
				+ "\n/: División");
		sel=tec.next();
		switch(sel){
		case "+":
			System.out.println("ha seleccionado suma\n");
			System.out.println("ingrese el primer número");
			a=tec.nextInt();
			System.out.println("ingrese el segundo número");
			b=tec.nextInt();
			res=a+b;
			System.out.println(a+"+"+b+"="+res);
			break;
		case "-":
			System.out.println("ha seleccionado Resta\n");
			System.out.println("ingrese el primer número");
			a=tec.nextInt();
			System.out.println("ingrese el segundo número");
			b=tec.nextInt();
			res=a-b;
			System.out.println(a+"-"+b+"="+res);
			break;
		case "*":
			System.out.println("ha seleccionado Multiplicación\n");
			System.out.println("ingrese el primer número");
			a=tec.nextInt();
			System.out.println("ingrese el segundo número");
			b=tec.nextInt();
			res=a*b;
			System.out.println(a+"*"+b+"="+res);
			break;
		case "/":
			System.out.println("ha seleccionado División\n");
			System.out.println("ingrese el primer número");
			a=tec.nextInt();
			System.out.println("ingrese el segundo número");
			b=tec.nextInt();
			res=a/b;
			System.out.println(a+"/"+b+"="+res);
			break;
		default:
			System.out.println("Esa opción no existe");
		}
		
	}

}