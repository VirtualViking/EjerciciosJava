public class Usuario {
    public String usuarioBase;
    public String claveBase;
    public boolean estadoDelSistema;

    public Usuario(String usuarioBase, String claveBase, boolean estadoDelSistema) {
        this.usuarioBase = usuarioBase;
        this.claveBase = claveBase;
        this.estadoDelSistema = estadoDelSistema;
    }
//string se comparan con .equals
    public boolean permitirAcceso(String usuarioIngresado, String claveIngresada) {
        return usuarioIngresado.equals(this.usuarioBase) && claveIngresada.equals(this.claveBase);
    }

    public boolean isEstadoDelSistema() {
        return estadoDelSistema;
    }
}
