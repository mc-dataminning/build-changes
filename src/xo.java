public record xo(xq a, boolean b) {
   public xo a() {
      return this.b ? new xo(this.a, false) : this;
   }

   public xq b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
