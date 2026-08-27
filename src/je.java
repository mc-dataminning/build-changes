public record je(amp a, hv b, dip c, dgv d) {
   public elb a() {
      return this.b.b();
   }

   public amp b() {
      return this.a;
   }

   public hv c() {
      return this.b;
   }

   public dip d() {
      return this.c;
   }

   public dgv e() {
      return this.d;
   }
}
