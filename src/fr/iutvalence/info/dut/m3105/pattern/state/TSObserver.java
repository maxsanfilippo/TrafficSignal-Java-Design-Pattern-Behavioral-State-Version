package fr.iutvalence.info.dut.m3105.pattern.state;

public interface TSObserver
{
	public void buttonPressed();
	public void colorChanged(TrafficSignalStateName color);
}
