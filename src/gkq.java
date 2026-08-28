public class gkq implements gkh<dtb> {
   public static final hab a = new hab(gxr.d, alh.b("entity/enchanting_table_book"));
   private final fxj b;

   public gkq(gki.a $$0) {
      this.b = new fxj($$0.a(gba.A));
   }

   public void a(dtb $$0, float $$1, fdt $$2, ghw $$3, int $$4, int $$5) {
      $$2.a();
      $$2.a(0.5F, 0.75F, 0.5F);
      float $$6 = (float)$$0.a + $$1;
      $$2.a(0.0F, 0.1F + azj.a($$6 * 0.1F) * 0.01F, 0.0F);
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
      float $$9 = azj.h($$1, $$0.c, $$0.b);
      float $$10 = azj.i($$9 + 0.25F) * 1.6F - 0.3F;
      float $$11 = azj.i($$9 + 0.75F) * 1.6F - 0.3F;
      float $$12 = azj.h($$1, $$0.g, $$0.f);
      this.b.a($$6, azj.a($$10, 0.0F, 1.0F), azj.a($$11, 0.0F, 1.0F), $$12);
      fdx $$13 = a.a($$3, gig::c);
      this.b.a($$2, $$13, $$4, $$5);
      $$2.b();
   }
}
