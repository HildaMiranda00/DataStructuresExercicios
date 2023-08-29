package arrayList;

	public class ArrayList implements List {
		
		private Object[] elements;
		private int size;

			public ArrayList() {
				this.elements = new Object[10];
				this.size = 0;
			}
			
			public Object get(int index) {
				if (index < 0 || index >= elements.length) {
					throw new IndexOutOfBoundsException("Índice fora dos limites");

				}
				return elements[index];
			}

			public void add(Object element) {
				if (this.elements.length <= size) {
					doubleElements();
				}
				elements[size] = element;
				size++;
			}

			public void add(Object element, int index) {
				if(this.elements.length <= size) {
					doubleElements();
				}
				elements[index] = element;
				size++;
				
			}

			public void remove(int index)  {
				if(index < 0 || index >= size) {
					throw new IndexOutOfBoundsException("Índice fora dos limites");

				}
				for(int i = index; i < size - 1; i++) {
					elements[i] = elements[i + 1];
				}
				size--;
				elements[size - 1] = null;
			}

			public int getSize() {
				return this.size;
			}

			private void doubleElements() {
				int newSize = elements.length * 2;
				Object[] newArray = new Object[newSize];
				for(int i = 0; i < elements.length; i++) {
					newArray[i] = elements[i];
				}
					elements = newArray;
				
			}
		public int length() {
			return this.elements.length;
		}
			
			
		}
