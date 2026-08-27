public class get implements gek<dpa> {
   public static final gpz a = new gpz(gnu.e, new akm("entity/enchanting_table_book"));
   private final fse b;

   public get(gel.a $$0) {
      this.b = new fse($$0.a(fvv.r));
   }

   public void a(dpa $$0, float $$1, eys $$2, gck $$3, int $$4, int $$5) {
      $$2.a();
      $$2.a(0.5F, 0.75F, 0.5F);
      float $$6 = (float)$$0.a + $$1;
      $$2.a(0.0F, 0.1F + ayd.a($$6 * 0.1F) * 0.01F, 0.0F);
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
      float $$9 = ayd.i($$1, $$0.c, $$0.b);
      float $$10 = ayd.h($$9 + 0.25F) * 1.6F - 0.3F;
      float $$11 = ayd.h($$9 + 0.75F) * 1.6F - 0.3F;
      float $$12 = ayd.i($$1, $$0.g, $$0.f);
      this.b.a($$6, ayd.a($$10, 0.0F, 1.0F), ayd.a($$11, 0.0F, 1.0F), $$12);
      eyw $$13 = a.a($$3, gcs::c);
      this.b.b($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
