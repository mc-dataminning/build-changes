public class gcm implements gbz<dno> {
   private final fsf<?> a;

   public gcm(gca.a $$0) {
      this.a = new fsf($$0.a(ftl.bk));
   }

   public void a(dno $$0, float $$1, ewi $$2, fzz $$3, int $$4, int $$5) {
      ih $$6 = ih.b;
      if ($$0.m()) {
         doz $$7 = $$0.i().a_($$0.aA_());
         if ($$7.b() instanceof diw) {
            $$6 = $$7.c(diw.b);
         }
      }

      cqc $$8 = $$0.t();
      gnm $$9;
      if ($$8 == null) {
         $$9 = gao.i;
      } else {
         $$9 = gao.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      ftm $$12 = this.a.b();
      $$12.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
      $$12.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      ewm $$13 = $$9.a($$3, gah::e);
      this.a.a($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
