class StockSpanner {

    class Pair{
        int idx;
        int val;
        Pair(int idx,int val){
            this.idx=idx;
            this.val=val;
        }
       
    }
    Stack <Pair>s;
    int index;
    public StockSpanner() {
       s=new Stack<>();
       index=-1;
    }
    
    public int next(int price) {
        index++;
        int span;
        while(!s.isEmpty()&&price>=s.peek().val){
            s.pop();
        }
        if(s.isEmpty()){
            span=index+1;
        }else{
            span=index-s.peek().idx;
        }
        s.push(new Pair(index,price));
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */