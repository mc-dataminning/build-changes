public record xg(xi a, boolean b) {
   public xg a() {
      return this.b ? new xg(this.a, false) : this;
   }

   public xi b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
