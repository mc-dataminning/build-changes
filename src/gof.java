public class gof implements gnw<dvt> {
   public static final hdu a = new hdu(hbk.d, alz.b("entity/enchanting_table_book"));
   private final gav b;

   public gof(gnx.a $$0) {
      this.b = new gav($$0.a(gen.G));
   }

   public void a(dvt $$0, float $$1, fgs $$2, gll $$3, int $$4, int $$5) {
      $$2.a();
      $$2.a(0.5F, 0.75F, 0.5F);
      float $$6 = (float)$$0.a + $$1;
      $$2.a(0.0F, 0.1F + bae.a($$6 * 0.1F) * 0.01F, 0.0F);
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
      float $$9 = bae.h($$1, $$0.c, $$0.b);
      float $$10 = bae.i($$9 + 0.25F) * 1.6F - 0.3F;
      float $$11 = bae.i($$9 + 0.75F) * 1.6F - 0.3F;
      float $$12 = bae.h($$1, $$0.g, $$0.f);
      this.b.a($$6, bae.a($$10, 0.0F, 1.0F), bae.a($$11, 0.0F, 1.0F), $$12);
      fgw $$13 = a.a($$3, glv::d);
      this.b.a($$2, $$13, $$4, $$5);
      $$2.b();
   }
}
