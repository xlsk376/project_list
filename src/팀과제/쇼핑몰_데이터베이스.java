package ??????;

import java.util.Arrays;

public class ???θ?_?????ͺ??̽? {

	public static void main(String[] args) {
		
		String[][] memberList= { // 20, 18 
				{"1001", "seohye", "??????", "seohye@gmail.com", "6000", "2014", "12", "12", "???⵵", "????", "??", "155", "22", "A", "010-1800-1800", "555", "????", "O"},
				{"1005", "jiho", "????ȣ", "jiho@naver.com", "600", "2014", "09", "16", "?????ϵ?", "????", "??", "175", "32", "D", "010-3200-3200", "1332", "????", "O"},
				{"1007", "jungok", "??????", "jungok@naver.com", "3400", "2014", "07", "25", " ", "?λ?", "??", "160", "28", "B", "010-4200-4200", "1887", "????", "X"},
				{"1016", "hayun", "??????", "hayun@gmail.com", "3000", "2015", "05", "07", "???⵵", "?Ⱦ?", "??", "160", "25", "B", "010-2000-2000", "666", "????", "X"},
				{"1019", "seokju", "??????", "seokju@gmail.com", "5700", "2015", "08", "09", " ", "????", "??", "185", "35", "A", "010-2600-2600", "999", "ķ??", "O"},
				{"1024", "youngsun", "?迵??", "youngsun@naver.com", "1400", "2015", "03", "15", " ", "?뱸", "??", "160", "42", "C", "010-3000-3000", "1221", "????", "O"},
				{"1028", "gyubeom", "???Թ?", "gyubeom@naver.com", "9000", "2015", "07", "24", " ", "????", "??", "175", "29", "A", "010-4000-4000", "1776", "??Ʈ", "X"},
				{"1033", "dong", "?赿??", "dong@naver.com", "8400", "2015", "07", "06", " ", "????", "??", "185", "27", "A", "010-4800-4800", "2220", "????", "X"},
				{"1038", "daewoon", "??????", "daewoon@gmail.com", "6700", "2015", "07", "02", " ", "??õ", "??", "170", "28", "A", "010-4600-4600", "2109", "????", "X"},
				{"1043", "kanghye", "?Ӱ???", "kanghye@naver.com", "500", "2016", "11", "15", "???⵵", "?Ȼ?", "??", "165", "40", "D", "010-1600-1600", "444", "?籸", "O"},
				{"1047", "jieon", "ä????", "jieon@naver.com", "3200", "2016", "09", "07", " ", "????", "??", "155", "25", "B", "010-2800-2800", "1110", "ķ??", "X"},
				{"1052", "myunghye", "??????", "myunghye@naver.com", "5400", "2016", "08", "01", " ", "????", "??", "155", "28", "A", "010-4400-4400", "1998", "?籸", "X"},
				{"1057", "mihyeon", "?ڹ???", "mihyeon@gmail.com", "1000", "2017", "02", "28", "??????", "????", "??", "160", "34", "C", "010-1400-1400", "333", "????", "O"},
				{"1061", "munsik", "?ع???", "munsik@naver.com", "5000", "2018", "03", "02", " ", "????", "??", "170", "50", "A", "010-1000-1000", "111", "????", "O"},
				{"1066", "hyoun", "??????", "hyoun@naver.com", "2500", "2018", "06", "27", "??û?ϵ?", "??õ", "??", "175", "40", "C", "010-3800-3800", "1665", "????", "O"},
				{"1071", "gyubaek", "?۱Թ?", "gyubaek@gmail.com", "3500", "2019", "02", "02", " ", "?λ?", "??", "175", "30", "B", "010-1200-1200", "222", "????", "X"},
				{"1075", "yihong", "????ȫ", "yihong@naver.com", "4500", "2019", "05", "19", "??????", "??õ", "??", "160", "25", "B", "010-3600-3600", "1554", "????", "X"},
				{"1080", "iseo", "???̼?", "iseo@naver.com", "100", "2020", "07", "08", " ", "?λ?", "??", "165", "29", "D", "010-2400-2400", "888", "?¸?", "O"},
				{"1085", "wooin", "ä????", "wooin@naver.com", "8000", "2020", "07", "24", "??????", "??ô", "??", "180", "24", "A", "010-3400-3400", "1443", "????", "O"},
				{"1090", "jungmin", "???߹?", "jungmin@gmail.com", "1500", "2021", "05", "06", " ", "????", "??", "180", "31", "C", "010-2200-2200", "777", "????", "O"},
				};
		
				//??ǰ???̺?
				// {"??ǰ??ȣ","ī?װ???", "??ǰ??", "?ǸŰ?", "????ǰ?񿩺?","???ΰ?(20%)", "???۱Ⱓ", "????????"}

		String[][] itemList= { // 40, 8
				{"1001","?Ƿ?","????Ƽ","29000","????","23200","2??","3500??"},
				{"1002","?Ƿ?","û????","112000","?Ϲ?","0","2??","100??"},
				{"1003","?Ƿ?","???ȼ???","79000","?Ϲ?","0","1??","1000??"},
				{"1004","?Ƿ?","???ȼ???","99000","????","79200","3??","800??"},
				{"1005","?Ƿ?","?縻","1000","?Ϲ?","0","1??","10000??"},
				{"1006","?Ƿ?","??Ÿŷ","3500","?Ϲ?","0","1??","9000??"},
				{"1007","?Ƿ?","??ĿƮ","35000","?Ϲ?","0","4??","293??"},
				{"1008","?Ƿ?","???ǽ?","80000","????","64000","4??","89??"},
				{"1009","?Ƿ?","????","118000","????","94400","5??","30??"},
				{"1010","?Ƿ?","??????","49000","?Ϲ?","0","2??","978??"},

				{"2001","????","TV","3000000", "?Ϲ?", "0", "14??", "15??"},
				{"2002","????","??Ʈ??","600000","????", "480000", "7??", "46??"},
				{"2003","????","û?ұ?","150000","????", "120000", "7??", "23??"},
				{"2004","????","?κ?û?ұ?","990000","????", "792000", "7??", "23??"},
				{"2005","????","?̾???","90000","?Ϲ?", "0", "3??", "6000??"},
				{"2006","????","??????????","35000","????", "28000", "4??", "68??"},
				{"2007","????","??????","650000","?Ϲ?", "0", "3??", "102??"},
				{"2008","????","???????̺?","12000","?Ϲ?", "0", "2??", "4626??"},
				{"2009","????","ī?޶?","1267000","????", "1013600", "10??", "13??"},
				{"2010","????","??????","1897000","????", "1517600", "10??", "15??"},

				{"3001","??ǰ","????????","21000","?Ϲ?", "0"," 1??","100??"},
				{"3002","??ǰ","?Ұ???","43000","?Ϲ?", "0"," 1??","81??"},
				{"3003","??ǰ","??????","9200","?Ϲ?", "0"," 1??","100??"},
				{"3004","??ǰ","?߰?????","1190","?Ϲ?", "0"," 1??","232??"},
				{"3005","??ǰ","????ȸ","44000","????", "0"," 3??","0??"},
				{"3006","??ǰ","??????","14100","?Ϲ?", "0"," 1??","66??"},
				{"3007","??ǰ","ȥ??7??","19900","?Ϲ?", "0"," 5??","100??"},
				{"3008","??ǰ","???ݱ?","6670","?Ϲ?","0","3??","1213??"},
				{"3009","??ǰ","?ٳ???","3300", "????", "2640", "2??", "1500??"},
				{"3010","??ǰ","??ġ","19500","????","15600","2??", "326??"},

				{"4001","ȭ??ǰ","??Ŭ??¡","15000","????","12000","3??","13000??"},
				{"4002","ȭ??ǰ","??Ǫ","20000","?Ϲ?","0","3??", "11000??"},
				{"4003","ȭ??ǰ","?ٵ?????","23000","????", "18400", "2??", "900??"},
				{"4004","ȭ??ǰ","????","13000","?Ϲ?", "0", "2??", "1300??"},
				{"4005","ȭ??ǰ","???̺???","9300","?Ϲ?", "0", "3??", "4900??"},
				{"4006","ȭ??ǰ","?̽?Ʈ","29000","????", "23200", "2??", "1211??"},
				{"4007","ȭ??ǰ","?μ?","39000","????", "31200", "2??", "5687??"},
				{"4008","ȭ??ǰ","??Ų","39000","????", "31200", "2??", "7364??"},
				{"4009","ȭ??ǰ","??ũ??","25000","?Ϲ?", "0", "2??", "4530??"},
				{"4010","ȭ??ǰ","????","350000","????", "280000", "4??", "56??"}
				};

		//?ֹ????̺?
		//[??ȣ", "?ֹ???ȣ", "?ֹ???ǰ", "?޴º?", "?????ݾ?", "?ֹ?????", "????????", "?????? ?ּ?", "??(??)??????"]
		String orderList[][]= { // 12, 9
				{"01", "1111", "????Ƽ/û????", "?ڹ???", "134000", "??????","?ſ?ī??","????????","????????"},
				{"02", "1112", "?縻", "?Ӱ???", "1000", "?????Ϸ?","???????Ա?","????????","????????"},
				{"03", "1113", "??Ǫ/?ٵ?????", "???̼?", "38400", "??ǰó????","?ſ?ī??","????","????????"},
				{"04", "1114", "TV", "??????", "3000000", "?????Ϸ?","??ī??????","??????","????????"},
				{"05", "1115", "??Ʈ??", "ä????", "480000", "?????Ϸ?","???????Ա?","????","????????"},
				{"06", "1116", "û?ұ?", "?迵??", "150000", "??????","??ī??????","??????","????????"},
				{"07", "1117", "?Ұ???/?ٳ???", "????ȣ", "45640", "??ǰó????","?ſ?ī??","????????"},
				{"08", "1118", "??????", "????ȫ", "14100", "??????","???????Ա?","??????","????????"},
				{"09", "1119", "??ġ", "??????", "15600", "??ǰó????","??ī??????","????","????????"},
				{"10", "1120", "??Ʈ??", "?ع???", "480000", "??????","?ſ?ī??","????????","????????"},
				{"11", "1121", "??????", "??????", "14100", "???ۿϷ?","???????Ա?","????????","????????"},
				{"12", "1122", "??????", "ä????", "1517600", "??????","???????Ա?","????","????????"}
				};
		
				/*
				 * 11.??ǰ?? ?????? ??????ȸ -????ȣ,????ȫ,??????,??????
				 * 
				 * 12.??ǰ?? 2???̻? ?????ѻ?????ȸ -?ڹ???,???̼?,????ȣ
				 * 
				 * 13.10?????̻???ǰ?? ??ǰ??ȣ ??ȸ - 1002, 1009, 2001, 2002, 2003, 2004, 2007, 2009, 2010, 4010
				 * 
				 * 14.???̵??? 'b'????? ?????? ??ȣ ??ȸ - 1028, 1071
				 * 
				 * 15.?Ƿ??? ?????? ȸ?? ?? 160cm ?????? ȸ???? ??ȸ?ϼ???. - ?ڹ???
				 * 
				 * 16.??ǰ??ȣ?? 2000?????? ??ǰ ?߿? ?ǸŰ??? ???? ???? ??ǰ?? ??ȸ?ϼ???. - ???????̺?
				 * 
				 * 17.ȸ???????? A?̰? ?????? ȸ???? ?????? ?????? ??ǰ??ȸ - TV, ??Ʈ??, ??????
				 * 
				 * 18.?????? ?????? ȸ?? ?? A???? ȸ???? ??ȸ?ϼ???. - ??????, ?ع???, ä????
				 * 
				 * 19.????ǰ?񿡼? ?????? ???? ??ǰ?? ??ȸ?ϼ???. -????ȸ 
				 * 
				 * 20.???? ??ǰ?? ?????? ???? ?? ?????????? ?????? ??ȸ?ϼ??? - ?ع???, ??????, ä????
				 */
		
		// 11.??ǰ?? ?????? ??????ȸ - ????ȣ,????ȫ,??????,??????
//		for(int i = 0; i < itemList.length; i++) {
//			if(itemList[i][1].equals("??ǰ")) {
//				//System.out.println(itemList[i][2]);
//				for(int j = 0; j < orderList.length; j++) {
//					String[] orderToken = orderList[j][2].split("/");
//					if(itemList[i][2].equals(orderToken[0])) {
//						System.out.println(orderList[j][3]);
//					}
//				}
//			}
//		}
		
		// 12.??ǰ?? 2???̻? ?????? ???? ??ȸ - ?ڹ???, ???̼?, ????ȣ
//		for(int i = 0; i < orderList.length; i++) {
//			for(int j = 0; j < orderList[i][2].length(); j++) {
//				char a = orderList[i][2].charAt(j);
//				if(a == '/') {
//					System.out.println(orderList[i][3]);
//				}
//			}
//		}
		
		// 13.10???? ?̻? ??ǰ??ȣ ??ȸ - 1002, 1009, 2001, 2002, 2003, 2004, 2007, 2009, 2010, 4010
//		int[] temp = new int[itemList.length];
//		for(int i = 0; i < itemList.length; i++) {
//			temp[i] = Integer.parseInt(itemList[i][3]);
//			if(temp[i] >= 100000) {
//				System.out.println(itemList[i][0]);
//			}
//		}
		
		//14.???̵??? 'b'????? ?????? ??ȣ ??ȸ - 1028, 1071
//		for(int i = 0; i < memberList.length; i++) {
//			for(int j = 0; j < memberList[i][1].length(); j++) {
//				char temp = memberList[i][1].charAt(j);
//				if(temp == 'b') {
//					System.out.println(memberList[i][0]);
//				}
//			}
//		}
		
		//15.?Ƿ??? ?????? ȸ?? ?? 160cm ?????? ȸ???? ??ȸ?ϼ???. - ?ڹ??? 
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
//		// temp ?? ?ֹ??? ??ǰ
//		int[] index2 = new int[orderList.length];
//		for(int i = 0; i < index2.length; i++) {
//			index2[i] = -1;
//		}
//		int a = 0;
//		for(int i = 0; i < itemList.length; i++) {
//			if(itemList[i][1].equals("?Ƿ?")) {
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
		  
		//16. ??ǰ??ȣ?? 2000?????? ??ǰ ?߿? ?ǸŰ??? ???? ???? ??ǰ?? ??ȸ?ϼ???. - ???????̺?
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
		 
		//17.ȸ???????? A?̰? ?????? ȸ???? ?????? ?????? ??ǰ??ȸ - TV, ??Ʈ??, ??????
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
		//18.?????? ?????? ȸ?? ?? A???? ȸ???? ??ȸ?ϼ???. - ??????, ?ع???, ä????
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
//		// temp ?? ?ֹ??? ??ǰ
//		int[] index2 = new int[orderList.length];
//		for(int i = 0; i < index2.length; i++) {
//			index2[i] = -1;
//		}
//		int a = 0;
//		for(int i = 0; i < itemList.length; i++) {
//			if(itemList[i][1].equals("????")) {
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
		
		 
		//19. ????ǰ?񿡼? ?????? ???? ??ǰ?? ??ȸ?ϼ???. -????ȸ -> ????ȸ ???????? ????
//		for(int i = 0; i < itemList.length; i++) {
//			if(itemList[i][7].equals("0??")) {
//				if(itemList[i][4].equals("????")) {
//					System.out.println(itemList[i][2]);
//				}
//			}
//		}
		
		//20.???? ??ǰ?? ?????? ???? ?? ?????????? ?????? ??ȸ?ϼ??? - ?ع???, ??????, ä????
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
		// temp ?? ?ֹ??? ??ǰ
		for(int i = 0; i < orderList.length; i++) {
			for(int j = 0; j < orderList.length; j++) {
				if(i != j && temp[i][0].equals(temp[j][0])) {
					if(orderList[j][8].equals("????????")) {
						System.out.println(orderList[j][3]);
					}
				}
			}
		}
		
		
		
		

	}

}
