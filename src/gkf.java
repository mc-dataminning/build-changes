public class gkf implements gjw<dsq> {
   public static final gzm a = new gzm(gxf.d, ale.b("entity/enchanting_table_book"));
   private final fwy b;

   public gkf(gjx.a $$0) {
      this.b = new fwy($$0.a(gap.A));
   }

   public void a(dsq $$0, float $$1, fdi $$2, ghl $$3, int $$4, int $$5) {
      $$2.a();
      $$2.a(0.5F, 0.75F, 0.5F);
      float $$6 = (float)$$0.a + $$1;
      $$2.a(0.0F, 0.1F + azf.a($$6 * 0.1F) * 0.01F, 0.0F);
      float $$7 = $$0.h - $$0.i;

      while ($$7 >= (float) Math.PI) {
         $$7 -= (float) (Math.PI * 2);
      }

      while ($$7 < (float) -Math.PI) {
         $$7 += (float) (Math.PI * 2);
      }

      float $$8 = $$0.i + $$7 * $$1;
      $$2.a(a.d.rotation(-$$8));
      $$2.a(a.f.rotationDegrees(80.0F));
      float $$9 = azf.h($$1, $$0.c, $$0.b);
      float $$10 = azf.i($$9 + 0.25F) * 1.6F - 0.3F;
      float $$11 = azf.i($$9 + 0.75F) * 1.6F - 0.3F;
      float $$12 = azf.h($$1, $$0.g, $$0.f);
      this.b.a($$6, azf.a($$10, 0.0F, 1.0F), azf.a($$11, 0.0F, 1.0F), $$12);
      fdm $$13 = a.a($$3, ghv::c);
      this.b.a($$2, $$13, $$4, $$5);
      $$2.b();
   }
}
