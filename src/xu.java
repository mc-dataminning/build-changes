public record xu(xw a, boolean b) {
   public xu a() {
      return this.b ? new xu(this.a, false) : this;
   }

   public xw b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
