public class geb implements gdo<dov> {
   private final ftu<?> a;

   public geb(gdp.a $$0) {
      this.a = new ftu($$0.a(fva.bk));
   }

   public void a(dov $$0, float $$1, exx $$2, gbo $$3, int $$4, int $$5) {
      is $$6 = is.b;
      if ($$0.m()) {
         dqh $$7 = $$0.i().a_($$0.az_());
         if ($$7.b() instanceof dkd) {
            $$6 = $$7.c(dkd.b);
         }
      }

      crs $$8 = $$0.t();
      gpc $$9;
      if ($$8 == null) {
         $$9 = gcd.i;
      } else {
         $$9 = gcd.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      fvb $$12 = this.a.b();
      $$12.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
      $$12.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      eyb $$13 = $$9.a($$3, gbw::e);
      this.a.a($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
