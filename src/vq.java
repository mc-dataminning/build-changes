public record vq(vs a, boolean b) {
   public vq a() {
      return this.b ? new vq(this.a, false) : this;
   }

   public vs b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
