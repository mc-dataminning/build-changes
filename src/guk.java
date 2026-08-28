public class guk implements gua<dzl> {
   public static final hmx a = new hmx(hkp.c, alr.b("entity/enchanting_table_book"));
   private final ggs b;

   public guk(gub.a $$0) {
      this.b = new ggs($$0.a(gkq.J));
   }

   public void a(dzl $$0, float $$1, fld $$2, grn $$3, int $$4, int $$5, fgc $$6) {
      $$2.a();
      $$2.a(0.5F, 0.75F, 0.5F);
      float $$7 = (float)$$0.a + $$1;
      $$2.a(0.0F, 0.1F + azz.a($$7 * 0.1F) * 0.01F, 0.0F);
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
      float $$10 = azz.h($$1, $$0.c, $$0.b);
      float $$11 = azz.i($$10 + 0.25F) * 1.6F - 0.3F;
      float $$12 = azz.i($$10 + 0.75F) * 1.6F - 0.3F;
      float $$13 = azz.h($$1, $$0.g, $$0.f);
      this.b.a($$7, azz.a($$11, 0.0F, 1.0F), azz.a($$12, 0.0F, 1.0F), $$13);
      flg $$14 = a.a($$3, gry::d);
      this.b.a($$2, $$14, $$4, $$5);
      $$2.b();
   }
}
