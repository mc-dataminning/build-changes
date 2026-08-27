public record we(wg a, boolean b) {
   public we a() {
      return this.b ? new we(this.a, false) : this;
   }

   public wg b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
