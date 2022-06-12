class Fibonacii{
public static void main(String args[]){
int total=8,temp,i;
int t1=1;
int t2=1;
System.out.print(t1+" , "+t2);
for(i=3; i<=total; i++){
int t3=t1+t2;
System.out.print(t3+" , ");

t1=t2;
t2=t3;
}

}


}