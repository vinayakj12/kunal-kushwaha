package com.company.StackQueue;

public class DynamicStack extends CustomStack {

    public DynamicStack() {
        super(); // it will call CustomStack
    }

    public DynamicStack(int size) {
        super(size); // it will call customstack(int size) constructor in the parent class.

    }

    @Override
    public boolean push(int item) {

        // * this take care of it being full
        if (this.isFull())
        {
            // double the array size
            int[] temp = new int[data.length * 2];

            // copy all the previous item in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            // reassining it to the data
            data = temp;
        }

        // * at this point we know that array is not full
        return  super.push(item);
    }


}
