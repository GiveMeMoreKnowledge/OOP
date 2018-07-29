interface IntStack{
    void push(int item);
    int pop();
}

class Stack implements IntStack{
    private int stck[];
    private int pointer;

    Stack(int size){
        stck = new int[size];
        pointer = -1;
    }

    public void push(int item){
        if(pointer == stck.length - 1){
            int temp[] = new int[stck.length * 2];
            for(int i = 0; i < stck.length; i++) temp[i] = stck[i];
            stck = temp;
            stck[++pointer] = item;
        }
        else
            stck[++pointer] = item;
    }

    public int pop(){
        if(pointer < 0) {
            System.out.println("Stack is not full!");
            return 0;
        }
        else
            return stck[pointer--];
    }
}

/* Example
	Stack ds = new Stack(5);
        for(int i = 0; i < 20; i++) ds.push(i);

        System.out.println("Stack in ds: ");
        for(int i = 0; i < 20; i++)
            System.out.println(ds.pop());
*/
