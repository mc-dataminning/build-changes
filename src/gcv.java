public class gcv implements gci<dnx> {
   private final fso<?> a;

   public gcv(gcj.a $$0) {
      this.a = new fso($$0.a(ftu.bk));
   }

   public void a(dnx $$0, float $$1, ewr $$2, gai $$3, int $$4, int $$5) {
      ij $$6 = ij.b;
      if ($$0.m()) {
         dpi $$7 = $$0.i().a_($$0.az_());
         if ($$7.b() instanceof djf) {
            $$6 = $$7.c(djf.b);
         }
      }

      cql $$8 = $$0.t();
      gnv $$9;
      if ($$8 == null) {
         $$9 = gax.i;
      } else {
         $$9 = gax.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      ftv $$12 = this.a.b();
      $$12.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
      $$12.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      ewv $$13 = $$9.a($$3, gaq::e);
      this.a.a($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
