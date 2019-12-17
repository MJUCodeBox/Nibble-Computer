package device.cpu.cu.cuInstruction.instruction;

import device.cpu.cu.cuInstruction.CUInstruction;

public class GOTOACA extends CUInstruction{

	@Override
	public void excute() {// Process���� ��򰡷� ��.
		int value = (this.ac.getData() & 0x0000ffff) + this.cp.getData();
		this.pc.setData(value);
		this.setPCB();
	}
}
