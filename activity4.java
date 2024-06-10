package Activities;

public class activity4 {
    public static void main(String[] args) {
        int[] myNumbers ={12,10,6,8,9,7};
        ascendingSort(myNumbers);
    }
    public static void ascendingSort(int[] myNumbers)
    {
        System.out.println("array size"+myNumbers.length);
        int temp = 0;
        for(int i=0; i<myNumbers.length; i++){
            for(int j= i+1;j<myNumbers.length;j++){
                if(myNumbers[i]>myNumbers[j]){
                    temp =myNumbers[i];
                    myNumbers[i] =myNumbers[j];
                    myNumbers[j] = temp;
                }

            }


        }
        for(int k=0; k<myNumbers.length; k++){
            System.out.println(myNumbers[k]);
        }
        
    }
}
