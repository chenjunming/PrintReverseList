package interview_05;

import java.util.Stack;

/**
 * 
 * @ClassName: PrintReverseList 
 * @Description: 输入一个链表的头指针，从尾到头输出链表
 * 
 * @author cjm
 * @date 2017年11月22日 下午8:18:19 
 *
 */
public class PrintReverseList {
	
	
	public static void main(String[] args) {
		LinkNode head = new LinkNode();
		head.value = 10;
		head.next = null;
		LinkNode temp = head;
		for(int i=9;i>0;i--) {
			LinkNode node = new LinkNode();
			node.value = i;
			node.next = null;
			temp.next = node;
			temp = node;
		}
		//printReverseList(head);
		printReverseListM2(head);
	}
	
	
	/**
	 * 
	 * @Title: printReverseListM2 
	 * @Description: 反向输出链表(递归实现）
	 * @param head   
	 * @return void     
	 * @throws
	 */
	private static void printReverseListM2(LinkNode head) {
		if(head==null)return;
		if(head.next!=null) {
			printReverseListM2(head.next);
		} 
		System.out.print(head.value+" ");
		
		
	}




	/**
	 * 
	 * @Title: printReverseList 
	 * @Description:反向输出链表 (栈实现)
	 * @param head   
	 * @return void     
	 * @throws
	 */
	private static void printReverseList(LinkNode head) {
		if(head == null) return;
		Stack<Integer> stack = new Stack();
		// 遍历链表
		LinkNode temp = head;
		while(temp != null) {
			stack.add(temp.value);
			temp = temp.next;
		}
		while(!stack.isEmpty()) {
			if(stack.size()!=1) {
				System.out.print(stack.pop()+",");
			}else {
				System.out.print(stack.pop());
			}
		}
	}
}
