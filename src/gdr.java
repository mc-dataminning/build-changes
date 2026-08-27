public class gdr implements gde<dom> {
   private final ftk<?> a;

   public gdr(gdf.a $$0) {
      this.a = new ftk($$0.a(fuq.bk));
   }

   public void a(dom $$0, float $$1, exn $$2, gbe $$3, int $$4, int $$5) {
      ir $$6 = ir.b;
      if ($$0.m()) {
         dpy $$7 = $$0.i().a_($$0.az_());
         if ($$7.b() instanceof dju) {
            $$6 = $$7.c(dju.b);
         }
      }

      cqw $$8 = $$0.t();
      gor $$9;
      if ($$8 == null) {
         $$9 = gbt.i;
      } else {
         $$9 = gbt.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      fur $$12 = this.a.b();
      $$12.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
      $$12.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      exr $$13 = $$9.a($$3, gbm::e);
      this.a.a($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
