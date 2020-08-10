package com.gcx.dataStructure.lean.link;

public class SingleLinkedDemo {
    public static void main(String[] args) {
        //添加测试
        SingleLinked singleLinked = new SingleLinked();
//        singleLinked.add(new LinkNode(0,"张三"));
//        singleLinked.add(new LinkNode(2,"王五"));
//        singleLinked.add(new LinkNode(1,"李四"));

        //按顺序插入
        singleLinked.addByOrder(new LinkNode(0,"张三"));
        singleLinked.addByOrder(new LinkNode(2,"王五"));
        singleLinked.addByOrder(new LinkNode(1,"李四"));
        //查看测试
//        System.out.println("更新前查看");
//        singleLinked.showList();
//        singleLinked.update(new LinkNode(2,"王五~~~~"));

//        System.out.println("更新后查看");
//        singleLinked.showList();

//        System.out.println("删除前查看");
//        singleLinked.showList();
//        singleLinked.delete(new LinkNode(1,"李四"));
//        System.out.println("删除后查看");
//        singleLinked.showList();

//        System.out.println("反转前查看");
//        singleLinked.showList();
//        singleLinked.reverse();
//        System.out.println("反转后查看");
//        singleLinked.showList();

        singleLinked.showList();
        LinkNode linkNode = singleLinked.returnIndex(1);
        System.out.println(linkNode);



    }

}

class SingleLinked{

    LinkNode head ;
    public SingleLinked() {
        head = new LinkNode(-1,"");
    }
    public void showList(){
        if(head.next == null){
            System.out.printf("链表为空");
        }
        LinkNode temp = head.next;
        while(true){
            if(temp == null){
                System.out.printf("已经遍历完了");
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }
    public void add(LinkNode node){
        //遍历 zhao找到最后一个节点需要临时指针
        LinkNode  temp = head;
        while(true){
            if(temp.next == null){
                temp.next = node;
                break;
            }
            temp = temp.next;
        }

    }

    public void addByOrder(LinkNode node){
        //遍历 zhao找到最后一个节点需要临时指针
        LinkNode  temp = head;
        while(true){
            if(temp.next == null){
                temp.next = node;
                break;
            }
            if(temp.next.no > node.no){
                node.next = temp.next;
                temp.next = node;
                break;
            }
            temp = temp.next;
        }

    }

    public void update(LinkNode node){
        LinkNode  temp = head.next;
        boolean flag = false;

        while(temp != null){
            if(temp.no == node.no){
                temp.name = node.name;
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            System.out.println("更新成功");
        }else{
            System.out.println("更新失败");
        }

    }

    public void delete(LinkNode node){
        LinkNode temp = head;
        while(temp.next != null){
            //找到删除的前一个结点
            if(temp.next.no  == node.no){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
    }

    public void reverse(){
        LinkNode temp = head.next;
        LinkNode tempNext ;
        LinkNode newTempHead = new LinkNode(-1,"");
        if(head == null || head.next.next == null){
            System.out.println("列表无需反转");
        }
        while(temp != null){
            tempNext = temp.next;
            temp.next = newTempHead.next;
            newTempHead.next = temp;
            temp = tempNext;
        }
        head.next = newTempHead.next;
    }

    public LinkNode returnIndex(int index){
        LinkNode temp = head.next;

        if(head.next == null){
            System.out.println("列表为空");
        }
        //查找总长度
        int count = queryCount();
        if(index<=0 || index>count){
            System.out.println("请输入正确的数字");
        }
        for (int i = 0;i<count-index ;i++){
            temp = temp.next;
        }
        return temp;

    }

    public int queryCount(){
        if(head.next == null){
            return 0;
        }
        int count = 0;
        LinkNode temp = head.next;
        while(temp != null){
            count ++;
            temp = temp.next;
        }
        return count;
    }

    public LinkNode reverseList(LinkNode head) {
        LinkNode newHead = new LinkNode (-1,"");
        LinkNode temp = head;

        while(temp.next != null){
            newHead.next = temp;
            temp = temp.next;
        }
        temp.next = newHead.next;
        return temp;

    }
}
class LinkNode{
    int no;
    String name;
    LinkNode next;

    public LinkNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "LinkNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
