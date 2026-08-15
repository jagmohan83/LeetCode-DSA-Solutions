class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;

        }
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        List<int[]> result = new ArrayList<>();
        int[] currentintervals = intervals[0];
        result.add(currentintervals);
        for(int[] nextintervals : intervals){
            int currentEnd = currentintervals[1];
            int nextStart = nextintervals[0];
            int nextEnd = nextintervals[1];
            if(nextStart<= currentEnd){
                currentintervals[1] = Math.max(currentEnd,nextEnd);
            }else{
                currentintervals = nextintervals;
                result.add(currentintervals);

            }
        }
        return result.toArray(new int[result.size()][]);
        
    }
}