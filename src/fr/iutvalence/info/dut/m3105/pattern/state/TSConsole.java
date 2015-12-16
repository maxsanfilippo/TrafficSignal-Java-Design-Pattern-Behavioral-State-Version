package fr.iutvalence.info.dut.m3105.pattern.state;

public class TSConsole implements TSObserver
{

	@Override
	public void buttonPressed()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void colorChanged(TrafficSignalStateName color)
	{
		System.out.println("Traffic signal state is "+ color );
	}

}
