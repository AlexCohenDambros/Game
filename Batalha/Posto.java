package Batalha;

public class Posto extends Inimigo{

	public Posto(int x, int y) {
		super(x, y);
	}
	
	public boolean levarBomba()
	{
		if(this.getEstado() == 'P')
		{
			this.setMsgBatalha("CRASH! Caiu nos destro�os de um posto");
			return false;
		}
		else
		{
			this.setMsgBatalha("BOOMM! POSTO atingido! Voc� foi *E L I M I N A D O*");
			this.setEstado('P');
			return true;
			
		}
		
		
		
		
	}

}
