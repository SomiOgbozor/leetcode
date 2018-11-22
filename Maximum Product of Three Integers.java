public int maximumProduct(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        for(int i=0; i < nums.length; i++){
            int num = nums[i];
            if(num >= largest){
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = num;
            } else if(num >= secondLargest){
                thirdLargest = secondLargest;
                secondLargest = num;
            } else if (num >= thirdLargest){
                thirdLargest = num;
            }
            
            if(num <= smallest){
                secondSmallest = smallest;
                smallest = num;
            } else if(num <= secondSmallest){
                secondSmallest = num;
            }
        }
        return Math.max((largest*secondLargest*thirdLargest), (smallest*secondSmallest*largest));
    }