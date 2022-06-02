import java.util.Arrays;

public class PrimitiveTypeArrayStudentMain {
	public static void main(String[] args) {

		// 배열객체 생성 초기화

		System.out.println("----학생10명데이타를 저장하기위한 배열객체생성 초기화----");
		int[] noArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String[] nameArray = { "KIM", "LEE", "PARK", "CHOI", "SIM", "KIM", "PIM", "MIN", "AIM", "LIM" };
		int[] korArray = { 90, 45, 88, 66, 98, 93, 80, 61, 72, 80 };
		int[] engArray = { 32, 46, 74, 96, 68, 98, 72, 91, 32, 99 };
		int[] mathArray = { 39, 89, 34, 46, 54, 23, 90, 85, 73, 34 };
		int[] totArray = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		double[] avgArray = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		char[] gradeArray = { 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F' };
		int[] rankArray = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

		// 총점,평균,평점계산

		for (int i = 0; i < noArray.length; i++) {
			// 총점
			totArray[i] = korArray[i] + engArray[i] + mathArray[i];
			// 평균
			avgArray[i] = totArray[i] / 3.0;
			// 평점
			if (avgArray[i] >= 90) {
				gradeArray[i] = 'A';
			} else if (avgArray[i] >= 80) {
				gradeArray[i] = 'B';
			} else if (avgArray[i] >= 70) {
				gradeArray[i] = 'C';
			} else if (avgArray[i] >= 60) {
				gradeArray[i] = 'D';
			} else {
				gradeArray[i] = 'F';
			}

		}

		// 총점으로석차계산

		// 1번학생(index = 0)석차계산

		for (int j = 0; j < totArray.length; j++) {
			if (totArray[0] < totArray[j]) {
				rankArray[0] = rankArray[0] + 1;
			}
		}

		// 2번학생(index = 1)석차계산

		for (int j = 0; j < totArray.length; j++) {
			if (totArray[1] < totArray[j]) {
				rankArray[1]++;
			}
		}

		// 3번학생석차계산
		for (int j = 0; j < totArray.length; j++) {
			if (totArray[2] < totArray[j]) {
				rankArray[2]++;
			}
		}

		// 4번학생석차계산
		for (int j = 0; j < totArray.length; j++) {
			if (totArray[3] < totArray[j]) {
				rankArray[3]++;
			}
		}

		// 5번학생석차계산
		for (int j = 0; j < totArray.length; j++) {
			if (totArray[4] < totArray[j]) {
				rankArray[4]++;
			}
		}

		// 6번학생석차계산
		for (int j = 0; j < totArray.length; j++) {
			if (totArray[5] < totArray[j]) {
				rankArray[5]++;
			}
		}

		// 7번학생석차계산
		for (int j = 0; j < totArray.length; j++) {
			if (totArray[6] < totArray[j]) {
				rankArray[6]++;
			}
		}

		// 8번학생석차계산
		for (int j = 0; j < totArray.length; j++) {
			if (totArray[7] < totArray[j]) {
				rankArray[7]++;
			}
		}

		// 9번학생석차계산
		for (int j = 0; j < totArray.length; j++) {
			if (totArray[8] < totArray[j]) {
				rankArray[8]++;
			}
		}

		// 10번학생석차계산
		for (int j = 0; j < totArray.length; j++) {
			if (totArray[9] < totArray[j]) {
				rankArray[9]++;
			}
		}

		// 학생검색(번호,국어,영어,수학,학점)

		// 번호3번인 학생 1명찾아서 1명정보출력(학생번호는 중복되지않는다.)

		System.out.println(">>번호 3번인 학생 찾아서 1명 정보출력(학생번호는 중복되지않는다.)");
		for (int i = 0; i < noArray.length; i++) {
			if (noArray[i] == 3) {
				System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
				break;
			}
		}

		// 국어점수 80점인 학생들 여러명 찾아서 여러명정보출력

		System.out.println(">>국어점수 80점인 학생들 여러명 찾아서 여러명정보출력");
		for (int i = 0; i < korArray.length; i++) {
			if (korArray[i] == 80) {
				System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
				continue;
			}
		}

		// 영어점수 50점이하인 학생들 여러명 찾아서 여러명정보출력

		System.out.println(">>영어점수 50점이하인 학생들 여러명 찾아서 여러명정보출력");
		for (int i = 0; i < engArray.length; i++) {
			if (engArray[i] <= 50) {
				System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
				continue;
			}
		}

		// 수학점수 70점이상인 학생들 여러명 찾아서 여러명정보출력

		System.out.println(">>수학점수 70점이상인 학생들 여러명 찾아서 여러명정보출력");
		for (int i = 0; i < mathArray.length; i++) {
			if (mathArray[i] >= 70) {
				System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
				continue;
			}
		}

		// 학점이 D학점이하인 학생모두찾아서 여러명 정보출력

		System.out.println(">>학점이 D학점이하인 학생모두찾아서 여러명 정보출력");
		for (int i = 0; i < gradeArray.length; i++) {
			if (gradeArray[i] >= 'D') {
				System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
				continue;
			}
		}

		/*
		 * 정렬
		 * 1.오름차순(1,2,3,4,5..../a,b,c,d,e..../가,나,다...힣)
		 * 2.내림차순(5,4,3,2,1/ z,x,y.../ 힣...가)
		 */

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>> 정렬전  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.printf("%s %3s %s %s %s %s %3s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------\n");
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
					engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);

		}

	
	}
}
