public record wa(wc a, boolean b) {
   public wa a() {
      return this.b ? new wa(this.a, false) : this;
   }

   public wc b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
