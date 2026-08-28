public record xt(xv a, boolean b) {
   public xt a() {
      return this.b ? new xt(this.a, false) : this;
   }

   public xv b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
