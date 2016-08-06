package sort;

/**
 * Created by soren on 8/6/2016.
 */
public class UseSelectionSort {
    public static void main(String[] args) {
        int [] list = {9,6,7,0,3,5};
        for(int i=0; i<list.length; i++){
            for(int j=i+1; j<list.length;j++){
                if(list[j]<list[i]){
                    int temp = list[j];
                    list[j]=list[i];
                    list[i]=temp;

                }
            }
        }
        for(int n=0; n<list.length; n++){
            System.out.println(list[n]);
        }
    }
}
