package chenbin211614354;

import java.util.ArrayList;
import java.util.Random;

public class Grade1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		Random random = new Random();
		int i = 0;
		boolean g = false;
		for (i = 0; i < 10; i++) {
			g = random.nextBoolean();
			if (g == true) {
				x(list);               //���ü������㷽��
			} else if (g == false) {
				y(list);               //���üӷ����㷽��
			}

		}
		h(list);
	}

	public static void x(ArrayList<String> list) {
		// �p�����㷽��
		Random r = new Random();
		int i = 0;
		int answer = 0;
		int a = 0;
		int b = 0;

		do {
			a = r.nextInt(100);
			// aΪ��һ�������
			b = r.nextInt(100);
			// bΪ�ڶ��������
			answer = a - b;
		} while (answer < 0);
		String answer1 = String.valueOf(answer);
		String a1 = String.valueOf(a);
		String b1 = String.valueOf(b);
		list.add("(" + (i + 1) + ") " + a1 + " - " + b1 + " = ");
		list.add(answer1);

	}

	public static void y(ArrayList<String> list) {
		// �ӷ����㷽��
		Random r = new Random();
		int i = 0;
		int answer = 0;
		int a = 0;
		int b = 0;

		do {
			a = r.nextInt(100);
			// aΪ��һ�������
			b = r.nextInt(100);
			// bΪ�ڶ��������
			answer = a + b;
		} while (answer >= 100);
		String answer1 = String.valueOf(answer);
		String a1 = String.valueOf(a);
		String b1 = String.valueOf(b);
		list.add("(" + (i + 1) + ") " + a1 + " + " + b1 + " = ");
		list.add(answer1);

	}

	public static void h(ArrayList<String> list) {
		// �½�һ����������ר�����
		int i=0;
		for ( i = 0; i < 2 * 10 - 2; i = i + 2) {
			System.out.println(list.get(i));
		}
		System.out.print("\n");
		for ( i = 0; i <= 2 * 10 - 2; i = i + 2) {
			System.out.print(list.get(i));
			System.out.println(list.get(i + 1));
		}

	}
}
		
		
		
			
	

