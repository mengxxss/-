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
			System.out.print("��������Ŀ������");
			int tg=t.nextInt();
			//������Ŀ����
			System.out.print("������������ķ�Χ���� 100��1000�ȣ�:");
			int tf=t.nextInt();
			//������Ŀ��Χ
			System.out.println("��ѡ���Ƿ��и�����1:��  0:û��");
			int zf=t.nextInt();
			//����������
			System.out.println("��ѡ���Ƿ����*����/��2:�� 4:�� ");
			int fu=t.nextInt();
			//���Ʒ���
			System.setOut(ps);
			//��Ӵ�ӡѧ��
			//for(int j=0;j<2;j++) {
			//System.out.println(2019000+j);
			for(int i=0;i<tg;i++) {//ѭ��������Ŀ����
				//��һ����������ѡ��
				int a=(int)(Math.random()*tf+1);
				if(zf==1) {//�и���
				int p=(int) (Math.random()*2);
					switch(p) {
					case 0:a=a*(-1);//ȡ����
						   System.out.print(a);break;
					case 1:
					   	   System.out.print(a);break;
					}
				}
				if(zf==0) {//û�и���
						System.out.print(a);
						}
				if(fu==2) {//ѡ�������ַ���+����-��
					int k=(int)(Math.random()*2);
					switch(k) {//���ѡ�������
					case 0:System.out.print("+");
						   break;
					case 1:System.out.print("-");
						   break; 
						   						}
					
					int b=(int)(Math.random()*tf+1);
					if(zf==1) {//�и���
						int p=(int) (Math.random()*2);
							switch(p) {
							case 0:b=b*(-1);//ȡ����
								   System.out.print(b);break;
							case 1:
							   	   System.out.print(b);break;
							}
						}
						if(zf==0) {//û�и���
								System.out.print(b);
								}
					System.out.println("=");
					/*
					//������
					if(k==0) {c=a+b;System.out.println(c);}
					if(k==1){c=a-b;	System.out.println(c);}
					*/	
				}
				if(fu==4) {//�ĸ��ַ��ġ�+����-����*����/��
				int k=(int)(Math.random()*4+1);
				switch(k) {//���ѡ�������
				case 1:System.out.print("+");break;
				case 2:System.out.print("-");break;
				case 3:System.out.print("*");break;
				case 4:System.out.print("/");break;
				}
				//�ڶ�����������ѡ��
				int b=(int) (Math.random()*tf+1);			
				if(zf==1) {//�и���
					int p=(int) (Math.random()*2);
						switch(p) {
						case 0:b=b*(-1);//ȡ����						   
							   System.out.print(b);break;
						case 1:
						   	   System.out.print(b);break;
						}
					}
					if(zf==0) {//û�и���						
							System.out.print(b);
							}
				//�Ⱥ�			
				System.out.println("=");			
				/*
				//������
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
		//ѧ���Ǹ�ѭ���Ľ�ֹ}
	}
	}



