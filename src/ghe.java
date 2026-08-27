public class ghe implements ghg<dpz> {
   public static final gtc a = new gtc(gqx.e, new akt("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fys c;

   public ghe(ghh.a $$0) {
      fys $$1 = $$0.a(fyr.m);
      this.c = $$1.b("bell_body");
   }

   public static fyy b() {
      fza $$0 = new fza();
      fzb $$1 = $$0.a();
      fzb $$2 = $$1.a("bell_body", fyx.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fyu.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fyx.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fyu.a(-8.0F, -12.0F, -8.0F));
      return fyy.a($$0, 32, 32);
   }

   public void a(dpz $$0, float $$1, fbc $$2, gfg $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = aym.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
         if ($$0.c == iw.c) {
            $$7 = -$$9;
         } else if ($$0.c == iw.d) {
            $$7 = $$9;
         } else if ($$0.c == iw.f) {
            $$8 = -$$9;
         } else if ($$0.c == iw.e) {
            $$8 = $$9;
         }
      }

      this.c.e = $$7;
      this.c.g = $$8;
      fbg $$10 = a.a($$3, gfo::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
