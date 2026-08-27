public record tw(ty a, boolean b) {
   public tw a() {
      return this.b ? new tw(this.a, false) : this;
   }

   public ty b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
