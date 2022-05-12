package com.chainsys.interface_vehicle;

public abstract class VehicleAbstract implements IVehicle{
	@Override
	public void start() {
		System.out.println("Vehicle.Start");
	}
}
