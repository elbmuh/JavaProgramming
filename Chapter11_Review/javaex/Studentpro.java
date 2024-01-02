package javaex;
import java.util.Scanner;

public class Studentpro {
	Student1[] arr = new Student1[3];
	Scanner sc = new Scanner(System.in);
	int tkor = 0, teng = 0, tmat = 0;
	int totMax = 0;
	
	// case 1 : 데이터 입력(번호, 이름, 국어점수, 영어점수, 수학점수)
	public void insert() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("번호 이름 국어 영어 수학 점수 : ");
			int num = sc.nextInt();
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int mat = sc.nextInt();
			Student1 stu = new Student1(num, name, kor, eng, mat);
			totAvg(stu); // 합계, 평균, 학점
			arr[i] = stu;
		}
		rank(arr); // 등수 저장
	}
	
	public void totAvg(Student1 stu) {
		stu.tot = stu.kor + stu.eng + stu.mat;
		stu.avg = ((stu.tot/3)*100)/100;
		if (stu.avg >= 90) stu.hak = "A";
		else if (stu.avg >= 80) stu.hak = "B";
		else if (stu.avg >= 70) stu.hak = "C";
		else stu.hak = "재시험";
	}
	
	// 등수 구하기
	public void rank(Student1[] stu) {
		for (int i = 0; i < stu.length; i++) {
			stu[i].rank = 1;
		}
		
		for (int i = 0; i < stu.length; i++) {
			for (int j = 0; j < stu.length; j++) {
				if (stu[i].avg < stu[j].avg) {
					stu[i].rank++;
				}
			}
		}
		
	}
	
	// case 2 : 전체 출력(번호, 이름, 국어점수, 영어점수, 수학점수, 총점, 평균, 학점, 등수)
	public void titleprint() {
		System.out.println("\n\t\t\t\t[성적표]");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점\t등수");
	}
	
	public void print() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				continue;
			}
			
			System.out.println(arr[i].num + "\t" + arr[i].name + "\t" + arr[i].kor + "\t" + arr[i].eng + 
					"\t" + arr[i].mat + "\t" + arr[i].tot + "\t" + arr[i].avg + "\t" + arr[i].hak + "\t" + arr[i].rank);
		}
		subTot(arr); // 과목별 충점 출력
		totMax(arr); // 가장 큰 총점 출력
	}
	
	public void print(Student1 stu) {
		System.out.println(stu.num + "\t" + stu.name + "\t" + stu.kor + "\t" + stu.eng + "\t" 
				+ stu.mat + "\t" + stu.tot + "\t" + stu.avg + "\t" + stu.hak + "\t" + stu.rank);
	}
	
	// 과목별 총점
	public void subTot(Student1[] stu) {
		tkor = 0;
		teng = 0;
		tmat = 0;
		for (int i = 0; i < stu.length; i++) {
			if (arr[i] == null) { continue; }
			tkor += stu[i].kor;
			teng += stu[i].eng;
			tmat += stu[i].mat;
		}
		subTotPrint(tkor, teng, tmat);
	}
	
	public void subTotPrint(int tkor, int teng, int tmat) {
		System.out.println("-----------------------------------");
		System.out.println("과목별 총점 " + tkor + "\t" + teng + "\t" + tmat);
	}
	
	// 가장 큰 총점
	public void totMax(Student1[] stu) {
		for (int i = 0; i < stu.length; i++) {
			if (arr[i] == null) { continue; }
			if (totMax < stu[i].tot) {
				totMax = stu[i].tot;
			}
		}
		System.out.println("가장 높은 총점 : " + totMax + "\n");
	}
	
	// case 3 : 번호를 검색하여 출력
	public void search(int num) {
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i].num) {
				System.out.println("[" + num + "번 데이터 출력]");
				titleprint();
				print(arr[i]);
			}
		}
	}
	
	// case 4 : 번호를 검색하여 삭제
	public boolean delete(int num) {
		boolean chk = true;
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i].num) {
				arr[i] = null;
				return chk;
			}
		}
		return !chk;
	}
	
	// case 5 : 오름차순 출력(기존 배열에서 수정)
	public int modify(int num) {
		String modifyChk = null;
		Student1 tmp = new Student1();
		
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i].num) {
				System.out.print(num + "번 데이터 수정\n이름 국어 영어 수학 점수 입력 : ");
				tmp.num = num;
				tmp.name = sc.next();
				tmp.kor = sc.nextInt();
				tmp.eng = sc.nextInt();
				tmp.mat = sc.nextInt();
				
				System.out.print("수정하시겠습니까? [Y/N] : ");
				modifyChk = sc.next();
				
				if (modifyChk.equalsIgnoreCase("Y")) {
					totAvg(tmp);
					arr[i] = tmp;
					rank(arr);
					
					return 0;
				}
				
				else return 1;
			}
		}
		return 2;
	}
	
	// case 6 : 등수 오름차순 출력
	public void ascending() {
		Student1 tmp = new Student1();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == null || arr[j] == null) {
					continue;
				}
				
				if (arr[i].rank > arr[j].rank) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.print("\n등수에 따른 오름차순 재정렬 ===>");
		titleprint();
		print();
	}
} // class