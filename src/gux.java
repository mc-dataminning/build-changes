public class gux implements gun<dyz> {
   public static final hnh a = new hnh(hkz.c, ali.b("entity/enchanting_table_book"));
   private final ghf b;

   public gux(guo.a $$0) {
      this.b = new ghf($$0.a(gld.J));
   }

   public void a(dyz $$0, float $$1, flo $$2, gsa $$3, int $$4, int $$5, ffq $$6) {
      $$2.a();
      $$2.a(0.5F, 0.75F, 0.5F);
      float $$7 = (float)$$0.a + $$1;
      $$2.a(0.0F, 0.1F + azo.a($$7 * 0.1F) * 0.01F, 0.0F);
      float $$8 = $$0.h - $$0.i;

      while ($$8 >= (float) Math.PI) {
         $$8 -= (float) (Math.PI * 2);
      }

      while ($$8 < (float) -Math.PI) {
         $$8 += (float) (Math.PI * 2);
      }

      float $$9 = $$0.i + $$8 * $$1;
      $$2.a(a.d.rotation(-$$9));
      $$2.a(a.f.rotationDegrees(80.0F));
      float $$10 = azo.h($$1, $$0.c, $$0.b);
      float $$11 = azo.i($$10 + 0.25F) * 1.6F - 0.3F;
      float $$12 = azo.i($$10 + 0.75F) * 1.6F - 0.3F;
      float $$13 = azo.h($$1, $$0.g, $$0.f);
      this.b.a($$7, azo.a($$11, 0.0F, 1.0F), azo.a($$12, 0.0F, 1.0F), $$13);
      flr $$14 = a.a($$3, gsl::d);
      this.b.a($$2, $$14, $$4, $$5);
      $$2.b();
   }
}
