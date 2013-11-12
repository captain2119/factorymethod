package masahiro.tamaru.kj.kbc;

public class Main {

	public static void main(String[] args) {
		AbstractCreator sc = new SaxophoneCreator();
		AbstractCreator tc = new TrumpetCreator();

		sc.setName("フォン");
		tc.setName("トラン");

		WindInstrumentProduct ins = sc.create();
		WindInstrumentProduct ins2 = tc.create();

		ins.printPlate();
		ins.play();
		ins2.printPlate();
		ins2.play();


	}

}
