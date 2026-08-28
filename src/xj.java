public record xj(xl a, boolean b) {
   public xj a() {
      return this.b ? new xj(this.a, false) : this;
   }

   public xl b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
