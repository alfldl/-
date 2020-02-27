package myjava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Monney {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int sum[] = new int[10]; //개인별 매수 합계
			int total[] = new int[10]; //총 매수 합계
			int i; //반복문을 돌릴 변수
			for(i=0;i<10;i++){ //전부 0으로 초기화
				sum[i]=0;
				total[i]=0;
			}
			String name; //이름을 입력받을 변수
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
			System.out.println("=================출장비지급표=================");
		    System.out.println("성명\t지급액\t\t오만원 \t만원\t오천원\t천원");
		    System.out.println(name +"\t"+money +"\t\t 5"+"\t 5" +"\t 0"+"\t 0");
		    

		
			
			
		}
	}	
	

