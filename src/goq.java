public class goq implements goh<dut> {
   public static final hgt a = new hgt(hel.d, aku.b("entity/enchanting_table_book"));
   private final gbh b;

   public goq(goi.a $$0) {
      this.b = new gbh($$0.a(gez.J));
   }

   public void a(dut $$0, float $$1, ffs $$2, glv $$3, int $$4, int $$5) {
      $$2.a();
      $$2.a(0.5F, 0.75F, 0.5F);
      float $$6 = (float)$$0.a + $$1;
      $$2.a(0.0F, 0.1F + ayy.a($$6 * 0.1F) * 0.01F, 0.0F);
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
      float $$9 = ayy.h($$1, $$0.c, $$0.b);
      float $$10 = ayy.i($$9 + 0.25F) * 1.6F - 0.3F;
      float $$11 = ayy.i($$9 + 0.75F) * 1.6F - 0.3F;
      float $$12 = ayy.h($$1, $$0.g, $$0.f);
      this.b.a($$6, ayy.a($$10, 0.0F, 1.0F), ayy.a($$11, 0.0F, 1.0F), $$12);
      ffw $$13 = a.a($$3, gmf::d);
      this.b.a($$2, $$13, $$4, $$5);
      $$2.b();
   }
}
