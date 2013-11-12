package masahiro.tamaru.kj.kbc;

public class Main {

	public static void main(String[] args) {
		SaxophoneCreator sc = new SaxophoneCreator();
		TrumpetCreator tc = new TrumpetCreator();

		WindInstrumentProduct ins = sc.create();
		WindInstrumentProduct ins2 = tc.create();

		ins.setPlate("フォン");
		ins2.setPlate("トラン");

		ins.printPlate();
		ins.play();
		ins2.printPlate();
		ins2.play();


	}

}
