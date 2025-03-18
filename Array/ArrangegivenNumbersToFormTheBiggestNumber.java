

public class ArrangegivenNumbersToFormTheBiggestNumber {
    public static String largestNumber(int[] nums) {
    
        String list[]=new String[nums.length];
        
        for(int i=0;i<nums.length;i++){
            
            list[i]=(String.valueOf(nums[i]));
        }
        
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                String AB = list[i] + list[j];
                String BA = list[j] + list[i];
                if (AB.compareTo(BA) < 0) {
                    String temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
            
       
        
        String res = "";
         for(int i=0;i<list.length;i++){
             res += list[i];
        }
        
        if(res.charAt(0) == '0')
            return "0";
        
        return res;
    }
    
        public static void main(String[] args) {
          int  arr[] =  {3, 30, 34, 5, 9};
    System.out.println(largestNumber(arr));
    }
}
