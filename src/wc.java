public record wc(we a, boolean b) {
   public wc a() {
      return this.b ? new wc(this.a, false) : this;
   }

   public we b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
