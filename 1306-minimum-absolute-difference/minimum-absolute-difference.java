class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> li=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]<min){
                min=arr[i]-arr[i-1];
            
            }
        }
          for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==min){
                List<Integer> list=new ArrayList<>();
                if(arr[i]<arr[i-1]){
                 list.add(arr[i]);
                 list.add(arr[i-1]);
                }
                else{
                 list.add(arr[i-1]);
                 list.add(arr[i]);
                }
                 li.add(list);;
            
            }
        }
        return li;
    }
}