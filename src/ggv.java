public class ggv implements ggx<dqf> {
   public static final gso a = new gso(gqi.e, akr.b("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fyi c;

   public ggv(ggy.a $$0) {
      fyi $$1 = $$0.a(fyh.l);
      this.c = $$1.b("bell_body");
   }

   public static fyo b() {
      fyq $$0 = new fyq();
      fyr $$1 = $$0.a();
      fyr $$2 = $$1.a("bell_body", fyn.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fyk.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fyn.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fyk.a(-8.0F, -12.0F, -8.0F));
      return fyo.a($$0, 32, 32);
   }

   public void a(dqf $$0, float $$1, fbg $$2, gex $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = ayo.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
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
      fbk $$10 = a.a($$3, gff::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
