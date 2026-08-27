public record wq(ws a, boolean b) {
   public wq a() {
      return this.b ? new wq(this.a, false) : this;
   }

   public ws b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
