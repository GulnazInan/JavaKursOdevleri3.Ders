package homeworkExercises.week3;

public abstract class BaseCreditManager implements ICreditManager{
	
	public abstract void Calculate();
	
	public void Save() {
		System.out.println("Kaydedildi");
	}
	
}