public class JavaArrays {
        public String average(int arr[]) {
          double sum=0;
          for (int price:arr){
              sum+=price;
          }
          double average=sum/arr.length;
          return String.format("%.2f", average);
    
        }
}
