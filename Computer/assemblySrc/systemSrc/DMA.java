package assemblySrc.systemSrc;

import assemblySrc.aExe.Exe;

public class DMA extends Exe{ // EIDataType�� ���� ��.
	
	public DMA() {
		this.setInstructions(new int[][] {
			{KeyCode, NULL},
			{MouseX, NULL},
			{MouseY, NULL},
			{MouseP, NULL},
			{Freq, NULL},
			{SPKUser, NULL},
			{SPKFinish, NULL},
			{ConLoad, NULL},
			{MoniLoad, NULL},
		});
	}
}
