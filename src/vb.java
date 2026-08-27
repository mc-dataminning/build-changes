public record vb(vd a, boolean b) {
   public vb a() {
      return this.b ? new vb(this.a, false) : this;
   }

   public vd b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
