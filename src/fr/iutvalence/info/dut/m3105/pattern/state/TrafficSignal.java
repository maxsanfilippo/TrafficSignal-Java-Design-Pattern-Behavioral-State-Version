package fr.iutvalence.info.dut.m3105.pattern.state;

import java.util.LinkedList;
import java.util.List;


public class TrafficSignal extends Thread implements TrafficSignalContext, TrafficSignalUserInterface
{
	private TrafficSignalState state;
	private TSObserver observer;

	public TrafficSignal(TSObserver obs)
	{
		observer = obs;
	}
	
	@Override
	public void setTrafficSignalState(TrafficSignalState state)
	{
		
		observer.colorChanged(state.getName());
		this.state = state;		
	}

	@Override
	public void pressButton()
	{
		this.state.buttonPressed();
	}
	
	public void run()
	{
		this.setTrafficSignalState(new TrafficSignalGreenState(this));
		while (true)
		{
			try
			{
				Thread.sleep(1000);
				this.state.secondEllapsed();
			}
			catch (InterruptedException e)
			{
				break;
			}
		}
	}
	
}
