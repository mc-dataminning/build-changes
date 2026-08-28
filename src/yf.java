public record yf(yh a, boolean b) {
   public yf a() {
      return this.b ? new yf(this.a, false) : this;
   }

   public yh b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
