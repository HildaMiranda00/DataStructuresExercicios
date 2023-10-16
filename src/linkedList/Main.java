package linkedList;
	public class Main {
		public static void main(String[] args) {
			LinkedList list = new LinkedList();
			
			
			list.add(3);
			list.add(2);
			list.add(15,0);
			list.remove(0);
			list.add(1,0);
			for(int i = 0; i < 100; i++) {
				list.add(Math.random());
			}
			System.out.println("length of size: " + list.getSize());
			System.out.println("Value added in list:");
			for (int i = 0; i < list.getSize(); i++) {
				System.out.println(list.get(i));
				
			}
			System.out.println("Tempo de execução: " + System.currentTimeMillis());
		}
	}


