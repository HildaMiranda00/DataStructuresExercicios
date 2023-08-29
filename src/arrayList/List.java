package arrayList;

	public interface List<T> {

		public T get(int index);
		
		public void add(T element);

		public void add(T element, int index);
		
		public void remove(int index);
		
		public int getSize();
	}
