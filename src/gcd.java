public class gcd extends gby<gys> {
   private final gfa[] a = new gfa[9];

   public gcd(gfa $$0) {
      super($$0);

      for (int $$1 = 0; $$1 < this.a.length; $$1++) {
         this.a[$$1] = $$0.b(a($$1));
      }
   }

   private static String a(int $$0) {
      return "tentacle" + $$0;
   }

   public static gfg a() {
      gfi $$0 = new gfi();
      gfk $$1 = $$0.a();
      $$1.a("body", gff.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), gfc.a(0.0F, 17.6F, 0.0F));
      azg $$2 = azg.a(1660L);

      for (int $$3 = 0; $$3 < 9; $$3++) {
         float $$4 = (((float)($$3 % 3) - (float)($$3 / 3 % 2) * 0.5F + 0.25F) / 2.0F * 2.0F - 1.0F) * 5.0F;
         float $$5 = ((float)($$3 / 3) / 2.0F * 2.0F - 1.0F) * 5.0F;
         int $$6 = $$2.a(7) + 8;
         $$1.a(a($$3), gff.c().a(0, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, (float)$$6, 2.0F), gfc.a($$4, 24.6F, $$5));
      }

      return gfg.a($$0, 64, 32).a(gfj.scaling(4.5F));
   }

   public void a(gys $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.a.length; $$1++) {
         this.a[$$1].e = 0.2F * ayy.a($$0.u * 0.3F + (float)$$1) + 0.4F;
      }
   }
}
