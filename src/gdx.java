public class gdx implements gdo<dog> {
   public static final gpc a = new gpc(gmx.e, new akh("entity/enchanting_table_book"));
   private final frj b;

   public gdx(gdp.a $$0) {
      this.b = new frj($$0.a(fva.r));
   }

   public void a(dog $$0, float $$1, exx $$2, gbo $$3, int $$4, int $$5) {
      $$2.a();
      $$2.a(0.5F, 0.75F, 0.5F);
      float $$6 = (float)$$0.a + $$1;
      $$2.a(0.0F, 0.1F + axz.a($$6 * 0.1F) * 0.01F, 0.0F);
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
      float $$9 = axz.i($$1, $$0.c, $$0.b);
      float $$10 = axz.h($$9 + 0.25F) * 1.6F - 0.3F;
      float $$11 = axz.h($$9 + 0.75F) * 1.6F - 0.3F;
      float $$12 = axz.i($$1, $$0.g, $$0.f);
      this.b.a($$6, axz.a($$10, 0.0F, 1.0F), axz.a($$11, 0.0F, 1.0F), $$12);
      eyb $$13 = a.a($$3, gbw::c);
      this.b.b($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
