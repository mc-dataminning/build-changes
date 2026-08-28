public record xs(xu a, boolean b) {
   public xs a() {
      return this.b ? new xs(this.a, false) : this;
   }

   public xu b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
