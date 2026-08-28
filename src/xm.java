public record xm(xo a, boolean b) {
   public xm a() {
      return this.b ? new xm(this.a, false) : this;
   }

   public xo b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
