public record vp(vr a, boolean b) {
   public vp a() {
      return this.b ? new vp(this.a, false) : this;
   }

   public vr b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
