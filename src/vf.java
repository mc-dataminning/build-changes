public record vf(vh a, boolean b) {
   public vf a() {
      return this.b ? new vf(this.a, false) : this;
   }

   public vh b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
