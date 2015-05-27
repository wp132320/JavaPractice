/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *     |_ IdolGroup
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 27.
 * </pre>
 *
 * @author	: 오준용
 * @version 	: 1.0
 */
public class IdolGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] idolGroup = {"빅뱅", "2NE1", "걸스데이"};
		String[][] members = {
				{"GD", "태양", "대성", "탑", "승리"},
				{"CL", "산다라박", "박봄", "민지"},
				{"유리", "소진", "민아", "해리", "그외"}
		};
		for(String group : idolGroup) {
			System.out.println("<< "+group+" 멤버 >>");
			switch(group) {
			case "빅뱅":
				for(String member : members[0])
					System.out.println(member);
				break;
			case "2NE1":
				for(String member : members[1])
					System.out.println(member);
				break;
			case "걸스데이":
				for(String member : members[2])
					System.out.println(member);
				break;
			}
		}
	}

}
