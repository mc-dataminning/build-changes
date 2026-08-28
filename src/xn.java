public record xn(xp a, boolean b) {
   public xn a() {
      return this.b ? new xn(this.a, false) : this;
   }

   public xp b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
