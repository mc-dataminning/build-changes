public class fvi implements fuz<dhi> {
   public static final ggj a = new ggj(gee.e, new ahd("entity/enchanting_table_book"));
   private final fix b;

   public fvi(fva.a $$0) {
      this.b = new fix($$0.a(fmo.m));
   }

   public void a(dhi $$0, float $$1, ept $$2, fsz $$3, int $$4, int $$5) {
      $$2.a();
      $$2.a(0.5F, 0.75F, 0.5F);
      float $$6 = (float)$$0.a + $$1;
      $$2.a(0.0F, 0.1F + aui.a($$6 * 0.1F) * 0.01F, 0.0F);
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
      float $$9 = aui.i($$1, $$0.c, $$0.b);
      float $$10 = aui.h($$9 + 0.25F) * 1.6F - 0.3F;
      float $$11 = aui.h($$9 + 0.75F) * 1.6F - 0.3F;
      float $$12 = aui.i($$1, $$0.g, $$0.f);
      this.b.a($$6, aui.a($$10, 0.0F, 1.0F), aui.a($$11, 0.0F, 1.0F), $$12);
      epx $$13 = a.a($$3, fth::c);
      this.b.b($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
