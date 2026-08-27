public record us(uu a, boolean b) {
   public us a() {
      return this.b ? new us(this.a, false) : this;
   }

   public uu b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
