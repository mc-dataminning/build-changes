public class fzd implements fyq<dkt> {
   private final foy<?> a;

   public fzd(fyr.a $$0) {
      this.a = new foy($$0.a(fqe.bg));
   }

   public void a(dkt $$0, float $$1, etd $$2, fwq $$3, int $$4, int $$5) {
      ih $$6 = ih.b;
      if ($$0.m()) {
         dme $$7 = $$0.i().a_($$0.aD_());
         if ($$7.b() instanceof dgd) {
            $$6 = $$7.c(dgd.b);
         }
      }

      cog $$8 = $$0.s();
      gkc $$9;
      if ($$8 == null) {
         $$9 = fxf.i;
      } else {
         $$9 = fxf.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      fqf $$12 = this.a.b();
      $$12.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
      $$12.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      eth $$13 = $$9.a($$3, fwy::e);
      this.a.a($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
