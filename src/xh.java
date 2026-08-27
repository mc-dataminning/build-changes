public record xh(xj a, boolean b) {
   public xh a() {
      return this.b ? new xh(this.a, false) : this;
   }

   public xj b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
