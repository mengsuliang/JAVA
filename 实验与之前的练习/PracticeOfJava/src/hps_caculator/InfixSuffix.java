package hps_caculator;


import java.util.Stack;

public class InfixSuffix {
	 private String textString;

	public InfixSuffix(String textString) {
		this.textString = textString;
	}
	/**
	 * ���ڼ���׺���ʽ�Ƿ���ȷ
	 * @return
	 */
	public boolean checkIsVaild() {
		int mark = 0,l = 0,r = 0;
		for(int i = 0;i < this.textString.length();i++) 
		{
			if(textString.charAt(i) == '.') {
				while(i < this.textString.length() &&(textString.charAt(i) != '-' && textString.charAt(i) != '+' && textString.charAt(i) != '*' &&textString.charAt(i) != '/') ) {
					if(textString.charAt(i) == '.')mark ++;
					i++;
				}
				if(mark > 1) return false;
				mark = 0;
				i--;
			}else if (textString.charAt(i) == '-' || textString.charAt(i) == '+' || textString.charAt(i) == '*' || textString.charAt(i) == '/' ) 
			{
				if(i == 0) return false;
				if(i+1 >= textString.length() ) 
				{
					return false;
				}else {
					if(textString.charAt(i-1) != ')' &&textString.charAt(i+1) != '(' &&(textString.charAt(i-1)>'9'||textString.charAt(i-1)< '0'|| textString.charAt(i+1)< '0'||textString.charAt(i+1)> '9' ))  return false;
				}
				
			}else if(textString.charAt(i) == '(') {
				l++;
				
				if(i+1 >= textString.length()) return false;
				if(i != 0) {
					if((textString.charAt(i-1)>= '0' && textString.charAt(i-1) <= '9')|| textString.charAt(i+1) > '9'|| textString.charAt(i+1) < '0') return false;
				}else {
					if(textString.charAt(i+1) > '9'|| textString.charAt(i+1) < '0') return false;
				}
			}else if (textString.charAt(i) == ')') {
				r++;
				if(i== 0) return false;
				if(i < textString.length()-1) {
					if((textString.charAt(i+1)>= '0' && textString.charAt(i+1) <= '9')|| textString.charAt(i-1) > '9'|| textString.charAt(i-1) < '0') return false;
				}else if(textString.length()-1 == i ){
					if(textString.charAt(i-1)>'9'||textString.charAt(i-1)<'0') return false;
					
				}
				
			}
		}
		if(l != r) return false;
		return true;
		
	}

	// �����ж����ȼ�
	/**
	 * 
	 * @param left ����ջ�е������
	 * ]
	 * @param right ����Ŀǰ�������
	 * 
	 * @return
	 */
	public int judgeCha(char left, char right) {
		if (left == '+' || left == '-')
			return 1;
		else if (left == '*' || left == '/')
			return 0;
		else if (left == '(')
			return 1;
		return -1;

	}
	public double caculate(double left,double right,char opr) {
		switch (opr) {
		case '+':
			return left+right;
		case '-':
			return left-right;
		case '*':
			return left * right;
		case '/':
			if(right != 0) {
				return left/right; 
			}
			
		}
		return 0xfffff;
		
	}
	//������׺���ʽ��ֵ����׺->��׺->���㣩
	//return ���
	public double inToPost() {
		//����ַ����Ƿ�Ϸ�
		if(!checkIsVaild()) return 0xffffff;
		//����һ��ջ  �洢����
		Stack<Double> stack = new Stack<Double>();
		//�洢����
		Stack<Character> stack2 = new Stack<Character>();
		String string = "";
		for(int i = 0 ;i < textString.length();i++) 
		{
			
			if((i < textString.length())&&((this.textString.charAt(i) >= '0' && this.textString.charAt(i) <= '9')|| this.textString.charAt(i) == '.')){
				//System.out.print(this.textString.charAt(i));
				while((i < textString.length())&&((this.textString.charAt(i) >= '0' && this.textString.charAt(i) <= '9')|| this.textString.charAt(i) == '.')){
					string += this.textString.charAt(i);
					i++;
				}
				//������ѹ��ջ��
				stack.push(Double.valueOf(string));
				string = "";
				i--;
				
			}else if (this.textString.charAt(i) == '(') {
				//��������ѹ��ջ��
				stack2.push(Character.valueOf(this.textString.charAt(i)));
				
			}else if(this.textString.charAt(i) == ')') {
				/**
				 * ����ջ��Ԫ��  ������ Ȼ���������ջ��
				 *
				 */
				while(stack2.peek()!='(') 
				{
					//��������������
					double right = stack.peek();
					stack.pop();
					double left = stack.peek();
					stack.pop();
					//���㵯��������������  Ȼ�󽫽�����ջ��
					if(Math.abs(caculate(left, right, stack2.peek())- 0xfffff) > 1e-6)
						stack.push(caculate(left, right, stack2.peek()));
					stack2.pop();
				}
				//����������
				stack2.pop();
			}else if (stack2.empty()||this.judgeCha(stack2.peek(), this.textString.charAt(i)) == 1) {
				/**
				 * �˿�˵��ջ�е�Ԫ�ط����ȼ��ϵ�  ѹջ
				 */
				stack2.push(this.textString.charAt(i));
				
			}else  if(this.judgeCha(stack2.peek(), this.textString.charAt(i)) == 0){
				do 
				{
					double right = stack.peek();
					stack.pop();
					double left = stack.peek();
					stack.pop();
					//�����ѹ��ջ��
					stack.push(this.caculate(left, right, stack2.peek()));
					stack2.pop();
					
				}while(!stack2.empty() && this.judgeCha(stack2.peek(), this.textString.charAt(i)) == 0); //Ҫô��������Ԫ��  Ҫô����ջ��
				//����ǰԪ��ѹ��ջ�� 
				stack2.push(this.textString.charAt(i));
			
		}	
	}
	while(!stack2.empty()) 
	{
		double right = stack.peek();
		stack.pop();
		double left = stack.peek();
		stack.pop();
		//���㵯��������������  Ȼ�󽫽�����ջ��
		if(Math.abs(caculate(left, right, stack2.peek())- 0xfffff) > 1e-6)
			stack.push(caculate(left, right, stack2.peek()));
		stack2.pop();
		
	}
	return stack.peek();
}

}

