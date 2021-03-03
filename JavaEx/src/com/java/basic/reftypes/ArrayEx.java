package com.java.basic.reftypes;

public class ArrayEx {

	public static void main(String[] args) {
		//arrayBasic();
		//twoDimens();
		//arrayCopyFor();
		arrayCopySystem();
	}

	//배열 복사 sstem 이용
	private static void arrayCopySystem() {
		int scoure[] = {1,2,3};
		int target[] = new int [10];
		
		System.arraycopy(scoure,//원본
				0,//시작 위치
				target,//타켓 배열
				0,//타켓의 시작 위치
				scoure.length//길이
				);
		for(int i=0;i<target.length;i++) {
			System.out.print(target[i]+"\t");
		}
		System.out.println();
		
		//복사 for문
		for(int ccc : target) {
			System.out.print(ccc+"    ");
		}
		System.out.println();
	}
	//배열 복사
	private static void arrayCopyFor() {
		//배열 크기에 따라 공간 확보를 위한
		//새로운 배열을 만듬 복사
		int scource[] = {1,2,3};
		int targer[] = new int[10];
		
		for(int i=0;i<scource.length;i++){
			targer[i] = scource[i];
		}
		for(int i=0;i<targer.length;i++) {
			System.out.print(targer[i]+" ");
		}
		System.out.println();
	}
	
	
	
	private static void twoDimens() {
		int[][] twoDimens = new int [5][10];//5행 10열
		
		//기본 데이터 있을 경우 초기화
		int table[][] = {{1,2,3,4,5},{2,3,4,5,6},{3,4,5,6,7}
	};//3행 5열
		System.out.println("length of table: "+table.length);//행수만 나옴
		System.out.println("length of table[0]: "+table[0].length);// table[0]의 열수
		//table 배열의 모든 값을 합산
		int total =0;
		for(int i =0;i<table.length;i++) {
			for(int j=0;j<table[i].length;j++) {
				total= total +table[i][j];//total+=table[i][j]
				
			}
		}
		System.out.println("배열요소의 합: "+total);
	}
	private static void arrayBasic() {
		//배열 선언
		String[] names; //타입[] 식별자
		int scores[];//타입 식별자[]
		
		// 초기화
		names = new String[] {
				"홍길동","장경산","전우치","김삿갓"
		};
		
		//System.out.println(names);
		
		scores = new int[4];//4개의 공간 배열
		//공간 접근 인덱스
		System.out.println("length of scores: "+ scores.length);
		scores[0] =80;
		scores[1] =75;
		scores[2] =44;
		scores[3] =55;
		//scores[4] =100;  범위 벗어나 에러남
		
		//System.out.println(scores);
		//값이 있을 경우
		float height[] = {
				178.5f,444.44f,123.12f,458.5f
		};
		
		for(int i =0;i<names.length;i++) {
			//index 범위 0~length-1  까지
			System.out.printf("%s(%.2f): score =%d%n",names[i],height[i],scores[i]);
		}
		//참조 복사 scores2 를 바꾸면 scores 도 바뀜
		int[] scores2 = scores;
		System.out.println("scores의 scores2는 같은가?"+(scores == scores2));
		
		scores2[3] = 111;
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		
		}
	}
	
}
