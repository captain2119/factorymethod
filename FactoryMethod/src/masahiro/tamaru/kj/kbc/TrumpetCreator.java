package masahiro.tamaru.kj.kbc;

public class TrumpetCreator extends AbstractCreator {

	@Override
	public WindInstrumentProduct createInstrument() {
		return new Trumpet();
	}

}
