package day07.modi.member.pac1;

public class B {
		
	public B() {
		//A의 기능
		A a = new A();
		a.var1 = 1;
		a.var2 = 2;
		//a.var3 = 3; //no - private
		
		a.method01();
		a.method02();
		//a.method03(); //no - private
		
	}

}
