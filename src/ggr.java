public class ggr implements ggt<dqd> {
   public static final gsj a = new gsj(gqe.e, akq.b("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fye c;

   public ggr(ggu.a $$0) {
      fye $$1 = $$0.a(fyd.l);
      this.c = $$1.b("bell_body");
   }

   public static fyk b() {
      fym $$0 = new fym();
      fyn $$1 = $$0.a();
      fyn $$2 = $$1.a("bell_body", fyj.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fyg.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fyj.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fyg.a(-8.0F, -12.0F, -8.0F));
      return fyk.a($$0, 32, 32);
   }

   public void a(dqd $$0, float $$1, fbc $$2, get $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = ayn.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
         if ($$0.c == ji.c) {
            $$7 = -$$9;
         } else if ($$0.c == ji.d) {
            $$7 = $$9;
         } else if ($$0.c == ji.f) {
            $$8 = -$$9;
         } else if ($$0.c == ji.e) {
            $$8 = $$9;
         }
      }

      this.c.e = $$7;
      this.c.g = $$8;
      fbg $$10 = a.a($$3, gfb::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
