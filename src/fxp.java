public class fxp extends fxk<gtw> {
   private final gal a;
   private final gal[] b = new gal[9];

   public fxp(gal $$0) {
      this.a = $$0;

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         this.b[$$1] = $$0.b(a($$1));
      }
   }

   private static String a(int $$0) {
      return "tentacle" + $$0;
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      $$1.a("body", gaq.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), gan.a(0.0F, 17.6F, 0.0F));
      azl $$2 = azl.a(1660L);

      for (int $$3 = 0; $$3 < 9; $$3++) {
         float $$4 = (((float)($$3 % 3) - (float)($$3 / 3 % 2) * 0.5F + 0.25F) / 2.0F * 2.0F - 1.0F) * 5.0F;
         float $$5 = ((float)($$3 / 3) / 2.0F * 2.0F - 1.0F) * 5.0F;
         int $$6 = $$2.a(7) + 8;
         $$1.a(a($$3), gaq.c().a(0, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, (float)$$6, 2.0F), gan.a($$4, 24.6F, $$5));
      }

      return gar.a($$0, 64, 32).a(gau.scaling(4.5F));
   }

   public void a(gtw $$0) {
      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         this.b[$$1].e = 0.2F * azd.a($$0.p * 0.3F + (float)$$1) + 0.4F;
      }
   }

   @Override
   public gal a() {
      return this.a;
   }
}
