package RG;


	import java.io.FileNotFoundException;
	import java.io.InputStream;
	import java.io.PrintStream;
	import java.util.Scanner;
	public class szys {
		public static void main(String[] args) throws FileNotFoundException {
			PrintStream ps = new PrintStream("d:/result.txt");
			int c;
			Scanner t=new Scanner(System.in);
			System.out.print("请输入题目个数：");
			int tg=t.nextInt();
			//控制题目个数
			System.out.print("请输入操作数的范围（如 100，1000等）:");
			int tf=t.nextInt();
			//控制题目范围
			System.out.println("请选择是否有负数：1:有  0:没有");
			int zf=t.nextInt();
			//控制正负数
			System.out.println("请选择是否包含*或者/：2:否 4:是 ");
			int fu=t.nextInt();
			//控制符号
			System.setOut(ps);
			//添加打印学号
			//for(int j=0;j<2;j++) {
			//System.out.println(2019000+j);
			for(int i=0;i<tg;i++) {//循环控制题目个数
				//第一个操作数的选择
				int a=(int)(Math.random()*tf+1);
				if(zf==1) {//有负数
				int p=(int) (Math.random()*2);
					switch(p) {
					case 0:a=a*(-1);//取负数
						   System.out.print(a);break;
					case 1:
					   	   System.out.print(a);break;
					}
				}
				if(zf==0) {//没有负数
						System.out.print(a);
						}
				if(fu==2) {//选择两个字符‘+’‘-’
					int k=(int)(Math.random()*2);
					switch(k) {//随机选择运算符
					case 0:System.out.print("+");
						   break;
					case 1:System.out.print("-");
						   break; 
						   						}
					
					int b=(int)(Math.random()*tf+1);
					if(zf==1) {//有负数
						int p=(int) (Math.random()*2);
							switch(p) {
							case 0:b=b*(-1);//取负数
								   System.out.print(b);break;
							case 1:
							   	   System.out.print(b);break;
							}
						}
						if(zf==0) {//没有负数
								System.out.print(b);
								}
					System.out.println("=");
					/*
					//运算结果
					if(k==0) {c=a+b;System.out.println(c);}
					if(k==1){c=a-b;	System.out.println(c);}
					*/	
				}
				if(fu==4) {//四个字符的‘+’‘-’‘*’‘/’
				int k=(int)(Math.random()*4+1);
				switch(k) {//随机选择运算符
				case 1:System.out.print("+");break;
				case 2:System.out.print("-");break;
				case 3:System.out.print("*");break;
				case 4:System.out.print("/");break;
				}
				//第二个操作数的选择
				int b=(int) (Math.random()*tf+1);			
				if(zf==1) {//有负数
					int p=(int) (Math.random()*2);
						switch(p) {
						case 0:b=b*(-1);//取负数						   
							   System.out.print(b);break;
						case 1:
						   	   System.out.print(b);break;
						}
					}
					if(zf==0) {//没有负数						
							System.out.print(b);
							}
				//等号			
				System.out.println("=");			
				/*
				//运算结果
				if(k==1) {
					c=a+b;System.out.println(c);
				}
				if(k==2) {
					c=a-b;System.out.println(c);
				}
				if(k==3) {
					c=a*b;System.out.println(c);
				}
				if(k==4) {
					c=a/b;System.out.println(c);
				}*/			
			}	
			}
		//学号那个循环的截止}
	}
	}



