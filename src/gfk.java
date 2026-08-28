public class gfk implements gfm<dpd> {
   public static final grb a = new grb(gow.e, new ale("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fwy c;

   public gfk(gfn.a $$0) {
      fwy $$1 = $$0.a(fwx.l);
      this.c = $$1.b("bell_body");
   }

   public static fxe b() {
      fxg $$0 = new fxg();
      fxh $$1 = $$0.a();
      fxh $$2 = $$1.a("bell_body", fxd.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fxa.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fxd.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fxa.a(-8.0F, -12.0F, -8.0F));
      return fxe.a($$0, 32, 32);
   }

   public void a(dpd $$0, float $$1, ezw $$2, gdm $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = ayx.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
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
      faa $$10 = a.a($$3, gdu::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
