package homeworkExercises.week3;

public interface ICreditManager {
	
	//Interface'ler referans tiptir.
	//Interface amacı yazılımdaki bağımlılıkları engellemek ve iflerden kurtulmaktır.
	//Bir sınıf sadece bir sınıfı, bir sınıf birden fazla interface'i implemente edebilir.
	
	void Calculate();
	void Save();
	
}