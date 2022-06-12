class MyCalculator{
int num1,num2,sum,mul;
MyCalculator(){
num1=0;
num2=0;

}
MyCalculator(int n1,int n2){
num1=n1;
num2=n2;
}
void add(){

sum=num1+num2;
System.out.println("Sum is : "+sum);
}
void multiply(){

mul=num1*num2;
System.out.println("Multiply is : "+mul);
}

void display(){
System.out.println("n1 : "+num1+" n2 : "+num2);
}



}