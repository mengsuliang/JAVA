package exe_03;

import java.util.Scanner;

public class TestOfJava_04 {

	public static void main(String[] args) {
		HomeWork_03 homeWork_03 = new HomeWork_03(101); 
		Scanner cin = new Scanner(System.in); 
		String id,name,sex,phone,addr; 
		Person person; 
		int totalNum = 0; 
		System.out.println("������Ҫ���������:"); 
		totalNum = cin.nextInt(); 
		for(int i = 0;i < totalNum;i++){ 
			System.out.println("��������:"); 
			id = cin.next(); 
			System.out.println("����������:"); 
			name = cin.next(); 
			System.out.println("�������Ա�:"); 
			sex = cin.next(); 
			System.out.println("������绰:"); 
			phone = cin.next(); 
			System.out.println("�������ַ:"); 
			addr = cin.next(); 
			person  = new Person(id, name, sex, phone, addr); 
			homeWork_03.addPerson(person); 
			homeWork_03.printPerson(); 	
		} 
		System.out.println("������һ���û��Ľ��:"); 
		person = new Person("33", "����1", "��", "10893", "����");//�� 
		homeWork_03.addPerson(person); 
		homeWork_03.printPerson(); 
		System.out.println("������һ���û��Ľ��(��������):"); 
		homeWork_03.changeNameById("1", "����2");//�� 
		homeWork_03.printPerson(); 
		System.out.println("������һ���û��Ľ�������ĵ�ַ��:"); 
		homeWork_03.changeAddrById("1", "����");//�� 
		homeWork_03.printPerson(); 
		System.out.println("ɾ����һ���û��Ľ��:"); 
		homeWork_03.deletePersonById("2");//ɾ 
		homeWork_03.printPerson(); 
		System.out.println("��ѯ��Ľ��:"); 
		System.out.println(homeWork_03.findById("1"));// ��  
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
	* @param person �������ӵ��� 
	* @return 
	*/ 
	public Boolean addPerson(Person person){ 
		if(this.curNum== max-1 ){ 
			System.out.println("�����������޷�����"); 
			return false; 
		} 
		persons[curNum] = person; 
		curNum++; 
		return true; 
		} 
	/** 
	* ���ڷ��ز�ѯ�������� 
	* @param id  ����ȷ���û� 
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
		System.out.println("���\t ���� \t�Ա�\t�绰\tͨ�ŵ�ַ"); 
		for(int i = 0;i < this.curNum;i++){ 
			System.out.println(persons[i].getId()+"\t"+persons[i].getName()+"\t"+persons[i].getSex()+"\t"+persons[i].getPhoneNum()+"\t"+persons[i].getAddr()); 
		} 
	} 

	/** 
	* �����޸ĵ��û������� 
	* @param id   ȷ���û���id 
	* @param name  ��Ҫ���޸ĵ����� 
	*/ 
	public void changeNameById(String id,String name){ 
		Person person = findById(id); 
		if(person == null){ 
			System.out.println("���󲻴���,�޸�ʧ��"); 
			return; 
		} 
		person.setName(name); 
	} 

	/** 
	*  
	* �����޸��û���id 
	* @param id  ȷ���û� 
	* @param changeId ��Ҫ�޸ĵ����� 
	*/ 
	public void changIdById(String id,String changeId) { 
		Person person = findById(id); 
		if(person == null){ 
			System.out.println("���󲻴���,�޸�ʧ��"); 
			return; 
		} 
		person.setId(changeId); 
		} 

	/** 
	*  
	* �����޸��û����Ա� 
	* @param id ȷ���û� 
	* @param sex  ��Ҫ�޸ĵ����� 
	*/ 
	public void changeSexById(String id,String sex){ 
		Person person = findById(id); 
		if(person == null){ 
			System.out.println("���󲻴���,�޸�ʧ��"); 
			return; 
		} 
		person.setSex(sex); 
	} 

	/** 
	* ���ڲ�ѯ�û� 
	* @param id ȷ��ͨѶ¼�е��û� 
	* @return ��ѯ�����±� 
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
	* �����޸��û��ĵ绰 
	* @param id ȷ��ͨѶ¼�е��û� 
	* @param phone ��Ҫ�޸ĵ����� 
	*/ 
	public void changePhoneById(String id,String phone) { 
		Person person = findById(id); 
		if(person == null){ 
			System.out.println("���󲻴���,�޸�ʧ��"); 
			return;
		} 
		person.setPhoneNum(phone); 
	} 

	/** 
	* �����޸��û���ַ 
	* @param id  ȷ��ͨѶ¼�е��û� 
	* @param addr ��Ҫ�޸ĵ����� 
	*/ 
	public void changeAddrById(String id,String addr) { 
		Person person = findById(id); 
		if(person == null){ 
			System.out.println("���󲻴���,�޸�ʧ��"); 
			return; 
		} 
		person.setAddr(addr); 
	} 

	/** 
	* ����ɾ��ͨѶ¼�е��û� 
	* @param id  Ҫɾ���û���id 
	*/ 
	public void deletePersonById(String id) { 	 	 
		if(find(id) == -1) { 
			System.out.println("ɾ��ʧ�ܣ������ڸ��û�"); 
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