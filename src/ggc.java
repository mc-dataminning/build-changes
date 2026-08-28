public class ggc implements gfp<dqr> {
   private final fvu<?> a;

   public ggc(gfq.a $$0) {
      this.a = new fvu($$0.a(fxa.bk));
   }

   public void a(dqr $$0, float $$1, ezz $$2, gdp $$3, int $$4, int $$5) {
      je $$6 = je.b;
      if ($$0.m()) {
         dsd $$7 = $$0.i().a_($$0.ay_());
         if ($$7.b() instanceof dlz) {
            $$6 = $$7.c(dlz.b);
         }
      }

      ctj $$8 = $$0.u();
      gre $$9;
      if ($$8 == null) {
         $$9 = gee.i;
      } else {
         $$9 = gee.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      fxb $$12 = this.a.b();
      $$12.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
      $$12.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      fad $$13 = $$9.a($$3, gdx::e);
      this.a.a($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
