public class gcg implements gci<dmm> {
   public static final gnv a = new gnv(glr.e, new ajv("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final ftv c;

   public gcg(gcj.a $$0) {
      ftv $$1 = $$0.a(ftu.l);
      this.c = $$1.b("bell_body");
   }

   public static fub b() {
      fud $$0 = new fud();
      fue $$1 = $$0.a();
      fue $$2 = $$1.a("bell_body", fua.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), ftx.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fua.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), ftx.a(-8.0F, -12.0F, -8.0F));
      return fub.a($$0, 32, 32);
   }

   public void a(dmm $$0, float $$1, ewr $$2, gai $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = axm.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
         if ($$0.c == ij.c) {
            $$7 = -$$9;
         } else if ($$0.c == ij.d) {
            $$7 = $$9;
         } else if ($$0.c == ij.f) {
            $$8 = -$$9;
         } else if ($$0.c == ij.e) {
            $$8 = $$9;
         }
      }

      this.c.e = $$7;
      this.c.g = $$8;
      ewv $$10 = a.a($$3, gaq::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
