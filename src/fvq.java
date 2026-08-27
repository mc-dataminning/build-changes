public class fvq implements fvh<dhp> {
   public static final ggq a = new ggq(gem.e, new ahg("entity/enchanting_table_book"));
   private final fjf b;

   public fvq(fvi.a $$0) {
      this.b = new fjf($$0.a(fmw.m));
   }

   public void a(dhp $$0, float $$1, eqb $$2, fth $$3, int $$4, int $$5) {
      $$2.a();
      $$2.a(0.5F, 0.75F, 0.5F);
      float $$6 = (float)$$0.a + $$1;
      $$2.a(0.0F, 0.1F + auo.a($$6 * 0.1F) * 0.01F, 0.0F);
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
      float $$9 = auo.i($$1, $$0.c, $$0.b);
      float $$10 = auo.h($$9 + 0.25F) * 1.6F - 0.3F;
      float $$11 = auo.h($$9 + 0.75F) * 1.6F - 0.3F;
      float $$12 = auo.i($$1, $$0.g, $$0.f);
      this.b.a($$6, auo.a($$10, 0.0F, 1.0F), auo.a($$11, 0.0F, 1.0F), $$12);
      eqf $$13 = a.a($$3, ftp::c);
      this.b.b($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
