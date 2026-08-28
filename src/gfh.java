public class gfh implements gfj<dpa> {
   public static final gqy a = new gqy(got.e, new alb("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fwv c;

   public gfh(gfk.a $$0) {
      fwv $$1 = $$0.a(fwu.l);
      this.c = $$1.b("bell_body");
   }

   public static fxb b() {
      fxd $$0 = new fxd();
      fxe $$1 = $$0.a();
      fxe $$2 = $$1.a("bell_body", fxa.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fwx.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fxa.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fwx.a(-8.0F, -12.0F, -8.0F));
      return fxb.a($$0, 32, 32);
   }

   public void a(dpa $$0, float $$1, ezt $$2, gdj $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = ayu.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
         if ($$0.c == je.c) {
            $$7 = -$$9;
         } else if ($$0.c == je.d) {
            $$7 = $$9;
         } else if ($$0.c == je.f) {
            $$8 = -$$9;
         } else if ($$0.c == je.e) {
            $$8 = $$9;
         }
      }

      this.c.e = $$7;
      this.c.g = $$8;
      ezx $$10 = a.a($$3, gdr::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
