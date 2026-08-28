public class ggx implements ggz<dqf> {
   public static final gsq a = new gsq(gqk.e, akr.b("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fyk c;

   public ggx(gha.a $$0) {
      fyk $$1 = $$0.a(fyj.l);
      this.c = $$1.b("bell_body");
   }

   public static fyq b() {
      fys $$0 = new fys();
      fyt $$1 = $$0.a();
      fyt $$2 = $$1.a("bell_body", fyp.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fym.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fyp.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fym.a(-8.0F, -12.0F, -8.0F));
      return fyq.a($$0, 32, 32);
   }

   public void a(dqf $$0, float $$1, fbi $$2, gez $$3, int $$4, int $$5) {
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
      fbm $$10 = a.a($$3, gfh::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
