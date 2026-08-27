public record tv(tx a, boolean b) {
   public tv a() {
      return this.b ? new tv(this.a, false) : this;
   }

   public tx b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
