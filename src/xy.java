public record xy(ya a, boolean b) {
   public xy a() {
      return this.b ? new xy(this.a, false) : this;
   }

   public ya b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
