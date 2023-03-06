package j21_람다식;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceMain {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("홍길동");
		names.add("홍길동2");
		names.add("홍길동3");
		names.add("홍길동4");
		names.add("홍길동5");
		names.add("홍길동6");
		names.add("홍길동7");
		// Runnable function
		Runnable printName = () -> {
			System.out.println("이름 출력 로직");
			names.forEach(name -> System.out.println(name)); // Foreach 는 consumer를 받는다.name~ syso 까진 컨슈머!
		};

		printName.run();

		System.out.println();
		// Supplier Function
		System.out.println("Supplier");
		for (int i = 0; i < names.size(); i++) {
			int finalI = i;
			Supplier<String> nameSupplier = () -> names.get(finalI);

			System.out.println(nameSupplier.get());
		}
		// Consumer function
		System.out.println();
		System.out.println("Consumer");
		Consumer<List<String>> consumer = nameList -> {
			nameList.forEach(name -> System.out.println(name));
		};
		consumer.accept(names);

		System.out.println();
		// Function
		System.out.println("Function");
		Function<List<String>, String> function = nameList -> {
			String nameText = null;
			for (int i = 0; i < nameList.size(); i++) {
				if (i == 0) {
					nameText = nameList.get(i);
					continue;
				}
				nameText += ", " + nameList.get(i);
			}
			return nameText;
		};
		String nameText = function.apply(names);
		System.out.println(nameText);
		System.out.println();

		// Predicate function
		System.out.println("Predicate");
		Predicate<String> contains = (name) -> name.contains("홍");
		boolean flag = contains.test(nameText);
		System.out.println("이름 포함 유무 :" + flag);
	}
}
