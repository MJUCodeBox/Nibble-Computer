package device.cpu.cu.cuInstruction.instruction;

import device.cpu.cu.cuInstruction.CUInstruction;

public class GOTO extends CUInstruction{

	@Override
	public void excute() {// Process���� ��򰡷� ��.
		int value = (this.ir.getData() & 0x0000ffff) + this.cp.getData();
		this.pc.setData(value);
		this.setPCB();
	}
}
