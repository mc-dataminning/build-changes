public class fve implements fvg<dgs> {
   public static final ggp a = new ggp(gel.e, new ahg("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fmw c;

   public fve(fvh.a $$0) {
      fmw $$1 = $$0.a(fmv.k);
      this.c = $$1.b("bell_body");
   }

   public static fnc b() {
      fne $$0 = new fne();
      fnf $$1 = $$0.a();
      fnf $$2 = $$1.a("bell_body", fnb.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fmy.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fnb.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fmy.a(-8.0F, -12.0F, -8.0F));
      return fnc.a($$0, 32, 32);
   }

   public void a(dgs $$0, float $$1, eqa $$2, ftg $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = aun.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
         if ($$0.c == ic.c) {
            $$7 = -$$9;
         } else if ($$0.c == ic.d) {
            $$7 = $$9;
         } else if ($$0.c == ic.f) {
            $$8 = -$$9;
         } else if ($$0.c == ic.e) {
            $$8 = $$9;
         }
      }

      this.c.e = $$7;
      this.c.g = $$8;
      eqe $$10 = a.a($$3, fto::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
