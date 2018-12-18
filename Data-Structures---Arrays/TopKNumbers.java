public class TopKNumbers{
/**Given a non-empty array of integers, return the k most frequent elements.

For example,
Given [1,1,1,2,2,3] and k = 2, return [1,2].
**/
    //define node to store number and its frequency
        public static class Node
        {
            int count=0;
            int n=0;
            Node(int n, int count){
                this.count=count;
                this.n=n;
            }
        }
        
    public List<Integer> topKFrequent(int[] nums, int k) {
		//map to count occurences
        HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
        for(int num:nums)
        {
            if(map.containsKey(num))
                map.put(num, map.get(num)+1);
            else
                map.put(num,1);
        }
		//make min heap
        PriorityQueue<Node> pq=new PriorityQueue<Node>(new Comparator<Node>(){
            public int compare(Node a, Node b)
            {
                return a.count-b.count;
            }
            });
        for(int key:map.keySet())
        {
            Node n=new Node(key, map.get(key));
            pq.offer(n);
            if(pq.size()>k)
                pq.poll();
        }
        List<Integer> list=new ArrayList<Integer>();
        while(!pq.isEmpty())
        {
            list.add(pq.poll().n);
        }
        
        return list;
    }
}