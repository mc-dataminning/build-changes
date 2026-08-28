public record xr(xt a, boolean b) {
   public xr a() {
      return this.b ? new xr(this.a, false) : this;
   }

   public xt b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
