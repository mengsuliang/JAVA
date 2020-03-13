package hps_caculator;


import java.util.Stack;

public class InfixSuffix {
	 private String textString;

	public InfixSuffix(String textString) {
		this.textString = textString;
	}
	/**
	 * 用于检查后缀表达式是否正确
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

	// 用于判断优先级
	/**
	 * 
	 * @param left 代表栈中的运算符
	 * ]
	 * @param right 代码目前的运算符
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
	//计算中缀表达式的值（中缀->后缀->计算）
	//return 结果
	public double inToPost() {
		//检查字符串是否合法
		if(!checkIsVaild()) return 0xffffff;
		//创建一个栈  存储数字
		Stack<Double> stack = new Stack<Double>();
		//存储数组
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
				//将数字压入栈中
				stack.push(Double.valueOf(string));
				string = "";
				i--;
				
			}else if (this.textString.charAt(i) == '(') {
				//将左括号压入栈中
				stack2.push(Character.valueOf(this.textString.charAt(i)));
				
			}else if(this.textString.charAt(i) == ')') {
				/**
				 * 弹出栈中元素  并计算 然后存入数字栈中
				 *
				 */
				while(stack2.peek()!='(') 
				{
					//弹出两个操作数
					double right = stack.peek();
					stack.pop();
					double left = stack.peek();
					stack.pop();
					//计算弹出的两个操作数  然后将结果存回栈中
					if(Math.abs(caculate(left, right, stack2.peek())- 0xfffff) > 1e-6)
						stack.push(caculate(left, right, stack2.peek()));
					stack2.pop();
				}
				//弹出左括号
				stack2.pop();
			}else if (stack2.empty()||this.judgeCha(stack2.peek(), this.textString.charAt(i)) == 1) {
				/**
				 * 此刻说明栈中的元素符优先级较低  压栈
				 */
				stack2.push(this.textString.charAt(i));
				
			}else  if(this.judgeCha(stack2.peek(), this.textString.charAt(i)) == 0){
				do 
				{
					double right = stack.peek();
					stack.pop();
					double left = stack.peek();
					stack.pop();
					//将结果压进栈中
					stack.push(this.caculate(left, right, stack2.peek()));
					stack2.pop();
					
				}while(!stack2.empty() && this.judgeCha(stack2.peek(), this.textString.charAt(i)) == 0); //要么弹完所有元素  要么弹到栈空
				//将当前元素压入栈中 
				stack2.push(this.textString.charAt(i));
			
		}	
	}
	while(!stack2.empty()) 
	{
		double right = stack.peek();
		stack.pop();
		double left = stack.peek();
		stack.pop();
		//计算弹出的两个操作数  然后将结果存回栈中
		if(Math.abs(caculate(left, right, stack2.peek())- 0xfffff) > 1e-6)
			stack.push(caculate(left, right, stack2.peek()));
		stack2.pop();
		
	}
	return stack.peek();
}

}

