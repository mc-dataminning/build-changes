public class gdp {
   private final gic a;
   private final gdh b;
   private final gjc c;
   private gdp.a d = gdp.a.a;

   public gdp(gic $$0, gdh $$1, gjc $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a() {
      switch (this.d) {
         case b:
            jh $$0 = this.a.dv();
            boolean $$1 = this.b.e($$0.v());
            if ($$1 || this.c.a($$0) || this.a.Y_() || !this.a.bL()) {
               this.d = gdp.a.c;
            }
         case a:
         case c:
      }
   }

   public boolean b() {
      return this.d == gdp.a.c;
   }

   public void c() {
      if (this.d == gdp.a.a) {
         this.d = gdp.a.b;
      }
   }

   static enum a {
      a,
      b,
      c;
   }
}
