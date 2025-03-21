public class InversionCount{
public static int countInversion(int[] array){
int count=0;
for(int i=0;i<array.length;i++){
for(int j=i+1;j<array.length;j++){
if(array[i]>array[j]){
count++;
}
}
}
return count;
}
public static void main(String[] args){
int[] array={2,4,8,9,3};
int totalInversion=countInversion(array);
system.out.println("Inversion:"+totalInversion);
}
}
