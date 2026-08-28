public class gfw extends gfq<hcq> {
   private final giu[] a = new giu[9];

   public gfw(giu $$0) {
      super($$0);

      for (int $$1 = 0; $$1 < this.a.length; $$1++) {
         this.a[$$1] = $$0.b(a($$1));
      }
   }

   private static String a(int $$0) {
      return "tentacle" + $$0;
   }

   public static gja a() {
      gjc $$0 = new gjc();
      gje $$1 = $$0.a();
      $$1.a("body", giz.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), giw.a(0.0F, 17.6F, 0.0F));
      azv $$2 = azv.a(1660L);

      for (int $$3 = 0; $$3 < 9; $$3++) {
         float $$4 = (((float)($$3 % 3) - (float)($$3 / 3 % 2) * 0.5F + 0.25F) / 2.0F * 2.0F - 1.0F) * 5.0F;
         float $$5 = ((float)($$3 / 3) / 2.0F * 2.0F - 1.0F) * 5.0F;
         int $$6 = $$2.a(7) + 8;
         $$1.a(a($$3), giz.c().a(0, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, (float)$$6, 2.0F), giw.a($$4, 24.6F, $$5));
      }

      return gja.a($$0, 64, 32).a(gjd.scaling(4.5F));
   }

   public void a(hcq $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.a.length; $$1++) {
         this.a[$$1].e = 0.2F * azm.a($$0.u * 0.3F + (float)$$1) + 0.4F;
      }
   }
}
