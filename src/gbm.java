public class gbm extends gbh<gyb> {
   private final gej[] a = new gej[9];

   public gbm(gej $$0) {
      super($$0);

      for (int $$1 = 0; $$1 < this.a.length; $$1++) {
         this.a[$$1] = $$0.b(a($$1));
      }
   }

   private static String a(int $$0) {
      return "tentacle" + $$0;
   }

   public static gep a() {
      ger $$0 = new ger();
      get $$1 = $$0.a();
      $$1.a("body", geo.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), gel.a(0.0F, 17.6F, 0.0F));
      bac $$2 = bac.a(1660L);

      for (int $$3 = 0; $$3 < 9; $$3++) {
         float $$4 = (((float)($$3 % 3) - (float)($$3 / 3 % 2) * 0.5F + 0.25F) / 2.0F * 2.0F - 1.0F) * 5.0F;
         float $$5 = ((float)($$3 / 3) / 2.0F * 2.0F - 1.0F) * 5.0F;
         int $$6 = $$2.a(7) + 8;
         $$1.a(a($$3), geo.c().a(0, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, (float)$$6, 2.0F), gel.a($$4, 24.6F, $$5));
      }

      return gep.a($$0, 64, 32).a(ges.scaling(4.5F));
   }

   public void a(gyb $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.a.length; $$1++) {
         this.a[$$1].e = 0.2F * azu.a($$0.p * 0.3F + (float)$$1) + 0.4F;
      }
   }
}
