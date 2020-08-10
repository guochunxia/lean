package com.gcx.dataStructure.lean.link;

public class Josepfu {
    public static void main(String[] args) {
        CycleLink cycleLink = new CycleLink();
        cycleLink.add(5);

        cycleLink.show();
        cycleLink.josepfuOut(5,1,2);
    }
}
class CycleLink{
    CycleLinkNode first;
    public void add(int nums){
        if(nums<=0){
            System.out.println("输入不正确");
        }

        CycleLinkNode curNode = null;

        for (int i = 1; i <= nums; i++) {

            CycleLinkNode node = new CycleLinkNode(i);
            if(i == 1){//说明添加第一个节点
                first =node;
                first.next = first;
                curNode = first;
            }else{
                curNode.next = node;
                node.next = first;
                curNode = node;
            }

        }
    }
    public void show(){
        if(first == null){
            System.out.println("为空");
        }
        CycleLinkNode temp = first;
        while(true){
            System.out.println(temp.no);
            if (temp.next ==first){
                break;
            }
            temp = temp.next;
        }
    }

    public void josepfuOut(int nums,int startNo,int countNo){

        if(first == null || startNo <1 || startNo>nums){
            System.out.println("参数不正确");
        }

        //先给helper找到位置
        CycleLinkNode helper = first;
        while(true){
            if(helper.next == first){
                break;
            }
            helper = helper.next;
        }

        while (true){
            if(first == helper){
                System.out.println("已经出完了");
                break;
            }
            //helper和first同时向前走startNo-1
            for (int i = 0; i < startNo-1; i++) {
                first = first.next;
                helper = helper.next;
            }

            //helper和first同时数countNo-1下
            for (int i = 0; i < countNo-1; i++) {
                first = first.next;
                helper = helper.next;
            }
            //这时候first的位置就是要出对的位置
            System.out.println("出对编号："+first.no);
            first = first.next;
            helper.next = first;

        }

        System.out.println("剩下的编号是"+first.no);



    }
}
class CycleLinkNode{
    int no;
    CycleLinkNode next;

    public CycleLinkNode(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "CycleLinkNode{" +
                "no=" + no +
                '}';
    }
}
