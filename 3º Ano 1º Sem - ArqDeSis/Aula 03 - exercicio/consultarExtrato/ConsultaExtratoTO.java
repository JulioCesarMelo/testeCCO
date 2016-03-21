package consultarExtrato;

import java.util.ArrayList;

public class ConsultaExtratoTO {

	private ArrayList<Extrato> list;
	public ConsultaExtratoTO(ArrayList<Extrato> list)
	{
		this.list = list;
	}
	public Object getTable() {
		return list;
	}
	
}
