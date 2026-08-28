public class fxf extends fxa<gtf> {
   private final gab a;
   private final gab[] b = new gab[9];

   public fxf(gab $$0) {
      this.a = $$0;

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         this.b[$$1] = $$0.b(a($$1));
      }
   }

   private static String a(int $$0) {
      return "tentacle" + $$0;
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      $$1.a("body", gag.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), gad.a(0.0F, 17.6F, 0.0F));
      azk $$2 = azk.a(1660L);

      for (int $$3 = 0; $$3 < 9; $$3++) {
         float $$4 = (((float)($$3 % 3) - (float)($$3 / 3 % 2) * 0.5F + 0.25F) / 2.0F * 2.0F - 1.0F) * 5.0F;
         float $$5 = ((float)($$3 / 3) / 2.0F * 2.0F - 1.0F) * 5.0F;
         int $$6 = $$2.a(7) + 8;
         $$1.a(a($$3), gag.c().a(0, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, (float)$$6, 2.0F), gad.a($$4, 24.6F, $$5));
      }

      return gah.a($$0, 64, 32).a(gak.scaling(4.5F));
   }

   public void a(gtf $$0) {
      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         this.b[$$1].e = 0.2F * azc.a($$0.p * 0.3F + (float)$$1) + 0.4F;
      }
   }

   @Override
   public gab a() {
      return this.a;
   }
}
