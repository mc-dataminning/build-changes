public record vl(vn a, boolean b) {
   public vl a() {
      return this.b ? new vl(this.a, false) : this;
   }

   public vn b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
