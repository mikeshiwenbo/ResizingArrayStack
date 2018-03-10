
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResizingArrayStack<Integer> a=new ResizingArrayStack<>();
		for(Integer i=0;i<300;i++){
			a.push(i);
		}
		for(Integer k:a){
			System.out.println(k);
		}
		System.out.println(a.pop());
		for(Integer k:a){
			System.out.println(k);
		}
	}

}
