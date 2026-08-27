public record vn(vp a, boolean b) {
   public vn a() {
      return this.b ? new vn(this.a, false) : this;
   }

   public vp b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
