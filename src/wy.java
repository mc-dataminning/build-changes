public record wy(xa a, boolean b) {
   public wy a() {
      return this.b ? new wy(this.a, false) : this;
   }

   public xa b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
