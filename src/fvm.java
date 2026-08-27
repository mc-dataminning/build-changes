public class fvm implements fuz<dhw> {
   private final fli<?> a;

   public fvm(fva.a $$0) {
      this.a = new fli($$0.a(fmo.bh));
   }

   public void a(dhw $$0, float $$1, ept $$2, fsz $$3, int $$4, int $$5) {
      ic $$6 = ic.b;
      if ($$0.n()) {
         dja $$7 = $$0.i().a_($$0.aB_());
         if ($$7.b() instanceof ddh) {
            $$6 = $$7.c(ddh.b);
         }
      }

      clf $$8 = $$0.w();
      ggj $$9;
      if ($$8 == null) {
         $$9 = fto.i;
      } else {
         $$9 = fto.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      fmp $$12 = this.a.b();
      $$12.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
      $$12.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      epx $$13 = $$9.a($$3, fth::e);
      this.a.a($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
