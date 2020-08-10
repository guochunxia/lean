package com.gcx.dataStruct;

/**
 * @ClassName ArrayQueue
 * @Author guo_chx@suixingpay.com
 * @Date 2019/12/10 下午4:31
 * @Version 1.0
 */
public class ArrayQueue {

    // 用数组实现的队列
        // 数组：items，数组大小：n
        private String[] items;
        private int n = 0;
        // head表示队头下标，tail表示队尾下标
        private int head = 0;
        private int tail = 0;

        // 申请一个大小为capacity的数组
        public ArrayQueue(int capacity) {
            items = new String[capacity];
            n = capacity;
        }

        // 入队
//        public boolean enqueue(String item) {
//            // 如果tail == n 表示队列已经满了
//            if (tail == n) return false;
//            items[tail] = item;
//            ++tail;
//            return true;
//        }


        // 入队操作，将item放入队尾
        public boolean enqueue(String item) {
            // tail == n表示队列末尾没有空间了
            if (tail == n) {
                // tail ==n && head==0，表示整个队列都占满了
                if (head == 0) return false;
                // 数据搬移
                for (int i = head; i < tail; ++i) {
                    items[i-head] = items[i];
                }
                // 搬移完之后重新更新head和tail
                tail -= head;
                head = 0;
            }

            items[tail] = item;
            ++tail;
            return true;
        }

        // 出队
        public String dequeue() {
            // 如果head == tail 表示队列为空
            if (head == tail) return null;
            // 为了让其他语言的同学看的更加明确，把--操作放到单独一行来写了
            String ret = items[head];
            ++head;
            return ret;
        }

//    public static void main(String[] args) {
//
//        ArrayQueue arrayQueue = new ArrayQueue(5);
//        System.out.println(arrayQueue.enqueue("1"));
//        System.out.println(arrayQueue.enqueue("2"));
//        System.out.println(arrayQueue.enqueue("3"));
//        System.out.println(arrayQueue.enqueue("4"));
//        System.out.println(arrayQueue.enqueue("5"));
//        System.out.println(arrayQueue.dequeue());
//        System.out.println(arrayQueue.enqueue("6"));
//
//        System.out.println(arrayQueue.dequeue());
//        System.out.println(arrayQueue.dequeue());
//        System.out.println(arrayQueue.dequeue());
//        System.out.println(arrayQueue.dequeue());
//        System.out.println(arrayQueue.dequeue());
//
//    }

//    public static void main(String[] args) {
//
//        String [] items = new String[8];
//        items[5] = "1";
//        items[6] = "2";
//        items[7] = "3";
//        int head = 5;
//        for (int i = head; i < 7; ++i) {
//            items[i-head] = items[i];
//        }
//        System.out.printf(items.toString());
//    }

    public static void main(String[] args) {
            int n = 7;
            if (n == 1)
                System.out.println(1);
            if (n == 2)
                System.out.println(2);
            int ret = 0;
            int pre = 2;
            int prepre = 1;
            for (int i = 3; i <= n; ++i) {
                System.out.println(ret);
                System.out.println(pre);
                System.out.println(prepre);
                ret = pre + prepre;
                prepre = pre;
                pre = ret;
            }
        System.out.println(ret);
    }



    // 冒泡排序，a表示数组，n表示数组大小
    public void bubbleSort(int[] a, int n) {
        if (n <= 1) return;

        for (int i = 0; i < n; ++i) {
            // 提前退出冒泡循环的标志位
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {
                if (a[j] > a[j+1]) { // 交换
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    flag = true;  // 表示有数据交换
                }
            }
            if (!flag) break;  // 没有数据交换，提前退出
        }
    }

}
