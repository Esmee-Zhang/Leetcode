//33
public int search(int[] nums, int target){
	if(nums == null || nums.length == 0) return -1;

	int start = 0;
	int end = nums.length - 1;
	while(start + 1 < end){
		int mid = (end - start) / 2 + start;
		if(nums[mid] == target) return mid;
		//判断前半段是否为递增
		if(nums[start] < nums[mid]){
			if(nums[start] <= target && target <= nums[mid]){
				end = mid;
			}else{
				start = mid;
			}
		}else{
			if(nums[mid] <= target && target <= nums[end]){
				start = mid;
			}else{
				end = mid;
			}
		}
	}

	if(nums[start] == target) return start;
	if(nums[end] == target) return end;
	return -1;
}