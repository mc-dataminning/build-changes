public class gbx implements gbz<dmd> {
   public static final gnm a = new gnm(gli.e, new ajt("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final ftm c;

   public gbx(gca.a $$0) {
      ftm $$1 = $$0.a(ftl.l);
      this.c = $$1.b("bell_body");
   }

   public static fts b() {
      ftu $$0 = new ftu();
      ftv $$1 = $$0.a();
      ftv $$2 = $$1.a("bell_body", ftr.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fto.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", ftr.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fto.a(-8.0F, -12.0F, -8.0F));
      return fts.a($$0, 32, 32);
   }

   public void a(dmd $$0, float $$1, ewi $$2, fzz $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = axk.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
         if ($$0.c == ih.c) {
            $$7 = -$$9;
         } else if ($$0.c == ih.d) {
            $$7 = $$9;
         } else if ($$0.c == ih.f) {
            $$8 = -$$9;
         } else if ($$0.c == ih.e) {
            $$8 = $$9;
         }
      }

      this.c.e = $$7;
      this.c.g = $$8;
      ewm $$10 = a.a($$3, gah::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
