public class gka implements gjr<dsn> {
   public static final gzh a = new gzh(gxa.d, alc.b("entity/enchanting_table_book"));
   private final fwu b;

   public gka(gjs.a $$0) {
      this.b = new fwu($$0.a(gak.A));
   }

   public void a(dsn $$0, float $$1, fde $$2, ghg $$3, int $$4, int $$5) {
      $$2.a();
      $$2.a(0.5F, 0.75F, 0.5F);
      float $$6 = (float)$$0.a + $$1;
      $$2.a(0.0F, 0.1F + azd.a($$6 * 0.1F) * 0.01F, 0.0F);
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
      float $$9 = azd.h($$1, $$0.c, $$0.b);
      float $$10 = azd.h($$9 + 0.25F) * 1.6F - 0.3F;
      float $$11 = azd.h($$9 + 0.75F) * 1.6F - 0.3F;
      float $$12 = azd.h($$1, $$0.g, $$0.f);
      this.b.a($$6, azd.a($$10, 0.0F, 1.0F), azd.a($$11, 0.0F, 1.0F), $$12);
      fdi $$13 = a.a($$3, ghq::c);
      this.b.a($$2, $$13, $$4, $$5);
      $$2.b();
   }
}
