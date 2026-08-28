public record xf(xh a, boolean b) {
   public xf a() {
      return this.b ? new xf(this.a, false) : this;
   }

   public xh b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
