package myjava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Monney {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String name; //이름을 입력받을 변수
			int list[] = new int[5];
			int money=0;  //출장비를 입력받을 변수
			int T;  //출장비를 계산에 사용하기 위해 옮겨둘 변수
			int M;  //지폐의 단위를 넣을 변수
			int sw = 1; //지폐의 단위를 바꿀때 사용할 조건 스위치
			String yn;  //입력 정보 최종 확인 여부를 받을 변수
			
			loop: while(true){
				while(true){
					while(true){
						System.out.print("이름을 입력하세요 : ");
						name = scan.nextLine();
						if(name.equals("quit")){
							System.out.println("입력 종료");
							break loop;
						}
						break;
					}//name end
				try{
					while(true){
						System.out.print("출장비를 입력하세요 : ");
						money = scan.nextInt();
						break;
					}
				}catch(InputMismatchException e){
					System.out.println("숫자만 입력해야 합니다.");
				}//money end
					System.out.println("이름 : "+ name + " 님 | 출장비 : " + money +" 원");
					System.out.print("입력하신 정보가 맞으시면 y를 입력하세요. : ");
					scan = new Scanner(System.in);
					yn = scan.nextLine();
					
					if(yn.equals("y") || yn.equals("Y")){
							break loop;
						
						} else {
						System.out.println("정보를 다시 입력합니다.");
						}
				}//input end
				
			}  
			
			
			T = money;
			M = 50000;
			for(int i = 0; i < 4; i++) {
				list[i] = T/M;
				T = T-(list[i]*M);
				if(sw==1){ //지폐의 시작단위가 5라면 1로
					M=M/5;
					sw=0;

				}else{     //지폐의 시작단위가 1이면 5로
					M=M/2;
					sw=1;
					
				}

			}
			System.out.println("=================출장비지급표=================");
			System.out.println("성명\t지급액\t\t오만원 \t만원\t오천원\t천원");
			System.out.println(name +"\t"+money +"\t\t"+list[0]+"\t"+list[1]+"\t"+list[2]+"\t"+list[3]);
			
		}
	}	
	

