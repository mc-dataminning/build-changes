public class gdc implements gde<dnb> {
   public static final gor a = new gor(gmn.e, new akf("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fur c;

   public gdc(gdf.a $$0) {
      fur $$1 = $$0.a(fuq.l);
      this.c = $$1.b("bell_body");
   }

   public static fux b() {
      fuz $$0 = new fuz();
      fva $$1 = $$0.a();
      fva $$2 = $$1.a("bell_body", fuw.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fut.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fuw.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fut.a(-8.0F, -12.0F, -8.0F));
      return fux.a($$0, 32, 32);
   }

   public void a(dnb $$0, float $$1, exn $$2, gbe $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = axw.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
         if ($$0.c == ir.c) {
            $$7 = -$$9;
         } else if ($$0.c == ir.d) {
            $$7 = $$9;
         } else if ($$0.c == ir.f) {
            $$8 = -$$9;
         } else if ($$0.c == ir.e) {
            $$8 = $$9;
         }
      }

      this.c.e = $$7;
      this.c.g = $$8;
      exr $$10 = a.a($$3, gbm::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
