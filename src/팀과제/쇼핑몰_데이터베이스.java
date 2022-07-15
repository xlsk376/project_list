package 팀과제;

import java.util.Arrays;

public class 쇼핑몰_데이터베이스 {

	public static void main(String[] args) {
		
		String[][] memberList= { // 20, 18 
				{"1001", "seohye", "지서혜", "seohye@gmail.com", "6000", "2014", "12", "12", "경기도", "시흥", "여", "155", "22", "A", "010-1800-1800", "555", "볼링", "O"},
				{"1005", "jiho", "권지호", "jiho@naver.com", "600", "2014", "09", "16", "전라북도", "전주", "남", "175", "32", "D", "010-3200-3200", "1332", "독서", "O"},
				{"1007", "jungok", "이정옥", "jungok@naver.com", "3400", "2014", "07", "25", " ", "부산", "여", "160", "28", "B", "010-4200-4200", "1887", "양궁", "X"},
				{"1016", "hayun", "김하윤", "hayun@gmail.com", "3000", "2015", "05", "07", "경기도", "안양", "여", "160", "25", "B", "010-2000-2000", "666", "등산", "X"},
				{"1019", "seokju", "강석주", "seokju@gmail.com", "5700", "2015", "08", "09", " ", "광주", "남", "185", "35", "A", "010-2600-2600", "999", "캠핑", "O"},
				{"1024", "youngsun", "김영선", "youngsun@naver.com", "1400", "2015", "03", "15", " ", "대구", "여", "160", "42", "C", "010-3000-3000", "1221", "독서", "O"},
				{"1028", "gyubeom", "지규범", "gyubeom@naver.com", "9000", "2015", "07", "24", " ", "서울", "남", "175", "29", "A", "010-4000-4000", "1776", "요트", "X"},
				{"1033", "dong", "김동률", "dong@naver.com", "8400", "2015", "07", "06", " ", "서울", "남", "185", "27", "A", "010-4800-4800", "2220", "등산", "X"},
				{"1038", "daewoon", "조대운", "daewoon@gmail.com", "6700", "2015", "07", "02", " ", "인천", "남", "170", "28", "A", "010-4600-4600", "2109", "골프", "X"},
				{"1043", "kanghye", "임강혜", "kanghye@naver.com", "500", "2016", "11", "15", "경기도", "안산", "여", "165", "40", "D", "010-1600-1600", "444", "당구", "O"},
				{"1047", "jieon", "채지언", "jieon@naver.com", "3200", "2016", "09", "07", " ", "대전", "여", "155", "25", "B", "010-2800-2800", "1110", "캠핑", "X"},
				{"1052", "myunghye", "여명혜", "myunghye@naver.com", "5400", "2016", "08", "01", " ", "서울", "여", "155", "28", "A", "010-4400-4400", "1998", "당구", "X"},
				{"1057", "mihyeon", "박미현", "mihyeon@gmail.com", "1000", "2017", "02", "28", "강원도", "원주", "여", "160", "34", "C", "010-1400-1400", "333", "골프", "O"},
				{"1061", "munsik", "팽문식", "munsik@naver.com", "5000", "2018", "03", "02", " ", "서울", "남", "170", "50", "A", "010-1000-1000", "111", "독서", "O"},
				{"1066", "hyoun", "양현영", "hyoun@naver.com", "2500", "2018", "06", "27", "충청북도", "제천", "남", "175", "40", "C", "010-3800-3800", "1665", "펜싱", "O"},
				{"1071", "gyubaek", "송규백", "gyubaek@gmail.com", "3500", "2019", "02", "02", " ", "부산", "남", "175", "30", "B", "010-1200-1200", "222", "음악", "X"},
				{"1075", "yihong", "설이홍", "yihong@naver.com", "4500", "2019", "05", "19", "강원도", "춘천", "여", "160", "25", "B", "010-3600-3600", "1554", "서핑", "X"},
				{"1080", "iseo", "전이서", "iseo@naver.com", "100", "2020", "07", "08", " ", "부산", "여", "165", "29", "D", "010-2400-2400", "888", "승마", "O"},
				{"1085", "wooin", "채우인", "wooin@naver.com", "8000", "2020", "07", "24", "강원도", "삼척", "남", "180", "24", "A", "010-3400-3400", "1443", "음악", "O"},
				{"1090", "jungmin", "박중민", "jungmin@gmail.com", "1500", "2021", "05", "06", " ", "서울", "남", "180", "31", "C", "010-2200-2200", "777", "사격", "O"},
				};
		
				//상품테이블
				// {"상품번호","카테고리", "상품명", "판매가", "할인품목여부","할인가(20%)", "배송기간", "재고개수"}

		String[][] itemList= { // 40, 8
				{"1001","의류","반팔티","29000","할인","23200","2일","3500개"},
				{"1002","의류","청바지","112000","일반","0","2일","100개"},
				{"1003","의류","반팔셔츠","79000","일반","0","1일","1000개"},
				{"1004","의류","긴팔셔츠","99000","할인","79200","3일","800개"},
				{"1005","의류","양말","1000","일반","0","1일","10000개"},
				{"1006","의류","스타킹","3500","일반","0","1일","9000개"},
				{"1007","의류","스커트","35000","일반","0","4일","293개"},
				{"1008","의류","원피스","80000","할인","64000","4일","89개"},
				{"1009","의류","자켓","118000","할인","94400","5일","30개"},
				{"1010","의류","슬랙스","49000","일반","0","2일","978개"},

				{"2001","가전","TV","3000000", "일반", "0", "14일", "15개"},
				{"2002","가전","노트북","600000","할인", "480000", "7일", "46개"},
				{"2003","가전","청소기","150000","할인", "120000", "7일", "23개"},
				{"2004","가전","로봇청소기","990000","할인", "792000", "7일", "23개"},
				{"2005","가전","이어폰","90000","일반", "0", "3일", "6000개"},
				{"2006","가전","무선충전기","35000","할인", "28000", "4일", "68개"},
				{"2007","가전","모니터","650000","일반", "0", "3일", "102개"},
				{"2008","가전","충전케이블","12000","일반", "0", "2일", "4626개"},
				{"2009","가전","카메라","1267000","할인", "1013600", "10일", "13개"},
				{"2010","가전","에어컨","1897000","할인", "1517600", "10일", "15개"},

				{"3001","식품","돼지고기","21000","일반", "0"," 1일","100개"},
				{"3002","식품","소고기","43000","일반", "0"," 1일","81개"},
				{"3003","식품","유정란","9200","일반", "0"," 1일","100개"},
				{"3004","식품","닭가슴살","1190","일반", "0"," 1일","232개"},
				{"3005","식품","연어회","44000","할인", "0"," 3일","0개"},
				{"3006","식품","고등어","14100","일반", "0"," 1일","66개"},
				{"3007","식품","혼합7곡","19900","일반", "0"," 5일","100개"},
				{"3008","식품","양반김","6670","일반","0","3일","1213개"},
				{"3009","식품","바나나","3300", "할인", "2640", "2일", "1500개"},
				{"3010","식품","김치","19500","할인","15600","2일", "326개"},

				{"4001","화장품","폼클렌징","15000","할인","12000","3일","13000개"},
				{"4002","화장품","샴푸","20000","일반","0","3일", "11000개"},
				{"4003","화장품","바디워시","23000","할인", "18400", "2일", "900개"},
				{"4004","화장품","립밤","13000","일반", "0", "2일", "1300개"},
				{"4005","화장품","쉐이빙젤","9300","일반", "0", "3일", "4900개"},
				{"4006","화장품","미스트","29000","할인", "23200", "2일", "1211개"},
				{"4007","화장품","로션","39000","할인", "31200", "2일", "5687개"},
				{"4008","화장품","스킨","39000","할인", "31200", "2일", "7364개"},
				{"4009","화장품","선크림","25000","일반", "0", "2일", "4530개"},
				{"4010","화장품","향수","350000","할인", "280000", "4일", "56개"}
				};

		//주문테이블
		//[번호", "주문번호", "주문상품", "받는분", "결제금액", "주문상태", "결제방식", "수령할 주소", "무(유)료배송"]
		String orderList[][]= { // 12, 9
				{"01", "1111", "반팔티/청바지", "박미현", "134000", "배송중","신용카드","직접수령","무료배송"},
				{"02", "1112", "양말", "임강혜", "1000", "결제완료","무통장입금","직접수령","유료배송"},
				{"03", "1113", "샴푸/바디워시", "전이서", "38400", "상품처리중","신용카드","집앞","유료배송"},
				{"04", "1114", "TV", "강석주", "3000000", "결제완료","앱카드어플","경비실","무료배송"},
				{"05", "1115", "노트북", "채지언", "480000", "결제완료","무통장입금","집앞","무료배송"},
				{"06", "1116", "청소기", "김영선", "150000", "배송중","앱카드어플","경비실","무료배송"},
				{"07", "1117", "소고기/바나나", "권지호", "45640", "상품처리중","신용카드","직접수령"},
				{"08", "1118", "고등어", "설이홍", "14100", "배송중","무통장입금","경비실","유료배송"},
				{"09", "1119", "김치", "양현영", "15600", "상품처리중","앱카드어플","집앞","유료배송"},
				{"10", "1120", "노트북", "팽문식", "480000", "배송중","신용카드","직접수령","무료배송"},
				{"11", "1121", "고등어", "조대운", "14100", "배송완료","무통장입금","직접수령","무료배송"},
				{"12", "1122", "에어컨", "채우인", "1517600", "배송중","무통장입금","집앞","무료배송"}
				};
		
				/*
				 * 11.식품을 구매한 사람조회 -권지호,설이홍,양현영,조대운
				 * 
				 * 12.제품을 2개이상 구매한사람조회 -박미현,전이서,권지호
				 * 
				 * 13.10만원이상제품의 상품번호 조회 - 1002, 1009, 2001, 2002, 2003, 2004, 2007, 2009, 2010, 4010
				 * 
				 * 14.아이디에 'b'가들어간 사람의 번호 조회 - 1028, 1071
				 * 
				 * 15.의류를 구매한 회원 중 160cm 이하인 회원을 조회하세요. - 박미현
				 * 
				 * 16.상품번호가 2000번대인 상품 중에 판매가가 가장 낮은 상품을 조회하세요. - 충전케이블
				 * 
				 * 17.회원등급이 A이고 구독제 회원인 사람이 구매한 상품조회 - TV, 노트북, 에어컨
				 * 
				 * 18.가전을 구매한 회원 중 A등급 회원을 조회하세요. - 강석주, 팽문식, 채우인
				 * 
				 * 19.할인품목에서 재고가 없는 상품을 조회하세요. -연어회 
				 * 
				 * 20.같은 상품을 구매한 사람 중 무료배송인 사람을 조회하세요 - 팽문식, 조대운, 채지언
				 */
		
		// 11.식품을 구매한 사람조회 - 권지호,설이홍,양현영,조대운
//		for(int i = 0; i < itemList.length; i++) {
//			if(itemList[i][1].equals("식품")) {
//				//System.out.println(itemList[i][2]);
//				for(int j = 0; j < orderList.length; j++) {
//					String[] orderToken = orderList[j][2].split("/");
//					if(itemList[i][2].equals(orderToken[0])) {
//						System.out.println(orderList[j][3]);
//					}
//				}
//			}
//		}
		
		// 12.제품을 2개이상 구매한 사람 조회 - 박미현, 전이서, 권지호
//		for(int i = 0; i < orderList.length; i++) {
//			for(int j = 0; j < orderList[i][2].length(); j++) {
//				char a = orderList[i][2].charAt(j);
//				if(a == '/') {
//					System.out.println(orderList[i][3]);
//				}
//			}
//		}
		
		// 13.10만원 이상 상품번호 조회 - 1002, 1009, 2001, 2002, 2003, 2004, 2007, 2009, 2010, 4010
//		int[] temp = new int[itemList.length];
//		for(int i = 0; i < itemList.length; i++) {
//			temp[i] = Integer.parseInt(itemList[i][3]);
//			if(temp[i] >= 100000) {
//				System.out.println(itemList[i][0]);
//			}
//		}
		
		//14.아이디에 'b'가들어간 사람의 번호 조회 - 1028, 1071
//		for(int i = 0; i < memberList.length; i++) {
//			for(int j = 0; j < memberList[i][1].length(); j++) {
//				char temp = memberList[i][1].charAt(j);
//				if(temp == 'b') {
//					System.out.println(memberList[i][0]);
//				}
//			}
//		}
		
		//15.의류를 구매한 회원 중 160cm 이하인 회원을 조회하세요. - 박미현 
//		int[] index = new int[orderList.length];
//		for(int i = 0; i < orderList.length; i++) {
//			for(int j = 0; j < orderList[i][2].length(); j++) {
//				char a = orderList[i][2].charAt(j);
//				if(a == '/') {
//					index[i] = i;
//				}
//			}
//		}
//		//System.out.println(Arrays.toString(index));
//		String[][] temp = new String[orderList.length][2];
//		for(int i = 0; i < orderList.length; i++) {
//			if(i == index[i]) {
//				String[] temp2 = orderList[index[i]][2].split("/");
//				temp[index[i]][0] = temp2[0];
//				temp[index[i]][1] = temp2[1];
//			}else {
//				temp[i][0] = orderList[i][2];
//			}
//		}
//		for(int i = 0; i < orderList.length; i++) {
//			System.out.println(Arrays.toString(temp[i]));
//		}
//		// temp 는 주문한 물품
//		int[] index2 = new int[orderList.length];
//		for(int i = 0; i < index2.length; i++) {
//			index2[i] = -1;
//		}
//		int a = 0;
//		for(int i = 0; i < itemList.length; i++) {
//			if(itemList[i][1].equals("의류")) {
//				for(int j = 0; j < temp.length; j++) {
//					if(itemList[i][2].equals(temp[j][0]) || itemList[i][2].equals(temp[j][1])) {
//						index2[a] = j;
//						a += 1;
//					}
//				}
//			}
//		}
//		int[] index3 = new int[a];
//		for(int i = 0; i < index3.length; i++) {
//			index3[i] = -1;
//		}
//		int b = 0;
//		for(int i = 0; i < a; i++) {
//			boolean check = false;
//			for(int j = 0; j < a; j++) {
//				if(index2[i] == index3[j]) {
//					check = true;
//				}
//			}
//			if(check == false) {
//				index3[b] = index2[i];
//				b += 1;
//			}
//		}
//		System.out.println(Arrays.toString(index3));
//		for(int i = 0; i < index3.length; i++) {
//			if(index3[i] != -1) {
//				//System.out.println(orderList[i][3]);
//				for(int j = 0; j < memberList.length; j++) {
//					if(orderList[i][3].equals(memberList[j][2])) {
//						int temp3 = Integer.parseInt(memberList[j][11]);
//						if(temp3 <= 160) {
//							System.out.println(memberList[j][2]);
//						}
//					}
//				}
//			}
//		}
		  
		//16. 상품번호가 2000번대인 상품 중에 판매가가 가장 낮은 상품을 조회하세요. - 충전케이블
//		int max = 0;
//		for(int i = 0 ; i < itemList.length; i++) {
//			int temp = Integer.parseInt(itemList[i][0]);
//			if(temp >= 2000 && temp < 3000) {
//				int temp2 = Integer.parseInt(itemList[i][3]);
//				if(max < temp2) {
//					max = temp2;
//				}
//			}
//		}
//		int index = 0;
//		int min = max;
//		for(int i = 0; i < itemList.length; i++) {
//			int temp = Integer.parseInt(itemList[i][0]);
//			if(temp >= 2000 && temp < 3000) {
//				//System.out.println(itemList[i][2]);
//				int temp2 = Integer.parseInt(itemList[i][3]);
//				if(min > temp2) {
//					min = temp2;
//					index = i;
//				}
//			}
//		}
//		System.out.println(itemList[index][2]);
		 
		//17.회원등급이 A이고 구독제 회원인 사람이 구매한 상품조회 - TV, 노트북, 에어컨
//		for(int i = 0; i < memberList.length; i++) {
//			if(memberList[i][13].equals("A")) {
//				if(memberList[i][17].equals("O")) {
//					//System.out.println(memberList[i][2]);
//					for(int j = 0; j < orderList.length; j++) {
//						if(memberList[i][2].equals(orderList[j][3])) {
//							System.out.println(orderList[j][2]);
//						}
//					}
//				}
//			}
//		}
		//18.가전을 구매한 회원 중 A등급 회원을 조회하세요. - 강석주, 팽문식, 채우인
//		int[] index = new int[orderList.length];
//		for(int i = 0; i < orderList.length; i++) {
//			for(int j = 0; j < orderList[i][2].length(); j++) {
//				char a = orderList[i][2].charAt(j);
//				if(a == '/') {
//					index[i] = i;
//				}
//			}
//		}
//		//System.out.println(Arrays.toString(index));
//		String[][] temp = new String[orderList.length][2];
//		for(int i = 0; i < orderList.length; i++) {
//			if(i == index[i]) {
//				String[] temp2 = orderList[index[i]][2].split("/");
//				temp[index[i]][0] = temp2[0];
//				temp[index[i]][1] = temp2[1];
//			}else {
//				temp[i][0] = orderList[i][2];
//			}
//		}
//		for(int i = 0; i < orderList.length; i++) {
//			System.out.println(Arrays.toString(temp[i]));
//		}
//		// temp 는 주문한 물품
//		int[] index2 = new int[orderList.length];
//		for(int i = 0; i < index2.length; i++) {
//			index2[i] = -1;
//		}
//		int a = 0;
//		for(int i = 0; i < itemList.length; i++) {
//			if(itemList[i][1].equals("가전")) {
//				for(int j = 0; j < temp.length; j++) {
//					if(itemList[i][2].equals(temp[j][0]) || itemList[i][2].equals(temp[j][1])) {
//						index2[a] = j;
//						a += 1;
//					}
//				}
//			}
//		}
//		//System.out.println(Arrays.toString(index2));
//		int[] index3 = new int[a];
//		for(int i = 0; i < index3.length; i++) {
//			index3[i] = -1;
//		}
//		int b = 0;
//		for(int i = 0; i < index3.length; i++) {
//			boolean check = false;
//			for(int j = 0; j < index3.length; j++) {
//				if(index2[i] == index3[j]) {
//					check = true;
//					break;
//				}
//			}
//			if(check == false) {
//				index3[b] = index2[i];
//				b += 1;
//			}
//		}
//		//System.out.println(Arrays.toString(index3));
//		for(int i = 0; i < index3.length; i++) {
//			for(int j = 0; j < memberList.length; j++) {
//				if(orderList[index3[i]][3].equals(memberList[j][2])) {
//					if(memberList[j][13].equals("A")) {
//						System.out.println(memberList[j][2]);
//					}
//				}
//			}
//		}
		
		 
		//19. 할인품목에서 재고가 없는 상품을 조회하세요. -연어회 -> 연어회 할인으로 변경
//		for(int i = 0; i < itemList.length; i++) {
//			if(itemList[i][7].equals("0개")) {
//				if(itemList[i][4].equals("할인")) {
//					System.out.println(itemList[i][2]);
//				}
//			}
//		}
		
		//20.같은 상품을 구매한 사람 중 무료배송인 사람을 조회하세요 - 팽문식, 조대운, 채지언
		int[] index = new int[orderList.length];
		for(int i = 0; i < orderList.length; i++) {
			for(int j = 0; j < orderList[i][2].length(); j++) {
				char a = orderList[i][2].charAt(j);
				if(a == '/') {
					index[i] = i;
				}
			}
		}
		//System.out.println(Arrays.toString(index));
		String[][] temp = new String[orderList.length][2];
		for(int i = 0; i < orderList.length; i++) {
			if(i == index[i]) {
				String[] temp2 = orderList[index[i]][2].split("/");
				temp[index[i]][0] = temp2[0];
				temp[index[i]][1] = temp2[1];
			}else {
				temp[i][0] = orderList[i][2];
			}
		}
//		for(int i = 0; i < orderList.length; i++) {
//			System.out.println(Arrays.toString(temp[i]));
//		}
		// temp 는 주문한 물품
		for(int i = 0; i < orderList.length; i++) {
			for(int j = 0; j < orderList.length; j++) {
				if(i != j && temp[i][0].equals(temp[j][0])) {
					if(orderList[j][8].equals("무료배송")) {
						System.out.println(orderList[j][3]);
					}
				}
			}
		}
		
		
		
		

	}

}
