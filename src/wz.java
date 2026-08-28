public record wz(xb a, boolean b) {
   public wz a() {
      return this.b ? new wz(this.a, false) : this;
   }

   public xb b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
