package tp;

public class File<T> {
	
	private FileElement first;
	
	public File() {
		first = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void add(T data) {

		if(first == null)
			first = new FileElement(data);
		else {
			FileElement current = first;
			while(current.getNext() != null)
				current = current.getNext();
			
			current.setNext(new FileElement(data));
		}
	
	}
	
	public int size() {
		int size = 0;
		
		FileElement current = first;
		while(current != null) {
			size++;
			current = current.getNext();
		}
		
		return size;
	}
	
	public T get() throws Exception{
		if(isEmpty())
			throw new Exception("Liste Vide");
		
		return first.getData();
	}
	
	public T remove() throws Exception {
		
		if(first == null)
			throw new Exception("File Vide");
		
		T data = first.getData();
		first = first.getNext();
		
		return data;
	}
	
	// Elemenent de file
	public class FileElement {
		private T data;
		private FileElement next;
		
		public FileElement(T data) {
			this.data = data;
			next = null;
		}
		
		public T getData() { return data;}
		
		public void setData(T data) {
			this.data = data;
		}
		
		public void setNext(FileElement e) {
			this.next = e;
		}
		
		public FileElement getNext() { return next;}
	}
	
}
