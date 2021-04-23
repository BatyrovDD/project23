//создала класс для третьего разработчика
public class SortBuble {
	public static void sortbuble(int[] bub) {

		boolean sortirovka=false;
		while(!sortirovka) {
			sortirovka=true;
				for(int i=1; i < bub.length; i++) {
					if(bub[i] < bub[i-1]) {
						int temp=bub[i];
						bub[i]= bub[i-1];
						bub[i-1]=temp;
						sortirovka=false;
					}
				}
			}
		}
	}

