package facturas;

public interface IFactura {

	void cambiarEstado(Estados estado);
	float getTotal();
	float getCantidadIva();
}
