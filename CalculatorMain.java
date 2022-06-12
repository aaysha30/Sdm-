class CalculatorMain{
public static void main(String [] args){
	MyCalculator m1=new MyCalculator();
	m1.display();
	
	MyCalculator m2=new MyCalculator(55,32);
	m2.display();	
	m2.add();
	m2.multiply();
}

}