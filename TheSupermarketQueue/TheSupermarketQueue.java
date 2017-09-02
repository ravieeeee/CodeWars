
public class TheSupermarketQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solveSuperMarketQueue(new int[] {4,4,7,3,7,3,5,4}, 5));
	}

	public static int solveSuperMarketQueue(int[] customers, int n) {
		int time = 0;
		
		// 계산대가 한 개인 경우
		if (n == 1) {
			for (int i = 0; i < customers.length; i++) {
				time += customers[i];
			}
			return time;
		}
		
		
		int count = 0;
		int[] tills = new int[n];
		
		// 계산대 초기화
		for (int i = 0; i < n; i++) {
			tills[i] = 0;
		}
		
		while (count < customers.length) {
			for (int i = 0; i < n; i++) {
				// 비사용중인 계산대 찾기
				if (tills[i] == 0) {
					tills[i] = customers[count++];
				}
				// boundaryException 방지
				if (count == customers.length) {
					break;
				}
			}
			
			boolean flag = true;
			while (flag && (count < customers.length)) {
				flag = tictoc(tills);
				time++;
			}
		}
		
		// 계산대에 고객이 남아있는 경우, tictoc대신 시간 옮기기(한명만 남을 수 있기때문에)
		int maxTime = 0;
		for (int i = 0; i < n; i++) {
			if (maxTime < tills[i]) {
				maxTime = tills[i];
			}
		}
		time += maxTime;
		
		return time;
	}
	
	public static boolean tictoc(int[] tills) {
		boolean flag = true;
		
		// 계산대 시간 1 감소
		for (int i = 0; i < tills.length; i++) {
			tills[i]--;
		}
		
		// 완료된 계산되가 있는지 확인
		for (int j = 0; j < tills.length; j++) {
			if (tills[j] == 0) {
				flag = false;
			}
		}
		return flag;
	}

}
