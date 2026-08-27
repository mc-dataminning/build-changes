public record tr(tt a, boolean b) {
   public tr a() {
      return this.b ? new tr(this.a, false) : this;
   }

   public tt b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
