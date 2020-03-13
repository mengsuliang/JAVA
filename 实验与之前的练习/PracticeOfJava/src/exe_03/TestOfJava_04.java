package exe_03;

import java.util.Scanner;

public class TestOfJava_04 {

	public static void main(String[] args) {
		HomeWork_03 homeWork_03 = new HomeWork_03(101); 
		Scanner cin = new Scanner(System.in); 
		String id,name,sex,phone,addr; 
		Person person; 
		int totalNum = 0; 
		System.out.println("输入您要输入的总数:"); 
		totalNum = cin.nextInt(); 
		for(int i = 0;i < totalNum;i++){ 
			System.out.println("请输入编号:"); 
			id = cin.next(); 
			System.out.println("请输入姓名:"); 
			name = cin.next(); 
			System.out.println("请输入性别:"); 
			sex = cin.next(); 
			System.out.println("请输入电话:"); 
			phone = cin.next(); 
			System.out.println("请输入地址:"); 
			addr = cin.next(); 
			person  = new Person(id, name, sex, phone, addr); 
			homeWork_03.addPerson(person); 
			homeWork_03.printPerson(); 	
		} 
		System.out.println("增加了一个用户的结果:"); 
		person = new Person("33", "测试1", "男", "10893", "南宁");//增 
		homeWork_03.addPerson(person); 
		homeWork_03.printPerson(); 
		System.out.println("更改了一个用户的结果(更改名字):"); 
		homeWork_03.changeNameById("1", "测试2");//改 
		homeWork_03.printPerson(); 
		System.out.println("更改了一个用户的结果（更改地址）:"); 
		homeWork_03.changeAddrById("1", "北京");//改 
		homeWork_03.printPerson(); 
		System.out.println("删除了一个用户的结果:"); 
		homeWork_03.deletePersonById("2");//删 
		homeWork_03.printPerson(); 
		System.out.println("查询后的结果:"); 
		System.out.println(homeWork_03.findById("1"));// 查  
	}  
} 

class Person { 	 
	private String id; 
	private String name; 
	private String sex;  
	private String phoneNum;  
	private String addr;  
	public Person(String id,String name,String sex,String phone,String addr){ 
		this.id = id; 
		this.name = name; 
		this.sex = sex; 
		this.phoneNum = phone; 
		this.addr = addr; 
	} 
	public void setId(String id){ 
		this.id = id; 
	} 
	public void setSex(String sex){ 
		this.sex= sex; 
	} 
	public void setName(String name){ 
		this.name = name; 
	} 
	public void setPhoneNum(String phoneNum){ 
		this.phoneNum = phoneNum; 
	} 
 
	public void setAddr(String addr){ 
		this.addr = addr; 
	} 
	public String  getId(){ 
		return this.id; 
	} 
 
	public String getSex(){ 
		return this.sex; 
	} 
 
	public String getPhoneNum(){ 
		return this.phoneNum; 
	} 
 
	public String getName(){ 
		return this.name; 
	} 
 
	public String getAddr(){ 
		return this.addr; 
	} 
	
}

class HomeWork_03 { 
	private Person[] persons; 
	private int curNum = 0; 
	private int max; 
	public HomeWork_03(int max) { 
		persons = new Person[max]; 
		this.max = max;  
	} 

	/** 
	*  
	* @param person 用于增加的人 
	* @return 
	*/ 
	public Boolean addPerson(Person person){ 
		if(this.curNum== max-1 ){ 
			System.out.println("容量已满，无法增加"); 
			return false; 
		} 
		persons[curNum] = person; 
		curNum++; 
		return true; 
		} 
	/** 
	* 用于返回查询到的数据 
	* @param id  用于确定用户 
	* @return 
	*/ 
	public Person findById(String id) { 
		for(int i = 0;i < this.curNum;i++){ 
			if(persons[i].getId().equals(id)) { 
				return persons[i]; 
				} 
		} 
		return null; 
	} 

	public void printPerson(){ 
		System.out.println("编号\t 姓名 \t性别\t电话\t通信地址"); 
		for(int i = 0;i < this.curNum;i++){ 
			System.out.println(persons[i].getId()+"\t"+persons[i].getName()+"\t"+persons[i].getSex()+"\t"+persons[i].getPhoneNum()+"\t"+persons[i].getAddr()); 
		} 
	} 

	/** 
	* 用于修改的用户的名字 
	* @param id   确定用户的id 
	* @param name  将要的修改的数据 
	*/ 
	public void changeNameById(String id,String name){ 
		Person person = findById(id); 
		if(person == null){ 
			System.out.println("对象不存在,修改失败"); 
			return; 
		} 
		person.setName(name); 
	} 

	/** 
	*  
	* 用于修改用户的id 
	* @param id  确定用户 
	* @param changeId 将要修改的数据 
	*/ 
	public void changIdById(String id,String changeId) { 
		Person person = findById(id); 
		if(person == null){ 
			System.out.println("对象不存在,修改失败"); 
			return; 
		} 
		person.setId(changeId); 
		} 

	/** 
	*  
	* 用于修改用户的性别 
	* @param id 确定用户 
	* @param sex  将要修改的数据 
	*/ 
	public void changeSexById(String id,String sex){ 
		Person person = findById(id); 
		if(person == null){ 
			System.out.println("对象不存在,修改失败"); 
			return; 
		} 
		person.setSex(sex); 
	} 

	/** 
	* 用于查询用户 
	* @param id 确定通讯录中的用户 
	* @return 查询到的下标 
	*/ 
	public  int find(String id) { 
		for(int i = 0;i < this.curNum;i++){ 
			if(persons[i].getId().equals(id)) { 
				return i; 
			} 
		} 
		return -1; 
	} 

	/** 
	* 用于修改用户的电话 
	* @param id 确定通讯录中的用户 
	* @param phone 将要修改的数据 
	*/ 
	public void changePhoneById(String id,String phone) { 
		Person person = findById(id); 
		if(person == null){ 
			System.out.println("对象不存在,修改失败"); 
			return;
		} 
		person.setPhoneNum(phone); 
	} 

	/** 
	* 用于修改用户地址 
	* @param id  确定通讯录中的用户 
	* @param addr 将要修改的数据 
	*/ 
	public void changeAddrById(String id,String addr) { 
		Person person = findById(id); 
		if(person == null){ 
			System.out.println("对象不存在,修改失败"); 
			return; 
		} 
		person.setAddr(addr); 
	} 

	/** 
	* 用于删除通讯录中的用户 
	* @param id  要删除用户的id 
	*/ 
	public void deletePersonById(String id) { 	 	 
		if(find(id) == -1) { 
			System.out.println("删除失败，不存在该用户"); 
			return; 
		} 
		int location = find(id); 
		if(location == max-1) { 
			this.curNum --; 
			}else { 
				for(int i = location;i<this.curNum-1;i++) { 
					persons[i] = persons[i+1]; 
 
				} 
				this.curNum--; 
				} 
		} 
	}