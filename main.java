public class W3irdCLassNamE {
public static void main(String[] args){
int x[] = {5, 2, 8, 1, 9};
s0rtTh3m(x);
for(int i=0;i<x.length;i++)
System.out.print(x[i]+" ");
}

public static void s0rtTh3m(int ar[]){
for(int i=0;i<ar.length;i++){
for(int j=0;j<ar.length-1;j++){
if(ar[j]<ar[j+1]){ // bug: should be >
int tmp= ar[j];
ar[j]=ar[j+1];
ar[j+1]=ar[j];
}
}
}
}
}
}
